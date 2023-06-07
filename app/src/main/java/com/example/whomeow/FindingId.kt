package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityFindingIdBinding

class FindingId : AppCompatActivity() {
    lateinit var binding: ActivityFindingIdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_id)
        binding = ActivityFindingIdBinding.inflate(layoutInflater)

        binding.checkIdBtn.setOnClickListener {
            val name = binding.idInputName.text.toString()
            val email = binding.idInputEmail.text.toString()
            if (name == "" || email == "") Toast.makeText(
                this@FindingId,
                "회원정보를 전부 입력해주세요.",
                Toast.LENGTH_SHORT
            ).show() else {
                val intent = Intent(applicationContext, LoginActivity::class.java)
                startActivity(intent)

            }
        }
    }
}