package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "ON Start", Toast.LENGTH_SHORT).show()


    }
    override fun onStart(){
        super.onStart()
        Toast.makeText(this,"ON Start",Toast.LENGTH_SHORT).show()
    }

    override  fun onResume(){
        super.onResume()
        Toast.makeText(this,"ON Resume",Toast.LENGTH_SHORT).show()
    }

    override  fun onPause(){
        super.onPause()
        Toast.makeText(this,"ON Pause",Toast.LENGTH_SHORT).show()
    }


    override  fun onStop() {
        super.onStop()
        Toast.makeText(this, "ON Stop", Toast.LENGTH_SHORT).show()
    }
    override  fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "ON Restart", Toast.LENGTH_SHORT).show()
    }
    override  fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "ON Destroy", Toast.LENGTH_SHORT).show()
    }
    }
