package com.shakivhusain.dagger2

import android.util.Log
import com.shakivhusain.dagger2.Common.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String, password:String){
        Log.d(TAG, "User Saved In Db : ")
        
    }
}