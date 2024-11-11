package com.example.dependencyinjection_dagger

import dagger.Module
import dagger.Provides

@Module(includes = [ServiceProviderModule::class])
class SimCardModule {
    @Provides
    fun provideSimCard(serviceProvider: ServiceProvider): SimCard {
        return SimCard(serviceProvider)
    }
}
