package com.digitalhouse.arch.ui.products

import androidx.lifecycle.ViewModel
import com.digitalhouse.arch.data.Product
import com.digitalhouse.arch.data.ProductsRepository

class ProductsViewModel(private val productsRepository: ProductsRepository) : ViewModel() {

    fun addProduct(product: Product) = productsRepository.addProduct(product)

    fun getProducts() = productsRepository.getProducts()
}