package com.cbse.jeemain.itopper;



import android.app.ProgressDialog;
import android.content.Intent;

import com.google.android.material.navigation.NavigationView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity   implements NavigationView.OnNavigationItemSelectedListener {
    ViewPager viewPager;




    ProgressDialog mProgressDialog;

    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_navigation);
        mProgressDialog = new ProgressDialog(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        CardView ch;
        ch=(CardView)findViewById(R.id.che);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,chemistry.class);
                startActivity(in);
            }
        });
        CardView ph;
        ph=(CardView)findViewById(R.id.phy);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,physics.class);
                startActivity(in);  }
        });

        CardView ma;
        ma=(CardView)findViewById(R.id.mat);
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,maths.class);
                startActivity(in);   }
        });
        CardView jem;
        jem=(CardView)findViewById(R.id.jeemain);
        jem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,jeemain.class);
                startActivity(in);
            }
        });
        CardView jea;
        jea=(CardView)findViewById(R.id.jeeadvance);
        jea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,jeeadvance.class);
                startActivity(in);
            }
        });
        CardView kv;
        kv=(CardView)findViewById(R.id.kvpy);


        kv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,kvpy.class);
                startActivity(in);
            }
        });
        CardView ns;
        ns=(CardView)findViewById(R.id.nstse);
        ns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,nstse.class);
                startActivity(in);
            }
        });

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nactive));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nnactive));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nactive));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nnactive));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });





        Timer time=new Timer();
        time.scheduleAtFixedRate(new  MyTimeTask(),  3000, 4000);

    }
    public class MyTimeTask extends TimerTask{

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager.getCurrentItem()==0){
                        viewPager.setCurrentItem(+1);
                    }
                    else if(viewPager.getCurrentItem()==1){
                        viewPager.setCurrentItem(+2);
                    }
                    else if(viewPager.getCurrentItem()==2){
                        viewPager.setCurrentItem(+4);
                    }

                    else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {

            Intent in=new Intent(MainActivity.this, cheexesol.aboutus.class);
            startActivity(in);
        }
       else if (id == R.id.report) {
            Intent in=new Intent(MainActivity.this,report.class);
            startActivity(in);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.PHY) {
            Intent in=new Intent(MainActivity.this,physics.class);
            startActivity(in);
            // Handle the camera action
        } else if (id == R.id.CHE) {
            Intent in=new Intent(MainActivity.this,chemistry.class);
            startActivity(in);

        } else if (id == R.id.MAT) {
            Intent in=new Intent(MainActivity.this,maths.class);
            startActivity(in);

        }
        else if (id == R.id.reset) {
            new prefrencemanager(this).clearpref();
            startActivity(new Intent(MainActivity.this,MainActivity2.class));
            finish();

        }else if (id == R.id.nav_share) {
            Intent in=new Intent();
            in.setAction(Intent.ACTION_SEND);
            in.putExtra(Intent.EXTRA_TEXT,"url");
            in.setType("text/plain");
            startActivity(Intent.createChooser(in,"share this app with friends"));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}