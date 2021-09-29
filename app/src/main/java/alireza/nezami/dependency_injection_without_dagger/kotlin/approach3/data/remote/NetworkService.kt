package alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.data.remote

import android.content.Context

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
class NetworkService
    (private val context: Context, private val apiKey: String) {
    val dummyData: String
        get() = "NETWORK_DUMMY_DATA"
}