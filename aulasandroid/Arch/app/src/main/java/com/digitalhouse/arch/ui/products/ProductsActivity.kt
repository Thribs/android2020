package com.digitalhouse.arch.ui.products

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContract
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.arch.data.Product
import com.digitalhouse.arch.databinding.ActivityProductsBinding
import com.digitalhouse.arch.utilities.InjectorUtils

class ProductsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsBinding

    private lateinit var products: LiveData<List<Product>>

    private lateinit var viewModel: ProductsViewModel

    val newProductResult = registerForActivityResult(NewProductContract()) { product ->
        viewModel.addProduct(product)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityProductsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Create a ViewModel the first time the system calls an activity's onCreate() method.
        // Re-created activities receive the same MyViewModel instance created by the first activity.
        val factory = InjectorUtils.provideProductsViewModelFactory()
        val viewModel = ViewModelProvider(this, factory)
            .get(ProductsViewModel::class.java)
        // Observing LiveData from the ProductsViewModel, which in turn observes
        // LiveData from the repository, which observes LiveData from the DAO :)
        viewModel.getProducts().observe(this, Observer<List<Product>> { products ->
            // Update the list of products
        })

        products = viewModel.getProducts()
        val productsList = products.value ?: listOf()

        val recycler = binding.productsRecyclerView
        recycler.adapter = ProductsAdapter(productsList)
        recycler.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        binding.newProductButton.setOnClickListener() {

            newProductResult.launch("test")
        }
    }

    class NewProductContract : ActivityResultContract<String, Product>() {
        override fun createIntent(context: Context, input: String?): Intent =
            Intent(context, NewProductActivity::class.java)

        override fun parseResult(resultCode: Int, intent: Intent?) =
            Product(
                0,
                intent?.getStringExtra("name") ?: "Chickens",
                intent?.getStringExtra("price")?.toDouble() ?: 0.0
            )
    }
}