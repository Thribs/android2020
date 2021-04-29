package com.digitalhouse.arch.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeProductDAO {
    // A fake database table
    private val productsList = mutableListOf<Product>(
        Product(1,"Apple crate",8.00),
        Product(2,"Banana bunch",5.00))


    // Livedata can be observed for changes
    private val products = MutableLiveData<List<Product>>()

    init {
        // Immediately connect the now empty productsList
        // to the MutableLiveData which can be observed
        products.value = productsList
    }

    fun addProduct(product: Product) {
        productsList.add(product)
        // After adding a product to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        products.value = productsList
    }
    // Casting MutableLiveData to LiveData because its value
    // shouldn't be changed from other classes
    fun getProducts() = products as LiveData<List<Product>>

    fun productCheck(product: Product, check: Boolean) { product.isChecked = check }


}