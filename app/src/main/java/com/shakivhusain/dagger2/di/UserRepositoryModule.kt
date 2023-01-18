package com.shakivhusain.dagger2.di

import com.shakivhusain.dagger2.FirebaseRepository
import com.shakivhusain.dagger2.SQLRepository
import com.shakivhusain.dagger2.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

    // Whenever you need UsrRepo, this funtion will provide Firebase Obj
    //
//    @Provides
//    fun getFirebaseRepository(sqlRepository: SQLRepository) : UserRepository{
//        return sqlRepository //
//        // Dagger can create the object of sqlRepo cause, its inject with already
//    }


    // Or Can Use Bind

    @Binds
    abstract fun getFirebaseRepository(sqlRepository: SQLRepository) : UserRepository
    // Here we are using bind, Bind Usr repo with sql repo
    // SQL Repo Object can create by itself dagger, so we use bind, otherwise Provide
    // If dagger can create obj by self then we can use bind =, otherwise provide

}