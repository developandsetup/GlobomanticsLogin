package com.globomantics.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val loginVerification = LoginVerification()

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.editTextEmail)
        password = findViewById(R.id.editTextPassword)
        login = findViewById(R.id.button)

        login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (loginVerification.verify(
                email.text.toString(),
                password.text.toString()
            )
        ) {
           
            Toast.makeText(context: this, text:"Login Successful", Toast.LENGTH_SHORT).show()
        } else {

            Toast.makeText(context: this, text:"Login Failed", Toast.LENGTH_SHORT).show()
        }
    }
}