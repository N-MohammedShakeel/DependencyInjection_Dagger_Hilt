package com.example.dependencyinjection_dagger

import android.util.Log
import javax.inject.Inject

class Smartphone @Inject constructor(
    private val battery: Battery,
    private val simCard: SimCard,
    private val memoryCard: MemoryCard
) {
    init {
        Log.i("MYTAG", "Smartphone created.")
    }

    fun powerOn() {
        battery.getPower()
        simCard.connectToNetwork()
        memoryCard.storeData()
        Log.i("MYTAG", "Smartphone powered on.")
    }
}
