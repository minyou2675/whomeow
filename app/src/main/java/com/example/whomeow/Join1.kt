package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityJoin1Binding

class Join1 : AppCompatActivity() {
    lateinit var binding: ActivityJoin1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJoin1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext1.setOnClickListener {
            val inputName = binding.userName.text.toString()
            val inputEmail = binding.userEmail.text.toString()
            if (inputName == "" || inputEmail =="") Toast.makeText(
                this@Join1,
                "해당 정보를 모두 입력하세요.",
                Toast.LENGTH_SHORT
            ).show() else {
                val intent = Intent(applicationContext, Join2::class.java)
                startActivity(intent)
            }
        }
    }
}