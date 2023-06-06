package com.example.whomeow

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityJoin2Binding

class Join2 : AppCompatActivity() {
    lateinit var binding : ActivityJoin2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJoin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext2.setOnClickListener {
            val userId = binding.inputId.text.toString()
            if (userId=="") Toast.makeText(
                this@Join2,
                "아이디를 입력하세요.",
                Toast.LENGTH_SHORT
            ).show() else {
                val intent = Intent(applicationContext, Join3::class.java)
                startActivity(intent)
            }
        }
    }
}