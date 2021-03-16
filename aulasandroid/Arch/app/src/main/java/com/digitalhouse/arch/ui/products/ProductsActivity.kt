package com.digitalhouse.arch.ui.products

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.arch.data.Product
import com.digitalhouse.arch.databinding.ActivityProductsBinding
import com.digitalhouse.arch.utilities.InjectorUtils

class ProductsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsBinding
    private lateinit var productsList: List<Product>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Create a ViewModel the first time the system calls an activity's onCreate() method.
        // Re-created activities receive the same MyViewModel instance created by the first activity.

        // Use the 'by viewModels()' Kotlin property delegate
        // from the activity-ktx artifact
        val factory = InjectorUtils.provideProductsViewModelFactory()
        val viewModel = ViewModelProvider(this, factory)
            .get(ProductsViewModel::class.java)
        // Observing LiveData from the ProductsViewModel, which in turn observes
        // LiveData from the repository, which observes LiveData from the DAO :)
        viewModel.getProducts().observe(this, Observer<List<Product>> { products ->
            // Update the list of products
            productsList = products
        })

        productsList = viewModel.getProducts().value ?: listOf()

        val recycler = binding.productsRecyclerView
        recycler.adapter = ProductsAdapter(productsList, this)
        recycler.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        binding.newProductButton.setOnClickListener() {
            val intent = Intent(this, NewProductActivity::class.java)
            startActivity(intent)
        }
    }
}