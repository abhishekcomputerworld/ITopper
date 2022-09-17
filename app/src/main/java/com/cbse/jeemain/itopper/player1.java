package com.cbse.jeemain.itopper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class player1 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
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
        if(ab1.st=="chemistrych1"){
            chevideolist1 ab=new   chevideolist1();
            if(ab.a==1){ youTubePlayer.loadVideo("zBdnOCndEvQ");}
            else if(ab.a==2){ youTubePlayer.loadVideo("=QWcQVeri__U");}
            else if(ab.a==3){ youTubePlayer.loadVideo("2WmsyyBTHFk");}
            else if(ab.a==4){ youTubePlayer.loadVideo("aymUmNWi9vo");}
            else if(ab.a==5){ youTubePlayer.loadVideo("sNb6eGCmZxU");}
            else if(ab.a==6){ youTubePlayer.loadVideo("5iZ_PLIeYV8");}
            else if(ab.a==7){ youTubePlayer.loadVideo("oysgHKWG78s");}
        }

        else if(ab1.st=="chemistrych2")
        {
            chevideolist2 ab=new   chevideolist2();
            if(ab.a==1){ youTubePlayer.loadVideo("7T9sgCw3okE");}
            else if(ab.a==2){ youTubePlayer.loadVideo("r79wuSzRLMQ");}
            else if(ab.a==3){ youTubePlayer.loadVideo("oad2PMPpnCE");}
            else if(ab.a==4){ youTubePlayer.loadVideo("h_Q0jl2PNus");}
            else if(ab.a==5){ youTubePlayer.loadVideo("ubcUA1ymjh0");}
            else if(ab.a==6){ youTubePlayer.loadVideo("MBg78FXnkUw");}

        }
        else if(ab1.st=="chemistrych3")
        {
            chevideolist3 ab=new   chevideolist3();
            if(ab.a==1){ youTubePlayer.loadVideo("vqDjSmAZJrs");}
            else if(ab.a==2){ youTubePlayer.loadVideo("JrQIUNVGUOk");}
            else if(ab.a==3){ youTubePlayer.loadVideo("MtG5P88ooA8");}
            else if(ab.a==4){ youTubePlayer.loadVideo("F7zDJjNa-5w");}
            else if(ab.a==5){ youTubePlayer.loadVideo("1Ga2AXqpxdo");}
            else if(ab.a==6){ youTubePlayer.loadVideo("tWW9-9NLSyM");}
            else if(ab.a==7){ youTubePlayer.loadVideo("NNSrW0VLhJA");}
            else if(ab.a==8){ youTubePlayer.loadVideo("-pz2HPcGkOk");}
            // else if(ab.a==9){ youTubePlayer.loadVideo("bwMfN9nDK7U");}

        }

        else if(ab1.st=="chemistrych4")
        {   chevideolist4 ab=new   chevideolist4();
            if(ab.a==1){ youTubePlayer.loadVideo("sysyxdLOx1g");}
            else if(ab.a==2){ youTubePlayer.loadVideo("jX0yA_-YQj8");}
            else if(ab.a==3){ youTubePlayer.loadVideo("Ku6joFOxhDU");}
            else if(ab.a==4){ youTubePlayer.loadVideo("ddT6e_-MhO0");}
            else if(ab.a==5){ youTubePlayer.loadVideo("JF2OspQalrQ");}
        }

        else if(ab1.st=="chemistrych5")
        {    chevideolist5 ab=new   chevideolist5();
            if(ab.a==1){ youTubePlayer.loadVideo("pAlTc50BSu4");}
            else if(ab.a==2){ youTubePlayer.loadVideo("JurtLLgzhNw");}
            else if(ab.a==3){ youTubePlayer.loadVideo("78K9sYEfgrg");}
            else if(ab.a==4){ youTubePlayer.loadVideo("VaMIwEWuQK");}
            else if(ab.a==5){ youTubePlayer.loadVideo("DjyRZtmGRdo");}
            else if(ab.a==6){ youTubePlayer.loadVideo("ztpOxzBiRKo");}
            else if(ab.a==7){ youTubePlayer.loadVideo("YC8c0RnX1qQ");}

        }
        else if(ab1.st=="chemistrych6")

        {     chevideolist6 ab=new   chevideolist6();
            if(ab.a==1){ youTubePlayer.loadVideo("d5pXyVaXMDc");}
            else if(ab.a==2){ youTubePlayer.loadVideo("ATwSNHv3Xrc");}
            else if(ab.a==3){ youTubePlayer.loadVideo("FPTxAc2ZKHo");}
            else if(ab.a==4){ youTubePlayer.loadVideo("N-GmIRcpWJo");}
            else if(ab.a==5){ youTubePlayer.loadVideo("V-J9yqOf1Ug");}
            else if(ab.a==6){ youTubePlayer.loadVideo("qP6N04kk-cg");}
            else if(ab.a==7){ youTubePlayer.loadVideo("mhPrC72II7s");}

        }

        else if(ab1.st=="chemistrych7")
        {   chevideolist7 ab=new   chevideolist7();
            if(ab.a==1){ youTubePlayer.loadVideo("HiHM-T9-y9Y");}
            else if(ab.a==2){ youTubePlayer.loadVideo("QqOo4f260_o");}
            else if(ab.a==3){ youTubePlayer.loadVideo("uhUjwukTKjM");}
            else if(ab.a==4){ youTubePlayer.loadVideo("PPCeGNEEdVY");}
            else if(ab.a==5){ youTubePlayer.loadVideo("gq5KLv1QGbM");}
            else if(ab.a==6){ youTubePlayer.loadVideo("8mveiLHryMs");}
            else if(ab.a==7){ youTubePlayer.loadVideo("AyiZHoQeZ_4");}
            else if(ab.a==8){ youTubePlayer.loadVideo("Y-QPE-lJ3DQ");}
            else if(ab.a==9){ youTubePlayer.loadVideo("HK79zTpXbfI");}
            else if(ab.a==10){ youTubePlayer.loadVideo("xTd-6QUynwU");}
            else if(ab.a==11){ youTubePlayer.loadVideo("dXfzCE2GKss");}
            else if(ab.a==12){ youTubePlayer.loadVideo("wvfpkpToNR0");}
            else if(ab.a==13){ youTubePlayer.loadVideo("b0ewMx3kB8k");}}
        else if(ab1.st=="chemistrych8")
        {    chevideolist8 ab=new   chevideolist8();
            if(ab.a==1){ youTubePlayer.loadVideo("xwRfn4abwz0");}
            else if(ab.a==2){ youTubePlayer.loadVideo("EGBBH9huA_Y");}
            else if(ab.a==3){ youTubePlayer.loadVideo("UfE1LOLjmx4");}
            else if(ab.a==4){ youTubePlayer.loadVideo("q2NAZh2ujFA");}
            else if(ab.a==5){ youTubePlayer.loadVideo("p3gwEGeupyA");}
            else if(ab.a==6){ youTubePlayer.loadVideo("RRrDBZ23laQ");}
        }
        else if(ab1.st=="chemistrych9")
        {      chevideolist9 ab=new   chevideolist9();
            if(ab.a==1){ youTubePlayer.loadVideo("eZW4a6qZM5Y");}
            else if(ab.a==2){ youTubePlayer.loadVideo("78J_IlpRJ-c");}
            else if(ab.a==3){ youTubePlayer.loadVideo("SR4_5uRQJc4");}
            else if(ab.a==4){ youTubePlayer.loadVideo("lAxsDclO2NM");}
            else if(ab.a==5){ youTubePlayer.loadVideo("7V3i1b6_hoU");}
            else if(ab.a==6){ youTubePlayer.loadVideo("srJNbLx6g1c");}
            else if(ab.a==7){ youTubePlayer.loadVideo("gn94Nq2Sq1Y");}

        }

        else if(ab1.st=="chemistrych10")
        {     chevideolist10 ab=new   chevideolist10();
            if(ab.a==1){ youTubePlayer.loadVideo("2ibRiRNjsoQ");}
            else if(ab.a==2){ youTubePlayer.loadVideo("vdzFZDoT460");}
            else if(ab.a==3){ youTubePlayer.loadVideo("Ta6LH-tijvc");}
            else if(ab.a==4){ youTubePlayer.loadVideo("7tpEuwubYYo");}
            else if(ab.a==5){ youTubePlayer.loadVideo("vIh_VVqxXXI");}
            else if(ab.a==6){ youTubePlayer.loadVideo("rGN5pI88L1I");}
        }

        else if(ab1.st=="chemistrych11")
        {      chevideolist11 ab=new   chevideolist11();
            if(ab.a==1){ youTubePlayer.loadVideo("rrJlk1v5iAo");}
            else if(ab.a==2){ youTubePlayer.loadVideo("dxZtHRL_otk");}
            else if(ab.a==3){ youTubePlayer.loadVideo("3Dq0x5QYb38");}
            else if(ab.a==4){ youTubePlayer.loadVideo("lwBWjuoX4AQ");}
            else if(ab.a==5){ youTubePlayer.loadVideo("2Y9WIGSsEk4");}
            else if(ab.a==6){ youTubePlayer.loadVideo("qjJFTd-szRg");}
            else if(ab.a==7){ youTubePlayer.loadVideo("Gt9CDQjvRak");}}
        else if(ab1.st=="chemistrych12")
        {    chevideolist12 ab=new   chevideolist12();
            if(ab.a==1){ youTubePlayer.loadVideo("sX7NNJX3ikk");}
            else if(ab.a==2){ youTubePlayer.loadVideo("w2Zk--7iEEo");}
            else if(ab.a==3){ youTubePlayer.loadVideo("A1pf2a4Ns4I");}
            else if(ab.a==4){ youTubePlayer.loadVideo("3USRtwx52aQ");}
            else if(ab.a==5){ youTubePlayer.loadVideo("SqWDQEHGDhw");}
            else if(ab.a==6){ youTubePlayer.loadVideo("Mw980emHogY");}
            else if(ab.a==7){ youTubePlayer.loadVideo("hvMyi14MkQY");}
            else if(ab.a==8){ youTubePlayer.loadVideo("H8ZzRGHjz0g");}
            else if(ab.a==9){ youTubePlayer.loadVideo("UqBqMk2dvYY");}
            }

        else if(ab1.st=="chemistrych13")
        {
            chevideolist13 ab=new   chevideolist13();
            if(ab.a==1){ youTubePlayer.loadVideo("huFs-9nfteo");}
            else if(ab.a==2){ youTubePlayer.loadVideo("jQRp3QF4Z08");}
            else if(ab.a==3){ youTubePlayer.loadVideo("hZolA70lFaI");}
            else if(ab.a==4){ youTubePlayer.loadVideo("vgQbVGykw0E");}
            else if(ab.a==5){ youTubePlayer.loadVideo("lBHjuzUSx1U");}
            else if(ab.a==6){ youTubePlayer.loadVideo("WUy8GU8jwjE");}}

        else if(ab1.st=="chemistrych4")
        {
            chevideolist14 ab=new   chevideolist14();
            if(ab.a==1){ youTubePlayer.loadVideo("Y1BnCHJAB98");}
            else if(ab.a==2){ youTubePlayer.loadVideo("veDMvWbO_H4");}
            else if(ab.a==3){ youTubePlayer.loadVideo("WmhvYuqz728");}
            else if(ab.a==4){ youTubePlayer.loadVideo("F4CkEBFZEXU");}
            else if(ab.a==5){ youTubePlayer.loadVideo("rXYtBklWfGM");}
        }


        else if(ab1.st=="chemistrych15")
        {   chevideolist15 ab=new   chevideolist15();
            if(ab.a==1){ youTubePlayer.loadVideo("fP0Lqh2qjzc");}
            else if(ab.a==2){ youTubePlayer.loadVideo("9lE_Rv994WE");}
            else if(ab.a==3){ youTubePlayer.loadVideo("5-UnT_TClwo");}

        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}