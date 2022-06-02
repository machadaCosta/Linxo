package io.chill.linxo

import android.app.Application
import io.chill.linxo.data.FakeRepository
import io.chill.linxo.data.remote.FakeRemoteDataSource
import timber.log.Timber

class App : Application() {

    companion object {
        lateinit var instance: App

        // Initialize the app repository
        val fakeRepository by lazy {
            FakeRepository(FakeRemoteDataSource)
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        // Initialise Timber for debugging
        Timber.plant(Timber.DebugTree())
    }
}