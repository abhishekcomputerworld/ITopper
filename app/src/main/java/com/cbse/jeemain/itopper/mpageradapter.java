package com.cbse.jeemain.itopper;


import android.content.Context;

import androidx.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class mpageradapter extends ViewPagerAdapter {



    private int[] layouts;
    private LayoutInflater layoutInflater;
    private Context context;

    public mpageradapter( int[] layouts,Context context) {

        this.layouts = layouts;
        this.context = context;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {

        return layouts.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        View view=layoutInflater.inflate(layouts[position],container,false);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        View view=(View)object;
        container.removeView(view);
    }
}

