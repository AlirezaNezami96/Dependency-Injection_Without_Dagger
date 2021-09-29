package alireza.nezami.dependency_injection_without_dagger.kotlin.approach2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import alireza.nezami.dependency_injection_without_dagger.R
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach2.data.local.DatabaseService
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach2.data.remote.NetworkService
import android.widget.TextView
import android.app.Application

class MainViewModel(
    private val databaseService: DatabaseService?,
    private val networkService: NetworkService?
) {
    val someData: String
        get() = databaseService!!.dummyData + " : " + networkService!!.dummyData
}