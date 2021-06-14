package com.example.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messenger.presentation.credentials.auth.AuthActivity
import com.example.messenger.presentation.credentials.registration.RegistrationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent = Intent(this, AuthActivity::class.java)
        startActivity(intent)
        finish()
    }
}