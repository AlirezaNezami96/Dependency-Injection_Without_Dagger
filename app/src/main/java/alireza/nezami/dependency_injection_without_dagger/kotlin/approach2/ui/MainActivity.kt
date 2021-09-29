package alireza.nezami.dependency_injection_without_dagger.kotlin.approach2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import alireza.nezami.dependency_injection_without_dagger.R
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach2.MyApplication
import android.widget.TextView
import android.app.Application

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize MainViewModel
        val app = application as MyApplication
        viewModel = MainViewModel(app.databaseService, app.networkService)
        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.text = viewModel.someData
    }
}