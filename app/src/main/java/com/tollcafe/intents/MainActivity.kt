package com.tollcafe.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
        //TODO Step 1 Create Intent to launch new Activity using startActivity()
        //TODO Step 2 To pass any data to next activity
        //TODO Step 3 Start Second activity
        }
    }
}