package com.example.dumnofood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class DonateFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donatefood)
        clickListener();

    supportActionBar!!.title = "Donate Food"

    }

    public fun clickListener(){
        var card1 = findViewById<CardView>(R.id.card1);

        card1.setOnClickListener{
            openDonateFoodActivity()
        }
    }
    public fun openDonateFoodActivity(){
        startActivity(Intent(this@DonateFoodActivity, add_donate::class.java))

    }

}