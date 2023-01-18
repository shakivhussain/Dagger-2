package com.shakivhusain.dagger2

import android.util.Log
import com.shakivhusain.dagger2.Common.TAG
import javax.inject.Inject



interface UserRepository{
    fun saveUser(email:String, password:String)
}
class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG, "User Saved In Db : ")
        
    }
}

class FirebaseRepository : UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG, "User Saved In Firebase : ")

    }
}