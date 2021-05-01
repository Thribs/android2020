package space.thribs.oohwee.data.model.character

import com.google.gson.annotations.SerializedName
import space.thribs.oohwee.data.model.Info

data class CharactersResponse(
    @SerializedName("info")
    val info: Info? = null,
    @SerializedName("results")
    val characters: List<Character> = listOf()
)