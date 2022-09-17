package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class physicsvideo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicsvideo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        CardView b1=(CardView)findViewById(R.id.phch1);
        CardView   b2=(CardView)findViewById(R.id.phch2);
        CardView  b3=(CardView)findViewById(R.id.phch3);
        CardView  b4=(CardView)findViewById(R.id.phch4);
        CardView b5=(CardView)findViewById(R.id.phch5);
        CardView b6=(CardView)findViewById(R.id.phch6);
        CardView b7=(CardView)findViewById(R.id.phch7);
        CardView b8=(CardView)findViewById(R.id.phch8);
        CardView b9=(CardView)findViewById(R.id.phch9);
        CardView  b10=(CardView)findViewById(R.id.phch10);
        CardView  b11=(CardView)findViewById(R.id.phch11);
        CardView  b12=(CardView)findViewById(R.id.phch12);
        CardView  b13=(CardView)findViewById(R.id.phch13);
        CardView  b14=(CardView)findViewById(R.id.phch14);
        CardView  b15=(CardView)findViewById(R.id.phch15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist.class);
                startActivity(in);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist2.class);
                startActivity(in);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist3.class);
                startActivity(in);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist4.class);
                startActivity(in);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist5.class);
                startActivity(in);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist6.class);
                startActivity(in);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist7.class);
                startActivity(in);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist8.class);
                startActivity(in);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist9.class);
                startActivity(in);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist10.class);
                startActivity(in);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist11.class);
                startActivity(in);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist12.class);
                startActivity(in);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist13.class);
                startActivity(in);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist14.class);
                startActivity(in);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(physicsvideo.this,phyvideolist15.class);
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
            Intent in=new Intent(physicsvideo.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(physicsvideo.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(physicsvideo.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(physicsvideo.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}

