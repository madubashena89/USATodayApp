package top.stores.usatodayapp.data


import com.google.gson.annotations.SerializedName

data class Slide(
    @SerializedName("id")
    val id: Int,
    @SerializedName("metaData")
    val metaData: MetaData,
    @SerializedName("mobileUrl")
    val mobileUrl: String,
    @SerializedName("position")
    val position: Int,
    @SerializedName("ssts")
    val ssts: Ssts,
    @SerializedName("status")
    val status: String,
    @SerializedName("taxonomyEntities")
    val taxonomyEntities: List<Any>,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)