package com.shakivhusain.dagger2

import android.util.Log
import com.shakivhusain.dagger2.Common.TAG
import javax.inject.Inject


interface NotificationService {
    fun send(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d(TAG, " Email Sent")

    }
}

class MessageService(private val retryCount : Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d(TAG, " Mesg Sent - Retry Count $retryCount")

    }
}