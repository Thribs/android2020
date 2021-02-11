package com.example.brick

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name by lazy { view.findViewById<TextView>(R.id.tv_name) }
    val registration by lazy { view.findViewById<TextView>(R.id.tv_registration) }
}
