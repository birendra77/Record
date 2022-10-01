package com.example.Record

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class friday : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friday)

        val fri_Back : CardView =findViewById(R.id.fri_back)
        fri_Back.setOnClickListener{
            startActivity(Intent(this,days::class.java))
        }
    }
}