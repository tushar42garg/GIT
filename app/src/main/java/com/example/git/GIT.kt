package com.example.git

import android.app.Application
import com.example.git.di.apiModule
import com.example.git.di.networkModule
import com.example.git.di.viewModelModule
import org.koin.android.ext.android.startKoin

/**
 * Created by Tushar Garg on 17/4/20.
 */
@Suppress("Unused")
class GIT : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(
            networkModule,
            apiModule,
            viewModelModule
        ))
    }

}