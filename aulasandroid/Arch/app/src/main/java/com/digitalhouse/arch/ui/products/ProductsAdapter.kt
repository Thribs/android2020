package com.digitalhouse.arch.ui.products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.arch.R
import com.digitalhouse.arch.data.Product

// Pass in the activity to have access to its functions
class ProductsAdapter(val productsList: List<Product>, val activity: ProductsActivity) : RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        // get the ViewHolder to be inflated
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val productView = inflater.inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        // Get the data model based on position
        val product = productsList.get(position)

        // Set item views based on views and data model
        holder.productTextView.setText(product.name)
        holder.priceTextView.setText(product.price.toString())
        holder.productCheckBox.isChecked = product.isChecked

        // Product checking logic
    }

    override fun getItemCount() = productsList.size
}
