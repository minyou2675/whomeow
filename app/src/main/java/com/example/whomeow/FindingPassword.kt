package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityFindingPasswordBinding

class FindingPassword : AppCompatActivity() {
    lateinit var findingPasswordBinding: ActivityFindingPasswordBinding
    //var DB: DBHelp? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_password)
        findingPasswordBinding = ActivityFindingPasswordBinding.inflate(layoutInflater)
        //DB = DBHelp(this)

        findingPasswordBinding.checkPwBtn!!.setOnClickListener {
            val name = findingPasswordBinding.pwInputName!!.text.toString()
            val email = findingPasswordBinding.pwInputEmail!!.text.toString()
            if (name == "" || email == "") Toast.makeText(
                this@FindingPassword,
                "회원정보를 전부 입력해주세요.",
                Toast.LENGTH_SHORT
            ).show()
            /*else {
                val checkUseremail = DB!!.checkUseremail(name, email)
                if (checkUseremail == true) {
                    val intent = Intent(applicationContext, LoginActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@FindingPassword, "이름과 이메일을 다시 확인해주세요.", Toast.LENGTH_SHORT)
                        .show()
                }
            } */
        }
    }
}