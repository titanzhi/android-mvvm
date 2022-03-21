package com.s3d.hilt_intro

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "HiltIntroTag"

@HiltAndroidApp
class HiltIntroApplication: Application() {
}