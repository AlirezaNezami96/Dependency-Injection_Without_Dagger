package alireza.nezami.dependency_injection_without_dagger.java.approach3.di;


import alireza.nezami.dependency_injection_without_dagger.java.approach3.MyApplication;
import alireza.nezami.dependency_injection_without_dagger.java.approach3.data.local.DatabaseService;
import alireza.nezami.dependency_injection_without_dagger.java.approach3.data.remote.NetworkService;
import alireza.nezami.dependency_injection_without_dagger.java.approach3.ui.MainActivity;
import alireza.nezami.dependency_injection_without_dagger.java.approach3.ui.MainViewModel;

public class DependencyComponent {

    public static void inject(MyApplication application) {
        application.networkService = new NetworkService(application, "SOME_API_KEY");
        application.databaseService = new DatabaseService(application, "dummy_db", 1);
    }

    public static void inject(MainActivity activity) {
        MyApplication app = (MyApplication) activity.getApplication();
        activity.viewModel = new MainViewModel(app.databaseService, app.networkService);
    }
}
