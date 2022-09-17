package com.cbse.jeemain.itopper;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ads.Interstitial;
import com.ads.adsattus;
import com.facebook.ads.InterstitialAd;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.vungle.warren.AdConfig;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

public class splash extends AppCompatActivity implements adsattus {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   if(new prefrencemanager(this).chekpref()) {
       IronSource.setInterstitialListener(new InterstitialListener() {
           @Override
           public void onInterstitialAdReady() {
               Log.d("IronSource_", "onInterstitialAdReady mainactivity " + String.valueOf(""));
               IronSource.showInterstitial("5769321");

           }

           @Override
           public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
               Log.d("IronSource_", "onInterstitialAdLoadFailed mainactivity " + String.valueOf(ironSourceError));
               if (Vungle.isInitialized()) {
                   Vungle.loadAd("INTERSTITIAL-5473499", new LoadAdCallback() {
                       @Override
                       public void onAdLoad(String id) {
                           AdConfig adConfig = new AdConfig();
                           adConfig.setAdOrientation(AdConfig.AUTO_ROTATE);
                           adConfig.setMuted(true);
                           Vungle.playAd("INTERSTITIAL-5473499", adConfig, new PlayAdCallback() {
                               @Override
                               public void onAdStart(String id) {
                                   Log.d("abhishek_ads", "Vungle mainactivity onAdStart");

                               }

                               @Override
                               public void onAdEnd(String id, boolean completed, boolean isCTAClicked) {
                                   Log.d("abhishek_ads", "Vungle mainactivity onAdEnd1");

                               }

                               @Override
                               public void onAdEnd(String id) {
                                   Log.d("abhishek_ads", "Vungle  onAdEnd2");
                               }

                               @Override
                               public void onAdClick(String id) {

                               }

                               @Override
                               public void onAdRewarded(String id) {
                                   Log.d("abhishek_ads", "Vungle  onAdRewarded");

                               }

                               @Override
                               public void onAdLeftApplication(String id) {

                               }

                               @Override
                               public void onError(String id, VungleException exception) {
                                   Log.d("abhishek_ads", "Vungle  onError");
                               }

                               @Override
                               public void onAdViewed(String id) {

                               }
                           });

                       }

                       @Override
                       public void onError(String id, VungleException exception) {
                           new Interstitial("1415772392134176_1417796831931732", splash.this, splash.this).loadAd();
                       }
                   });
               }
           }

           @Override
           public void onInterstitialAdOpened() {

           }

           @Override
           public void onInterstitialAdClosed() {
           }

           @Override
           public void onInterstitialAdShowSucceeded() {

           }

           @Override
           public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {

           }

           @Override
           public void onInterstitialAdClicked() {

           }
       });
       IronSource.init(this, "10c77986d", IronSource.AD_UNIT.INTERSTITIAL);
       IronSource.loadInterstitial();
   }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openActivity();
            }
        },500) ;


    }

    public void openActivity(){
        Intent in=new Intent(splash.this,MainActivity2.class);
        startActivity(in);
        finish();
    }

    @Override
    public void load() {

    }

    @Override
    public void noload() {
     //   openActivity();
    }

    protected void onResume() {
        super.onResume();
        IronSource.onResume(this);
    }
    protected void onPause() {
        super.onPause();
        IronSource.onPause(this);
    }
}
