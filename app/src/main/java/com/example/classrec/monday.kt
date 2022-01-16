package com.example.classrec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class monday : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monday)


        val mon_Back :CardView=findViewById(R.id.mon_back)
        mon_Back.setOnClickListener{
            startActivity(Intent(this,days::class.java))
        }

    }

}