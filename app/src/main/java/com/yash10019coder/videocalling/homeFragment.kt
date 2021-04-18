package com.yash10019coder.videocalling

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.yash10019coder.videocalling.databinding.FragmentHomeBinding



class homeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
    val binding: FragmentHomeBinding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container,false
    )
    //type your code here


        return binding.root


    }


}