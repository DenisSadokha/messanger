package com.example.messenger.base

import com.arellomobile.mvp.MvpView

interface IBaseView : MvpView {
        fun onSuccess(message: String)
        fun onError(message: String)

}