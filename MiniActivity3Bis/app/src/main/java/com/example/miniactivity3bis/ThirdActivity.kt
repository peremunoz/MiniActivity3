package com.example.miniactivity3bis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val intent = intent
        if (intent != null) {
            val message = intent.getStringExtra(Intent.EXTRA_TEXT)
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = message
        }
    }
}