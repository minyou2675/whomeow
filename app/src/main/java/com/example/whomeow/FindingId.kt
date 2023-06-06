package com.example.whomeow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.whomeow.databinding.ActivityFindingIdBinding

class FindingId : AppCompatActivity() {
    lateinit var findingIdBinding: ActivityFindingIdBinding
    //var DB:DBHelp?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_id)
        findingIdBinding = ActivityFindingIdBinding.inflate(layoutInflater)
        //DB = DBHelp(this)

        findingIdBinding.checkIdBtn!!.setOnClickListener {
            val name = findingIdBinding.idInputName!!.text.toString()
            val email = findingIdBinding.idInputEmail!!.text.toString()
            if (name == "" || email == "") Toast.makeText(
                this@FindingId,
                "회원정보를 전부 입력해주세요.",
                Toast.LENGTH_SHORT
            ).show() else {
                /*val checkUseremail = DB!!.checkUseremail(name, email)
                if (checkUseremail == true) {
                    Toast.makeText(this@FindingId, "성공", Toast.LENGTH_SHORT)
                        .show()
                    val intent = Intent(applicationContext, LoginActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@FindingId, "이름과 이메일을 다시 확인해주세요.", Toast.LENGTH_SHORT)
                        .show()
                }*/
            }
        }
    }
}