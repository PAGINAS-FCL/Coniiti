package com.example.coniiti

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ponencia2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ponencia2)
        //BOTON VOLVER AL MENU
        val btnVoMenu1 = findViewById<Button>(R.id.btn_pon2_vm)
        btnVoMenu1.setOnClickListener {
            val prM = Intent(this, Menu::class.java)
            startActivity(prM)

        }
    }
}