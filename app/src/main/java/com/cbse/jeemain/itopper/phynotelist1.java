package com.cbse.jeemain.itopper;


import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class phynotelist1 extends AppCompatActivity {
    PDFView pdf;  public static  String  note;

    private ProgressBar progress;
    private ProgressDialog progressDialog;
    DownloadManager downloadManager;
    Timer timer;
    Handler handler;
    Runnable runnable;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phynotelist1);
        pdf=(PDFView)findViewById(R.id.pdfView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        progress=(ProgressBar) findViewById(R.id.progressBar1);

        handler=new Handler();


        runnable = new Runnable() {
            @Override
            public void run() {
                progress.setVisibility(View.GONE);
                timer.cancel();
            }
        };

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        },12000, 8000);





        //  pdf.fromAsset("ph.pdf").load();

        if( note=="phynote"){ physicsnote pn=new physicsnote();

            if( pn.a==1){

               new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a37768be4b02604fa408dce.pdf");

            }
            else if( pn.a==2){



                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a378b6ee4b0212025b191bf.pdf");

            }





            else if( pn.a==3){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a336fb0e4b07163cce837e5.pdf");
            } 
            else if( pn.a==4){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a3370d7e4b07163cce837f1.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a33713ee4b072f270453a03.pdf");
            }
            else if( pn.a==6){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a3371d9e4b07163cce837f4.pdf");
            }
            else if( pn.a==7){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337240e4b072f270453a04.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aba14eee4b037820c381f5f.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a3372b3e4b07163cce837f6.pdf");
            }
            else if( pn.a==10){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337316e4b072f270453a09.pdf");
            }
            else if( pn.a==11){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a379127e4b0212025b191e4.pdf");}
            else if( pn.a==12){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a37934ae4b0212025b191fc.pdf");
            }
            else if( pn.a==13){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a379127e4b0212025b191e4.pdf");
            }
            else if( pn.a==14){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337393e4b07163cce83808.pdf");
            }
            else if( pn.a==15){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aba15bbe4b037820c381f64.pdf");
            }

        }
        else if( note=="chenote") {
            chemistrynotes pn = new chemistrynotes();
            if( pn.a==1){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337c18e4b07163cce8388f.pdf");
            }
            else if( pn.a==2){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337d6ae4b072f270453b77.pdf");
            }
            else if( pn.a==3){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337de2e4b07163cce83928.pdf");
            }
            else if( pn.a==4){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337ecde4b07163cce8392c.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337f4be4b07163cce83931.pdf");
            }
            else if( pn.a==6){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a337fdee4b072f270453b8a.pdf");
            }
            else if( pn.a==7){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a33819fe4b072f270453bb6.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a33833be4b072f270453bc6.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a338567e4b07163cce83950.pdf");
            }
            else if( pn.a==10){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a3385eee4b072f270453bd0.pdf");
            }
            else if( pn.a==11){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a338652e4b07163cce83951.pdf");
            }
            else if( pn.a==12){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a3386c7e4b07163cce83953.pdf");
            }
            else if( pn.a==13){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a338747e4b07163cce83958.pdf");
            }
            else if( pn.a==14){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a3391cbe4b072f270453c70.pdf");
            }
            else if( pn.a==15){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a33924de4b072f270453c75.pdf");
            }
            else if( pn.a==16){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a339331e4b072f270453c89.pdf");
            }
        }
        else if( note=="matnote"){mathnote pn=new mathnote();
            if( pn.a==1){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cbc9fe4b05022c32e41ea.pdf");
            }
            else if( pn.a==2){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cc760e4b0222b835a4a97.pdf");
            }
            else if( pn.a==3){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cbb72e4b0222b835a4a5c.pdf");
            }
            else if( pn.a==4){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cc822e4b05022c32e422a.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595ccf14e4b06b1a547df945.pdf");
            }
            else if( pn.a==6){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595ccf94e4b00cb2966137ad.pdf");
            }
            else if( pn.a==7){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cd07be4b06b1a547df94c.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cd4a0e4b00cb2966137cc.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cd54be4b00cb2966137d4.pdf");
            }
            else if( pn.a==10){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cd603e4b06b1a547df976.pdf");
            }
            else if( pn.a==11){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cd6d4e4b06b1a547df988.pdf");
            }
            else if( pn.a==12){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cd95fe4b00cb2966137f2.pdf");
            }
            else if( pn.a==13){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/595cdaa4e4b00cb2966137fc.pdf");
            }

        }
        else if( note=="mathbook"){ mathbook pn=new mathbook();
            if( pn.a==1){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartI/Relations%20and%20Functions%20ch%201.pdf");
            }
            else if( pn.a==2){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartI/Inverse%20Trigonometric%20Functions%20ch_2.pdf");
            }
            else if( pn.a==3){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartI/Matrices%20ch_3.pdf");
            }
            else if( pn.a==4){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartI/Determinant%20ch%204.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartI/Continuity%20and%20Differentiability%20ch%205.pdf");
            }
            else  if( pn.a==6){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartI/Ch_6.pdf");
            }

            else if( pn.a==7){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartII/Integral%20ch_7%2006.11.06.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartII/Chapter%208%20%20Application%20of%20the%20Integral%2008_11_06.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartII/Differential%20Equations%2010.11.06.pdf");
            }
            else if( pn.a==10){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartII/Vectoalgebra%2013.11.06.pdf");
            }
            else if( pn.a==11){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartII/ch11-THREE%20DIMENSIONAL%20GEOMETRY.pdf");
            }
            else if( pn.a==12){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartII/Chapter%2012%20Linear%20Programming%2016.11.06.pdf");
            }
            else if( pn.a==13){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartII/Probability%2018.11.06.pdf");
            }
            else if( pn.a==14){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartII/Answers%20Part%20-%20II%2004.11.06.pdf");
            }
            else  if( pn.a==15){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Mathematics.MathematicsPartI/Answers%20Part%20-%20I.pdf");
            }

        }
        else if( note=="phybook"){ phybook pn=new phybook();
            if( pn.a==1){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Chapter%201.pdf");
            }
            else if( pn.a==2){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Chapter%202.pdf");
            }
            else if( pn.a==3){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Chapter%203.pdf");
            }
            else if( pn.a==4){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Chapter%204.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Chapter%205.pdf");
            }
            else if( pn.a==6){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Chapter%206.pdf");
            }
            else if( pn.a==7){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Chapter%207.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Chapter%208.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartII/Chapter%209.pdf");
            }
            else if( pn.a==10){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartII/Chapter%2010.pdf");
            }
            else if( pn.a==11){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartII/ch%2011.pdf");
            }
            else if( pn.a==12){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartII/Chapter%2012.pdf");
            }
            else if( pn.a==13){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartII/Chapter%2013.pdf");
            }
            else if( pn.a==14){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartII/Chapter%2014.pdf");
            }
            else  if( pn.a==15){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartII/ch%2015.pdf");
            }
            else if( pn.a==16){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartII/Answers.pdf");
            }
            else if( pn.a==17){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Physics.PhysicsPartI/Answers%20part_1.pdf");
            }

        }
        else if( note=="chebook"){ chebook pn=new chebook();
            if( pn.a==1){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/1.pdf");
            }
            else if( pn.a==2){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/2.pdf");
            }
            else if( pn.a==3){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/3.pdf");
            }
            else if( pn.a==4){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/4.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/5.pdf");
            }
            else if( pn.a==6){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/6.pdf");
            }
            else if( pn.a==7){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/7.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/8.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/9.pdf");
            }

            else if( pn.a==10){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryII/Unit%2010.pdf");
            }
            else if( pn.a==11){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryII/Unit%2011.pdf");
            }
            else if( pn.a==12){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryII/Unit%2012.pdf");
            }
            else  if( pn.a==13){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryII/Unit%2013.pdf");
            }
            else if( pn.a==14){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryII/Unit%2014.pdf");
            }
            else  if( pn.a==15){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryII/Unit%2015.pdf");
            }
            else if( pn.a==16){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryII/Unit%2016.pdf");
            }
            else if( pn.a==17){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryII/Answers.pdf");
            }
            else if( pn.a==18){
                new RetrievePDFStream().execute("http://ncertbooks.prashanthellina.com/class_12.Chemistry.ChemistryI/Answers.pdf");
            }
        }
        else if( note=="phyexercise"){ phyexesol pn=new phyexesol();
            if( pn.a==1){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4d877e4b0f6c0a90cdc00.pdf");
            }
            else if( pn.a==2){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4da7ce4b06e37fff91e5e.pdf");
            }
            else if( pn.a==3){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4db57e4b06e37fff91e64.pdf");
            }
            else if( pn.a==4){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4dc0ce4b0ee8fadafdee8.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4dcf0e4b06e37fff91e6b.pdf");
            }
            else if( pn.a==6){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4de20e4b06e37fff91e6c.pdf");
            }
            else if( pn.a==7){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4deefe4b06e37fff91e6d.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4df86e4b06e37fff91e6e.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4e030e4b0f6c0a90cdc11.pdf");
            }
            else  if( pn.a==10){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4e15ee4b0f6c0a90cdc13.pdf");
            }
            else if( pn.a==11){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4e20be4b0ee8fadafdef6.pdf");
            }
            else if( pn.a==12){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4e2b4e4b0f6c0a90cdc1a.pdf");
            }
            else if( pn.a==13){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58dccf65e4b0cf56381faf82.pdf");
            }
            else if( pn.a==14){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4e366e4b06e37fff91e78.pdf");
            }
            else if( pn.a==15){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4e48de4b0f6c0a90cdc1c.pdf");
            } }
        else if( note=="cheexercise"){ cheexesol pn=new cheexesol();
            if( pn.a==1){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4be2ae4b0f6c0a90cdbc5.pdf");
            }
            else if( pn.a==2){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4c409e4b0ee8fadafdeac.pdf");
            }
            else if( pn.a==3){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4bf63e4b0ee8fadafdea7.pdf");
            }
            else if( pn.a==4){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4c574e4b06e37fff91e35.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4c75ae4b06e37fff91e3b.pdf");
            }
            else if( pn.a==6){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef4fabe4b0080050e501c3.pdf");
            }
            else if( pn.a==7){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef50e5e4b0080050e501c6.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef5222e4b049192fca67f2.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef5381e4b02f783b71d5f2.pdf");
            }
            else if( pn.a==10){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef581de4b049192fca681e.pdf");
            }
            else if( pn.a==11){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef5928e4b02f783b71d616.pdf");
            }
            else if( pn.a==12){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef5ff2e4b02f783b71d62e.pdf");
            }
            else if( pn.a==13){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef60c3e4b02f783b71d631.pdf");
            }
            else if( pn.a==14){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef629fe4b049192fca6857.pdf");
            }
            else if( pn.a==15){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58ef63d3e4b02f783b71d659.pdf");
            }}
        else if( note=="mathexercise"){ mathexesol pn=new mathexesol();
            if( pn.a==1){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58cfbdf6e4b07c707eb49743.pdf");
            }
            else if( pn.a==2){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58cfbf77e4b0e30989388446.pdf");
            }
            else if( pn.a==3){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58cfc053e4b0e30989388447.pdf");
            }
            else  if( pn.a==4){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58cfc187e4b0e30989388449.pdf");
            }
            else if( pn.a==5){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58cfc2b9e4b0db44ba14c92b.pdf");
            }
            else if( pn.a==6){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4eee5e4b06e37fff91e8f.pdf");
            }
            else if( pn.a==7){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4efcce4b0f6c0a90cdc44.pdf");
            }
            else if( pn.a==8){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4f0c0e4b0f6c0a90cdc47.pdf");
            }
            else if( pn.a==9){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4f155e4b0f6c0a90cdc48.pdf");
            }
            else if( pn.a==10){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4f1f4e4b0f6c0a90cdc49.pdf");
            }
            else  if( pn.a==11){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4f28de4b0f6c0a90cdc4a.pdf");
            }
            else if( pn.a==12){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4f342e4b0ee8fadafdf15.pdf");
            }
            else  if( pn.a==13){
                new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/58d4f3eee4b0f6c0a90cdc4b.pdf");
            }
        }

        else if( note=="phyexampler"){  pexampler pn=new pexampler();
            if(pn.exam=="pch1"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUm1Ga0RQNkRIdzg&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmdUZ4b3NEQzZzX3c&export=download");
                }
            }
            else if(pn.exam=="pch2"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfma2RBanZzZmZLMjA&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmcFQ1aVpxWmh3NXc&export=download");
                }
            }
            else if(pn.exam=="pch3"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmbVRCbUJpaXN4emM&export=download" );
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmVXV5SS16NnZ5VFE&export=download");
                }
            }
            else if(pn.exam=="pch4"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmT1JtcnZ4QTd4OXM&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmVVNDQkVUSWZuUFE&export=download");
                }
            }
            else if(pn.exam=="pch5"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmX3BHb0dzdXBDclk&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmb3hpZ3ZKejNsNlk&export=download");
                }
            }
            else if(pn.exam=="pch6"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUGNCcDh2Umc4ZDQ&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmNkZ6ZWJqdmZZakE&export=download");
                }
            }
            else if(pn.exam=="pch7"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmVTE5ODRheW5EZUU&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUERST3ppbjZxdGM&export=download");
                }
            }
            else if(pn.exam=="pch8"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmTWk1MEFKYjRKQ1U&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmOXlndTdNVVVqNDA&export=download");
                }
            }
            else if(pn.exam=="pch9"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmWXJSMDFKZkk0QmM&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmcmZwOFlFSm1BcHM&export=download");
                }
            }
            else if(pn.exam=="pch10"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmNjBvVFJ5NVh2SEk&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmLWkwdGJKeGlwRFk&export=download");
                }
            }
            else if(pn.exam=="pch11"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmR0YyUU5ndkdoaVU&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmekFBckxGMDBmS28&export=download");
                }
            }
            else if(pn.exam=="pch12"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmdzc4SXRsTEtGaWs&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmcGxjSnlOVm9EdGM&export=download");
                }
            }
            else if(pn.exam=="pch13"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmSWRBc3kxVldYdWM&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmXy16YldoM3RYcWM&export=download");
                }
            }
            else if(pn.exam=="pch14"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmSDZoS0VrUWhydGc&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmWVhwbjlUX0Z5ZkU&export=download");
                }
            }
            else if(pn.exam=="pch15"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/fuc?authuser=0&id=0B9KCwuDRLzfmOXQyS3NieURGaEE&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmMEpCQkNkUi1WY2c&export=download");
                }
            }




        }
        else if( note=="cheexampler"){  cexampler pn=new cexampler();
            if(pn.exam=="cch1"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmZnZBVVE3ZE5fMFE&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmZm1CRklKWWpoWEk&export=download");
                }
            }
            else if(pn.exam=="cch2"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmNy00T3BvTXMybkU&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmNkxiN2RUTGtzNW8&export=download");
                }
            }
            else if(pn.exam=="cch3"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUzhhdXFjbk1hakk&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmcjdsYmxXTllxcXc&export=download");
                }
            }
            else if(pn.exam=="cch4"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmaDVFdm1mb0dicHM&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmTmFGS05uZy1FT2c&export=download");
                }
            }
            else if(pn.exam=="cch5"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmRXpFclZmRVAwdzQ&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmOVBMUVZHYm1UVlk&export=download");
                }
            }
            else if(pn.exam=="cch6"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmREVVLU9XODV4YUk&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmcTFqcmZ6bVp2emc&export=download");
                }
            }
            else if(pn.exam=="cch7"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmbVFEbmMyZjE1bEU&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmcTJoR3RsRWFTc1E&export=download");
                }
            }
            else if(pn.exam=="cch8"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmbk1OdUpXV2g2eUk&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmaHNZa1FZcVREX0U&export=download");
                }
            }
            else if(pn.exam=="cch9"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmMUFveklYbFZ3M3c&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmMFMzcmhVTERPbDg&export=download");
                }
            }
            else if(pn.exam=="cch10"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmYzk1eFFUNmp6bTA&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmV0VDX2dKcXRUdm8&export=download");
                }
            }
            else if(pn.exam=="cch11"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmLUU3b1c4aVRUNjQ&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmSWRjaHh3YWRYNnM&export=download");
                }
            }
            else if(pn.exam=="cch12"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmdnZ3UU1SMFhZS28&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmLURpWmI3QklDZEk&export=download");
                }
            }
            else if(pn.exam=="cch13"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmbVlRNl9ZMGFtelE&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmcnNsVHFsSUJtVzg&export=download");
                }
            }
            else if(pn.exam=="cch14"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmR2E2b0x4M3VEams&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmMnB4WWxfM2d5cXM&export=download");
                }
            }
            else if(pn.exam=="cch15"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmdnVKd0VQU0hVNjQ&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmMndQZmxIa2ktdEE&export=download");
                }
            }
            else if(pn.exam=="cch16"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmSXltSHFtX1Jpekk&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmNXdqRkVQWXhEa0E&export=download");
                }
            }




        }

        else if( note=="mathexampler"){  mexampler pn=new mexampler();
            if(pn.exam=="mch1"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmbzhMUDFtX0VSWTQ&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch2"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmMjljd056cjFjMzA&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch3"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmRm9UZFkxM3ljOWs&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch4"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmbnRFVE9vNngtTVk&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch5"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmcFFZNllxakFYLVE&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch6"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmZ2lucGZ4Q3ZXdkE&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch7"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmN0xTNHI2WjMyOUU&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch8"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmdWFqeGYyMThIbVk&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch9"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmZU4weUNja1RYdzQ&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch10"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmOGNJR0NQUmtOQWc&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch11"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/0uc?authuser=0&id=B9KCwuDRLzfmUF9hMjNMamxyeHc&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch12"){
                if( pn.a==1){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmX3JaLW5PR09IXzA&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }
            else if(pn.exam=="mch13"){
                if( pn.a==1){
                    new RetrievePDFStream().execute(" https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmU09ENGlmOEh1SGs&export=download");
                }
                else if( pn.a==2){
                    new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B9KCwuDRLzfmUksxQmZmX2otcXc&export=download");
                }
            }





        }






        else if( note=="phyimportantque"){  phyimpque pn=new phyimpque();
            if(pn.a==1){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch01_electrostatics.pdf");}
            else if(pn.a==2){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch02_current_electricity.pdf");}
            else if(pn.a==3){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch03_magnetic_effects_of_current_and_magnetims.pdf");}
            else if(pn.a==4){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch04_electromagnetic_induction_and_alternating_current.pdf");}
            else if(pn.a==5){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch05_electromagnetic_waves.pdf");}
            else if(pn.a==6){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch06_optics.pdf");}
            else if(pn.a==7){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch07_dual_nature_of_matter_and_radiation.pdf");}
            else if(pn.a==8){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch08_atoms_and_nuclei.pdf");}
            else if(pn.a==9){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch09_electronic_devices.pdf");}
            else if(pn.a==10){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_physics_impq_ch10_communication_systems.pdf");}

        }
        else if( note=="cheimportantque"){cheimpque pn=new cheimpque();
            if(pn.a==1){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH01_the_solid_state_01.pdf");}
            else if(pn.a==2){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH02_solutions_01.pdf");}
            else if(pn.a==3){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH03_electro_chemistry_02.pdf");}
            else if(pn.a==4){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH04_chemical_kinetics_02.pdf");}
            else if(pn.a==5){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH05_surface_chemistry_01-1.pdf");}
            else if(pn.a==6){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH06_general_principles_and_processes_of_isolation_of_elements_01.pdf");}
            else if(pn.a==7){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH07_the_p_block_elements_01.pdf");}
            else if(pn.a==8){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH08_d_and_f_block_elements_01.pdf");}
            else if(pn.a==9){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH09_coordination_compounds_01.pdf");}
            else if(pn.a==10){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH10_haloalkanes_and_haloarenes_01.pdf");}
            else if(pn.a==11){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH11_alcohols_phenols_and_ethers_01.pdf");}
            else if(pn.a==12){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH12_aldehydes-ketones-and-carboxylic-acids.pdf");}
            else if(pn.a==13){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH13_amines_01.pdf");}
            else if(pn.a==14){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH14_biomolecules_01.pdf");}
            else if(pn.a==15){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_chemistry_impq_CH16_chemistry_in_every_day_life.pdf");}

        }
        else if( note=="matimportantque"){ mathimpque pn=new mathimpque();

            if(pn.a==1){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH01_relations_and_functions_01.pdf");}
            else if(pn.a==2){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH2_inverse_trigonometric_functions_01.pdf");}
            else if(pn.a==3){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH3-4_matrices_and_determinants_01.pdf");}
            else if(pn.a==4){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH5_continuity_and_differentiation_01.pdf");}
            // else if(pn.a==4){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH3-4_matrices_and_determinants_01.pdf");}
            else if(pn.a==5){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH6_applications_of_derivatives_01.pdf");}
            else if(pn.a==6){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH7_integrals_01.pdf");}
            else if(pn.a==7){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH8_applications_of_integrals_01.pdf");}
            else if(pn.a==8){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH9_differential_equations_01.pdf");}
            else if(pn.a==9){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH10_vectors_01.pdf");}
            else if(pn.a==11){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH12_linear_programming_01.pdf");}
            else if(pn.a==12){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH13probability_01.pdf");}
            else if(pn.a==10){ new RetrievePDFStream().execute("http://www.4ono.com/wp-content/uploads/2015/12/12_mathematics_impq_CH11_three_dimensional_geometry_01.pdf");}

        }
        else if( note=="physolvesample"){ physolvesample pn=new physolvesample();
            if(pn.a==1){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5b02ab94e4b0ec65a709e0f2.pdf");}
            else  if(pn.a==2){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a730d14e4b070d739fae298.pdf");}
            else if(pn.a==3){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0fff43e4b0229952309fb7.pdf");}
            else if(pn.a==4){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0ed275e4b0229952308ff5.pdf");}
            else if(pn.a==5){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a17c39de4b0229952313b8c.pdf");}
            else if(pn.a==6){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0fe063e4b0229952309db0.pdf");}
            else if(pn.a==7){ new RetrievePDFStream().execute("http://www.careerpoint.ac.in/download/2018/cbse/CBSE-Board-XII-Physics-Paper-Sol.pdf");}
            else if(pn.a==8){ new RetrievePDFStream().execute("http://www.careerpoint.ac.in/download/2017/cbse/CBSE-Board-XII-Physics-Paper-Sol.pdf");}

        }
        else if( note=="phyunsolvesample"){ phyunsolvesample pn=new phyunsolvesample();
            if(pn.a==1){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B2GKjeMqs8QQS3pyTG5YczI2VUU&export=download");}
            else if(pn.a==2){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B2GKjeMqs8QQeXpJZmhoRlNPekU&export=download");}
            else if(pn.a==3){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQUjhqQlZ2Zi01WDQ&export=download");}
            else if(pn.a==4){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQN3RqUGJXazBLVnM&export=download");}
            else if(pn.a==5){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQREdGdFF0RFQ4Ujg&export=download");}
            else if(pn.a==6){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQdElweXZYM0x6VlU&export=download");}
            else if(pn.a==7){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQSEFFMjRDRUpLcDQ&export=download");}
            else if(pn.a==8){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQS1NWcXd5Z1hqa2s&export=download");}
            else if(pn.a==9){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0fff43e4b0229952309fb7.pdf");}
            else if(pn.a==10){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a1000d6e4b006543b788ed7.pdf");}}
        else if( note=="chesolvesample"){ chesolvesample pn=new chesolvesample();

            if(pn.a==1){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5b02ad3ce4b03332aecbf96d.pdf");}
            else if(pn.a==2){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0d8121e4b0eb3a7f9419d7.pdf");}
            else if(pn.a==3){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a100469e4b0229952309fea.pdf");}
            else if(pn.a==4){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0ed310e4b006543b786324.pdf");}
            else if(pn.a==5){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a17c478e4b08c0bab2dd7d2.pdf");}
            else if(pn.a==6){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0fe0f2e4b08c0bab2d3f9f.pdf");}
            else if(pn.a==7){ new RetrievePDFStream().execute("http://www.careerpoint.ac.in/download/2018/cbse/CBSE-Board-XII-Chemistry-Paper-Sol.pdf");}
            else if(pn.a==8){ new RetrievePDFStream().execute("http://www.careerpoint.ac.in/download/2017/cbse/CBSE-Board-XII-Chemistry-Paper-Sol.pdf");}
            else if(pn.a==9){ new RetrievePDFStream().execute("");}
            else if(pn.a==10){ new RetrievePDFStream().execute("");}}
        else if( note=="cheunsolvesample"){ cunsolvesamplepaper pn=new cunsolvesamplepaper();

            if(pn.a==1){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B2GKjeMqs8QQcnpxWk1Hd19FT28&export=download");}
            else if(pn.a==2){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B2GKjeMqs8QQMjJaVnZ2Z2lOTm8&export=download");}
            if(pn.a==3){new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B2GKjeMqs8QQalVfRzNtNFpCblU/&export=download");}
            else if(pn.a==4){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQc1F3SEg3MmNtVlU&export=download");}
            else if(pn.a==5){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQNVhaZjFHZmM2SGs&export=download");}
            else if(pn.a==6){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQUHJNdEdYdnRWWmM&export=download");}
            else if(pn.a==7){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQNmdWY3kyNU53cW8&export=download");}
            else if(pn.a==8){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQdU42SGM2UU9hUjQ&export=download");}
            else if(pn.a==9){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQX3hGaVMxTnlicU0&export=download");}
            else if(pn.a==10){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a10035de4b0229952309fd7.pdf");}}
        else if( note=="mathsolvesample"){ mathsolvesample pn=new mathsolvesample();
            if(pn.a==1){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5b02a681e4b01b22ecf8bf25.pdf");}
            else if(pn.a==2){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0d84f4e4b0d5f2a48861d9.pdf");}
            else if(pn.a==3){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0fe97ce4b08c0bab2d406f.pdf");}
            else if(pn.a==4){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0ffbade4b08c0bab2d414f.pdf");}
            else if(pn.a==5){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0ffcf9e4b08c0bab2d416d.pdf");}
            else if(pn.a==6){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0ffd77e4b006543b788eae.pdf");}
            else if(pn.a==7){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0ed1a7e4b08c0bab2d3047.pdf");}
            else if(pn.a==8){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a17c2dce4b08c0bab2dd7bf.pdf");}
            else if(pn.a==9){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5a0fdf83e4b006543b788d07.pdf");}
            else if(pn.a==10){ new RetrievePDFStream().execute("http://www.careerpoint.ac.in/download/2018/cbse/CBSE-Board-XII-Maths-Paper-Sol.pdf");}
        }
        else if( note=="mathunsolvesample"){ mathunsolvesample pn=new mathunsolvesample();

            if(pn.a==1){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B2GKjeMqs8QQVU9PZi1zYlBYSWs&export=download");}
            else if(pn.a==2){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B2GKjeMqs8QQQ2hCTTkzZE1OMTg&export=download");}
            else if(pn.a==3){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B2GKjeMqs8QQMnBaQUEySnRnNkU&export=download");}
            else if(pn.a==4){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQeGY0djB0LTZxS1E&export=download");}
            else if(pn.a==5){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQRlBnNDBkSDFaN28&export=download");}
            else if(pn.a==6){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQNXh6RWhiUmZjV3M&export=download");}
            else if(pn.a==7){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQbFFHX1RvSU5CX0E&export=download");}
            else if(pn.a==8){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQb2pqX1RRZU84OGc&export=download");}
            else if(pn.a==9){ new RetrievePDFStream().execute("https://drive.google.com/uc?authuser=0&id=0B14M4ID1Z9cQR0xuNzEydS13NE0&export=download");}
        }
        else if( note=="kvpy"){ kvpy pn=new kvpy();
//sylllabus
            if(pn.a==1){ new RetrievePDFStream().execute("http://www.recruitmentinboxx.com/wp-content/uploads/2015/07/KVPY-Syllabus.pdf");}


            //2017 sb sx5
            else if(pn.a==2){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/3a9d4559/KVPY-2017-Stream-SB-SX-5-Nov-Paper-Solutions.pdf");}
            //2017 sb sx19
            else if(pn.a==3){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/7ac3d51c/KVPY-2017-Stream-SB-SX-19-Nov-Paper-Solutions.pdf");}

            //sample pape sx sb
            else if(pn.a==4){ new RetrievePDFStream().execute("http://kvpy.iisc.ernet.in/main/resources/2016_qp_sb_sx.pdf");}
            //sample pape sxsb answer
            else if(pn.a==5){ new RetrievePDFStream().execute("http://kvpy.iisc.ernet.in/main/resources/KVPY_Answer_Keys_2016_SB-SX.pdf");}

         //2016 sb
            else if(pn.a==6){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/4fbebf91/KVPY-2016-Stream-SB-Paper.pdf");}
            //2016 sx
            else if(pn.a==7){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/b0e113e4/KVPY-2016-Stream-SX-Paper.pdf");}
            //2015 sb sx
            else if(pn.a==8){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/d8172d13/KVPY-2015-Stream-SB-SX-Paper.pdf");}
            //2014 sb sx
            else if(pn.a==9){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/e1a273c8/KVPY-2014-Stream-SB-SX-Solved-Paper.pdf");}
            //2013 sb sx
            else if(pn.a==10){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/36eb7016/KVPY-2013-Stream-SB-SX-Solved-Paper.pdf");}
            //2012 sb sx
            else if(pn.a==11){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/6d6a2680/KVPY-2012-Stream-SB-SX-Solved-Paper.pdf");}
            //2011 sb sx
            else if(pn.a==12){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/82396a30/KVPY-2011-Stream-SB-SX-Solved-Paper.pdf");}

        }
        else if( note=="nstse"){ nstse pn=new nstse();

            if(pn.a==3){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/b96e8fcf/NSTSE-Class-12-PCM-Solved-Paper-2011.pdf");}
            else if(pn.a==4){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/80f0861c/NSTSE-Class-12-PCM-Solved-Paper-2010.pdf");}
            else if(pn.a==5){ new RetrievePDFStream().execute("https://www.examrace.com/d/pdf/288c2c83/NSTSE-Class-12-PCM-Paper-2009.pdf");}
            else if(pn.a==1){ new RetrievePDFStream().execute("http://www.unifiedcouncil.com/docs/SamplesPapers_NSTSE/QuestionPapers/NSTSE%2012PCM.pdf");}
            else if(pn.a==2){ new RetrievePDFStream().execute("http://www.unifiedcouncil.com/docs/SamplesPapers_NSTSE/Solutions/Solutions%2012PCM.pdf");}

        }
        else if( note=="jeemain"){ jeemain pn=new jeemain();
//2018
            if(pn.a==1){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ad6ebdfe4b095c91e26b7a4.pdf");}
            else if(pn.a==2){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ad6eda8e4b095c91e26b7cf.pdf");}
            else if(pn.a==3){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ad6ee66e4b095c91e26b7d0.pdf");}
            else if(pn.a==4){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5acb4c9ce4b0a301a079529d.pdf");}
            //2017
            else if(pn.a==5){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa7ba71e4b0cab3c986f213.pdf");}
            else if(pn.a==6){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa7bc27e4b046ed6623a817.pdf");}
            else if(pn.a==7){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa7be61e4b046ed6623a81d.pdf");}
            else if(pn.a==8){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa7bf42e4b0cab3c986f239.pdf");}

            //2016
            else if(pn.a==9){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa8df16e4b05c43726dc8d7.pdf");}
            else if(pn.a==10){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa8e589e4b0069c46fe74f9.pdf");}
            else if(pn.a==11){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa8e9eee4b07913040057a0.pdf");}
            else if(pn.a==12){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa8ea84e4b05c43726dc92c.pdf");}

            //2015
            else if(pn.a==13){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa8ee6ee4b05c43726dc97a.pdf");}
            else if(pn.a==14){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa8efc0e4b0791304005828.pdf");}
            else if(pn.a==15){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa8f9f4e4b0069c46fe7636.pdf");}
            else if(pn.a==16){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa8fb11e4b07913040058db.pdf");}

            //2014
            else if(pn.a==17){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa90822e4b079130400593f.pdf");}
            else if(pn.a==18){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa90963e4b0791304005948.pdf");}
            else if(pn.a==19){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa90a88e4b0791304005954.pdf");}
            else if(pn.a==20){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa90b35e4b0791304005955.pdf");}

        }
        else if( note=="jeeadvance"){ jeeadvance pn=new jeeadvance();
//2017 1
            if(pn.a==1){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab22d21e4b0f671d177783b.pdf");}
            else if(pn.a==2){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab2320ce4b00e879249cbb2.pdf");}
            else if(pn.a==3){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab236bbe4b00e879249cc08.pdf");}
            //2017 2
            else if(pn.a==4){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab23a02e4b0f671d1777927.pdf");}
            else if(pn.a==5){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab23b35e4b00e879249cc82.pdf");}
            else if(pn.a==6){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab23c04e4b00e879249cc9f.pdf");}
//2016 set1
            else if(pn.a==7){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab247bae4b0eb573a99d98d.pdf");}
            else if(pn.a==8){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab24846e4b0f671d17779c6.pdf");}
            else if(pn.a==9){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab24916e4b0f671d17779c7.pdf");}
            //2016 set2
            else if(pn.a==10){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab24eb2e4b00e879249cd31.pdf");}
            else if(pn.a==11){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab24f80e4b0eb573a99d9d7.pdf");}
            else if(pn.a==12){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab25004e4b00e879249cd3e.pdf");}
            //2015 set1
            else if(pn.a==13){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab33d38e4b0f671d1777faa.pdf");}
            else if(pn.a==14){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5aa22c1ce4b0604c8b1a54d4.pdf");}
            else if(pn.a==15){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab34752e4b0eb573a99df78.pdf");}
            //2015 set2
            else if(pn.a==16){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab34906e4b0eb573a99df7d.pdf");}
            else if(pn.a==17){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab34b53e4b0f671d1777ff9.pdf");}
            else if(pn.a==18){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab34bcce4b0eb573a99df81.pdf");}

            //2014 set1
            else if(pn.a==19){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab3546be4b0f671d177801d.pdf");}
            else if(pn.a==20){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab354f2e4b00e87924a1489.pdf");}
            else if(pn.a==21){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab3558fe4b0eb573a99dfa7.pdf");}

            //2014 set2
            else if(pn.a==22){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab363d6e4b0f671d1778042.pdf");}
            else if(pn.a==23){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab36442e4b00e87924a14e0.pdf");}
            else if(pn.a==24){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab36f4fe4b0eb573a99e02d.pdf");}

            //2013 set1
            else if(pn.a==25){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab3a063e4b0c0c8daecdd6f.pdf");}
            else if(pn.a==26){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab3a0c6e4b0c0c8daecdd70.pdf");}
            else if(pn.a==27){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab3a145e4b037820c379aaa.pdf");}

            //2013 set2
            else if(pn.a==28){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab3a763e4b010e43b34d6a9.pdf");}
            else if(pn.a==29){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab3a85ee4b0c0c8daecddca.pdf");}
            else if(pn.a==30){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab3a8cae4b037820c379b0e.pdf");}



            //2012 set1
            else if(pn.a==31){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab8e217e4b037820c381431.pdf");}
            else if(pn.a==32){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab8e2b6e4b037820c381437.pdf");}
            else if(pn.a==33){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab8e323e4b0c0c8daed4a2f.pdf");}
            //2012 set2
            else if(pn.a==34){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab8e421e4b010e43b358147.pdf");}
            else if(pn.a==35){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab8e4a0e4b037820c381445.pdf");}
            else if(pn.a==36){ new RetrievePDFStream().execute("https://seo-manager.s3.amazonaws.com/prod/content-files-downloadable/5ab8e50ce4b010e43b35814e.pdf");}
        }
    }
    class RetrievePDFStream extends AsyncTask<String,Void,InputStream>{


        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream=null;
            try {
                URL url=new URL(strings[0]);
                HttpURLConnection urlconnection=(HttpURLConnection)url.openConnection();
                if (urlconnection.getResponseCode()==200){
                    inputStream=new BufferedInputStream(urlconnection.getInputStream());
                }
            }
            catch(IOException e){
                return null;
            }
            return  inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdf.fromStream(inputStream).load();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.home) {
            Intent in=new Intent(phynotelist1.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(phynotelist1.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(phynotelist1.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(phynotelist1.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }


}
