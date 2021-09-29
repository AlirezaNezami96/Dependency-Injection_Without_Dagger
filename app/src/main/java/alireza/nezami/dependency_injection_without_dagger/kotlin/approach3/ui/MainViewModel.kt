package alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.ui

import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.data.local.DatabaseService
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.data.remote.NetworkService

class MainViewModel(
    private val databaseService: DatabaseService?,
    private val networkService: NetworkService?
) {
    val someData: String
        get() = databaseService!!.dummyData + " : " + networkService!!.dummyData
}