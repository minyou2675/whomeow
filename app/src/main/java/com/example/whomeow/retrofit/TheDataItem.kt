package com.example.nycy1020.whomeowproject.retrofit


import com.google.gson.annotations.SerializedName

data class TheDataItem(
    @SerializedName("behaviors")
    val behaviors: String,
    @SerializedName("frequency")
    val frequency: Float
)