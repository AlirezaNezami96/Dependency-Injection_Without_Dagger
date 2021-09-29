package alireza.nezami.dependency_injection_without_dagger.kotlin.approach1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import alireza.nezami.dependency_injection_without_dagger.R
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize MainViewModel
        viewModel = MainViewModel(this.applicationContext)
        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.text = viewModel.someData
    }
}