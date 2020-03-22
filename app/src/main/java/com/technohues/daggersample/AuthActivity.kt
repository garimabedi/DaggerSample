package com.technohues.daggersample

import android.os.Bundle
import android.util.Log
import com.technohues.daggersample.databinding.ActivityAuthBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named

abstract class AuthActivity : DaggerAppCompatActivity() {

    val TAG: String = javaClass.name
    lateinit var activityAuthBinding: ActivityAuthBinding

    @Inject
    lateinit var str: String

    @JvmField
    @field:[Inject Named("isAppNull")]
    var isAppNull: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityAuthBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(activityAuthBinding.root)
        activityAuthBinding.textView.setTextColor(getColor(android.R.color.holo_red_dark))
        activityAuthBinding.str = str
        Log.d(TAG, "str is ${activityAuthBinding.str}")
        Log.d(TAG, "app is null: $isAppNull")
    }
}
