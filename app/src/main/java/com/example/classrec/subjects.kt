package com.example.classrec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class subjects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subjects)

        val Maths : CardView = findViewById(R.id.Maths_card)
        Maths.setOnClickListener(){
            startActivity(Intent(this,maths_info::class.java))
        }
        val Physics : CardView = findViewById(R.id.Physics_card)
        Physics.setOnClickListener(){
            startActivity(Intent(this,phy_info::class.java))
        }
        val Bxe : CardView = findViewById(R.id.Bxe_card)
        Bxe.setOnClickListener(){
            startActivity(Intent(this,bxe_info::class.java))
        }
        val Paps : CardView = findViewById(R.id.Paps_card)
        Paps.setOnClickListener(){
            startActivity(Intent(this,paps_info::class.java))
        }
        val Sme : CardView = findViewById(R.id.Sme_card)
        Sme.setOnClickListener(){
            startActivity(Intent(this,sme_info::class.java))
        }

    }
}