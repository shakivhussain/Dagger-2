package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.EmailService
import com.shakivhusain.dagger2.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {

    // Step 1 :We need this obj
    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService() : EmailService
}