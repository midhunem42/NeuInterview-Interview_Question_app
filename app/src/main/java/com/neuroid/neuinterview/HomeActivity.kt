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

class HomeActivity : AppCompatActivity() {

    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        // Configure action bar
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.title = "Hello Toolbar"
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
                R.id.action_Home ->{
                    replaceFragments(HomeFragment())
                }
                R.id.action_HTML ->{
                    val fragment = QuestionsFragment.newInstance("HTML5")
                    replaceFragments(fragment)
                }
                R.id.action_CSS -> {
                    val fragment = QuestionsFragment.newInstance("CSS3")
                    replaceFragments(fragment)
                }
                R.id.action_Bootstrap ->{
                    val fragment = QuestionsFragment.newInstance("BootStrap")
                    replaceFragments(fragment)
                }
                R.id.action_JavaScript ->{
                    val fragment = QuestionsFragment.newInstance("JavaScript")
                    replaceFragments(fragment)
                }
                R.id.action_jQuery ->{
                    val fragment = QuestionsFragment.newInstance("jQuery")
                    replaceFragments(fragment)
                }
                R.id.action_Angular ->{
                    val fragment = QuestionsFragment.newInstance("Angular")
                    replaceFragments(fragment)
                }
                R.id.action_TypScript ->{
                    val fragment = QuestionsFragment.newInstance("TypScript")
                    replaceFragments(fragment)
                }
                R.id.action_NodeJS -> {
                    val fragment = QuestionsFragment.newInstance("NodeJS")
                    replaceFragments(fragment)
                }
                R.id.action_ES6 -> {
                    val fragment = QuestionsFragment.newInstance("ES6")
                    replaceFragments(fragment)
                }
                R.id.action_ReactJS ->{
                    val fragment = QuestionsFragment.newInstance("ReactJS")
                    replaceFragments(fragment)
                }
                R.id.action_MongoDB -> {
                    val fragment = QuestionsFragment.newInstance("MongoDB")
                    replaceFragments(fragment)
                }
                R.id.action_AEM ->{
                    val fragment = QuestionsFragment.newInstance("AEM")
                    replaceFragments(fragment)
                }
                R.id.action_Misc ->{
                    val fragment = QuestionsFragment.newInstance("Misc")
                    replaceFragments(fragment)
                }
            }
            // Close the drawer
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }


    // Extension function to show toast message easily
    private fun Context.toast(message:String){
        Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
    }

    private fun replaceFragments(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.relativelayout, fragment).commit()
    }
}
