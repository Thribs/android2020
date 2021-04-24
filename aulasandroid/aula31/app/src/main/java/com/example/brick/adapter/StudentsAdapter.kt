package com.example.brick.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.brick.R
import com.example.brick.model.Student
import com.example.brick.adapter.viewholder.StudentViewHolder
import com.example.brick.view.StudentDetailActivity

class StudentsAdapter(private val studentsList: MutableList<Student>) :
    RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.name.text = studentsList[position].name
        holder.registration.text = studentsList[position].registration
        holder.cardview.setOnClickListener {
            val intent = Intent(it.context, StudentDetailActivity::class.java)
            intent.putExtra("NAME", studentsList[position].name)
            intent.putExtra("REGISTRATION", studentsList[position].registration)
        }
    }
    override fun getItemCount() = studentsList.size

    fun addStudent() {
        studentsList.add(studentsList.size, Student("Student ${studentsList.size + 1}", "Registration ${studentsList.size + 1}"))
        notifyDataSetChanged()
    }
}
