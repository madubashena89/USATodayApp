package top.stores.usatodayapp.data


import com.google.gson.annotations.SerializedName

data class Album(
    @SerializedName("date")
    val date: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("slides")
    val slides: List<Slide>,
    @SerializedName("title")
    val title: String
)