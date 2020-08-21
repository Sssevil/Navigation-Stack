package com.example.navigationstack.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationstack.R
import com.example.navigationstack.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomView()
    }

    private fun setupBottomView(){
        val navView=findViewById<BottomNavigationView>(R.id.bottomNav)

        val navIds= listOf(
            R.navigation.towns,
            R.navigation.fragments,
            R.navigation.account
        )

        navView.setupWithNavController(
            navGraphIds = navIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navView,
            intent=intent

        )
    }
}