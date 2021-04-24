package com.digitalhouse.mvvmtutorial.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.digitalhouse.mvvmtutorial.data.QuoteRepository


class QuotesViewModelFactory(private val quoteRepository: QuoteRepository)
    : ViewModelProvider.NewInstanceFactory(){

    // Don't mind the annotation. It's just supressing an error, following the tutorial
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}