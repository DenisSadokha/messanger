package com.example.messenger.domain.repository.rest.api

import com.example.messenger.base.ABaseRestApi
import com.example.messenger.base.IRestClient
import com.example.messenger.domain.repository.models.rest.User
import com.example.messenger.domain.repository.rest.service.IUserRestServiceApi

class UserRestApi : ABaseRestApi<IUserRestServiceApi> {
    constructor(client: IRestClient) : super(client)

    fun registration(login: String, password: String) =
        service.registration(User(login = login, password = password))


    fun auth(login: String, password: String) =
        service.auth(User(login = login, password = password))
}
