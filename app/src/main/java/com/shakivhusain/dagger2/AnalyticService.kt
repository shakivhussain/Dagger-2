package com.shakivhusain.dagger2

import android.util.Log
import com.shakivhusain.dagger2.Common.TAG

interface AnalyticService {
    fun trackEvent(eventName:String, eventType:String)
}
// Need Implementation for this interface

class MixPanelAnalytic: AnalyticService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, " Mic Panel Events : ")
    }

}

class FirebaseAnalytic: AnalyticService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, " Mic Panel Events : ")
    }

}