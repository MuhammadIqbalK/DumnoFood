package com.example.dumnofood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.WindowCompat

class signUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()
        WindowCompat.setDecorFitsSystemWindows(window, false)


        val toLogin = findViewById<TextView>(R.id.textlogin)
        val toSignin = findViewById<Button>(R.id.buttonSignup)

        toLogin.setOnClickListener{
            val intent = Intent(this@signUpActivity, LoginActivity::class.java)
            startActivity(intent)
        }
        toSignin.setOnClickListener{
            val intent = Intent(this@signUpActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}