package com.example.dependencyinjection_dagger

import dagger.Component
import jakarta.inject.Singleton

@Singleton
@Component(modules = [ SimCardModule::class, MemoryCardModule::class , NCBatteryModule::class])
interface SmartphoneComponent {

    // Add this method to provide the Smartphone instance
    //    fun getSmartphone(): Smartphone

    // (or)

    //Best practices
    // Add this method to inject dependencies into MainActivity
    fun inject(mainactivty: MainActivity)
}
