package com.example.firebaselogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


        class MainActivity : AppCompatActivity() {

            private var welcomeTextView: TextView? = null


            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)


                val uID = intent
                val userID = uID.getStringExtra("uID")

                welcomeTextView = findViewById(R.id.welcomeText)
                welcomeTextView?.text = "Welcome ${userID}!";


                }

            }



