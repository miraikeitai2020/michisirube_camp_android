package com.example.michisirubeapplication.ui.naviTime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import com.example.michisirubeapplication.R


class naviTimeFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val timePicker = TimePicker(activity)
        timePicker.setIs24HourView(true)
        return inflater.inflate(R.layout.fragment_navi_time, container, false)
    }

}