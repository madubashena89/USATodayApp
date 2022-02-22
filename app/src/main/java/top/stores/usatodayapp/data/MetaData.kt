package top.stores.usatodayapp.data


import com.google.gson.annotations.SerializedName

data class MetaData(
    @SerializedName("crops")
    val crops: Crops,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("document")
    val document: String,
    @SerializedName("items")
    val items: Items
)