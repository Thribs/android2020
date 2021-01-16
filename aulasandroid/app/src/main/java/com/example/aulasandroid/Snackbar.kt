package com.example.aulasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class Snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)
        val button = findViewById<FloatingActionButton>(R.id.button)
        button.setOnClickListener{ view ->
            Snackbar.make(view, "Here's a snackbar", Snackbar.LENGTH_LONG).show()
        }
    }
}