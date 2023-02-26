package com.example.desafiodsm02t

import android.os.Bundle

class MainActivity : com.example.desafiodsm02t.activities.Menu() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}