package com.example.tugasakhirnew.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitClient {
    val BASE_URL = "https://api-ta-satrio.000webhostapp.com/api/"
    val BASE_URL2 = "https://jsonplaceholder.typicode.com/"

    fun getInterceptor(): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okhttp = OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor)
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build()

        return okhttp
    }

    fun getNewtwork(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(BASE_URL2)
                .client(getInterceptor())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
    fun getNewtwork2(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
                .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
