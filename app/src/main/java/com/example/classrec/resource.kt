package com.example.classrec

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)


        val text_link: TextView =findViewById(R.id.online_rec)

        text_link.movementMethod= LinkMovementMethod.getInstance()
        text_link.setLinkTextColor(Color.WHITE)
        }
}