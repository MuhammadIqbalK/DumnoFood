package com.example.dumnofood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.view.WindowCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        WindowCompat.setDecorFitsSystemWindows(window, false)

            val bckSignup = findViewById<ImageButton>(R.id.bcksignup)
            val btnlogin =  findViewById<Button>(R.id.buttonSignin)

        bckSignup.setOnClickListener{
            val intent = Intent(this@LoginActivity, signUpActivity::class.java)
            startActivity(intent)
        }
        btnlogin.setOnClickListener{
            val intent = Intent(this@LoginActivity, setLocation1::class.java)
            startActivity(intent)
        }


    }
}