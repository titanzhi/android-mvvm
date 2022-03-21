package com.s3d.hilt_intro

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class NetworkModule {

    @Provides
    fun provideNetworkAdapter(): NetworkAdapter {
        return NetworkAdapter.Builder()
            .protocol("HTTPS")
            .host("google.com")
            .build()
    }
}