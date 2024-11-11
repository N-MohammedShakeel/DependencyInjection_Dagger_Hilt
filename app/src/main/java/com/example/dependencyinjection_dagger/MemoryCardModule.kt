package com.example.dependencyinjection_dagger

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {
    @Provides
    fun provideMemoryCard(): MemoryCard {
        return MemoryCard()
    }
}