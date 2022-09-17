package com.app;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;
import com.google.firebase.FirebaseApp;
import com.vungle.warren.InitCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

public class save extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
        AudienceNetworkAds.initialize(this);
        Vungle.init("610392ed3a153fdfb985a87d", getApplicationContext(), new InitCallback() {
            @Override
            public void onSuccess() {
                // SDK has successfully initialized
            }

            @Override
            public void onError(VungleException exception) {
                // SDK has failed to initialize
            }

            @Override
            public void onAutoCacheAdAvailable(String placementId) {
                // Ad has become available to play for a cache optimized placement
            }
        });

    }

}
