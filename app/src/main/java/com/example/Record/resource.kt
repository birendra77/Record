package com.example.Record

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)




        val res_Back:CardView =findViewById(R.id.res_back)
        res_Back.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        val feed_back:CardView =findViewById(R.id.feed_b)
        feed_back.setOnClickListener {
            startActivity(Intent(this,wednesday::class.java))
        }
    }

}