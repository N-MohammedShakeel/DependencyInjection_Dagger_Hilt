package com.example.dependencyinjection_dagger

import android.util.Log
import javax.inject.Inject

class SimCard constructor(private val serviceProvider: ServiceProvider) {
    init {
        Log.i("MYTAG", "SimCard created.")
    }

    fun connectToNetwork() {
        serviceProvider.getService()
        Log.i("MYTAG", "SimCard connected to network.")
    }
}
