package alireza.nezami.dependency_injection_without_dagger.java.approach3.ui;


import alireza.nezami.dependency_injection_without_dagger.java.approach3.data.local.DatabaseService;
import alireza.nezami.dependency_injection_without_dagger.java.approach3.data.remote.NetworkService;

public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
