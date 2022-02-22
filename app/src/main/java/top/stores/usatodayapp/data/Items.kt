package top.stores.usatodayapp.data


import com.google.gson.annotations.SerializedName

data class Items(
    @SerializedName("alternate")
    val alternate: String,
    @SerializedName("authoringurl")
    val authoringurl: String,
    @SerializedName("basename")
    val basename: String,
    @SerializedName("byline")
    val byline: String,
    @SerializedName("bylinetitle")
    val bylinetitle: String,
    @SerializedName("cachettl")
    val cachettl: String,
    @SerializedName("caption")
    val caption: String,
    @SerializedName("credit")
    val credit: String,
    @SerializedName("cutline")
    val cutline: String,
    @SerializedName("datephototaken")
    val datephototaken: String,
    @SerializedName("imagecropstatus")
    val imagecropstatus: String,
    @SerializedName("imgindex")
    val imgindex: String,
    @SerializedName("imguniquename")
    val imguniquename: String,
    @SerializedName("isRemote")
    val isRemote: String,
    @SerializedName("isautocroppedseton")
    val isautocroppedseton: String,
    @SerializedName("isimagevisitedbyuser")
    val isimagevisitedbyuser: String,
    @SerializedName("keywords")
    val keywords: String,
    @SerializedName("latlong")
    val latlong: String,
    @SerializedName("location")
    val location: String,
    @SerializedName("oImageHeight")
    val oImageHeight: String,
    @SerializedName("oImageWidth")
    val oImageWidth: String,
    @SerializedName("oimageheight")
    val oimageheight: String,
    @SerializedName("oimagewidth")
    val oimagewidth: String,
    @SerializedName("orientation")
    val orientation: String,
    @SerializedName("origimagename")
    val origimagename: String,
    @SerializedName("publishurl")
    val publishurl: String,
    @SerializedName("rootpath")
    val rootpath: String,
    @SerializedName("simageheight")
    val simageheight: String,
    @SerializedName("simagewidth")
    val simagewidth: String,
    @SerializedName("smallbasename")
    val smallbasename: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("title")
    val title: String
)