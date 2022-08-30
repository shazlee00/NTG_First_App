package com.example.ntgfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val registerButton:Button=findViewById(R.id.register_button)

        registerButton.setOnClickListener{
            val intent=Intent(this,RegisterationActivity::class.java)
            startActivity(intent)
        }






    }


    }
