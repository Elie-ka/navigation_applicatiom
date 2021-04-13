package com.example.navigationgodson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.navigationgodson.files.Deep_Link
import com.example.navigationgodson.files.HomeMainFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val navCtrl = Navigation.findNavController(this,R.id.my_nav_host_fragment)
       NavigationUI.setupActionBarWithNavController(this,navCtrl)
        //bottom nav
        val navController = findNavController(R.id.my_nav_host_fragment)
        bottom_navigation.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this,R.id.my_nav_host_fragment).navigateUp() || super.onSupportNavigateUp()
    }

}