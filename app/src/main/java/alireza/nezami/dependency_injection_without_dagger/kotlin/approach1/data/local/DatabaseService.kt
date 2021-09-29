package alireza.nezami.dependency_injection_without_dagger.kotlin.approach1.data.local

import android.content.Context

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
data class DatabaseService
    (
    private val context: Context?,
    private val databaseName: String = "dummy_db",
    private val version: Int = 1
) {
    val dummyData: String
        get() = "DATABASE_DUMMY_DATA"
}