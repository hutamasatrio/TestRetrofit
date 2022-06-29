package com.example.tugasakhirnew.network


import com.example.testretrofit.UserProfileData
import com.example.testretrofit.Data1Item
import com.example.testretrofit.UserProfile
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("userprofile")
    fun getData(): Call<Array<UserProfileData>>

    @GET("userprofile")
    fun getResponse(): Call<List<UserProfile>>

    @GET("posts")
    fun getDatacoba(): Call<List<Data1Item>>


}