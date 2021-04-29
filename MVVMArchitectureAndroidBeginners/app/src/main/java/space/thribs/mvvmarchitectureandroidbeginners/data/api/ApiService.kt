package space.thribs.mvvmarchitectureandroidbeginners.data.api

import io.reactivex.Single
import space.thribs.mvvmarchitectureandroidbeginners.data.model.User

interface ApiService {
    fun getUsers(): Single<List<User>>
}