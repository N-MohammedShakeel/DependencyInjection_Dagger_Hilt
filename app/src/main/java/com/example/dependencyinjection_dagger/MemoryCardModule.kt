package com.example.dependencyinjection_dagger

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(var memorySize: Int) {
    @Provides
    fun provideMemoryCard(): MemoryCard {
        Log.i("MYTAG", "Size of the memory is $memorySize")
        return MemoryCard()
    }
}
