package com.example.clicktocountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleText = findViewById<TextView>(R.id.title_text)
        val counterText = findViewById<TextView>(R.id.counter_text)
        val button = findViewById<Button>(R.id.push_button)

        var counter = 10
        counterText.text = counter.toString()

        button.setOnClickListener{
            counter --
            counterText.text = counter.toString()

            if (counter == 0){
                counter = 11
                titleText.text = "Continue?"
                counterText.text = ""
            } else {
                titleText.text = "Countdown with Chocobo"
            }
        }
    }
}