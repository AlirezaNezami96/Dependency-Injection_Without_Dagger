package alireza.nezami.dependency_injection_without_dagger.kotlin.approach2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import alireza.nezami.dependency_injection_without_dagger.R
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach2.data.local.DatabaseService
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach2.data.remote.NetworkService
import android.widget.TextView
import android.app.Application

class MyApplication : Application() {
    var networkService: NetworkService? = null
    var databaseService: DatabaseService? = null
    override fun onCreate() {
        super.onCreate()
        networkService = NetworkService(this, "SOME_API_KEY")
        databaseService = DatabaseService(this, "dummy_db", 1)
    }
}