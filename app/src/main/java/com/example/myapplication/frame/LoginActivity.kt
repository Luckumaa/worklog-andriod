package com.example.myapplication.frame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_login_frame.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_frame)

        loginButton.setOnClickListener {
            onCLickLogin()
        }

        forgetTextView.setOnClickListener {
            onCLickForgetPassword()
        }
    }

    private fun onCLickLogin() {
        val username = userNameEditText.text.toString()
        val password = passwordEditText.text.toString()
        Toast.makeText(this, "username: $username, password: $password", Toast.LENGTH_SHORT).show()
    }

    private fun onCLickForgetPassword() {
        Toast.makeText(this, "Forgot password!", Toast.LENGTH_SHORT).show()
    }
}