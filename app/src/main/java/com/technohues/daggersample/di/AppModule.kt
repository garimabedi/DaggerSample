package com.technohues.daggersample.di

import android.app.Application
import dagger.Module
import dagger.Provides

/**
 * Adding anything that will not change for the lifetime of the application
 */
@Module
class AppModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun someString(): String {
            return "This is a test String"
        }

        @Provides
        @JvmStatic
        fun getApp(application: BaseApplication): Boolean {
            return application == null
        }
    }
}