package com.example.messenger.presentation.credentials.registration

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.messenger.R
import com.example.messenger.base.ABaseActivity


class RegistrationActivity : ABaseActivity(), IRegistrationView {

    lateinit var btnRegistration: Button
    lateinit var etLogin: EditText
    lateinit var etPassword: EditText

    @InjectPresenter
    lateinit var registrationPresenter: RegistrationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_activity)
        etLogin = findViewById(R.id.etRegistrationLogin)
        etPassword = findViewById(R.id.etRegistrationPassword)
        btnRegistration = findViewById(R.id.btnRegistration)
        btnRegistration.setOnClickListener(View.OnClickListener {
            registrationPresenter.registration(
                etLogin.text.toString().trim(),
                etPassword.text.toString().trim()
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