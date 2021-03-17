package com.digitalhouse.arch.ui.products

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.arch.R
import com.digitalhouse.arch.data.Product
import java.util.*

// Pass in the activity to have access to its functions
class ProductsAdapter(val productsList: LiveData<List<Product>>, val activity: ProductsActivity) : RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        // get the ViewHolder to be inflated
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val productView = inflater.inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        // Get the data model based on position
        val product = productsList.value?.get(position) ?: Product(0, "", 0.0)

        // Set item views based on views and data model
        holder.productTextView.setText(product.name)
        holder.priceTextView.setText(product.price.toString())
        holder.productCheckBox.isChecked = product.isChecked

        // Product checking logic
        holder.productCheckBox.setOnCheckedChangeListener { _, isChecked ->
            product.isChecked = isChecked
            Log.d("tag","click")
        }
    }

    override fun getItemCount() = productsList.value?.size ?: 0
}
