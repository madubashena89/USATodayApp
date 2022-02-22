package top.stores.usatodayapp

import android.app.ProgressDialog
import android.os.Bundle
import android.os.Handler
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import top.stores.usatodayapp.data.Crops
import top.stores.usatodayapp.data.MetaData
import top.stores.usatodayapp.data.Slide
import top.stores.usatodayapp.databinding.ActivityMainBinding
import top.stores.usatodayapp.viewModel.MainViewModel
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter:ImageAdapter
    private lateinit var recyclerView : RecyclerView
    private var list: ArrayList<Slide> = ArrayList()
    private val viewModel: MainViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView = binding.recyclerViewImages
        binding.btnFetchData.setOnClickListener {
            viewModel.getData()
            viewModel.dataResponse.observe(this, Observer { mainResoponse ->
                mainResoponse.albums.forEach { album ->
                    list = album.slides as ArrayList<Slide>
                }
                renderMessges(list)
            })
        }
    }

    private fun renderMessges(messages: List<Slide>?){
        adapter = ImageAdapter(this,messages)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.stackFromEnd = true
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

}