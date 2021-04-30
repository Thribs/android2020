package space.thribs.oohwee.utils

import retrofit2.http.GET
import space.thribs.oohwee.data.model.CharactersResponse
import space.thribs.oohwee.data.model.EpisodesResponse
import space.thribs.oohwee.data.model.LocationsResponse

interface RMEndpoint {

    @GET("character")
    suspend fun getCharactersResponse() : CharactersResponse

    @GET("location")
    suspend fun getLocationResponse() : LocationsResponse

    @GET("episode")
    suspend fun getEpisodeResponse() : EpisodesResponse
}