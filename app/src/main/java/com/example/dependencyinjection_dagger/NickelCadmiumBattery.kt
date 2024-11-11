package com.example.dependencyinjection_dagger

import android.util.Log
import jakarta.inject.Inject

class NickelCadmiumBattery @Inject constructor() : Battery {
    override fun getPower() {
        Log.i("MYTAG", "Power from nickel-cadmium battery.")
    }
}