package com.example.ntgfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeration)

        val returnButton: Button =findViewById(R.id.close )

        returnButton.setOnClickListener{
            finish()
        }
    }
}