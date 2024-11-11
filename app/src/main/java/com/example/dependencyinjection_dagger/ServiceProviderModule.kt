package com.example.dependencyinjection_dagger

import dagger.Module
import dagger.Provides

@Module
class ServiceProviderModule {
    @Provides
    fun provideServiceProvider(): ServiceProvider {
        return ServiceProvider()
    }
}
