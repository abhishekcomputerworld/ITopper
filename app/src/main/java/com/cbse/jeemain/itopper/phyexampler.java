package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class phyexampler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phyexampler);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        phynotelist1 no=new phynotelist1();
        no.note="phyexampler";
        CardView b1=(CardView)findViewById(R.id.phechn1);
        CardView   b2=(CardView)findViewById(R.id.phechn2);
        CardView  b3=(CardView)findViewById(R.id.phechn3);
        CardView  b4=(CardView)findViewById(R.id.phechn4);
        CardView b5=(CardView)findViewById(R.id.phechn5);
        CardView b6=(CardView)findViewById(R.id.phechn6);
        CardView b7=(CardView)findViewById(R.id.phechn7);
        CardView b8=(CardView)findViewById(R.id.phechn8);
        CardView b9=(CardView)findViewById(R.id.phechn9);
        CardView  b10=(CardView)findViewById(R.id.phechn10);
        CardView  b11=(CardView)findViewById(R.id.phechn11);
        CardView  b12=(CardView)findViewById(R.id.phechn12);
        CardView  b13=(CardView)findViewById(R.id.phechn13);
        CardView  b14=(CardView)findViewById(R.id.phechn14);
        CardView  b15=(CardView)findViewById(R.id.phechn15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);
                pexampler no=new pexampler();
                no.exam="pch1";
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch2";
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch3";
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch4";
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch5";
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch6";
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch7";
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch8";
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch9";
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch10";
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch11";
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch12";
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch13";
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch14";
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(phyexampler.this,pexampler.class);
                startActivity(in);     pexampler no=new pexampler();
                no.exam="pch15";
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
            Intent in=new Intent(phyexampler.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(phyexampler.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(phyexampler.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(phyexampler.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
