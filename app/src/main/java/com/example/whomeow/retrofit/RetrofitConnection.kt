package com.example.nycy1020.whomeowproject.retrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConnection {

    companion object {
        private var retrofit: Retrofit? = null
        private const val BASE_URL = "jdbc:mysql://db-who.c2dkfbc2qp0h.ap-northeast-2.rds.amazonaws.com:3306/dbwho"

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