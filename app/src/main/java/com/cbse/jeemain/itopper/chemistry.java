package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class chemistry extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        CardView ch1;
        ch1=(CardView)findViewById(R.id.chevideo);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistry.this,chemistryvideo.class);
                startActivity(in);
            }
        });
        CardView chn;
        chn=(CardView)findViewById(R.id.chenote);
        chn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistry.this,chemistrynotes.class);
                startActivity(in);
            }
        });
        CardView chbook;
        chbook=(CardView)findViewById(R.id.chebook);
        chbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistry.this,chebook.class);
                startActivity(in);
            }
        });
        CardView   chexe;
        chexe=(CardView)findViewById(R.id.cheexe);
        chexe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistry.this,cheexesol.class);
                startActivity(in);
            }
        });
        CardView   chexa;
        chexa=(CardView)findViewById(R.id.cheexampler);
        chexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistry.this,cheexampler.class);
                startActivity(in);
            }
        });
        CardView   cheique;
        cheique=(CardView)findViewById(R.id.checbseque);
        cheique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistry.this,cheimpque.class);
                startActivity(in);
            }
        });
        CardView   chesam;
        chesam=(CardView)findViewById(R.id.csolsamplepaper);
        chesam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistry.this,chesolvesample.class);
                startActivity(in);
            }
        });
        CardView   cheunsam;
        cheunsam=(CardView)findViewById(R.id.cunsolvesamplepaper);
        cheunsam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(chemistry.this,cunsolvesamplepaper.class);
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
            Intent in=new Intent(chemistry.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(chemistry.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(chemistry.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(chemistry.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
