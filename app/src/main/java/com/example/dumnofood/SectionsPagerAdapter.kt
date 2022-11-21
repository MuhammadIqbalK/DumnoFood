package com.example.dumnofood

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dumnofood.fragmentGetStarted.start1Fragment
import com.example.dumnofood.fragmentGetStarted.start2Fragment
import com.example.dumnofood.fragmentGetStarted.start3Fragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = start1Fragment()
            1 -> fragment = start2Fragment()
            2 -> fragment = start3Fragment()

        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int {
        return 3
    }
}