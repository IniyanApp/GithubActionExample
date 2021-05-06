package com.iniyan.githubactionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("tag",com.iniyan.githubactionexample.BuildConfig.baseUrl)
        Log.e("tag",com.iniyan.githubactionexample.BuildConfig.gateway)
        Log.e("tag",com.iniyan.githubactionexample.BuildConfig.apiUrl)
        findViewById<TextView>(R.id.text).text = com.iniyan.githubactionexample.BuildConfig.baseUrl

    }
}