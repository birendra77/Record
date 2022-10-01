package com.example.Record

import android.graphics.Color
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation


class youtube_info : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view1= inflater.inflate(R.layout.fragment_youtube_info, container, false)
        val standup: TextView =view1.findViewById(R.id.stand_up)

        standup.movementMethod= LinkMovementMethod.getInstance()
        standup.setLinkTextColor(Color.WHITE)

        val tsp: TextView =view1.findViewById(R.id.t_sp)

        tsp.movementMethod= LinkMovementMethod.getInstance()
        tsp.setLinkTextColor(Color.WHITE)

        val explor_e: TextView =view1.findViewById(R.id.explore)

        explor_e.movementMethod= LinkMovementMethod.getInstance()
        explor_e.setLinkTextColor(Color.WHITE)

        val yt_Back : CardView =view1.findViewById(R.id.yt_back)
        yt_Back.setOnClickListener{
            Navigation.findNavController(view1).navigate(R.id.fun_frag1)
        }


        return view1
    }


}