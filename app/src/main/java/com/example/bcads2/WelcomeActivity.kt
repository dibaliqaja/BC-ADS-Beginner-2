package com.example.bcads2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_start)

        btn_started.setOnClickListener {
            finish()
            startActivity(Intent(this, SignInActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }
    }
}