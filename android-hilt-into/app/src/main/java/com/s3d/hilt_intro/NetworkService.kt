package com.s3d.hilt_intro

import android.util.Log
import javax.inject.Inject

class NetworkService @Inject constructor() {
    fun log() {
        Log.d(TAG, "NetworkService: $this")
    }
}