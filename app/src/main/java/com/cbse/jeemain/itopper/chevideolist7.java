package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class chevideolist7 extends AppCompatActivity {

    public static int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chevideolist7);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Youtubeconfig ab1=new Youtubeconfig();
        ab1.st="chemistrych7";
        CardView btn1 = (CardView) findViewById(R.id.chch7le1);
        CardView btn2 = (CardView) findViewById(R.id.chch7le2);
        CardView btn3 = (CardView) findViewById(R.id.chch7le3);
        CardView btn4 = (CardView) findViewById(R.id.chch7le4);
        CardView btn5 = (CardView) findViewById(R.id.chch7le5);
        CardView btn6 = (CardView) findViewById(R.id.chch7le6);
        CardView btn7 = (CardView) findViewById(R.id.chch7le7);
        CardView btn8 = (CardView) findViewById(R.id.chch7le8);
        CardView btn9 = (CardView) findViewById(R.id.chch7le9);
        CardView btn10 = (CardView) findViewById(R.id.chch7le10);
        CardView btn11= (CardView) findViewById(R.id.chch7le11);
        CardView btn12= (CardView) findViewById(R.id.chch7le12);
        CardView btn13= (CardView) findViewById(R.id.chch7le13);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=1;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=2;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=3;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=4;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=5;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=6;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=7;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=8;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=9;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=10;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=11;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=12;
                Intent in=new Intent(chevideolist7.this,player1.class);
                startActivity(in);

            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=13;
                Intent in=new Intent(chevideolist7.this,player1.class);
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
            Intent in=new Intent(chevideolist7.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(chevideolist7.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(chevideolist7.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(chevideolist7.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
