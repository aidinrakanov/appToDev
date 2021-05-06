package com.example.devtest.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.devtest.ui.viewPagersFragments.ConvenienceFragment
import com.example.devtest.ui.viewPagersFragments.GroceryFragment
import com.example.devtest.ui.viewPagersFragments.PharmacyFragment
import com.example.devtest.ui.viewPagersFragments.TakeAwaysFragment
import java.util.ArrayList


class ViewPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle) {

    var fragments : ArrayList<Fragment> = arrayListOf(
        ConvenienceFragment(), GroceryFragment(),PharmacyFragment(), TakeAwaysFragment()
    )

    override fun getItemCount(): Int {
            return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}