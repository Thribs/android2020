package com.example.brick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val recycler by lazy { findViewById<RecyclerView>(R.id.recyclerview) }
    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }
    val button by lazy { findViewById<Button>(R.id.button) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val students = getStudents()
        recycler.layoutManager = LinearLayoutManager(this)
        val adapter = StudentsAdapter(students)
        recycler.adapter = adapter

        button.setOnClickListener {
            StudentsAdapter(students).addStudent()
            adapter.notifyDataSetChanged()
        }
    }

    private fun getStudents(): MutableList<Student> {
        val students = mutableListOf<Student>()
        for (i in 1..30){
            val student = Student("Student $i","Registration $i")
            students.add(student)
            }
        return students
    }
}