package com.example.practical11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animals = arrayOf("Lion", "Tiger", "Elephant", "Giraffe", "Zebra", "Kangaroo", "Panda", "Penguin", "Bear", "Wolf")

        // Get the ListView from the layout
        val listView: ListView = findViewById<ListView>(R.id.animal_list)

        // Create an ArrayAdapter using the animals list
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animals)

        // Set the adapter to the ListView
        listView.adapter = adapter

        // Set an item click listener on the ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            // Display a Toast message with the selected animal
            val selectedAnimal = animals[position]
            Toast.makeText(this, "Selected: $selectedAnimal", Toast.LENGTH_SHORT).show()
        }
    }
}