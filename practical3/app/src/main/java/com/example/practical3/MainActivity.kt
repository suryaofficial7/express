package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Override the onBackPressed method
    override fun onBackPressed() {
        // Create an Alert Dialog
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Exit App")
        builder.setMessage("Are you sure you want to exit the app?")

        // Set the positive button
        builder.setPositiveButton("Yes") { dialog, _ ->
            // Exit the app
            super.onBackPressed()
        }

        // Set the negative button
        builder.setNegativeButton("No") { dialog, _ ->
            // Dismiss the dialog
            dialog.dismiss()
        }

        // Show the dialog
        val alertDialog = builder.create()
        alertDialog.show()
    }
}
