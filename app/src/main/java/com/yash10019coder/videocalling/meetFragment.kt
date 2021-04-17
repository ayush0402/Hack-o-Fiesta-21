package com.yash10019coder.videocalling

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.yash10019coder.videocalling.databinding.FragmentHomeBinding
import com.yash10019coder.videocalling.databinding.FragmentMeetBinding

class meetFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentMeetBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_meet, container,false
        )
        return binding.root
    }


}