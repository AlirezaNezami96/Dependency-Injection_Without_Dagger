package alireza.nezami.dependency_injection_without_dagger.kotlin.approach1.data.remote

import android.content.Context

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
class NetworkService
    (
    private val context: Context?,
    private val apiKey: String = "SOME_API_KEY"
) {
    val dummyData: String
        get() = "NETWORK_DUMMY_DATA"
}