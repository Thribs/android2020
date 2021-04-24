package com.digitalhouse.arch.utilities

import com.digitalhouse.arch.data.FakeDatabase
import com.digitalhouse.arch.data.ProductsRepository
import com.digitalhouse.arch.ui.products.ProductsViewModelFactory

object InjectorUtils {
    // This will be called from ProductsActivity
    fun provideProductsViewModelFactory(): ProductsViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val productRepository = ProductsRepository.getInstance(FakeDatabase.getInstance().productDAO)
        return ProductsViewModelFactory(productRepository)
    }
}