package com.example.assignmentlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        val sendButton = findViewById<Button>(R.id.send_button)
        sendButton.setOnClickListener {
            // Implement your logic to send OTP or email to reset password
        }
    }
}