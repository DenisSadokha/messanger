package com.example.messenger.presentation.credentials.registration

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.messenger.domain.repository.UserRepository
import com.google.gson.JsonObject

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@InjectViewState
class RegistrationPresenter : MvpPresenter<IRegistrationView>() {
    fun registration(login: String, pass: String) {
        viewState.showLoad()
        val userRep = UserRepository()
        userRep.registration(login = login, pass = pass)
            .enqueue(object : Callback<JsonObject> {
                override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                    viewState.stopLoad()
                    if (response.isSuccessful) {
                        viewState.onSuccess("success")
                    } else {
                        viewState.onSuccess("some wrong ${response.code()}")
                        println(response.errorBody())

                    }
                }

                override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                    viewState.stopLoad()
                    viewState.onError("not connection")
                    println("$t")
                }

            })


    }

}

