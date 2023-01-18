package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.EmailService
import com.shakivhusain.dagger2.NotificationService
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getNotificationService():NotificationService{
        return EmailService()
    }

}