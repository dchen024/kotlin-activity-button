package com.example.learningactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val TAG = "Activity 1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button with the ID "btn_next"
        var btn_next = findViewById<Button>(R.id.btn_next)

        // Set a click listener on the Button
        btn_next.setOnClickListener {
            // Create an Intent to start the MainActivity2
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        Log.d(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }
}