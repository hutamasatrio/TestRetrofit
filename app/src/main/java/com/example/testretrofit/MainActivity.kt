package com.example.testretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.tugasakhirnew.network.ApiInterface
import com.example.tugasakhirnew.network.RetrofitClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val apiInterface = RetrofitClient.getNewtwork().create(ApiInterface::class.java)
    private val apiInterface2 = RetrofitClient.getNewtwork2().create(ApiInterface::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()
    }

    private fun getData() {
        val user = apiInterface2.getData()
        user.enqueue(object : Callback<Array<UserProfileData>?> {
            override fun onResponse(call: Call<Array<UserProfileData>?>, response: Response<Array<UserProfileData>?>) {
                val responseBody = response.body()!!

                val myStringBuilder = StringBuilder()
                for (myData in responseBody) {
                    myStringBuilder.append(myData.userId)
                    myStringBuilder.append("/n")
                }
                    txtId.text = myStringBuilder
                }


            override fun onFailure(call: Call<Array<UserProfileData>?>, t: Throwable) {
                Toast.makeText(this@MainActivity, "data gagal", Toast.LENGTH_SHORT).show()
                Log.d("main activity", "failed to load data"+t.message)
            }
        })

//        val coba = apiInterface.getDatacoba()
//        coba.enqueue(object : Callback<List<Data1Item>?> {
//            override fun onResponse(
//                call: Call<List<Data1Item>?>,
//                response: Response<List<Data1Item>?>
//            ) {
//
//                val responseBody = response.body()!!
//                val myStringBuilder = StringBuilder()
//                for (myData in responseBody) {
//                    myStringBuilder.append(myData.title)
//                    myStringBuilder.append("/n")
//                }
//                txtId2.text = myStringBuilder
//            }
//
//
//            override fun onFailure(call: Call<List<Data1Item>?>, t: Throwable) {
//                Toast.makeText(this@MainActivity, "data gagal", Toast.LENGTH_SHORT).show()
//                Log.d("main activity", "failed to load data"+t.message)
//            }
//        })
//
        val user2 = apiInterface2.getResponse()
        user2.enqueue(object : Callback<List<UserProfile>?> {
            override fun onResponse(call: Call<List<UserProfile>?>, response: Response<List<UserProfile>?>) {
                val responseBody = response.body()!!

                val myStringBuilder = StringBuilder()
                for (myData in responseBody) {
                    myStringBuilder.append(myData.data)
                    myStringBuilder.append("/n")
                }
                txtId.text = myStringBuilder
            }


            override fun onFailure(call: Call<List<UserProfile>?>, t: Throwable) {
                Toast.makeText(this@MainActivity, "data gagal", Toast.LENGTH_SHORT).show()
                Log.d("main activity", "failed to load data"+t.message)
            }
        })


    }
}