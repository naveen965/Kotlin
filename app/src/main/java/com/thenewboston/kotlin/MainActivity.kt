package com.thenewboston.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById<Button>(R.id.button)
        // or val button : Button = findViewById<TextView>(R.id.button) as Button

        button.setOnClickListener {
            onClick()
        }

    }
    fun onClick() {
        /*var text = findViewById<TextView>(R.id.button)
        text.setText("hello")*/
        val intent = Intent(this,Main2Activity::class.java)
        startActivity(intent)
    }
}