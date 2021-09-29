package alireza.nezami.dependency_injection_without_dagger.java.approach2;

import android.app.Application;

import alireza.nezami.dependency_injection_without_dagger.java.approach2.data.local.DatabaseService;
import alireza.nezami.dependency_injection_without_dagger.java.approach2.data.remote.NetworkService;

public class MyApplication extends Application {

    public NetworkService networkService;
    public DatabaseService databaseService;

    @Override
    public void onCreate() {
        super.onCreate();
        networkService = new NetworkService(this, "SOME_API_KEY");
        databaseService = new DatabaseService(this, "dummy_db", 1);
    }
}