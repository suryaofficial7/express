package com.example.practical6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // List of 10 games
        val games = arrayOf(
            "Chess",
            "Checkers",
            "Monopoly",
            "Scrabble",
            "Candy Land",
            "Clue",
            "Risk",
            "Uno",
            "Jenga",
            "Twister"
        )

        // Get the ListView from the layout
        val listView: ListView = findViewById<ListView>(R.id.game_list)

        // Create an ArrayAdapter using the games list
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, games)

        // Set the adapter to the ListView
        listView.adapter = adapter

        // Get the TextView from the layout
        val selectedGameTextView: TextView = findViewById<TextView>(R.id.selected_game_text_view)

        // Set an item click listener on the ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            // Get the selected game from the list
            val selectedGame = games[position]

            // Display the selected game in the TextView
            selectedGameTextView.text = "Selected Game: $selectedGame"
        }
    }
}
