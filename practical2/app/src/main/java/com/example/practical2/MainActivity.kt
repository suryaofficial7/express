package com.example.practical2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the button from the layout
        val sendButton: Button = findViewById<Button>(R.id.send_button)

        // Set an OnClickListener on the button
        sendButton.setOnClickListener {
            // Create an intent to launch the target app
            val intent = Intent(this@MainActivity,TargetActivity::class.java);
            intent.putExtra("extra_data", "Hello from Source App!")

            // Check if there is an app that can handle the intent
                startActivity(intent)

        }
    }
}
