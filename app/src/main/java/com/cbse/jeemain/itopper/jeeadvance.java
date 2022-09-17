package com.cbse.jeemain.itopper;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class jeeadvance extends AppCompatActivity {
    public static  int a;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeeadvance);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        phynotelist1 no=new phynotelist1();
        no.note="jeeadvance";
        CardView b1=(CardView)findViewById(R.id.jea1);
        CardView   b2=(CardView)findViewById(R.id.jea2);
        CardView  b3=(CardView)findViewById(R.id.jea3);
        CardView  b4=(CardView)findViewById(R.id.jea4);
        CardView b5=(CardView)findViewById(R.id.jea5);
        CardView b6=(CardView)findViewById(R.id.jea6);
        CardView b7=(CardView)findViewById(R.id.jea7);
        CardView b8=(CardView)findViewById(R.id.jea8);
        CardView b9=(CardView)findViewById(R.id.jea9);
        CardView  b10=(CardView)findViewById(R.id.jea10);
        CardView  b11=(CardView)findViewById(R.id.jea11);
        CardView  b12=(CardView)findViewById(R.id.jea12);
        CardView  b13=(CardView)findViewById(R.id.jea13);
        CardView  b14=(CardView)findViewById(R.id.jea14);
        CardView  b15=(CardView)findViewById(R.id.jea15);

        CardView   b16=(CardView)findViewById(R.id.jea16);
        CardView  b17=(CardView)findViewById(R.id.jea17);
        CardView  b18=(CardView)findViewById(R.id.jea18);
        CardView b19=(CardView)findViewById(R.id.jea19);
        CardView b20=(CardView)findViewById(R.id.jea20);
        CardView b21=(CardView)findViewById(R.id.jea21);
        CardView b22=(CardView)findViewById(R.id.jea22);
        CardView b23=(CardView)findViewById(R.id.jea23);
        CardView  b24=(CardView)findViewById(R.id.jea24);
        CardView  b25=(CardView)findViewById(R.id.jea25);
        CardView  b26=(CardView)findViewById(R.id.jea26);
        CardView  b27=(CardView)findViewById(R.id.jea27);
        CardView  b28=(CardView)findViewById(R.id.jea28);
        CardView  b29=(CardView)findViewById(R.id.jea29);

        CardView  b30=(CardView)findViewById(R.id.jea30);
        CardView  b31=(CardView)findViewById(R.id.jea31);
        CardView  b32=(CardView)findViewById(R.id.jea32);
        CardView  b33=(CardView)findViewById(R.id.jea33);
        CardView  b34=(CardView)findViewById(R.id.jea34);
        CardView  b35=(CardView)findViewById(R.id.jea35);
        CardView  b36=(CardView)findViewById(R.id.jea36);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=1;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=3;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=4;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=5;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=6;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=7;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=8;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=9;
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=10;
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=11;
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=12;
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=13;
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=14;
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=15;
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=16;
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=17;
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=18;
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=19;
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=20;
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=21;
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=22;
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=23;
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=24;
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=25;
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=26;
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=27;
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=28;
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=29;
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=30;
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=31;
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=32;
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=33;
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=34;
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=35;
            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(jeeadvance.this,phynotelist1.class);
                startActivity(in);a=36;
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
            Intent in=new Intent(jeeadvance.this,MainActivity.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.about) {
            Intent in=new Intent(jeeadvance.this, cheexesol.aboutus.class);
            startActivity(in);

        } else if (id == R.id.report) {
            Intent in=new Intent(jeeadvance.this,report .class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(jeeadvance.this,MainActivity2.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
