package com.cbse.jeemain.itopper;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class physics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        CardView ph1;
        ph1=(CardView)findViewById(R.id.phyvideo);
        ph1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physics.this,physicsvideo.class);
                startActivity(in);
            }
        });
        CardView phn;
        phn=(CardView)findViewById(R.id.phynote);
        phn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physics.this,physicsnote.class);
                startActivity(in);
            }
        });
        CardView phbook;
        phbook=(CardView)findViewById(R.id.phybook);
        phbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physics.this,phybook.class);
                startActivity(in);
            }
        });
        CardView phexe;
        phexe=(CardView)findViewById(R.id.phyexe);
        phexe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physics.this,phyexesol.class);
                startActivity(in);
            }
        });
        CardView phexa;
        phexa=(CardView)findViewById(R.id.phyexampler);
        phexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physics.this,phyexampler.class);
                startActivity(in);
            }
        });
        CardView phyque;
        phyque=(CardView)findViewById(R.id.phycbseque);
        phyque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physics.this,phyimpque.class);
                startActivity(in);
            }
        });
        CardView physam;
        physam=(CardView)findViewById(R.id.psolsamplepaper);
        physam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physics.this,physolvesample.class);
                startActivity(in);
            }
        });
        CardView phyunsam;
        phyunsam=(CardView)findViewById(R.id.punsolvesamplepaper);
        phyunsam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physics.this,phyunsolvesample.class);
                startActivity(in);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.home) {
            Intent in=new Intent(physics.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(physics.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(physics.this,report.class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(physics.this,MainActivity2.class));
            finish();

        }

        return super.onOptionsItemSelected(item);
    }
}
