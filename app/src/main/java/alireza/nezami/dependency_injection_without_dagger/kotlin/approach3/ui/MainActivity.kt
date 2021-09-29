package alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import alireza.nezami.dependency_injection_without_dagger.R
import alireza.nezami.dependency_injection_without_dagger.kotlin.approach3.di.DependencyComponent
import android.widget.TextView
import android.app.Application

class MainActivity : AppCompatActivity() {
    var viewModel: MainViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DependencyComponent.inject(this)
        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.text = viewModel!!.someData
    }
}