package com.example.buildapi

import android.app.Application
import com.example.buildapi.repository.AppContainer
import com.example.buildapi.repository.KontakContainer

class KontakAplication : Application(){
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}