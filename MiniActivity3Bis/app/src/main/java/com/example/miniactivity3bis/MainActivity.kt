package com.example.miniactivity3bis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        if (intent != null) {
            val message = intent.getStringExtra(Intent.EXTRA_TEXT)
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = message
        }
    }
}