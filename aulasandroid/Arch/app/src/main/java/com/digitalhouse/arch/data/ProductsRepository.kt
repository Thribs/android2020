package com.digitalhouse.arch.data

// FakeProductDAO must be passed in - it is a dependency
// You could also instantiate the DAO right inside the class without all the fuss, right?
// No. This would break testability - you need to be able to pass a mock version of a DAO
// to the repository (e.g. one that upon calling getProducts() returns a dummy list of quotes for testing)
// This is the core idea behind DEPENDENCY INJECTION - making things completely modular and independent.

class ProductsRepository private constructor(private val productDAO: FakeProductDAO){

    // This may seem redundant.
    // Imagine a code which also updates and checks the backend.
    fun addProduct(product: Product) {
        productDAO.addProduct(product)
    }

    fun getProducts() = productDAO.getProducts()

    companion object {
        // Singleton instantiation you already know and love
        @Volatile private var instance: ProductsRepository? = null

        fun getInstance(productDAO: FakeProductDAO) =
            instance ?: synchronized(this) {
                instance ?: ProductsRepository(productDAO).also { instance = it }
            }
    }
}