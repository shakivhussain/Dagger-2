package com.shakivhusain.dagger2

import android.util.Log
import com.shakivhusain.dagger2.Common.TAG
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to: String, from: String, body: String) {
        Log.d(TAG, " Email Sent")

    }
}