package space.thribs.oohwee.utils

import retrofit2.http.GET
import retrofit2.http.Path
import space.thribs.oohwee.data.model.character.Character
import space.thribs.oohwee.data.model.character.CharactersResponse

interface RMEndpoint {

    @GET("character")
    suspend fun getCharactersResponse() : CharactersResponse

    @GET("character/{}")
    suspend fun getCharacter(id: String) : Character

}