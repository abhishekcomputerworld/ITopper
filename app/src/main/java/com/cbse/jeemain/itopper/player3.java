package com.cbse.jeemain.itopper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class player3 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    public static final String API_KEY="AIzaSyAnfyYNjMz0Mdqn2khy14NDMEmGL1mnBnA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtubeplayer);
        youTubePlayerView.initialize(API_KEY,this);{
        }

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        youTubePlayer.setFullscreen(true);
        Youtubeconfig ab1=new Youtubeconfig();
        if(ab1.st=="mathch1"){
            mathvideolist1 ab=new   mathvideolist1();
            if(ab.a==1){ youTubePlayer.loadVideo("Uw78QGAUCEk");}
            else if(ab.a==2){ youTubePlayer.loadVideo("5zsuQWaNx84");}
            else if(ab.a==3){ youTubePlayer.loadVideo("xzenTgq9y58");}
            else if(ab.a==4){ youTubePlayer.loadVideo("JpvCrA0C91U");}
            else if(ab.a==5){ youTubePlayer.loadVideo("ayUrrV7_XaI");}
            else if(ab.a==6){ youTubePlayer.loadVideo("kZrCUeovfnM");}
            else if(ab.a==7){ youTubePlayer.loadVideo("1pWmxdxvV6s");}
            else if(ab.a==8){ youTubePlayer.loadVideo("8XQDJV-uda0");}
        }

        else if(ab1.st=="mathch2")
        {
            mathvideolist2 ab=new   mathvideolist2();
            if(ab.a==1){ youTubePlayer.loadVideo("RJD3p-279aM");}
            else if(ab.a==2){ youTubePlayer.loadVideo("Nbkg6P_qXMM");}
            else if(ab.a==3){ youTubePlayer.loadVideo("HzGrWXAoOgI");}
            else if(ab.a==4){ youTubePlayer.loadVideo("2Wb84Sk4hu0");}

        }
        else if(ab1.st=="mathch3")
        {
            mathvideolist3 ab=new   mathvideolist3();
            if(ab.a==1){ youTubePlayer.loadVideo("lyLSqHETEaY");}
            else if(ab.a==2){ youTubePlayer.loadVideo("w1Lv8-13ySc");}
            else if(ab.a==3){ youTubePlayer.loadVideo("Z4XOUZCJ2_0");}
            else if(ab.a==4){ youTubePlayer.loadVideo("KY7Ge4xP8ik");}
            else if(ab.a==5){ youTubePlayer.loadVideo("3RC_6GwCxec");}
            else if(ab.a==6){ youTubePlayer.loadVideo("_x_102TDgRo");}
            else if(ab.a==7){ youTubePlayer.loadVideo("ERNfUvnn70M");}

        }

        else if(ab1.st=="mathch4")
        {    mathvideolist4 ab=new   mathvideolist4();
            if(ab.a==1){ youTubePlayer.loadVideo("VfUjEV8QDQU");}
            else if(ab.a==2){ youTubePlayer.loadVideo("0LRjwPDvVeQ");}
            else if(ab.a==3){ youTubePlayer.loadVideo("I6hcKH4p-Jg");}
            else if(ab.a==4){ youTubePlayer.loadVideo("k1vBFzFXjAk");}
            else if(ab.a==5){ youTubePlayer.loadVideo("LQQBwNHWB8w");}
            else if(ab.a==6){ youTubePlayer.loadVideo("zjSPRHtGOwk");}
            else if(ab.a==7){ youTubePlayer.loadVideo("iWiWKJ8RauA");}
        }

        else if(ab1.st=="mathch5")
        {     mathvideolist5 ab=new   mathvideolist5();
            if(ab.a==1){ youTubePlayer.loadVideo("1TuWg2pwjJA");}
            else if(ab.a==2){ youTubePlayer.loadVideo("s-sfytgKIHU");}
            else if(ab.a==3){ youTubePlayer.loadVideo("vqo86X2Wp2E");}
            else if(ab.a==4){ youTubePlayer.loadVideo("ab_Epl7kYrc");}
            else if(ab.a==5){ youTubePlayer.loadVideo("Tq0aeNb8p5o");}
            else if(ab.a==6){ youTubePlayer.loadVideo("nXSpNFRB9f8");}
            else if(ab.a==7){ youTubePlayer.loadVideo("FCgRCQd3MXA");}
            else if(ab.a==8){ youTubePlayer.loadVideo("2JrVX6jXnwo");}
            else if(ab.a==9){ youTubePlayer.loadVideo("xloXWd1L2oo");}
            else if(ab.a==10){ youTubePlayer.loadVideo("uZHYSc2k71E");}
            else if(ab.a==11){ youTubePlayer.loadVideo("1hRdcGI-BK4");}
            else if(ab.a==12){ youTubePlayer.loadVideo("F3y9ePu4cUw");}
            else if(ab.a==13){ youTubePlayer.loadVideo("-jCRPwxqdU0");}
            else if(ab.a==14){ youTubePlayer.loadVideo("xhbfjM0Edgw");}
            else if(ab.a==15){ youTubePlayer.loadVideo("_yP1nayP9t4");}
            else if(ab.a==16){ youTubePlayer.loadVideo("c1FOrOzIniU");}

        }
        else if(ab1.st=="mathch6")

        {      mathvideolist6 ab=new   mathvideolist6();
            if(ab.a==1){ youTubePlayer.loadVideo("UJ5coU-7qUM");}
            else if(ab.a==2){ youTubePlayer.loadVideo("hJ6zh-LDN74");}
            else if(ab.a==3){ youTubePlayer.loadVideo("r69bpFUqBXA");}
            else if(ab.a==4){ youTubePlayer.loadVideo("if1v3xHPqhI");}
            else if(ab.a==5){ youTubePlayer.loadVideo("0E4OA9z40ds");}
            else if(ab.a==6){ youTubePlayer.loadVideo("on3Wd1Piv8o");}
            else if(ab.a==7){ youTubePlayer.loadVideo("IGtAAZr8BKc");}
            else if(ab.a==8){ youTubePlayer.loadVideo("zLoNEzhfo2s");}

            else if(ab.a==9){ youTubePlayer.loadVideo("L-l6qKonYao");}
            else if(ab.a==10){ youTubePlayer.loadVideo("ZflK11c36qY");}
            else if(ab.a==11){ youTubePlayer.loadVideo("VXwx_j6MnH8");}
            else if(ab.a==12){ youTubePlayer.loadVideo("03e6JT0tC9I");}
        }

        else if(ab1.st=="mathch7")
        {    mathvideolist7 ab=new   mathvideolist7();
            if(ab.a==1){ youTubePlayer.loadVideo("SC65qBIBjNA");}
            else if(ab.a==2){ youTubePlayer.loadVideo("Yk7XXwakX6U");}
            else if(ab.a==3){ youTubePlayer.loadVideo("5tkmb0u9sVU");}
            else if(ab.a==4){ youTubePlayer.loadVideo("ZLoOtgbMC3c");}
            else if(ab.a==5){ youTubePlayer.loadVideo("k65YLozVTwk");}
            else if(ab.a==6){ youTubePlayer.loadVideo("gKbvn90qD6o");}
            else if(ab.a==7){ youTubePlayer.loadVideo("wCQoUCQB7YE");}
            else if(ab.a==8){ youTubePlayer.loadVideo("QvVX5YGc_nU");}
            else if(ab.a==9){ youTubePlayer.loadVideo("rVe7fJ5W19k");}
            else if(ab.a==10){ youTubePlayer.loadVideo("PhZGfRbokg8");}
            else if(ab.a==11){ youTubePlayer.loadVideo("8FMisCJLh2Q");}
            else if(ab.a==12){ youTubePlayer.loadVideo("iL4O6f1Gh9c");}
            else if(ab.a==13){ youTubePlayer.loadVideo("YETE96zK8_E");}
            else if(ab.a==14){ youTubePlayer.loadVideo("UPzlhFRqQMU");}
            else if(ab.a==15){ youTubePlayer.loadVideo("PE4_9r_tM7I");}
            else if(ab.a==16){ youTubePlayer.loadVideo("KsQZy12lGCg");}
        }
        else if(ab1.st=="mathch8")
        {     mathvideolist8 ab=new   mathvideolist8();
            if(ab.a==1){ youTubePlayer.loadVideo("Y-0MNn58K_I");}
            else if(ab.a==2){ youTubePlayer.loadVideo("RTMuvkp5dmI");}
            else if(ab.a==3){ youTubePlayer.loadVideo("3BvuN7VDyOM");}
           }
        else if(ab1.st=="mathch9")
        {      mathvideolist9 ab=new   mathvideolist9();
            if(ab.a==1){ youTubePlayer.loadVideo("8A9eMBBgx2o");}
            else if(ab.a==2){ youTubePlayer.loadVideo("cOxtuU6SzH4");}
            else if(ab.a==3){ youTubePlayer.loadVideo("FqM2aInV_S8");}
            else if(ab.a==4){ youTubePlayer.loadVideo("qFaWUcZePyc");}
            else if(ab.a==5){ youTubePlayer.loadVideo("G9KpOQ33lwg");}
            else if(ab.a==6){ youTubePlayer.loadVideo("hdnGdsI5NvI");}
            else if(ab.a==8){ youTubePlayer.loadVideo("mtDvyYvs9CQ");}
            else if(ab.a==9){ youTubePlayer.loadVideo("dtf0qrtklUw");}
            else if(ab.a==7){ youTubePlayer.loadVideo("P8QlB_Jgl4s");}
        }

        else if(ab1.st=="mathch10")
        {      mathvideolist10 ab=new   mathvideolist10();
            if(ab.a==1){ youTubePlayer.loadVideo("3RbaiYyNhRA");}
            else if(ab.a==2){ youTubePlayer.loadVideo("Cr4oEYROC88");}
            else if(ab.a==3){ youTubePlayer.loadVideo("3HRQbupOO-o");}
            else if(ab.a==4){ youTubePlayer.loadVideo("1qWB4_kJhM4");}
            else if(ab.a==5){ youTubePlayer.loadVideo("w8D39zABs6E");}
            else if(ab.a==6){ youTubePlayer.loadVideo("xvfvxFkee88");}
            // else if(ab.a==7){ youTubePlayer.loadVideo("ejHH_lIe7Kg");}
        }

        else if(ab1.st=="mathch11")
        {       mathvideolist11 ab=new   mathvideolist11();
            if(ab.a==1){ youTubePlayer.loadVideo("PB0XNy_wCLk");}
            else if(ab.a==2){ youTubePlayer.loadVideo("bmvZqDradLo");}
            else if(ab.a==3){ youTubePlayer.loadVideo("lIYqUqtj5YU");}
            else if(ab.a==4){ youTubePlayer.loadVideo("qD8rfKLD8A8");}
            else if(ab.a==5){ youTubePlayer.loadVideo("qVSIGEQQ7vE");}}
        else if(ab1.st=="mathch12")
        {      mathvideolist12 ab=new   mathvideolist12();
            if(ab.a==1){ youTubePlayer.loadVideo("HC2lTSoPmQE");}
            else if(ab.a==2){ youTubePlayer.loadVideo("5wka4_Ml-To");}
            else if(ab.a==3){ youTubePlayer.loadVideo("0WpmvZsImyo");}
            else if(ab.a==4){ youTubePlayer.loadVideo("Woq5ma07f3k");}
           }

        else if(ab1.st=="mathch13")
        {
            mathvideolist13 ab=new   mathvideolist13();
            if(ab.a==1){ youTubePlayer.loadVideo("zVCdnjf4o-I");}
            else if(ab.a==2){ youTubePlayer.loadVideo("uiB0MsrGMcw");}
            else if(ab.a==3){ youTubePlayer.loadVideo("Fa6bRiSs8v4");}
            else if(ab.a==4){ youTubePlayer.loadVideo("HjLH4O-NamY");}
            else if(ab.a==5){ youTubePlayer.loadVideo("PAtyo_Sy8jI");}
            else if(ab.a==6){ youTubePlayer.loadVideo("GXpUN2u-OOA");}
            else if(ab.a==7){ youTubePlayer.loadVideo("z3F9Dcv-l-4");}
            else if(ab.a==8){ youTubePlayer.loadVideo("RJzfQj6Rh0k");}
            else if(ab.a==9){ youTubePlayer.loadVideo("6iJX2afF_kM");}
            else if(ab.a==10){ youTubePlayer.loadVideo("Ws-sWxT9zow");}
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
