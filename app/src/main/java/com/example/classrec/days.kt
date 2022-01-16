package com.example.classrec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class days : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_days)

        val Monday : CardView = findViewById(R.id.Monday_card)
        Monday.setOnClickListener(){
            startActivity(Intent(this,monday::class.java))
        }
        val Tuesday : CardView = findViewById(R.id.Tuesday_card)
        Tuesday.setOnClickListener(){
            startActivity(Intent(this,tuesday::class.java))
        }
        val Wednesday : CardView = findViewById(R.id.Wednesday_card)
        Wednesday.setOnClickListener(){
            startActivity(Intent(this,wednesday::class.java))
        }
        val Thursday : CardView = findViewById(R.id.Thursday_card)
        Thursday.setOnClickListener(){
            startActivity(Intent(this,thursday::class.java))
        }
        val Friday : CardView = findViewById(R.id.Friday_card)
        Friday.setOnClickListener(){
            startActivity(Intent(this,friday::class.java))
        }
        val days_Back : CardView = findViewById(R.id.days_back)
        days_Back.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}