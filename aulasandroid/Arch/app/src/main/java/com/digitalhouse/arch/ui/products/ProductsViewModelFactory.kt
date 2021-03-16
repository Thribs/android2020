package com.digitalhouse.arch.ui.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.digitalhouse.arch.data.ProductsRepository

// The same repository that's needed for ProductsViewModel
// is also passed to the factory
class ProductsViewModelFactory(private val productsRepository: ProductsRepository)
    : ViewModelProvider.NewInstanceFactory(){
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProductsViewModel(productsRepository) as T
    }

}