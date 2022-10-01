package com.example.Record


import android.os.Bundle


import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation


class fun_frag1() : Fragment(){



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fun_frag1, container, false)
        val yt :CardView =view.findViewById(R.id.text_yt)
        yt.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.youtube_info)
        }


        val joke :CardView =view.findViewById(R.id.jk)
        joke.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.jpkes_info)
        }

        val f_g :CardView =view.findViewById(R.id.fg)
        f_g.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.flashgames_info)
        }

        return view
    }


}

