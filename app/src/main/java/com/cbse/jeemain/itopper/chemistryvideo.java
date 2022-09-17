package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class chemistryvideo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistryvideo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        CardView b1=(CardView)findViewById(R.id.chch1);
        CardView   b2=(CardView)findViewById(R.id.chch2);
        CardView  b3=(CardView)findViewById(R.id.chch3);
        CardView  b4=(CardView)findViewById(R.id.chch4);
        CardView b5=(CardView)findViewById(R.id.chch5);
        CardView b6=(CardView)findViewById(R.id.chch6);
        CardView b7=(CardView)findViewById(R.id.chch7);
        CardView b8=(CardView)findViewById(R.id.chch8);
        CardView b9=(CardView)findViewById(R.id.chch9);
        CardView  b10=(CardView)findViewById(R.id.chch10);
        CardView  b11=(CardView)findViewById(R.id.chch11);
        CardView  b12=(CardView)findViewById(R.id.chch12);
        CardView  b13=(CardView)findViewById(R.id.chch13);
        CardView  b14=(CardView)findViewById(R.id.chch14);
        CardView  b15=(CardView)findViewById(R.id.chch15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist1.class);
                startActivity(in);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist2.class);
                startActivity(in);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist3.class);
                startActivity(in);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist4.class);
                startActivity(in);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist5.class);
                startActivity(in);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist6.class);
                startActivity(in);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist7.class);
                startActivity(in);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist8.class);
                startActivity(in);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist9.class);
                startActivity(in);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist10.class);
                startActivity(in);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist11.class);
                startActivity(in);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist12.class);
                startActivity(in);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist13.class);
                startActivity(in);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist14.class);
                startActivity(in);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistryvideo.this,chevideolist15.class);
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
            Intent in=new Intent(chemistryvideo.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(chemistryvideo.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(chemistryvideo.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(chemistryvideo.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
