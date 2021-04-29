package com.digitalhouse.mvvmtutorial.utilities

import com.digitalhouse.mvvmtutorial.data.FakeDatabase
import com.digitalhouse.mvvmtutorial.data.QuoteRepository
import com.digitalhouse.mvvmtutorial.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val fakeDatabase = FakeDatabase.getInstance()
        val quoteDAO = fakeDatabase.quoteDAO
        val quoteRepository = QuoteRepository.getInstance(quoteDAO)
        return QuotesViewModelFactory(quoteRepository)
    }
}