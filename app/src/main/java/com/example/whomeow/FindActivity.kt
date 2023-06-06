package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whomeow.databinding.ActivityFindBinding

class FindActivity : AppCompatActivity() {
    lateinit var findBinding: ActivityFindBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find)
        findBinding = ActivityFindBinding.inflate(layoutInflater)

        findBinding.findIdBtn.setOnClickListener {
            val findIntent = Intent(this@FindActivity, FindingId::class.java)
            startActivity(findIntent)
        }

        findBinding.findPwBtn.setOnClickListener {
            val findIntent = Intent(this@FindActivity, FindingPassword::class.java)
            startActivity(findIntent)


        }
    }
}