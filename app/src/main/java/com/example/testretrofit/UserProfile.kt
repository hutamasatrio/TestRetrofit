package com.example.testretrofit


import com.google.gson.annotations.SerializedName

data class UserProfile(
    @SerializedName("data")
    val `data`: List<UserProfileData>,
    @SerializedName("status")
    val status: Boolean
)