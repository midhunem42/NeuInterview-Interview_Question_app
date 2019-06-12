package com.neuroid.neuinterview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.View
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.neuroid.neuinterview.fragment.HomeFragment
import com.neuroid.neuinterview.fragment.QuestionsFragment
import kotlinx.android.synthetic.main.activity_home.*
import com.neuroid.neuinterview.R.id.action_Angular as action_Angular1
import com.neuroid.neuinterview.R.id.action_Bootstrap as action_Bootstrap1
import com.neuroid.neuinterview.R.id.action_CSS as action_CSS1
import com.neuroid.neuinterview.R.id.action_ES6 as action_ES61
import com.neuroid.neuinterview.R.id.action_HTML as action_HTML1
import com.neuroid.neuinterview.R.id.action_Home as action_Home1
import com.neuroid.neuinterview.R.id.action_JavaScript as action_JavaScript1
import com.neuroid.neuinterview.R.id.action_MongoDB as action_MongoDB1
import com.neuroid.neuinterview.R.id.action_NodeJS as action_NodeJS1
import com.neuroid.neuinterview.R.id.action_ReactJS as action_ReactJS1
import com.neuroid.neuinterview.R.id.action_TypScript as action_TypScript1
import com.neuroid.neuinterview.R.id.action_jQuery as action_jQuery1

class HomeActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        // Configure action bar
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.title = "NeuInterview"
        supportFragmentManager.beginTransaction().replace(R.id.relativelayout, HomeFragment()).commit()
        MobileAds.initialize(this,
            getString(R.string.appID))

        mAdView = findViewById(R.id.adMobBannerHomeACTIVITY)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        // Initialize the action bar drawer toggle instance
        val drawerToggle:ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.nav_open,
            R.string.nav_close
        ){
            override fun onDrawerClosed(view: View){
                super.onDrawerClosed(view)
                //toast("Drawer closed")
            }

            override fun onDrawerOpened(drawerView: View){
                super.onDrawerOpened(drawerView)
                //toast("Drawer opened")
            }
        }


        // Configure the drawer layout to add listener and show icon on toolbar
        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        navigation_view.itemIconTintList = null
        // Set navigation view navigation item selected listener
        navigation_view.setNavigationItemSelectedListener{
            when (it.itemId){
                action_Home1 ->{
                    replaceFragments(HomeFragment())
                }
                action_HTML1 ->{
                    val fragment = QuestionsFragment.newInstance("HTML5")
                    replaceFragments(fragment)
                }
                action_CSS1 -> {
                    val fragment = QuestionsFragment.newInstance("CSS3")
                    replaceFragments(fragment)
                }
                action_Bootstrap1 ->{
                    val fragment = QuestionsFragment.newInstance("BootStrap")
                    replaceFragments(fragment)
                }
                action_JavaScript1 ->{
                    val fragment = QuestionsFragment.newInstance("JavaScript")
                    replaceFragments(fragment)
                }
                action_jQuery1 ->{
                    val fragment = QuestionsFragment.newInstance("jQuery")
                    replaceFragments(fragment)
                }
                action_Angular1 ->{
                    val fragment = QuestionsFragment.newInstance("Angular")
                    replaceFragments(fragment)
                }
                action_TypScript1 ->{
                    val fragment = QuestionsFragment.newInstance("TypScript")
                    replaceFragments(fragment)
                }
                action_NodeJS1 -> {
                    val fragment = QuestionsFragment.newInstance("NodeJS")
                    replaceFragments(fragment)
                }
                action_ES61 -> {
                    val fragment = QuestionsFragment.newInstance("ES6")
                    replaceFragments(fragment)
                }
                action_ReactJS1 ->{
                    val fragment = QuestionsFragment.newInstance("ReactJS")
                    replaceFragments(fragment)
                }
                action_MongoDB1 -> {
                    val fragment = QuestionsFragment.newInstance("MongoDB")
                    replaceFragments(fragment)
                }
            }
            actionBar!!.title=it.title
            // Close the drawer
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }

    private fun setActionBarTitle(title :String) {
        val actionBar = supportActionBar
        actionBar?.title = title
    }


    private fun replaceFragments(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.relativelayout, fragment).commit()
    }
}
