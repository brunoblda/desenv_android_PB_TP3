package com.example.backgroundchangecolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.ranges.random as random1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)
        val layout = findViewById<ConstraintLayout>(R.id.layout)
        

        button.setOnClickListener {
            val randomNumber = (0..10).random1()
            when(randomNumber){
                1 -> layout.setBackgroundColor(Color.parseColor("#E6A7B5"))
                2 -> layout.setBackgroundColor(Color.parseColor("#A1CD3D"))
                3 -> layout.setBackgroundColor(Color.parseColor("#7D57DA"))
                4 -> layout.setBackgroundColor(Color.parseColor("#8CBDC2"))
                5 -> layout.setBackgroundColor(Color.parseColor("#D2D101"))
                6 -> layout.setBackgroundColor(Color.parseColor("#3064D6"))
                7 -> layout.setBackgroundColor(Color.parseColor("#DE0CFD"))
                8 -> layout.setBackgroundColor(Color.parseColor("#4799B3"))
                9 -> layout.setBackgroundColor(Color.parseColor("#DBA838"))
                10 -> layout.setBackgroundColor(Color.parseColor("#D9A47B"))
            }

        }

    }
}