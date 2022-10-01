package com.example.Record

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class days : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_days)



        val Tuesday : CardView = findViewById(R.id.Tuesday_card)
        Tuesday.setOnClickListener(){
            startActivity(Intent(this,tuesday::class.java))
        }

        val days_Back : CardView = findViewById(R.id.days_back)
        days_Back.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}