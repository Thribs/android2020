package space.thribs.mvvmarchitectureandroidbeginners.data.api

import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single
import space.thribs.mvvmarchitectureandroidbeginners.data.model.User

class ApiServiceImpl : ApiService {
    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getObjectListSingle(User::class.java)
    }
}