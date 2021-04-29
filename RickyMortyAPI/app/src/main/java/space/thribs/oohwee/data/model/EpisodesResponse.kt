package space.thribs.oohwee.data.model


import com.google.gson.annotations.SerializedName

data class EpisodesResponse(
    @SerializedName("info")
    val info: Info? = null,
    @SerializedName("results")
    val episodes: List<Episode?>? = null
) {
    data class Info(
        @SerializedName("count")
        val count: Int? = null,
        @SerializedName("next")
        val next: String? = null,
        @SerializedName("pages")
        val pages: Int? = null,
        @SerializedName("prev")
        val prev: Any? = null
    )

    data class Episode(
        @SerializedName("air_date")
        val airDate: String? = null,
        @SerializedName("characters")
        val characters: List<String?>? = null,
        @SerializedName("created")
        val created: String? = null,
        @SerializedName("episode")
        val episode: String? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("url")
        val url: String? = null
    )
}