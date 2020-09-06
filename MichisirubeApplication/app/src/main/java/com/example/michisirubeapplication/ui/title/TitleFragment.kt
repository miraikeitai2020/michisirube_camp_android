package com.example.michisirubeapplication.ui.title

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.michisirubeapplication.R
import kotlinx.android.synthetic.main.fragment_title.view.*


class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_title,container,false)

        view.btNaviStart.setOnClickListener{
            findNavController().navigate(R.id.action_title_to_naviEmotion)
        }

        return view
    }

}