package com.example.kotlinproctice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SpalshScreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)

        Handler().postDelayed(
            {
                val i = Intent(this@SpalshScreen, MainActivity::class.java)
                startActivity(i)
                finish()
            }, SPLASH_TIME_OUT)
    }
}



