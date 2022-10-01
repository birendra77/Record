package com.example.Record

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.Record.ui.login.Login

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cardTT: CardView = findViewById(R.id.cardTT)
        cardTT.setOnClickListener {
            startActivity(Intent(this, days::class.java))
        }
//        val subject: CardView = findViewById(R.id.sub)
//        subject.setOnClickListener {
//            startActivity(Intent(this, subjects::class.java))
//        }
        val reso: CardView = findViewById(R.id.reso)
        reso.setOnClickListener {
            startActivity(Intent(this, resource::class.java))
        }
        val club: CardView = findViewById(R.id.clubs)
        club.setOnClickListener {
            startActivity(Intent(this, clubs::class.java))
        }
        val Men: ImageView = findViewById(R.id.menu)
        Men.setOnClickListener {
            startActivity(Intent(this, user_info::class.java))
        }


        val login: CardView = findViewById(R.id.Login_page)
        login.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

    }
}