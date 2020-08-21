package com.example.navigationstack.UI

import android.os.Bundle
import android.view.View
import com.example.navigationstack.BaseFragments.BaseFragment
import com.example.navigationstack.R
import com.example.navigationstack.UI.tablayout.FirstFragment
import com.example.navigationstack.UI.tablayout.SecondFragment
import com.example.navigationstack.UI.tablayout.ViewPagerAdapter
import kotlinx.android.synthetic.main.tab_fragment.*

class TabFragment: BaseFragment() {
    override fun resID()= R.layout.tab_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        val adapter = ViewPagerAdapter(childFragmentManager)
        viewPager.adapter=adapter

        adapter.addFragment(FirstFragment(), "First Fragment")
        adapter.addFragment(SecondFragment(),"Second Fragment")

        tabLayout.setupWithViewPager(viewPager)

    }
}