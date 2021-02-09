package com.example.comms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentProfile : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    fun setData(name: String?, email: String?, phone: String?) {
        view?.let {
            it.findViewById<TextView>(R.id.tv_profile_name).text = name
            it.findViewById<TextView>(R.id.tv_profile_email).text = email
            it.findViewById<TextView>(R.id.tv_profile_phone).text = phone
        }
    }
}