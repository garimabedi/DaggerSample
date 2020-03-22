package com.technohues.daggersample.di

import com.technohues.daggersample.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributesAuthActivity(): AuthActivity

}