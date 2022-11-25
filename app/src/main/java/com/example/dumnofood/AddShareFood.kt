package com.example.dumnofood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddShareFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_share_food)

        supportActionBar!!.title = "Share Food"
    }
}