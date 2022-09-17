package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class mathunsolvesample extends AppCompatActivity {

    public static int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathunsolvesample);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        phynotelist1 no=new phynotelist1();
        no.note="mathunsolvesample";


        CardView b1=(CardView)findViewById(R.id.maunsn1);
        CardView   b2=(CardView)findViewById(R.id.maunsn2);
        CardView  b3=(CardView)findViewById(R.id.maunsn3);
        CardView  b4=(CardView)findViewById(R.id.maunsn4);
        CardView b5=(CardView)findViewById(R.id.maunsn5);
        CardView b6=(CardView)findViewById(R.id.maunsn6);
        CardView b7=(CardView)findViewById(R.id.maunsn7);
        CardView b8=(CardView)findViewById(R.id.maunsn8);
        CardView b9=(CardView)findViewById(R.id.maunsn9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);
                a=1;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);   a=2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);   a=3;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);   a=4;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);   a=5;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);   a=6;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);   a=7;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);   a=8;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathunsolvesample.this,phynotelist1.class);
                startActivity(in);   a=9;
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
            Intent in=new Intent(mathunsolvesample.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(mathunsolvesample.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(mathunsolvesample.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(mathunsolvesample.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
