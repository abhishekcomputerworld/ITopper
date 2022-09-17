package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class kvpy extends AppCompatActivity {
    public static int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kvpy);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        phynotelist1 no=new phynotelist1();
        no.note="kvpy";
        CardView b1=(CardView)findViewById(R.id.kv1);
        CardView   b2=(CardView)findViewById(R.id.kv2);
        CardView  b3=(CardView)findViewById(R.id.kv3);
        CardView  b4=(CardView)findViewById(R.id.kv4);
        CardView b5=(CardView)findViewById(R.id.kv5);
        CardView b6=(CardView)findViewById(R.id.kv6);
        CardView b7=(CardView)findViewById(R.id.kv7);
        CardView b8=(CardView)findViewById(R.id.kv8);
        CardView b9=(CardView)findViewById(R.id.kv9);
        CardView  b10=(CardView)findViewById(R.id.kv10);
        CardView  b11=(CardView)findViewById(R.id.kv11);
        CardView  b12=(CardView)findViewById(R.id.kv12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=1;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=3;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=4;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=5;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=6;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=7;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=8;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=9;
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=10;
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=11;
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(kvpy.this,phynotelist1.class);
                startActivity(in);a=12;
            }
        });

    }
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
            Intent in=new Intent(kvpy.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(kvpy.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(kvpy.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(kvpy.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
