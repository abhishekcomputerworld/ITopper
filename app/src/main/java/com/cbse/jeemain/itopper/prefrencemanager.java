package com.cbse.jeemain.itopper;


import android.content.Context;
import android.content.SharedPreferences;

public class prefrencemanager {
    private Context context;
    private SharedPreferences sharedPreferences;
    public prefrencemanager(Context context){
        this.context=context;
        getsharedprefrence();

    }


    private void getsharedprefrence(){
        sharedPreferences=context.getSharedPreferences(context.getString(R.string.myprefrence),Context.MODE_PRIVATE);
    }
    public void writepref(){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(context.getString(R.string.myprefkey),"INIT_OK");
        editor.commit();
    }
    public boolean chekpref(){
        boolean status =false;
        if(sharedPreferences.getString(context.getString(R.string.myprefkey),"null").equals("null")){
            status=false;

        }else{ status=true;}
        return status;
    }
    public void clearpref(){
        sharedPreferences.edit().clear().commit();
    }
}

