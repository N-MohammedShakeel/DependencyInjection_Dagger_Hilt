package com.example.dependencyinjection_dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartphone: Smartphone // Smartphone with injected dependencies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up Dagger component and inject dependencies
       DaggerSmartphoneComponent.create() // Dagger-generated class
           .getSmartphone()
           .powerOn()

//        val smartphone = Smartphone(
//            Battery(),
//            SimCard(ServiceProvider()),
//            MemoryCard()
//        )
//        smartphone.powerOn()
    }
}
