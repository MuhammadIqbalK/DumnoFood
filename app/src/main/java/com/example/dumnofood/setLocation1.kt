package com.example.dumnofood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowCompat

class setLocation1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_location1)
        supportActionBar?.hide()
        WindowCompat.setDecorFitsSystemWindows(window, false)


    val toHome = findViewById<Button>(R.id.buttonSetloc)

    toHome.setOnClickListener{
        val intent = Intent(this@setLocation1, navMain::class.java)
        startActivity(intent)
    }


}

}