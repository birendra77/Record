package com.example.Record

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.Record.ui.login.Login

class user_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val user_Back: CardView = findViewById(R.id.user_back)
        user_Back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        val bir: TextView =findViewById(R.id.bir_dev)

        bir.movementMethod= LinkMovementMethod.getInstance()
        bir.setLinkTextColor(Color.WHITE)

        val hem: TextView =findViewById(R.id.hem_dev)

        hem.movementMethod= LinkMovementMethod.getInstance()
        hem.setLinkTextColor(Color.WHITE)

        val lout:CardView=findViewById(R.id.logout)
        lout.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

    }
}