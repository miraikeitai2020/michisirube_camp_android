package com.example.michisirubeapplication.ui.naviTime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.michisirubeapplication.R
import kotlinx.android.synthetic.main.fragment_navi_time.view.*


class naviTimeFragment : DialogFragment() {
    private val args: naviTimeFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val timePicker = TimePicker(activity)
        timePicker.setIs24HourView(true)
        return inflater.inflate(R.layout.fragment_navi_time, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //感情受け継がれているか確認用のトースト
        Toast.makeText(activity,args.emotion.toString(),Toast.LENGTH_SHORT)
            .show()

        view.btTimeSelect.setOnClickListener {
            //感情と時間を次に受け継ぐコード書く
            val time = 0//時間ちゃんととってくる
            val action = naviTimeFragmentDirections.actionNaviTimeToNaviDestination(args.emotion,time)
            findNavController().navigate(action)
        }

    }

}