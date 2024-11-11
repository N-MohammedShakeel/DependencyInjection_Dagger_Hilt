package com.example.dependencyinjection_dagger

import dagger.Component

@Component(modules = [ SimCardModule::class, MemoryCardModule::class , NCBatteryModule::class])
interface SmartphoneComponent {
    fun getSmartphone(): Smartphone
}
