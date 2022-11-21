package com.example.dumnofood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat

class setLocation1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_location1)
        supportActionBar?.hide()
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}