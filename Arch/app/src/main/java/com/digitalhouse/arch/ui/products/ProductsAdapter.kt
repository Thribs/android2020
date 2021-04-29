package com.digitalhouse.arch.ui.products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.arch.data.Product
import com.digitalhouse.arch.databinding.ItemProductBinding

// Pass in the activity to have access to its functions
class ProductsAdapter(val productsList: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        // get the ViewHolder to be inflated
        val context = parent.context
        val binding = ItemProductBinding
                .inflate(LayoutInflater.from(context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        // Get the data model based on position
        val product = productsList.get(position)

        // Set item views based on views and data model
        with(holder.binding) {
            productNameTextView.setText(product.name)
            productPriceTextView.setText(product.price.toString())
            productCheckbox.isChecked = product.isChecked

            productCheckbox.setOnCheckedChangeListener { _, isChecked ->
                product.isChecked = isChecked
            }

        }
        holder.binding.productNameTextView
    }

    override fun getItemCount() = productsList.size

    inner class ProductViewHolder(val binding: ItemProductBinding)
        :RecyclerView.ViewHolder(binding.root)
}
