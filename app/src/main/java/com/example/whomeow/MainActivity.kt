package com.example.whomeow

import android.content.Intent
import android.graphics.drawable.GradientDrawable
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.whomeow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.loginBtn.setOnClickListener {
            startActivity((Intent(this,WeeklyChart::class.java)))
        }

        binding.kakaoLoginBtn.setOnClickListener {
            startActivity((Intent(this,MonthlyChart::class.java)))
        }




//        val drawable = resources.getDrawable(R.drawable.kakao_login_medium_narrow)
//
//        kakaoLoginBtn.background = drawable
//
//        val radius = resources.getDimensionPixelSize(R.dimen.corner_radius).toFloat()
//        val shape = GradientDrawable()
//        shape.cornerRadius = radius
//        kakaoLoginBtn.background = shape
    }


}