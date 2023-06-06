package com.example.whomeow

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityJoin3Binding

class Join3 : AppCompatActivity() {
    lateinit var binding : ActivityJoin3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJoin3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext3.setOnClickListener {
            val pass = binding.inputPassword.text.toString()
            if (pass=="") Toast.makeText(
                this@Join3,
                "비밀번호를 입력하세요.",
                Toast.LENGTH_SHORT
            ).show() else {
                val intent = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intent)
            }
        }


    }
}