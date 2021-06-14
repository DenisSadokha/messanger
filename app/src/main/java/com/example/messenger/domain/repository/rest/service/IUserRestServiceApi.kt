package com.example.messenger.domain.repository.rest.service

import com.example.messenger.domain.repository.models.rest.User
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT

interface IUserRestServiceApi {
    @PUT("/user/v1/registration")
    fun registration(@Body user: User): Call<JsonObject>

    @POST("/user/v1/login")
    fun auth(@Body user: User): Call<JsonObject>

}