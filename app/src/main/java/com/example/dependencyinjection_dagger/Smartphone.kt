package com.example.dependencyinjection_dagger

import android.util.Log
import jakarta.inject.Singleton
import javax.inject.Inject

@Singleton
class Smartphone @Inject constructor(
    private val battery: Battery,
    private val simCard: SimCard,
    private val memoryCard: MemoryCard
) {
    init {
        battery.getPower()
        simCard.connectToNetwork()
        memoryCard.storeData()
        Log.i("MYTAG", "Smartphone created.")
    }

    fun makeaCallRecording() {
        Log.i("MYTAG", "Calling....")
    }
}
