package com.cbse.jeemain.itopper;

import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private ViewPager mPager;
    private int[] layouts=new int[]{R.layout.screen1,R.layout.screen2,R.layout.screen3,

    };
    private  mpageradapter mpageradapter;

    private LinearLayout Dotlayout;
    private ImageView[] dots;
    private Button next,skip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(new prefrencemanager(this).chekpref()){
            loadhome();
        }
        if(Build.VERSION.SDK_INT>19){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else{ getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        setContentView(R.layout.activity_main2);

        mPager=(ViewPager) findViewById(R.id.viewPager2);
        mpageradapter=new mpageradapter(layouts,this);
        mPager.setAdapter(mpageradapter);

        Dotlayout=(LinearLayout) findViewById(R.id.dotlayout);
        next =(Button) findViewById(R.id.next);
        skip=(Button) findViewById(R.id.skip);
        next.setOnClickListener(this);
        skip.setOnClickListener(this);
        createdots(0);

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                createdots(position);
                if(position==layouts.length-1){
                    next.setText("start");
                    skip.setVisibility(View.INVISIBLE);
                }
                else{
                    next.setText("next");
                    skip.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void createdots(int current_position){
        if(Dotlayout!=null){
            Dotlayout.removeAllViews();
            dots=new ImageView[layouts.length];
            for(int i=0;i<layouts.length;i++){
                dots[i]=new ImageView(this);
                if(i==current_position){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.nnactive));
                }
                else{
                    dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.nactive));
                }
                LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                params.setMargins(4,0,4,0);
                Dotlayout.addView(dots[i],params);
            }

        }
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.next:
                loadnextslide();
                break;
            case R.id.skip:
                loadhome();
                new prefrencemanager(this).writepref();
                break;
        }
    }
    private void loadhome(){
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
    private  void loadnextslide(){
        int nextslide=mPager.getCurrentItem()+1;
        if(nextslide<layouts.length){
            mPager.setCurrentItem(nextslide);
        }
        else{
            loadhome();
            new prefrencemanager(this).writepref();
        }
    }
}
