package com.example.lootlearn

import android.app.Application
import android.os.Build
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class LootLearnApplication : Application() {
    override fun onCreate() {
        super.onCreate()
//        if(BuildConfig.DEBUG){
//            Timber.plant(Timber.DebugTree())
//        }
        Timber.plant(Timber.DebugTree())
    }
}