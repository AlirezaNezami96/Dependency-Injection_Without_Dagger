package alireza.nezami.dependency_injection_without_dagger.java.approach1.ui;

import android.content.Context;

import alireza.nezami.dependency_injection_without_dagger.java.approach1.data.local.DatabaseService;
import alireza.nezami.dependency_injection_without_dagger.java.approach1.data.remote.NetworkService;


public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    public MainViewModel(Context context) {
        networkService = new NetworkService(context);
        databaseService = new DatabaseService(context);
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
