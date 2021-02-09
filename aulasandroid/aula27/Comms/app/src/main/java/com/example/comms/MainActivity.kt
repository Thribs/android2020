package com.example.comms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), UserDataContract {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun finishForm(name: String?, email: String?, phone: String?) {
        val fragmentProfile = supportFragmentManager.findFragmentById(R.id.fragment_profile) as FragmentProfile
        fragmentProfile.setData(name, email, phone)
    }
}