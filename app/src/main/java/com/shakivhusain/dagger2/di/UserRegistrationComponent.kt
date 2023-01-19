package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.*
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

//@Singleton
@ApplicationScope
@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class, AnalyticsModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    fun getEmailService(): EmailService

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount : Int) : UserRegistrationComponent
    }

}