package alireza.nezami.dependency_injection_without_dagger.java.approach1.ui;

import android.os.Bundle;
import android.widget.TextView;



import androidx.appcompat.app.AppCompatActivity;

import alireza.nezami.dependency_injection_without_dagger.R;

public class MainActivity extends AppCompatActivity {

    public MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize MainViewModel
        viewModel = new MainViewModel(this.getApplicationContext());

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());
    }
}
