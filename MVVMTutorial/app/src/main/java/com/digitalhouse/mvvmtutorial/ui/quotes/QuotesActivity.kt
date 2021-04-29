package com.digitalhouse.mvvmtutorial.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.digitalhouse.mvvmtutorial.R
import com.digitalhouse.mvvmtutorial.data.Quote
import com.digitalhouse.mvvmtutorial.utilities.InjectorUtils
import java.lang.StringBuilder
import kotlinx.android.synthetic.main.activity_quotes.*

class QuotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initializeUI()
    }

    private fun initializeUI() {
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        val provider = ViewModelProvider(this, factory)
        val viewModel = provider.get(QuotesViewModel::class.java)

        val quotes = viewModel.getQuotes()
        quotes.observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote ->
                stringBuilder.append("$quote\n\n")
            }
            textView_quotes.text = stringBuilder.toString()
        })

        button_add_quote.setOnClickListener() {

            val quoteText = editText_quote.text.toString()
            val quoteAuthor = editText_author.text.toString()
            val quote = Quote(quoteText, quoteAuthor)
            viewModel.addQuote(quote)
            editText_author.setText("")
            editText_quote.setText("")
        }


    }
}