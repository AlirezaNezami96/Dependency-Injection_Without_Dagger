package alireza.nezami.dependency_injection_without_dagger.java.approach1.data.local;

import android.content.Context;

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
public class DatabaseService {

    private Context context;
    private String databaseName;
    private int version;

    public DatabaseService(Context context) {
        // do the initialisation here
        this.context = context;
        databaseName = "dummy_db";
        version = 1;
    }

    public String getDummyData() {
        return "DATABASE_DUMMY_DATA";
    }
}
