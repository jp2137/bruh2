package com.example.bruh2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val linia = findViewById<EditText>(R.id.editTextTextPersonName)
        val liniaWiele = findViewById<EditText>(R.id.editTextTextMultiLine)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            linia.setText("yassinesbai")
        }
       /* findViewById<Button>(R.id.button1).setOnClickListener {
             findViewById<EditText>(R.id.editTextTextPersonName).setText("yassinesbai")
         }*/
        button2.setOnClickListener {
            liniaWiele.setText(R.string.Imie)
        }

    }
}