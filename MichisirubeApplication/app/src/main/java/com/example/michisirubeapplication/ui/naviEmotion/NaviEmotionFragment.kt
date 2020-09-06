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


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.btJoy.setOnClickListener{//喜び
            val emotion: Int = 0
            val action = NaviEmotionFragmentDirections.actionNaviEmotionToNaviTime(emotion)
            findNavController().navigate(action)
        }

        view.btAnger.setOnClickListener{//怒
            val emotion: Int = 1
            val action = NaviEmotionFragmentDirections.actionNaviEmotionToNaviTime(emotion)
            findNavController().navigate(action)
        }

        view.btSad.setOnClickListener{//悲しみ
            val emotion: Int = 2
            val action = NaviEmotionFragmentDirections.actionNaviEmotionToNaviTime(emotion)
            findNavController().navigate(action)
        }

        view.btEnjoyment.setOnClickListener{//
            val emotion: Int = 3
            val action = NaviEmotionFragmentDirections.actionNaviEmotionToNaviTime(emotion)
            findNavController().navigate(action)
        }

    }

}