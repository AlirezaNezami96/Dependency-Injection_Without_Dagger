package alireza.nezami.dependency_injection_without_dagger.kotlin.approach1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import alireza.nezami.dependency_injection_without_dagger.R
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach1.data.local.DatabaseService
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach1.data.remote.NetworkService
import android.content.Context
import android.widget.TextView

class MainViewModel(context: Context?) {
    private val databaseService: DatabaseService = DatabaseService(context)
    private val networkService: NetworkService = NetworkService(context)
    val someData: String
        get() = databaseService.dummyData + " : " + networkService.dummyData
}