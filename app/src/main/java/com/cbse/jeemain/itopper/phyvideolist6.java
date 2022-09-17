package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class phyvideolist6 extends AppCompatActivity {

    public static int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phyvideolist6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Youtubeconfig ab1=new Youtubeconfig();
        ab1.st="physicsch6";
        CardView btn1 = (CardView) findViewById(R.id.phch6le1);
        CardView btn2 = (CardView) findViewById(R.id.phch6le2);
        CardView btn3 = (CardView) findViewById(R.id.phch6le3);
        CardView btn4 = (CardView) findViewById(R.id.phch6le4);
        CardView btn5 = (CardView) findViewById(R.id.phch6le5);
        CardView btn6 = (CardView) findViewById(R.id.phch6le6);
        CardView btn7 = (CardView) findViewById(R.id.phch6le7);
        CardView btn8 = (CardView) findViewById(R.id.phch6le8);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=1;
                Intent in=new Intent(phyvideolist6.this,player.class);
                startActivity(in);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=2;
                Intent in=new Intent(phyvideolist6.this,player.class);
                startActivity(in);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=3;
                Intent in=new Intent(phyvideolist6.this,player.class);
                startActivity(in);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=4;
                Intent in=new Intent(phyvideolist6.this,player.class);
                startActivity(in);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=5;
                Intent in=new Intent(phyvideolist6.this,player.class);
                startActivity(in);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=6;
                Intent in=new Intent(phyvideolist6.this,player.class);
                startActivity(in);

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=7;
                Intent in=new Intent(phyvideolist6.this,player.class);
                startActivity(in);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=8;
                Intent in=new Intent(phyvideolist6.this,player.class);
                startActivity(in);

            }
        });



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
            Intent in=new Intent(phyvideolist6.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(phyvideolist6.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(phyvideolist6.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(phyvideolist6.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}

