package com.example.messenger.base

interface IRestClient {
    fun <T> createService(serviceClass: Class<T>): T

}