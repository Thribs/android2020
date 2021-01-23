package com.example.sumapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private val firstNumField by lazy { findViewById<TextInputEditText>(R.id.first_num) }
    private val secondNumField by lazy { findViewById<TextInputEditText>(R.id.second_num) }
    private val button by lazy { findViewById<Button>(R.id.button) }
    private val resultField by lazy { findViewById<TextView>(R.id.result) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val firstNum = firstNumField.text.toString().toInt()
            val secondNum = secondNumField.text.toString().toInt()
            val result = sum(firstNum, secondNum).toString()
            resultField.text = result
            //writeResult(result)
        }

    }
    private fun sum(x: Int, y: Int) : Int { return x + y }
    private fun writeResult(any: Int){ resultField.text =  any.toString()}
}