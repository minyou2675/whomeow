package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityFindingPasswordBinding

class FindingPassword : AppCompatActivity() {
    lateinit var binding: ActivityFindingPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_password)
        binding = ActivityFindingPasswordBinding.inflate(layoutInflater)


        binding.checkPwBtn.setOnClickListener {
            val name = binding.pwInputName.text.toString()
            val email = binding.pwInputEmail.text.toString()
            if (name == "" || email == "") Toast.makeText(
                this@FindingPassword,
                "회원정보를 전부 입력해주세요.",
                Toast.LENGTH_SHORT
            ).show()
            else {
                val intent = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intent)

            }
        }
    }
}