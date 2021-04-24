package com.digitalhouse.arch.data

data class Product(val id: Int, val name:String, val price: Double) {
    var isChecked = false
    override fun toString(): String {
        return "$name - $price"
    }
}