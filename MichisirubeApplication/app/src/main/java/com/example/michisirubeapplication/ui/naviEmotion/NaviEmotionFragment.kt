package com.example.michisirubeapplication.ui.naviEmotion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.michisirubeapplication.R
import kotlinx.android.synthetic.main.fragment_navi_emotion.view.*
import kotlinx.android.synthetic.main.fragment_title.view.*


class NaviEmotionFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_navi_emotion,container,false)

        view.btAnger.setOnClickListener{
            findNavController().navigate(R.id.action_naviEmotion_to_naviTime)
        }
        view.btJoy.setOnClickListener{
            findNavController().navigate(R.id.action_naviEmotion_to_naviTime)
        }
        view.btEnjoyment.setOnClickListener{
            findNavController().navigate(R.id.action_naviEmotion_to_naviTime)
        }
        view.btSad.setOnClickListener{
            findNavController().navigate(R.id.action_naviEmotion_to_naviTime)
        }
        return view
    }

}