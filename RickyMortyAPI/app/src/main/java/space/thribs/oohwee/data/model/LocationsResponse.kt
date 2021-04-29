package space.thribs.oohwee.data.model


import com.google.gson.annotations.SerializedName

data class LocationsResponse(
    @SerializedName("info")
    val info: Info? = null,
    @SerializedName("results")
    val locations: List<Location?>? = null
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

    data class Location(
        @SerializedName("created")
        val created: String? = null,
        @SerializedName("dimension")
        val dimension: String? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("residents")
        val residents: List<String?>? = null,
        @SerializedName("type")
        val type: String? = null,
        @SerializedName("url")
        val url: String? = null
    )
}