package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentProfile : Fragment() {


    fun setData(name: String, pass: String) {
        view?.let {
            it.findViewById<TextView>(R.id.tv_name).text = name
        }
    }
}