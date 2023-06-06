package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.whomeow.databinding.ActivityEditProfileBinding
import com.example.whomeow.databinding.ActivityProfileDogBinding

class EditProfile : AppCompatActivity() {
    lateinit var binding: ActivityEditProfileBinding

    lateinit var editName : EditText
    lateinit var editAge : EditText
    lateinit var editGender : EditText
    lateinit var editWeight : EditText
    lateinit var editBreed : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCheckProfile.setOnClickListener {
            startActivity((Intent(this,ProfileDog::class.java)))
        }

        editName =  findViewById(R.id.editName)
        editAge =  findViewById(R.id.editAge)
        editGender =  findViewById(R.id.editGender)
        editWeight =  findViewById(R.id.editWeight)
        editBreed =  findViewById(R.id.editBreed)


    }
}