package com.example.dumnofood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.view.WindowCompat
import com.example.dumnofood.fragmentGetStarted.startgtActivity

class splashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        supportActionBar?.hide()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        Handler().postDelayed(Runnable {
            val i = Intent(this@splashscreenActivity, startgtActivity::class.java)
            startActivity(i)
            // close this activity
            finish()
        }, 3000)
    }
}