package com.example.android.eggtimernotifications

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        Log.d(TAG, "From: ${remoteMessage?.from}")
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate contact firebase instance service");
    }

    override fun onNewToken(token: String?) {
        Log.d(TAG, "Refreshed token: $token")
        sendRegistrationToServer(token)
    }

    fun sendRegistrationToServer(token:String?){
        FirebaseMessaging.getInstance().subscribeToTopic("global")
    }
}