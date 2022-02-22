package top.stores.usatodayapp

import android.content.ContentValues.TAG
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.provider.ContactsContract.CommonDataKinds.Website.URL
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import top.stores.usatodayapp.data.Crops
import top.stores.usatodayapp.data.Slide
import java.net.URL

class ImageAdapter (private val context: Context, private val corps: List<Slide>?) : RecyclerView.Adapter<ImageAdapter.ViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, index: Int): ViewHolder {
        val rootView = LayoutInflater.from(viewGroup.context).inflate(R.layout.card, viewGroup, false)
        return ViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return corps?.size!!
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, index: Int) {
        val item = corps?.get(index)
      //  item?.metaData?.crops?.frontThumb?.let { downloadBitmap(it) }
        Glide
            .with(context)
            .load(item?.metaData?.crops?.frontThumb)
            .placeholder(R.drawable.ic_launcher_background)
            .into(viewHolder.imageUrl)
    }


    private fun downloadBitmap(imageUrl: String): Bitmap? {
        return try {
            val conn = URL(imageUrl).openConnection()
            conn.connect()
            val inputStream = conn.getInputStream()
            val bitmap = BitmapFactory.decodeStream(inputStream)
            inputStream.close()
            bitmap
        } catch (e: Exception) {
            Log.e(TAG, "Exception $e")
            null
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var imageUrl: ImageView = itemView.findViewById(R.id.imageView)
    }

}