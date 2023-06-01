package com.example.nycy1020.whomeowproject.retrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConnection {

    companion object {
        private var retrofit: Retrofit? = null
        private const val BASE_URL = "http://"

        fun getRetrofit() : Retrofit {
            if(retrofit ==null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                    .build()
            }
            return retrofit!!
        }
    }
}