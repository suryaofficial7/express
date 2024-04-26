package com.example.practical9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set the Toolbar as the AppBar
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    // Inflate the menu with the main menu and submenu items
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    // Handle submenu item selections
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.submenu_item1 -> {
                // Display a Toast message for Submenu Item 1
                Toast.makeText(this, "Selected Submenu Item 1", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.submenu_item2 -> {
                // Display a Toast message for Submenu Item 2
                Toast.makeText(this, "Selected Submenu Item 2", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
