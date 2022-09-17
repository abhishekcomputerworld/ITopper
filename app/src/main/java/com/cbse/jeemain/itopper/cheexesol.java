package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class cheexesol extends AppCompatActivity {

    public static int  a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheexesol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        phynotelist1 no=new phynotelist1();
        no.note="cheexercise";
        CardView b1=(CardView)findViewById(R.id.chexch1);
        CardView   b2=(CardView)findViewById(R.id.chexch2);
        CardView  b3=(CardView)findViewById(R.id.chexch3);
        CardView  b4=(CardView)findViewById(R.id.chexch4);
        CardView b5=(CardView)findViewById(R.id.chexch5);
        CardView b6=(CardView)findViewById(R.id.chexch6);
        CardView b7=(CardView)findViewById(R.id.chexch7);
        CardView b8=(CardView)findViewById(R.id.chexch8);
        CardView b9=(CardView)findViewById(R.id.chexch9);
        CardView  b10=(CardView)findViewById(R.id.chexch10);
        CardView  b11=(CardView)findViewById(R.id.chexch11);
        CardView  b12=(CardView)findViewById(R.id.chexch12);
        CardView  b13=(CardView)findViewById(R.id.chexch13);
        CardView  b14=(CardView)findViewById(R.id.chexch14);
        CardView  b15=(CardView)findViewById(R.id.chexch15);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=1;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=3;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=4;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=5;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=6;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=7;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=8;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=9;
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=10;
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=11;
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=12;
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=13;
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=14;
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(cheexesol.this,phynotelist1.class);
                startActivity(in);a=15;
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
            Intent in=new Intent(cheexesol.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(cheexesol.this,aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(cheexesol.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(cheexesol.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }

    public static class aboutus extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_aboutus);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

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
                Intent in=new Intent(aboutus.this,MainActivity.class);
                startActivity(in);
                // Handle the camera action
            } else if (id == R.id.about) {
                Intent in=new Intent(aboutus.this, aboutus.class);
                startActivity(in);

            } else if (id == R.id.report) {
                Intent in=new Intent(aboutus.this,report .class);
                startActivity(in);

            }
            else if (id == R.id.reset) {
                new prefrencemanager(this).clearpref();
                startActivity(new Intent(aboutus.this,MainActivity2.class));
                finish();

            }
            return super.onOptionsItemSelected(item);
        }
    }
}
