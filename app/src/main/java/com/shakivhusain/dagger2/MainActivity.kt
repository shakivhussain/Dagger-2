package com.shakivhusain.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shakivhusain.dagger2.di.DaggerUserRegistrationComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userRepository = UserRepository()
//        val emailService = EmailService()

        val component =DaggerUserRegistrationComponent.builder().build()


        // called as constructor injection
//        val userRegistrationService = UserRegistrationService(userRepository, emailService)


        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()

        userRegistrationService.registerUser("shakib@hmail.com", "HeyPass")
    }
}