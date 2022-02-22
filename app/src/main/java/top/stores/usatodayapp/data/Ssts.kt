package top.stores.usatodayapp.data


import com.google.gson.annotations.SerializedName

data class Ssts(
    @SerializedName("leafName")
    val leafName: String,
    @SerializedName("section")
    val section: Any,
    @SerializedName("storysubject")
    val storysubject: Any,
    @SerializedName("subsection")
    val subsection: Any,
    @SerializedName("subtopic")
    val subtopic: Any,
    @SerializedName("taxonomyEntityDisplayName")
    val taxonomyEntityDisplayName: Any,
    @SerializedName("topic")
    val topic: Any
)