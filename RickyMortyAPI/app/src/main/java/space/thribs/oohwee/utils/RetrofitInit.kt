package space.thribs.oohwee.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.reflect.KClass

private val gsonConverterFactory = GsonConverterFactory.create()

class RetrofitInit(url: String) {
    private val retrofitClient = Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(gsonConverterFactory)
        .build()

    fun <T: Any> create(clazz: KClass<T>): T =  retrofitClient.create(clazz.java)
}