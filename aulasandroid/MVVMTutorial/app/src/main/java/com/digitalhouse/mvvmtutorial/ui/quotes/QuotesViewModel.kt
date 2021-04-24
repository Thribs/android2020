package com.digitalhouse.mvvmtutorial.ui.quotes

import androidx.lifecycle.ViewModel
import com.digitalhouse.mvvmtutorial.data.Quote
import com.digitalhouse.mvvmtutorial.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel(){

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}