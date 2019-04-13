package com.ssu385.blizzardconsumer;

import android.app.Application;

/**
 * Created by Bryan on 4/9/2017.
 */

public class BlizzardConsumerApplication extends Application{

    private static  BlizzardConsumerApplication applicationInstance;



    private String locale;
    private String apikey;
    private String bossRouteExtension;
    private String baseApiUrl;





    @Override
    public void onCreate() {
        super.onCreate();
        applicationInstance = this;
        initialize();
    }

    public static BlizzardConsumerApplication getApplicationInstance() {

        return applicationInstance;

    }
    public void initialize(){
        locale = getString(R.string.locale);
        apikey = getString(R.string.api_key);
        baseApiUrl = getString(R.string.base_api_url);
        bossRouteExtension = getString(R.string.boss_route_extension);
    }

    public String getLocale() {
        return locale;
    }

    public String getApiKey() {
        return apikey;
    }

    public String getBossRouteExtension() {
        return bossRouteExtension;
    }

    public String getBaseApiUrl() {
        return baseApiUrl;
    }

}
