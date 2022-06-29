package com.example.testretrofit


import com.google.gson.annotations.SerializedName

data class UserProfileData(
    @SerializedName("aboutMe")
    val aboutMe: Any,
    @SerializedName("address")
    val address: Any,
    @SerializedName("adress")
    val adress: Any,
    @SerializedName("domicily")
    val domicily: Any,
    @SerializedName("email")
    val email: Any,
    @SerializedName("facebookAcc")
    val facebookAcc: Any,
    @SerializedName("hobby")
    val hobby: Any,
    @SerializedName("instagramAcc")
    val instagramAcc: Any,
    @SerializedName("language")
    val language: Any,
    @SerializedName("linkedIn")
    val linkedIn: Any,
    @SerializedName("name")
    val name: String,
    @SerializedName("profilePic")
    val profilePic: Any,
    @SerializedName("skill")
    val skill: Any,
    @SerializedName("twitterAcc")
    val twitterAcc: Any,
    @SerializedName("userId")
    val userId: String,
    @SerializedName("workLabel")
    val workLabel: Any
)