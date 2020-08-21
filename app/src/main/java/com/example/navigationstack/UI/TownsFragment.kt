package com.example.navigationstack.UI

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationstack.Adapter.Data
import com.example.navigationstack.Adapter.RvAdapter
import com.example.navigationstack.Adapter.RvListener
import com.example.navigationstack.BaseFragments.BaseFragment
import com.example.navigationstack.R
import kotlinx.android.synthetic.main.towns_fragment.*

class TownsFragment: BaseFragment(), RvListener {

    override fun resID()= R.layout.towns_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
    }

    private fun setupAdapter(){
        val adapter= RvAdapter(this)
        recyclerView.adapter=adapter
        adapter.update(getData())
    }

    private fun getData(): ArrayList<Data> {
       val list= arrayListOf<Data>()

        for(i in 1..10){
            list.add(Data("Bishkek$i"))
        }

        return list

    }

    override fun goToTown(data: Data) {
        findNavController().navigate(R.id.action_townsFragment2_to_bishkekFragment)
    }

}

