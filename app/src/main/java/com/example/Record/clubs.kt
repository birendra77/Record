package com.example.Record

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.cardview.widget.CardView

class clubs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        val club_Back : CardView = findViewById(R.id.club_back)
        club_Back.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }

        val Gdsc: TextView =findViewById(R.id.gdsc_ait)
        Gdsc.movementMethod= LinkMovementMethod.getInstance()
        Gdsc.setLinkTextColor(Color.CYAN)

        val Oss: TextView =findViewById(R.id.oss_ait)
        Oss.movementMethod= LinkMovementMethod.getInstance()
        Oss.setLinkTextColor(Color.CYAN)

        val Tb: TextView =findViewById(R.id.tb_ait)
        Tb.movementMethod= LinkMovementMethod.getInstance()
        Tb.setLinkTextColor(Color.CYAN)

        val Sports: TextView =findViewById(R.id.sports_ait)
        Sports.movementMethod= LinkMovementMethod.getInstance()
        Sports.setLinkTextColor(Color.CYAN)

        val Ecell: TextView =findViewById(R.id.ecell_ait)
        Ecell.movementMethod= LinkMovementMethod.getInstance()
        Ecell.setLinkTextColor(Color.CYAN)


    }
}
