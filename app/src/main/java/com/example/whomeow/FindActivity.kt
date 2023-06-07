package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whomeow.databinding.ActivityFindBinding

class FindActivity : AppCompatActivity() {
    lateinit var binding: ActivityFindBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding = ActivityFindBinding.inflate(layoutInflater)

        binding.findIdBtn.setOnClickListener {
            startActivity((Intent(this,FindingId::class.java)))
        }

        binding.findPwBtn.setOnClickListener {
            startActivity((Intent(this,FindingPassword::class.java)))


        }
    }
}