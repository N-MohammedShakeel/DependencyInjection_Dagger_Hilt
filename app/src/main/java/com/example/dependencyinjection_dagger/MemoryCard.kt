package com.example.dependencyinjection_dagger

import android.util.Log
import jakarta.inject.Inject

class MemoryCard {
    init {
        Log.i("MYTAG", "MemoryCard created.")
    }

    fun storeData() {
        Log.i("MYTAG", "Data stored in memory card.")
    }
}
