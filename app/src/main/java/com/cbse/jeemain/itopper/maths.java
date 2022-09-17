package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class maths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        CardView ma1;
        ma1=(CardView)findViewById(R.id.matvideo);
        ma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(maths.this,mathvideo.class);
                startActivity(in);
            }
        });
        CardView man;
        man=(CardView)findViewById(R.id.matnote);
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(maths.this,mathnote.class);
                startActivity(in);
            }
        });
        CardView mabook;
        mabook=(CardView)findViewById(R.id.matbook);
        mabook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(maths.this,mathbook.class);
                startActivity(in);
            }
        });

        CardView maexe;
        maexe=(CardView)findViewById(R.id.matexe);
        maexe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(maths.this,mathexesol.class);
                startActivity(in);
            }
        });
        CardView maexa;
        maexa=(CardView)findViewById(R.id.matexampler);
        maexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(maths.this,mathxampler.class);
                startActivity(in);
            }
        });
        CardView maique;
        maique=(CardView)findViewById(R.id.matcbseque);
        maique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(maths.this,mathimpque.class);
                startActivity(in);
            }
        });

        CardView mathsam;
        mathsam=(CardView)findViewById(R.id.msolsamplepaper);
        mathsam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(maths.this,mathsolvesample.class);
                startActivity(in);
            }
        });
        CardView mathunsam;
        mathunsam=(CardView)findViewById(R.id.munsolvesamplepaper);
        mathunsam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(maths.this,mathunsolvesample.class);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            Intent in=new Intent(maths.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(maths.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(maths.this,report.class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(maths.this,MainActivity2.class));
            finish();

        }

        return super.onOptionsItemSelected(item);
    }
}
