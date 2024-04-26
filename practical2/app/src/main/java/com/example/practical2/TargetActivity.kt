package com.example.practical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)



        // Get the TextView from the layout
        val textView: TextView = findViewById<TextView>(R.id.text_view)

        // Get the intent that started the activity
        val intent = intent

        // Check if the intent has the expected acti
            // Get the extra data from the intent
            val extraData = intent.getStringExtra("extra_data")

            // Display the received data in the TextView
            textView.text = "Received data: $extraData"
        
    }
}
