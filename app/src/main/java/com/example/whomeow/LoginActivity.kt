package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnJoin.setOnClickListener {
            startActivity((Intent(this,Join1::class.java)))

        }

        binding.btnFindPage.setOnClickListener {
            startActivity((Intent(this,FindActivity::class.java)))
        }


        binding.btnLogin.setOnClickListener {
            val userId = binding.userId.text.toString()
            val userPassword = binding.userPassword.text.toString()
            if (userId == "" || userPassword == "") Toast.makeText(
                this@LoginActivity,
                "회원정보를 전부 입력하세요",
                Toast.LENGTH_SHORT
            ).show() else {
                    startActivity((Intent(this,DailyChart::class.java)))

            }
        }

    }
}