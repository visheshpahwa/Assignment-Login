package com.example.assignmentlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            // Implement your login logic here using OTP or email
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

val signupButton = findViewById<Button>(R.id.signup_button)
        signupButton.setOnClickListener {
            // Implement your login logic here using OTP or email
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        // Handle forget password link/button click
        val forgetPasswordButton = findViewById<Button>(R.id.forget_password_button)
        forgetPasswordButton.setOnClickListener {
            val intent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}