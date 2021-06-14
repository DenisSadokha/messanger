package com.example.messenger.domain.repository

import com.example.messenger.base.IRestClient
import com.example.messenger.domain.repository.rest.RestClient
import com.example.messenger.domain.repository.rest.api.UserRestApi
import com.google.gson.JsonObject
import retrofit2.Call

class UserRepository {
    private lateinit var rest: UserRestApi

    fun registration(login: String, pass: String): Call<JsonObject> {
        var restClient = RestClient("http://212.75.210.227:8080", null)
        rest = UserRestApi(restClient as IRestClient)
        return rest.registration(login = login, password = pass)

    }

    fun authorize(login: String, password: String): Call<JsonObject> {
        val restClient = RestClient("http://212.75.210.227:8080", null)
        rest = UserRestApi(restClient)
        return rest.auth(login, password)
    }
}