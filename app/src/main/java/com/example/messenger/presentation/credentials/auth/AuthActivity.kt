package com.example.messenger.presentation.credentials.auth

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.messenger.R
import com.example.messenger.base.ABaseActivity


class AuthActivity : ABaseActivity(), IAuthView {
    lateinit var etLogin: EditText
    lateinit var etPass: EditText
    lateinit var btnAuth: Button

    @InjectPresenter
    lateinit var authPresenter: AuthPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_activity)
        etLogin = findViewById(R.id.etAuthLogin)
        etPass = findViewById(R.id.etAuthPass)
        btnAuth = findViewById(R.id.btnAuth)
        btnAuth.setOnClickListener(View.OnClickListener {
            authPresenter.authorize(
                etLogin.text.toString().trim(),
                etPass.text.toString().trim()
            )
        })

    }

    override fun showLoad() {

    }

    override fun stopLoad() {

    }

    override fun onSuccess(message: String) {
        toast(message)
    }

    override fun onError(message: String) {
        toast(message)
    }
}