package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.FirebaseRepository
import com.shakivhusain.dagger2.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    // Whenever you need UsrRepo, this funtion will provide Firebase Obj
    //
    @Provides
    fun getFirebaseRepository() : UserRepository{
        return FirebaseRepository()
    }


}