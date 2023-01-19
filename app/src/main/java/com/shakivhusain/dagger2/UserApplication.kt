package com.shakivhusain.dagger2

import android.app.Application
import com.shakivhusain.dagger2.di.DaggerUserRegistrationComponent
import com.shakivhusain.dagger2.di.UserRegistrationComponent

class UserApplication : Application() {


    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()


        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)

    }

}