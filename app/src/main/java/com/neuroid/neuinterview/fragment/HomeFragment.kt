package com.neuroid.neuinterview.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import com.neuroid.neuinterview.R
import kotlinx.android.synthetic.main.activity_home.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */


class HomeFragment : Fragment() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        activity!!.setTitle("Home")

        MobileAds.initialize(activity,getString(R.string.appID))
        mInterstitialAd = InterstitialAd(activity)
        mInterstitialAd.adUnitId = getString(R.string.homeFragmentInterstial)
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        mInterstitialAd.adListener = object: AdListener() {
            override fun onAdFailedToLoad(errorCode: Int) {
                // Code to be executed when an ad request fails.
                mInterstitialAd.loadAd(AdRequest.Builder().build())
            }

            override fun onAdOpened() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                mInterstitialAd.loadAd(AdRequest.Builder().build())
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
                // Code to be executed when the interstitial ad is closed.
            }
        }

        val cvHtml5 = view.findViewById<CardView>(R.id.cvHtml5)
        val cvcss3 = view.findViewById<CardView>(R.id.cvcss3)
        val cvbootstrap = view.findViewById<CardView>(R.id.cvbootstrap)
        val cvJavascript = view.findViewById<CardView>(R.id.cvJavascript)
        val cvJquery = view.findViewById<CardView>(R.id.cvJquery)
        val cvAngular = view.findViewById<CardView>(R.id.cvAngular)
        val cvTypscript = view.findViewById<CardView>(R.id.cvTypscript)
        val cvNodeJs = view.findViewById<CardView>(R.id.cvNodeJs)
        val cvEs6 = view.findViewById<CardView>(R.id.cvEs6)
        val cvReact = view.findViewById<CardView>(R.id.cvReact)
        val cvMongoDb = view.findViewById<CardView>(R.id.cvMongoDb)

        cvHtml5.setOnClickListener {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("HTML5")
        }
        cvcss3.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("CSS3")}
        cvbootstrap.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("BootStrap")}
        cvJavascript.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("JavaScript")}
        cvJquery.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("jQuery")}
        cvAngular.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("Angular")}
        cvTypscript.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("TypScript")}
        cvNodeJs.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("NodeJS")}
        cvEs6.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("ES6")}
        cvReact.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("ReactJS")}
        cvMongoDb.setOnClickListener{
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
            replaceFragments("MongoDB")}
        return view
    }

    private fun replaceFragments(name:String) {
        val fragment = QuestionsFragment.newInstance(name)
        activity!!.supportFragmentManager.beginTransaction().replace(R.id.relativelayout, fragment).commit()
    }
}