package com.example.classrec

import android.graphics.Color
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class flashgames_info : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view2= inflater.inflate(R.layout.fragment_flashgames_info, container, false)
        val Pm: TextView =view2.findViewById(R.id.pm)

        Pm.movementMethod= LinkMovementMethod.getInstance()
        Pm.setLinkTextColor(Color.WHITE)

        val Sm: TextView =view2.findViewById(R.id.sm)

        Sm.movementMethod= LinkMovementMethod.getInstance()
        Sm.setLinkTextColor(Color.WHITE)

        val Au: TextView =view2.findViewById(R.id.au)

        Au.movementMethod= LinkMovementMethod.getInstance()
        Au.setLinkTextColor(Color.WHITE)

        return view2
    }


}