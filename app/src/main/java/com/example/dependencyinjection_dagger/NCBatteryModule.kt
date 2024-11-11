package com.example.dependencyinjection_dagger

import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class NCBatteryModule {

    @Binds
    abstract fun provideNickelCadmiumBattery(nickelCadmiumBattery: NickelCadmiumBattery):Battery
}