package com.example.messenger.presentation.credentials.auth

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.messenger.domain.repository.UserRepository
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


@InjectViewState
class AuthPresenter : MvpPresenter<IAuthView>() {
    fun authorize(login: String, pass: String) {
        val userRep = UserRepository()
        userRep.authorize(login = login, password = pass)
            .enqueue(object : Callback<JsonObject> {
                override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                    if (response.isSuccessful) {
                        viewState.onSuccess("success")
                    } else {
                        viewState.onError("some wrong ${response.code()}")
                        println(response.errorBody())

                    }
                }

                override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                    viewState.onError("not connect")

                }


            })


    }
}