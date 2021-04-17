package com.yash10019coder.videocalling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.yash10019coder.videocalling.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val homeFragment=homeFragment()
        val meetFragment=meetFragment()

        makeCurrentFragment(homeFragment)
        //val bottom_nav=findViewById<FrameLayout>(R.id.bottom_nav)
        binding.bottomnav.setOnNavigationItemSelectedListener {
            if(it.itemId.equals(R.id.ic_home)){makeCurrentFragment(homeFragment)}
            else if(it.itemId.equals(R.id.ic_meet)){makeCurrentFragment(meetFragment)}

            true

        }
    }
    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fl_wrapper,fragment)
            commit()
        }
    }
}