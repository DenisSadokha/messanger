package com.example.messenger.base

import com.google.gson.JsonObject
import retrofit2.Call
import java.lang.reflect.ParameterizedType

abstract class ABaseRestApi<T> {
    private val client: IRestClient
    val service: T

    constructor(client: IRestClient) {
        val type = javaClass.genericSuperclass as ParameterizedType
        val clazz = type.actualTypeArguments[0] as Class<T>

        this.client = client
        service = client.createService(clazz)
    }


}