package com.cbse.jeemain.itopper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class player extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
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
        if(ab1.st=="physicsch1"){
            phyvideolist ab=new  phyvideolist();
            if(ab.a==1){ youTubePlayer.loadVideo("BjkzTGFgqxs");}
            else if(ab.a==2){ youTubePlayer.loadVideo("DGXTvYOpwvw");}
            else if(ab.a==3){ youTubePlayer.loadVideo("xzenTgq9y58");}
            else if(ab.a==4){ youTubePlayer.loadVideo("HNx1N9dq9TE");}
            else if(ab.a==5){ youTubePlayer.loadVideo("yJaMKzrE75s");}
            else if(ab.a==6){ youTubePlayer.loadVideo("LS0jBx19mTI");}
            else if(ab.a==7){ youTubePlayer.loadVideo("VXtmlVMwOzM");}
            else if(ab.a==8){ youTubePlayer.loadVideo("NN8Qx-0qMa0");}
            else if(ab.a==9){ youTubePlayer.loadVideo("iA118Dg4oZk");}
            else if(ab.a==10){ youTubePlayer.loadVideo("AubM2TcsOno");}
            else if(ab.a==11){ youTubePlayer.loadVideo("MakD7U1AoOc");}
            else if(ab.a==12){ youTubePlayer.loadVideo("3afxg4weGNw");}
            else if(ab.a==13){ youTubePlayer.loadVideo("NsrxtKKpgvA");}
            else if(ab.a==14){ youTubePlayer.loadVideo("55XDhI28KlQ");}
            else if(ab.a==15){ youTubePlayer.loadVideo("UaY7v60SzD8");}
            else if(ab.a==16){ youTubePlayer.loadVideo("3l_I84FasuY");}}

        else if(ab1.st=="physicsch2")
        {
            phyvideolist2 ab=new  phyvideolist2();
            if(ab.a==1){ youTubePlayer.loadVideo("VBu-Q-QFaFE");}
            else if(ab.a==2){ youTubePlayer.loadVideo("RtmWoi4KADM");}
            else if(ab.a==3){ youTubePlayer.loadVideo("qOtU8-wFnVU");}
            else if(ab.a==4){ youTubePlayer.loadVideo("Rm6FULlZixU");}
            else if(ab.a==5){ youTubePlayer.loadVideo("a2YFmwRdHtc");}
            else if(ab.a==6){ youTubePlayer.loadVideo("p3A2b622Xb4");}
            else if(ab.a==7){ youTubePlayer.loadVideo("fEUfHaAmMes");}
            else if(ab.a==8){ youTubePlayer.loadVideo("9J4y0fAkSr4");}
            else if(ab.a==9){ youTubePlayer.loadVideo("JdXs4UTFLv4");}
            else if(ab.a==10){ youTubePlayer.loadVideo("3GZA5inR6mo");}
            else if(ab.a==11){ youTubePlayer.loadVideo("8S8vzIzmu7Q");}
            else if(ab.a==12){ youTubePlayer.loadVideo("jYx7qfNPJAU");}
            else if(ab.a==13){ youTubePlayer.loadVideo("yKfCKMm0fIY");}
            else if(ab.a==14){ youTubePlayer.loadVideo("8dR74-jyfJo");}
            else if(ab.a==15){ youTubePlayer.loadVideo("3zzfNCictog");}
        }
        else if(ab1.st=="physicsch3")
        {
            phyvideolist3 ab=new  phyvideolist3();
            if(ab.a==1){ youTubePlayer.loadVideo("eHwJW-bKlR4");}
            else if(ab.a==2){ youTubePlayer.loadVideo("ZxERj1qK6Tk");}
            else if(ab.a==3){ youTubePlayer.loadVideo("E3EV5ZWGJhQ");}
            else if(ab.a==4){ youTubePlayer.loadVideo("33_YpG8UHQA");}
            else if(ab.a==5){ youTubePlayer.loadVideo("fXdJcXL0yzw");}
            else if(ab.a==6){ youTubePlayer.loadVideo("MK0E_jVP0Pk");}
            else if(ab.a==7){ youTubePlayer.loadVideo("FYV40vOEzxs");}
            else if(ab.a==8){ youTubePlayer.loadVideo("t8aDYUzBK3g");}
            else if(ab.a==9){ youTubePlayer.loadVideo("bwMfN9nDK7U");}
            else if(ab.a==10){ youTubePlayer.loadVideo("444h4Vzskqk");}
            else if(ab.a==11){ youTubePlayer.loadVideo("RM4hlj4oGV8");}
            else if(ab.a==12){ youTubePlayer.loadVideo("xO7b-CDEu3M");}
            else if(ab.a==13){ youTubePlayer.loadVideo("Xu2aHXvbMuc");}
            else if(ab.a==14){ youTubePlayer.loadVideo("8thvnlc4_YY");}
            else if(ab.a==15){ youTubePlayer.loadVideo("0e51bC5vdZQ");}
            else if(ab.a==16){ youTubePlayer.loadVideo("BMvnTKRkj3s");}
            else if(ab.a==17){ youTubePlayer.loadVideo("4PfT2yF2rng");}
            else if(ab.a==18){ youTubePlayer.loadVideo("4rWeo37OU-4");}
            else if(ab.a==19){ youTubePlayer.loadVideo("yMrwr-vl5Ok");}
            else if(ab.a==20){ youTubePlayer.loadVideo("3fDwy2tAWUo");}
            else if(ab.a==21){ youTubePlayer.loadVideo("37A7y_XIIi8");}
        }

        else if(ab1.st=="physicsch4")
        {   phyvideolist4 ab=new  phyvideolist4();
            if(ab.a==1){ youTubePlayer.loadVideo("UKNxpx5m3hc");}
            else if(ab.a==2){ youTubePlayer.loadVideo("3AIKEi41C6c");}
            else if(ab.a==3){ youTubePlayer.loadVideo("Uj_U_BtW4ZI");}
            else if(ab.a==4){ youTubePlayer.loadVideo("HNav57yKKuc");}
            else if(ab.a==5){ youTubePlayer.loadVideo("wOuJz5wzeeY");}
            else if(ab.a==6){ youTubePlayer.loadVideo("dQCBF-0Ak-A");}
            else if(ab.a==7){ youTubePlayer.loadVideo("1Xlvv1o6gDA");}
            else if(ab.a==8){ youTubePlayer.loadVideo("4jfEPuYMaOw");}
            else if(ab.a==9){ youTubePlayer.loadVideo("SJGMRcHw3cw");}
            else if(ab.a==10){ youTubePlayer.loadVideo("mP-PM4DfF4U");}
            else if(ab.a==11){ youTubePlayer.loadVideo("G3ACoSWZa6U");}
            else if(ab.a==12){ youTubePlayer.loadVideo("qWsbbCPMJuI");}
            else if(ab.a==13){ youTubePlayer.loadVideo("LVhXKEUkyxg");}
            else if(ab.a==14){ youTubePlayer.loadVideo("l92UuQOmmVg");}
            else if(ab.a==15){ youTubePlayer.loadVideo("NtdDQCQS0NU");}
            else if(ab.a==16){ youTubePlayer.loadVideo("8Wx9mwcQgFM");}
           }

        else if(ab1.st=="physicsch5")
        {     phyvideolist5 ab=new  phyvideolist5();
            if(ab.a==1){ youTubePlayer.loadVideo("VkVEXfrCtmM");}
            else if(ab.a==2){ youTubePlayer.loadVideo("fSdwjheT5fw");}
            else if(ab.a==3){ youTubePlayer.loadVideo("P-ZZQGyLZ0o");}
            else if(ab.a==4){ youTubePlayer.loadVideo("GnhC6yhvJac");}
            else if(ab.a==5){ youTubePlayer.loadVideo("eaFEcPCe1dU");}
            else if(ab.a==6){ youTubePlayer.loadVideo("tEsXUBRRrYY");}
            else if(ab.a==7){ youTubePlayer.loadVideo("bsLqUcmWfzI");}
            else if(ab.a==8){ youTubePlayer.loadVideo("Mmu0Etpc76s");}
        }
        else if(ab1.st=="physicsch6")

        {     phyvideolist6 ab=new  phyvideolist6();
            if(ab.a==1){ youTubePlayer.loadVideo("yyU3fihYl94");}
            else if(ab.a==2){ youTubePlayer.loadVideo("yNZKJMwkhSE");}
            else if(ab.a==3){ youTubePlayer.loadVideo("sS6v_gKt0so");}
            else if(ab.a==4){ youTubePlayer.loadVideo("38mRG0tOS2Q");}
            else if(ab.a==5){ youTubePlayer.loadVideo("cwF7rp0Tk8c");}
            else if(ab.a==6){ youTubePlayer.loadVideo("PqFJooDkwXA");}
            else if(ab.a==7){ youTubePlayer.loadVideo("OXx-TeNbP2M");}
            else if(ab.a==8){ youTubePlayer.loadVideo("LjXhrnoz7Qs");}
            else if(ab.a==9){ youTubePlayer.loadVideo("DyEt_xIPlaQ");}

        }

        else if(ab1.st=="physicsch7")
        {   phyvideolist7 ab=new  phyvideolist7();
            if(ab.a==1){ youTubePlayer.loadVideo("9ZirhRGtwks");}
            else if(ab.a==2){ youTubePlayer.loadVideo("2vMcN29oJqU");}
            else if(ab.a==3){ youTubePlayer.loadVideo("PZSr5_l2rxM");}
            else if(ab.a==4){ youTubePlayer.loadVideo("Kw7sXhySwoE");}
            else if(ab.a==5){ youTubePlayer.loadVideo("W5wmT8_7rF4");}
            else if(ab.a==6){ youTubePlayer.loadVideo("Vs5IMPSA84U");}
            else if(ab.a==7){ youTubePlayer.loadVideo("iw0nNVql0K8");}
            else if(ab.a==8){ youTubePlayer.loadVideo("MYJ5D_yqbOA");}
            else if(ab.a==9){ youTubePlayer.loadVideo("C7uDGW7_Itk");}
            else if(ab.a==10){ youTubePlayer.loadVideo("Z4_pEwDJXMc");}
            else if(ab.a==11){ youTubePlayer.loadVideo("7RcTY7Kv7fs");}
            else if(ab.a==12){ youTubePlayer.loadVideo("Gt4unm1sfRs");}}
        else if(ab1.st=="physicsch8")
        {    phyvideolist8 ab=new  phyvideolist8();
            if(ab.a==1){ youTubePlayer.loadVideo("CFCslzUJo3s");}
            else if(ab.a==2){ youTubePlayer.loadVideo("-J1I0KfZG6E");}
            else if(ab.a==3){ youTubePlayer.loadVideo("gCj-qzWzqC4");}
            else if(ab.a==4){ youTubePlayer.loadVideo("-YivV_HkI0U");}}
        else if(ab1.st=="physicsch9")
        {     phyvideolist9 ab=new  phyvideolist9();
            if(ab.a==1){ youTubePlayer.loadVideo("medyIcowHGw");}
            else if(ab.a==2){ youTubePlayer.loadVideo("HQif4dLeRpY");}
            else if(ab.a==3){ youTubePlayer.loadVideo("XiK0o-kP8vc");}
            else if(ab.a==4){ youTubePlayer.loadVideo("4eMb1eSWe3A");}
            else if(ab.a==5){ youTubePlayer.loadVideo("bVatYOVFors");}
            else if(ab.a==6){ youTubePlayer.loadVideo("L_HKUy3e_og");}
            else if(ab.a==7){ youTubePlayer.loadVideo("7HSyYg7iXiE");}
            else if(ab.a==8){ youTubePlayer.loadVideo("vVsCMBFQ4iE");}
            else if(ab.a==9){ youTubePlayer.loadVideo("IbULdzfzr5g");}
            else if(ab.a==10){ youTubePlayer.loadVideo("tZymRVZUhTg");}
            else if(ab.a==11){ youTubePlayer.loadVideo("Fc2KhVJYUCM");}
            else if(ab.a==12){ youTubePlayer.loadVideo("3UAiotAlux8");}
            else if(ab.a==13){ youTubePlayer.loadVideo("DMiRIs7Au-w");}
            else if(ab.a==14){ youTubePlayer.loadVideo("znLcN6HbKpQ");}
            else if(ab.a==15){ youTubePlayer.loadVideo("tw-xOPatIbk");}
            else if(ab.a==16){ youTubePlayer.loadVideo("Jo1RpWUpz2M");}
            else if(ab.a==17){ youTubePlayer.loadVideo("ZxYdZInV5bQ");}}

        else if(ab1.st=="physicsch10")
        {     phyvideolist10 ab=new  phyvideolist10();
            if(ab.a==1){ youTubePlayer.loadVideo("4289Jbdc0xs");}
            else if(ab.a==2){ youTubePlayer.loadVideo("igzSLmuPLZ8");}
            else if(ab.a==3){ youTubePlayer.loadVideo("2mNM254N4PM");}
            else if(ab.a==4){ youTubePlayer.loadVideo("_xSqVkWnGp0");}
            else if(ab.a==5){ youTubePlayer.loadVideo("DI7mrWkEoKs");}
            else if(ab.a==6){ youTubePlayer.loadVideo("cWQlSxOn3Ak");}
            else if(ab.a==7){ youTubePlayer.loadVideo("ejHH_lIe7Kg");}
            else if(ab.a==8){ youTubePlayer.loadVideo("7T00TQtebp8");}
            else if(ab.a==9){ youTubePlayer.loadVideo("xMiXUvugT4g");}
            else if(ab.a==10){ youTubePlayer.loadVideo("Ew6NFTJxnfs");}
            else if(ab.a==11){ youTubePlayer.loadVideo("GLl38E-8Ks8");}
            else if(ab.a==12){ youTubePlayer.loadVideo("Zdn1M0Zmn0g");}
            else if(ab.a==13){ youTubePlayer.loadVideo("_uuGzs1s2wA");}
            else if(ab.a==14){ youTubePlayer.loadVideo("Hy99Vv0PZLs");}
        }

        else if(ab1.st=="physicsch11")
        {      phyvideolist11 ab=new  phyvideolist11();
            if(ab.a==1){ youTubePlayer.loadVideo("aFarl-IRpjU&t");}
            else if(ab.a==2){ youTubePlayer.loadVideo("RmNmotcTj4A");}
            else if(ab.a==3){ youTubePlayer.loadVideo("iaDICpYCf0U");}
            else if(ab.a==4){ youTubePlayer.loadVideo("GChl5s5n77Y");}}
        else if(ab1.st=="physicsch12")
        {    phyvideolist12 ab=new  phyvideolist12();
            if(ab.a==1){ youTubePlayer.loadVideo("hylkX7cFu6Y");}
            else if(ab.a==2){ youTubePlayer.loadVideo("5z2JeSPVoz4");}
            else if(ab.a==3){ youTubePlayer.loadVideo("D4LG7hp0KKU");}}

        else if(ab1.st=="physicsch13")
        {
            phyvideolist13 ab=new  phyvideolist13();
            if(ab.a==1){ youTubePlayer.loadVideo("vGVgiDL5mqE");}
            else if(ab.a==2){ youTubePlayer.loadVideo("1BpG1-GrwnM");}
            else if(ab.a==3){ youTubePlayer.loadVideo("dIv_lXKVAd4");}
            else if(ab.a==4){ youTubePlayer.loadVideo("DwtEgiyGRl0");}
            else if(ab.a==5){ youTubePlayer.loadVideo("c8UGMG2nHSc");}}

        else if(ab1.st=="physicsch14")
        {
            phyvideolist14 ab=new  phyvideolist14();
            if(ab.a==1){ youTubePlayer.loadVideo("VOSvTbKId9M");}
            else if(ab.a==2){ youTubePlayer.loadVideo("dAihWs71Bxk");}
            else if(ab.a==3){ youTubePlayer.loadVideo("1GBi5I6t60c");}
            else if(ab.a==4){ youTubePlayer.loadVideo("eO6kktZGmOY");}
            else if(ab.a==5){ youTubePlayer.loadVideo("J7pZAK19jpA");}
            else if(ab.a==6){ youTubePlayer.loadVideo("s9pjVG8wldI");}
            else if(ab.a==7){ youTubePlayer.loadVideo("fjTvqgnMDkg");}
            else if(ab.a==8){ youTubePlayer.loadVideo("s9pjVG8wldI");}
            else if(ab.a==9){ youTubePlayer.loadVideo("iXjT_kvFI_M");}
            else if(ab.a==10){ youTubePlayer.loadVideo("pPuY-ZFy-k8");}
            else if(ab.a==11){ youTubePlayer.loadVideo("uWak-qJ2V9g");}
            else if(ab.a==12){ youTubePlayer.loadVideo("hGUFvA3OsKY");}
            else if(ab.a==13){ youTubePlayer.loadVideo("dwg0O6MzM8Y");}
            else if(ab.a==14){ youTubePlayer.loadVideo("9vmLcATCv_E");}
            else if(ab.a==15){ youTubePlayer.loadVideo("2c6n1soTPY4");}
            else if(ab.a==16){ youTubePlayer.loadVideo("2c6n1soTPY4");}}


        else if(ab1.st=="physicsch15")
        {   phyvideolist15 ab=new  phyvideolist15();
            if(ab.a==1){ youTubePlayer.loadVideo("9_DqY1yg0VM");}
            else if(ab.a==2){ youTubePlayer.loadVideo("-IFV8K_lF90");}
            else if(ab.a==3){ youTubePlayer.loadVideo("xlDTr8KEMJE");}
            else if(ab.a==4){ youTubePlayer.loadVideo("sKUU_birE4Q");}
            else if(ab.a==5){ youTubePlayer.loadVideo("TF7FSgXIZXw");}
            else if(ab.a==6){ youTubePlayer.loadVideo("9IAWUBVrxl0");}
            else if(ab.a==7){ youTubePlayer.loadVideo("XFvUhmKcs40");}}
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}