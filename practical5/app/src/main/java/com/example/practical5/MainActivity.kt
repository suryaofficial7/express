package com.example.practical5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Find the widgets by their IDs
        val button: Button = findViewById<Button>(R.id.button)
        val imageView: ImageView = findViewById<ImageView>(R.id.image_view)
        val editText: EditText = findViewById<EditText>(R.id.edit_text)
        val messageTextView: TextView = findViewById<TextView>(R.id.message_text_view)

        // Set OnClickListener on the Button
        button.setOnClickListener {
            messageTextView.text = "Button clicked!"
        }

        // Set OnLongClickListener on the Button
        button.setOnLongClickListener {
            messageTextView.text = "Button long clicked!"
            true
        }

        // Set OnTouchListener on the ImageView
            imageView.setOnTouchListener { _, event ->
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        messageTextView.text = "Image touched (Action Down)"
                    }
                    MotionEvent.ACTION_UP -> {
                        messageTextView.text = "Image touch released (Action Up)"
                }
                MotionEvent.ACTION_POINTER_DOWN -> {
                    messageTextView.text = "Additional finger touched (Pointer Down)"
                }
            }
            true
        }

        // Set OnKeyListener on the EditText
        editText.setOnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_DOWN) {
                // Check if Enter key is pressed
                messageTextView.text = "Enter key pressed in EditText"
                true
            } else {
                false
            }
        }
    }
}
