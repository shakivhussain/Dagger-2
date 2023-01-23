package com.shakivhusain.dagger2

import android.util.Log
import com.shakivhusain.dagger2.Common.TAG
import com.shakivhusain.dagger2.analytic.AnalyticService
import javax.inject.Inject



interface UserRepository{
    fun saveUser(email:String, password:String)
}
class SQLRepository @Inject constructor(val analytic: AnalyticService) : UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG, "User Saved In Db : ")
        analytic.trackEvent("HeyEvent", "None")
    }
}

class FirebaseRepository(val analytic: AnalyticService) : UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG, "User Saved In Firebase : ")

        analytic.trackEvent("FireEvent", "LIKE")
    }
}