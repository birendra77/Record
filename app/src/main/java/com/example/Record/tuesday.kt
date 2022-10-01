package com.example.Record

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class tuesday : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuesday)

        val tues_Back :CardView=findViewById(R.id.tues_back)
        tues_Back.setOnClickListener{
            startActivity(Intent(this,days::class.java))
        }


    }
}