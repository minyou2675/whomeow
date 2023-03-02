package com.example.whomeow

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val kakaoLoginBtn = findViewById<Button>(R.id.kakaoLoginBtn)

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