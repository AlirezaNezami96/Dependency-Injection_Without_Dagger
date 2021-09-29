package alireza.nezami.dependency_injection_without_dagger.kotlin.approach2.data.local

import android.content.Context

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
class DatabaseService
    (private val context: Context, private val databaseName: String, private val version: Int) {
    val dummyData: String
        get() = "DATABASE_DUMMY_DATA"
}