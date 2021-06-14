package com.example.messenger.base

import android.widget.Toast
import androidx.annotation.StringRes
import com.arellomobile.mvp.MvpAppCompatActivity

open class ABaseActivity : MvpAppCompatActivity() {
    fun toast(@StringRes stringId: Int) {
        Toast.makeText(this, stringId, Toast.LENGTH_LONG).show()
    }

    fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}