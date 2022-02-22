package top.stores.usatodayapp.data


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("albums")
    val albums: List<Album>,
    @SerializedName("date")
    val date: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("mobileUrl")
    val mobileUrl: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)