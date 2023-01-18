package com.shakivhusain.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shakivhusain.dagger2.di.DaggerUserRegistrationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject // we need inject on this field
    lateinit var userRegistrationService: UserRegistrationService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()

        component.inject(this)
//        val emailService = component.getEmailService()

        userRegistrationService.registerUser("shakib@hmail.com", "HeyPass")
    }
}