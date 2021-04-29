package space.thribs.mvvmarchitectureandroidbeginners.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import space.thribs.mvvmarchitectureandroidbeginners.data.api.ApiHelper
import space.thribs.mvvmarchitectureandroidbeginners.data.repository.MainRepository
import space.thribs.mvvmarchitectureandroidbeginners.ui.main.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}