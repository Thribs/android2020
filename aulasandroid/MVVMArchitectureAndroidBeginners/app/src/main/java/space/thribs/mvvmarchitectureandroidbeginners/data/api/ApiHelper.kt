package space.thribs.mvvmarchitectureandroidbeginners.data.api

class ApiHelper(private val apiService: ApiService) {
    fun getUsers() = apiService.getUsers()
}