package top.stores.usatodayapp.data


import com.google.gson.annotations.SerializedName

data class Crops(
    @SerializedName("front_thumb")
    val frontThumb: String,
    @SerializedName("1_1")
    val x11: String,
    @SerializedName("16_9")
    val x169: String,
    @SerializedName("3_4")
    val x34: String,
    @SerializedName("4_3")
    val x43: String,
    @SerializedName("9_16")
    val x916: String
)