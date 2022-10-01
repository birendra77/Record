package com.example.Record

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class wednesday : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wednesday)

        val wed_Back : CardView =findViewById(R.id.wed_back)
        wed_Back.setOnClickListener{
            startActivity(Intent(this,resource::class.java))
        }
    }
}