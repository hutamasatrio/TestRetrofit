package com.example.testretrofit


import com.google.gson.annotations.SerializedName

data class Data1Item(
    @SerializedName("body")
    val body: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("userId")
    val userId: Int
)