package com.iniyan.githubactionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("tag",BuildConfig.baseUrl)
        Log.e("tag",BuildConfig.gateway)
        Log.e("tag",BuildConfig.apiUrl)

    }
}