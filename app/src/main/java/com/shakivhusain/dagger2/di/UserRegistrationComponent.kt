package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.*
import com.shakivhusain.dagger2.analytic.AnalyticsModule
import dagger.BindsInstance
import dagger.Component

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