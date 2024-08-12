package com.example.bottomnavbardemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.bottomnavbardemo.favourites.FavouritesFragment
import com.example.bottomnavbardemo.home.HomeFragment
import com.example.bottomnavbardemo.profile.ProfileFragment
import com.example.bottomnavbardemo.shopping.ShopFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
         setupWithNavController(bottomNavView, navController)
    }
}