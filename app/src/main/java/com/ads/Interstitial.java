package com.ads;


import android.app.Activity;
import android.util.Log;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.vungle.warren.AdConfig;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

public class Interstitial {
    String adunit;
    Activity activity;
    private InterstitialAd interstitialAd;
    adsattus adsattus;
    public Interstitial(String adunit, Activity activity,adsattus adsattu) {
        this.adsattus=adsattu;
        this.adunit = adunit;
        this.activity = activity;
        interstitialAd = new InterstitialAd(activity, adunit);
        loadAd();
    }
    public void loadAd() {
        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(new InterstitialAdListener() {
                            @Override
                            public void onInterstitialDisplayed(Ad ad) {

                            }

                            @Override
                            public void onInterstitialDismissed(Ad ad) {
                                adsattus.noload();

                            }

                            @Override
                            public void onError(Ad ad, AdError adError) {
                                adsattus.noload();
                              /*  if (Vungle.isInitialized()) {
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
                                                    adsattus.noload();
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
                                                    adsattus.noload();                      }

                                                @Override
                                                public void onAdViewed(String id) {

                                                }
                                            });

                                        }

                                        @Override
                                        public void onError(String id, VungleException exception) {
                                            adsattus.noload();
                                        }
                                    });
                                }*/

                            }

                            @Override
                            public void onAdLoaded(Ad ad) {
                                if(interstitialAd != null && interstitialAd.isAdLoaded()&&!interstitialAd.isAdInvalidated() ) {
                                    interstitialAd.show();
                                    adsattus.load();  }
                            }

                            @Override
                            public void onAdClicked(Ad ad) {

                            }

                            @Override
                            public void onLoggingImpression(Ad ad) {

                            }
                        })
                        .build());
    }


}
