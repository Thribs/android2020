package space.thribs.mvvmarchitectureandroidbeginners.data.repository

import io.reactivex.Single
import space.thribs.mvvmarchitectureandroidbeginners.data.api.ApiHelper
import space.thribs.mvvmarchitectureandroidbeginners.data.model.User

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}