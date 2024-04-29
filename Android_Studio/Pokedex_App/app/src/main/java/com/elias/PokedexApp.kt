package com.elias

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp//Permite inytectar directamente dependendcias, facilita el acceso a los objetos necesarios
class PokedexApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())//Se utiliza para el registro, proporciona una api mas
        //facil de usar
    }
}