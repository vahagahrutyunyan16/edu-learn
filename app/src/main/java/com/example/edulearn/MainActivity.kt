package com.example.edulearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        val bottomNavView: BottomNavigationView = findViewById(R.id.bottomNavView)
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.homeFragment,
//                R.id.eventFragment,
//                R.id.classFragment,
//                R.id. profileFragment
//            ))

        bottomNavView.setupWithNavController(navController)
    }

}