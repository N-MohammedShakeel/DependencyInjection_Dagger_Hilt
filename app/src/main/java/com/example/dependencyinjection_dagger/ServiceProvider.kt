package com.example.dependencyinjection_dagger

import android.util.Log
import jakarta.inject.Inject

class ServiceProvider{
    init {
        Log.i("MYTAG", "ServiceProvider created.")
    }

    fun getService() {
        Log.i("MYTAG", "Service is being provided by ServiceProvider.")
    }
}
