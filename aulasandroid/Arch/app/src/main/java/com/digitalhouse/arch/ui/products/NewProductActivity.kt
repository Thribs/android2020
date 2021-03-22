package com.digitalhouse.arch.ui.products

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.arch.data.Product
import com.digitalhouse.arch.databinding.ActivityNewProductBinding

class NewProductActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewProductBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.newProductSubmitButton.setOnClickListener {
            setResult(123, Intent().apply {
                putExtra("name", binding.newProductProductNameEditText.text.toString())
                putExtra("price", binding.newProductProductPriceEditText.text.toString().toDouble())
            } )
            finish()
        }
    }
}