package com.digitalhouse.arch.ui.products

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.arch.R

// Provide a direct reference to each of the views within a data item
// Used to cache the views within the item layout for fast access
class ProductViewHolder(productView: View) : RecyclerView.ViewHolder(productView) {
    // Your holder should contain and initialize a member variable
    // for any view that will be set as you render a row
    val productTextView by lazy { productView.findViewById<TextView>(R.id.product_name_text_view) }
    val priceTextView by lazy { productView.findViewById<TextView>(R.id.product_price_text_view) }
    val productCheckBox by lazy { productView.findViewById<CheckBox>(R.id.product_checkbox) }
}
