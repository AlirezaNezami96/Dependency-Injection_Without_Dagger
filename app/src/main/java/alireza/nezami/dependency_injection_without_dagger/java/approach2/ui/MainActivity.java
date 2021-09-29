package alireza.nezami.dependency_injection_without_dagger.java.approach2.ui;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import alireza.nezami.dependency_injection_without_dagger.R;
import alireza.nezami.dependency_injection_without_dagger.java.approach2.MyApplication;

public class MainActivity extends AppCompatActivity {

    public MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize MainViewModel
        MyApplication app = (MyApplication) getApplication();
        viewModel = new MainViewModel(app.databaseService, app.networkService);

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());
    }
}
