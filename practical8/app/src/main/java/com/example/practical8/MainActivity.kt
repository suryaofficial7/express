package com.example.practical8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    // Track which image is currently displayed
    private var isImage1Displayed = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the ImageView and Button in the layout
        val imageView: ImageView = findViewById<ImageView>(R.id.image_view)
        val buttonChangeImage: Button = findViewById<Button>(R.id.button_change_image)

        // Set a click listener on the button
        buttonChangeImage.setOnClickListener {
            // Change the image in the ImageView
            if (isImage1Displayed) {
                // Switch to image2
                imageView.setImageResource(R.drawable.image2)
            } else {
                // Switch to image1
                imageView.setImageResource(R.drawable.image1)
            }
            // Toggle the flag
            isImage1Displayed = !isImage1Displayed
        }
    }
}
