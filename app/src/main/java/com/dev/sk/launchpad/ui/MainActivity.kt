package com.dev.sk.launchpad.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dev.sk.launchpad.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainFragment = MainFragment.instance();
        supportFragmentManager.beginTransaction()
            .add(R.id.container, mainFragment, MainFragment.TAG)
            .commit()
    }
}