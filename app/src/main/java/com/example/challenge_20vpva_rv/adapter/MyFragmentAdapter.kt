package com.example.challenge_20vpva_rv.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.challenge_20vpva_rv.fragments.AddFragment
import com.example.challenge_20vpva_rv.fragments.ListFragment

class MyFragmentAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        if (position ==0){
            return AddFragment()
        }else {
            return ListFragment()
        }
    }

}