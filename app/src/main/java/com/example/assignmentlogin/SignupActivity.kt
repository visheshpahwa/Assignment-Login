package com.example.assignmentlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupButton = findViewById<Button>(R.id.signup_button)
        signupButton.setOnClickListener {
            // Implement your signup logic here using OTP or email
        }
    }
}