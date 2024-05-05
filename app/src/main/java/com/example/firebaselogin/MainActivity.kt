package com.example.firebaselogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

/**
 * Główna aktywność aplikacji, wyświetlająca powitanie użytkownika.
 */
class MainActivity : AppCompatActivity() {

    private var welcomeTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Pobranie identyfikatora użytkownika przekazanego z poprzedniej aktywności
        val uID = intent
        val userID = uID.getStringExtra("uID")

        // Inicjalizacja pola tekstowego powitania i ustawienie tekstu powitalnego
        welcomeTextView = findViewById(R.id.welcomeText)
        welcomeTextView?.text = "Welcome ${userID}!";
    }
}
