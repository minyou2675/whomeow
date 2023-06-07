package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityLoginBinding
import com.example.whomeow.databinding.ActivityResetPasswordBinding

class ResetPassword : AppCompatActivity() {
    lateinit var binding: ActivityResetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        binding.checkPwBtn!!.setOnClickListener {
            val newPw = binding.inputNewPw!!.text.toString()
            val reNewPw = binding.reinputNewPw!!.text.toString()
            if (newPw != reNewPw) Toast.makeText(
                this@ResetPassword,
                "비밀번호가 일치하지 않습니다.",
                Toast.LENGTH_SHORT
            ).show()
            else {
                startActivity((Intent(this,LoginActivity::class.java)))

            }
        }
    }
}