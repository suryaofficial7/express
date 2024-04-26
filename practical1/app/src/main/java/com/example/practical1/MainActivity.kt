package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    // Inflate the menu with the items defined in menu_main.xml
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    // Handle selections on the menu items
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_settings -> {
                // Display a Toast message for Settings
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_search -> {
                // Display a Toast message for Search
                Toast.makeText(this, "Search selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_compose_email -> {
                // Although Compose Email is disabled, handle it just in case
                Toast.makeText(this, "Compose Email selected (disabled)", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_feedback -> {
                // Display a Toast message for Feedback
                Toast.makeText(this, "Feedback selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
