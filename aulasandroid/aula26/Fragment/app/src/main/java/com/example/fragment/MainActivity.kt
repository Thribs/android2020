package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val transactionCreate = fragmentManager.beginTransaction()

        transactionCreate.add(R.id.container1, FragmentExample1())
        transactionCreate.add(R.id.container2, FragmentExample2())
        transactionCreate.commit()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val transactionReplace = fragmentManager.beginTransaction()
            transactionReplace.replace(R.id.container1, FragmentExample2())
            transactionReplace.replace(R.id.container2, FragmentExample1())
            transactionReplace.commit()
        }
    }


}