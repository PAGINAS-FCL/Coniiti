package com.example.coniiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BOTON IR AL MENU
        val btnNext = findViewById<Button>(R.id.btn_ing)
        btnNext.setOnClickListener {
            val pasarIntro = Intent(this, Introduccion::class.java)
            startActivity(pasarIntro)

        }
    }
}