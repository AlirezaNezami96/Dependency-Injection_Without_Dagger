package alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import alireza.nezami.dependency_injection_without_dagger.R
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.MyApplication
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.data.local.DatabaseService
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.data.remote.NetworkService
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.ui.MainActivity
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.ui.MainViewModel
import android.widget.TextView
import android.app.Application

object DependencyComponent {
    fun inject(application: MyApplication) {
        application.networkService = NetworkService(application, "SOME_API_KEY")
        application.databaseService = DatabaseService(application, "dummy_db", 1)
    }

    fun inject(activity: MainActivity) {
        val app = activity.application as MyApplication
        activity.viewModel = MainViewModel(app.databaseService, app.networkService)
    }
}