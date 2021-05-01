package space.thribs.oohwee.data.repository

import space.thribs.oohwee.utils.RMEndpoint
import space.thribs.oohwee.utils.RetrofitInit

class RickAndMortyRepository {
    private val url = "https://rickandmortyapi.com/api/"

    private val rickAndMortyService = RetrofitInit(url).create(RMEndpoint::class)

    suspend fun getCharactersResponse() = rickAndMortyService.getCharactersResponse()
}