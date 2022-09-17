
package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class
mathxampler extends AppCompatActivity {
    public static int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathxampler);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        phynotelist1 no=new phynotelist1();
        no.note="mathexampler";

        CardView b1=(CardView)findViewById(R.id.maechn1);
        CardView   b2=(CardView)findViewById(R.id.maechn2);
        CardView  b3=(CardView)findViewById(R.id.maechn3);
        CardView  b4=(CardView)findViewById(R.id.maechn4);
        CardView b5=(CardView)findViewById(R.id.maechn5);
        CardView b6=(CardView)findViewById(R.id.maechn6);
        CardView b7=(CardView)findViewById(R.id.maechn7);
        CardView b8=(CardView)findViewById(R.id.maechn8);
        CardView b9=(CardView)findViewById(R.id.maechn9);
        CardView  b10=(CardView)findViewById(R.id.maechn10);
        CardView  b11=(CardView)findViewById(R.id.maechn11);
        CardView  b12=(CardView)findViewById(R.id.maechn12);
        CardView  b13=(CardView)findViewById(R.id.maechn13);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in); mexampler no=new mexampler();
                no.exam="mch1";

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch2";
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch3";
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch4";
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch5";
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch6";
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch7";
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch8";
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch9";
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch10";
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch11";
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch12";
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(mathxampler.this,mexampler.class);
                startActivity(in);  startActivity(in); mexampler no=new mexampler();
                no.exam="mch13";
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
            Intent in=new Intent(mathxampler.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(mathxampler.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(mathxampler.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(mathxampler.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
