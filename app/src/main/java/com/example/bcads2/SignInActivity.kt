package com.example.bcads2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btn_login.setOnClickListener {
            finish()
            startActivity(Intent(this, HomeActivity::class.java))
        }

        tv_signup.setOnClickListener {
            finish()
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}