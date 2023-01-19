package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.EmailService
import com.shakivhusain.dagger2.MainActivity
import com.shakivhusain.dagger2.NotificationService
import com.shakivhusain.dagger2.UserRegistrationService
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    fun getEmailService(): EmailService

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount : Int) : UserRegistrationComponent
    }

}