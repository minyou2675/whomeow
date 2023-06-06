package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var loginBinding: ActivityLoginBinding
    //var DB: DBHelp? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(loginBinding.root)
        //DB = DBHelp(this)

        loginBinding.login!!.setOnClickListener {
            val userId = loginBinding.Id!!.text.toString()
            val userPassword = loginBinding.Pw!!.text.toString()
            if (userId == "" || userPassword == "") Toast.makeText(
                this@LoginActivity,
                "회원정보를 전부 입력하세요",
                Toast.LENGTH_SHORT
            ).show() else {
                /*val checkUserpass = DB!!.checkUserpass(userid, pass)
                if (checkUserpass == true) {
                    Toast.makeText(this@LoginActivity, "login", Toast.LENGTH_SHORT)
                        .show()
                    val intent = Intent(applicationContext, DailyChart::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@LoginActivity, "no one", Toast.LENGTH_SHORT)
                        .show()
                } */
            }
        }
        loginBinding.joinBtn.setOnClickListener {
            val loginIntent = Intent(this@LoginActivity, Join1::class.java)
            startActivity(loginIntent)

        }

        loginBinding.findBtn.setOnClickListener {
            val loginIntent = Intent(this@LoginActivity, FindActivity::class.java)
            startActivity(loginIntent)
        }
    }
}