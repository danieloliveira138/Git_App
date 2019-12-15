package com.danieloliveira.gitapp.ui.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danieloliveira.gitapp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        sendToMainActivity()
    }

    private fun sendToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        this.finish()
    }
}
