package com.example.snacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    val fab by lazy { findViewById<FloatingActionButton>(R.id.fab) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener {
            val snack = Snackbar.make(fab, R.string.snack, Snackbar.LENGTH_LONG)
                    .setAction(R.string.action_text) {
                        this.finishAffinity()
                    }
            snack.show()
        }
    }
}