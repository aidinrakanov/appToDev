package com.example.devtest.ui.bottomFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.devtest.R
import com.example.devtest.databinding.FragmentHomeBinding
import com.example.devtest.databinding.FragmentTakeAwaysBinding
import com.example.devtest.ui.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewPager(view)
        buttonsNavigate()
    }

    private fun buttonsNavigate() {

    }

    private fun initViewPager(view: View) {
        val viewPager = view.findViewById<ViewPager2>(R.id.view_pager)
        val adapter = ViewPagerAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter

        val tabLayout : TabLayout = view.findViewById(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager){
                tab, position ->
            when(position){
                0->{ tab.setCustomView(R.layout.take_away_view )}
                1->{ tab.setCustomView(R.layout.grocery_view )}
                2->{ tab.setCustomView(R.layout.convenience_view )}
                3->{ tab.setCustomView(R.layout.pharmacy_view )}
            }
        }.attach()
    }

}