package top.stores.usatodayapp.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.GsonBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONException
import top.stores.usatodayapp.data.NetworkUtility
import top.stores.usatodayapp.data.Response

class MainViewModel : ViewModel() {
    val dataResponse = MutableLiveData<Response>()
    private lateinit var profile: Response

    fun getData(){
        viewModelScope.launch(Dispatchers.IO) {
            val rss = NetworkUtility.request()
            try {
                val gson = GsonBuilder().create()
                profile =
                    gson.fromJson(rss, Response::class.java)

                Log.d("TAG", "getData: $profile")

            } catch (e: JSONException) {
                e.printStackTrace()
            }
            withContext(Dispatchers.Main) {

                dataResponse.value=profile

            }
        }
    }
}