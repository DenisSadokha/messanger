package com.example.messenger.domain.repository.rest

import com.example.messenger.base.IRestClient
import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestClient(baseUrl: String, client: OkHttpClient?): IRestClient {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()

    override fun <T> createService(serviceClass: Class<T>): T {
        return retrofit.create(serviceClass)
    }


}