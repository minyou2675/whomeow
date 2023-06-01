package com.example.nycy1020.whomeowproject.retrofit

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("api/users/")
    fun getDataList(): Call<ArrayList<TheDataItem>>

    ////
}