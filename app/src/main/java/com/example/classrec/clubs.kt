package com.example.classrec

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
        setContentView(R.layout.activity_clubs)

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

        val Cb: TextView =findViewById(R.id.cb_ait)
        Cb.movementMethod= LinkMovementMethod.getInstance()
        Cb.setLinkTextColor(Color.CYAN)

        val Cp: TextView =findViewById(R.id.cp_ait)
        Cp.movementMethod= LinkMovementMethod.getInstance()
        Cp.setLinkTextColor(Color.CYAN)

        val Isdf: TextView =findViewById(R.id.isdf_ait)
        Isdf.movementMethod= LinkMovementMethod.getInstance()
        Isdf.setLinkTextColor(Color.CYAN)

        val Radio_ait: TextView =findViewById(R.id.radio_ait)
        Radio_ait.movementMethod= LinkMovementMethod.getInstance()
        Radio_ait.setLinkTextColor(Color.CYAN)

        val Gdxr: TextView =findViewById(R.id.gdxr_ait)
        Gdxr.movementMethod= LinkMovementMethod.getInstance()
        Gdxr.setLinkTextColor(Color.CYAN)

        val Finearts: TextView =findViewById(R.id.finearts_ait)
        Finearts.movementMethod= LinkMovementMethod.getInstance()
        Finearts.setLinkTextColor(Color.CYAN)
    }
}
