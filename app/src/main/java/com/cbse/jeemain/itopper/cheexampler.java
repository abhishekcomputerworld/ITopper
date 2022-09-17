package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class cheexampler extends AppCompatActivity {
    public static int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheexampler);
        phynotelist1 no=new phynotelist1();
        no.note="cheexampler";
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        CardView b1=(CardView)findViewById(R.id.chechn1);
        CardView   b2=(CardView)findViewById(R.id.chechn2);
        CardView  b3=(CardView)findViewById(R.id.chechn3);
        CardView  b4=(CardView)findViewById(R.id.chechn4);
        CardView b5=(CardView)findViewById(R.id.chechn5);
        CardView b6=(CardView)findViewById(R.id.chechn6);
        CardView b7=(CardView)findViewById(R.id.chechn7);
        CardView b8=(CardView)findViewById(R.id.chechn8);
        CardView b9=(CardView)findViewById(R.id.chechn9);
        CardView  b10=(CardView)findViewById(R.id.chechn10);
        CardView  b11=(CardView)findViewById(R.id.chechn11);
        CardView  b12=(CardView)findViewById(R.id.chechn12);
        CardView  b13=(CardView)findViewById(R.id.chechn13);
        CardView  b14=(CardView)findViewById(R.id.chechn14);
        CardView  b15=(CardView)findViewById(R.id.chechn15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in); cexampler no=new cexampler();
                no.exam="cch1";
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch2";
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch3";
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch4";
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch5";
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch6";
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch7";
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch8";
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch9";
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch10";
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch11";
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch12";
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch13";
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch14";
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexampler.this,cexampler.class);
                startActivity(in);cexampler no=new cexampler();
                no.exam="cch15";
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
            Intent in=new Intent(cheexampler.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(cheexampler.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(cheexampler.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(cheexampler.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
