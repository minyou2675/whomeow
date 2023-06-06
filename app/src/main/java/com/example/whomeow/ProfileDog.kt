package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whomeow.databinding.ActivityProfileDogBinding

class ProfileDog : AppCompatActivity() {
    lateinit var binding: ActivityProfileDogBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileDogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEditProfile.setOnClickListener {
            startActivity((Intent(this,EditProfile::class.java)))
        }
    }
}