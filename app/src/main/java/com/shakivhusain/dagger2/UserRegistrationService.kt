package com.shakivhusain.dagger2

import android.util.Log
import com.shakivhusain.dagger2.di.MessageQualifier
import javax.inject.Inject
import javax.inject.Named

// Step 2 : how will create obj ?
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
   @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser("skb", "123456")
        notificationService.send(email, "shakibraza436@gmail.com", "User Registerd")

    }
}