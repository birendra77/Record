package com.example.Record

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation


class jpkes_info : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view3= inflater.inflate(R.layout.fragment_jpkes_info, container, false)
        val jk_Back : CardView =view3.findViewById(R.id.jk_back)
        jk_Back.setOnClickListener{
            Navigation.findNavController(view3).navigate(R.id.fun_frag1)
        }

        return view3
    }


}