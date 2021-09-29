package alireza.nezami.dependency_injection_without_dagger.java.approach3;

import android.app.Application;

import alireza.nezami.dependency_injection_without_dagger.java.approach3.data.local.DatabaseService;
import alireza.nezami.dependency_injection_without_dagger.java.approach3.data.remote.NetworkService;
import alireza.nezami.dependency_injection_without_dagger.java.approach3.di.DependencyComponent;

public class MyApplication extends Application {

    public NetworkService networkService;
    public DatabaseService databaseService;

    @Override
    public void onCreate() {
        super.onCreate();
        DependencyComponent.inject(this);
    }
}