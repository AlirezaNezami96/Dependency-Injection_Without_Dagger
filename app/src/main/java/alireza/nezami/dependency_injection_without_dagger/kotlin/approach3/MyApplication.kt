package alireza.nezami.dependency_injection_without_dagger.kotlin.approach3

import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.data.local.DatabaseService
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.data.remote.NetworkService
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.di.DependencyComponent
import android.app.Application

class MyApplication : Application() {
    var networkService: NetworkService? = null
    var databaseService: DatabaseService? = null
    override fun onCreate() {
        super.onCreate()
        DependencyComponent.inject(this)
    }
}