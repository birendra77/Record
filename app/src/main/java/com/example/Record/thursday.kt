package com.example.Record

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class thursday : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thursday)

        val thur_Back : CardView =findViewById(R.id.thur_back)
        thur_Back.setOnClickListener{
            startActivity(Intent(this,days::class.java))
        }
    }
}