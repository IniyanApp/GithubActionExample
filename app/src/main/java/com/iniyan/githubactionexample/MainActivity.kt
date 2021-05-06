package com.iniyan.githubactionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.BuildConfig

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("tag",com.iniyan.githubactionexample.BuildConfig.baseUrl)
        Log.e("tag",com.iniyan.githubactionexample.BuildConfig.gateway)
        Log.e("tag",com.iniyan.githubactionexample.BuildConfig.apiUrl)

    }
}