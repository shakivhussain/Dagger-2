package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.EmailService
import com.shakivhusain.dagger2.MessageService
import com.shakivhusain.dagger2.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
//class NotificationServiceModule(private val retryCount: Int) {
class NotificationServiceModule() {


    // Manual Qualifier , can be typo mistake here
    @Named("email")
    @Provides
    fun getEmailService(): NotificationService {
        return EmailService()
    }

    // Qualifier is use for distinguish the methods
    // Custom Qualifier is use fir to avoid typo mistake.
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount:Int): NotificationService {
        return MessageService(retryCount)
    }

}