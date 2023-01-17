package com.shakivhusain.dagger2

import android.util.Log
import javax.inject.Inject

// Step 2 : how will create ?
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser("skb", "123456")
        emailService.send(email, "shakibraza436@gmail.com", "User Registerd")

    }
}