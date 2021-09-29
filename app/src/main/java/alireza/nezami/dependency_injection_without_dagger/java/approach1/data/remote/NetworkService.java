package alireza.nezami.dependency_injection_without_dagger.java.approach1.data.remote;

import android.content.Context;

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
public class NetworkService {

    private Context context;
    private String apiKey;

    public NetworkService(Context context) {
        this.context = context;
        // do the initialisation here
        apiKey = "SOME_API_KEY";
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA";
    }
}
