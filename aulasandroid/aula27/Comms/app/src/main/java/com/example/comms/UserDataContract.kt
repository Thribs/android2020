package com.example.comms

interface UserDataContract {
    fun finishForm(name: String? = null, email: String? = null, phone: String? = null)
}