package com.example.brick.adapter.viewholder

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.brick.R

class StudentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name by lazy { view.findViewById<TextView>(R.id.tv_item_name) }
    val registration by lazy { view.findViewById<TextView>(R.id.tv_item_registration) }
    val cardview by lazy { view.findViewById<CardView>(R.id.cardview) }
}
