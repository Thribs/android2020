package com.example.brick

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StudentsAdapter(private val studentsList: MutableList<Student>) :
    RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.name.text = studentsList[position].name
        holder.registration.text = studentsList[position].registration
    }
    override fun getItemCount() = studentsList.size

    fun addStudent() {
        studentsList.add(studentsList.size, Student("Student ${studentsList.size + 1}", "Registration ${studentsList.size + 1}"))
        notifyDataSetChanged()
    }
}
