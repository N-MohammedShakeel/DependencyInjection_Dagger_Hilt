package com.example.dependencyinjection_dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartphone: Smartphone // Smartphone with injected dependencies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Using Application Class for Dagger Dependency Injection
        (application as SmartphoneApplication).smartphoneComponent
            .inject(this)
        smartphone.makeaCallRecording()




        // Set up Dagger component and inject dependencies . with State of a module
//        DaggerSmartphoneComponent.builder()
//            .memoryCardModule(MemoryCardModule(1000))
//            .build()
//            .inject(this)
//            .makeaCallRecording()



//        // Set up Dagger component and inject dependencies
//       DaggerSmartphoneComponent.create() // Dagger-generated class
//           .inject(this) // Field Injection
//           .makeaCallRecording()


        //without field Injection using getter functio of the smarphone class from
        //the smartphone component
//        DaggerSmartphoneComponent.create() // Dagger-generated class
//            .getSmartPhone()
//            .powerOn()





        // normally using Dependency Injection
//        val smartphone = Smartphone(
//            Battery(),
//            SimCard(ServiceProvider()),
//            MemoryCard()
//        )
//        smartphone.powerOn()
    }
}
