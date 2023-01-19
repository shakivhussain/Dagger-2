package com.shakivhusain.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shakivhusain.dagger2.EmailService_Factory.create
import com.shakivhusain.dagger2.di.DaggerUserRegistrationComponent
import com.shakivhusain.dagger2.di.NotificationServiceModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject // we need inject on this field
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)
//            .builder()
//            .notificationServiceModule(NotificationServiceModule(3))
//            .build()

        component.inject(this)
//        val emailService = component.getEmailService()

        userRegistrationService.registerUser("shakib@hmail.com", "HeyPass")
    }
}