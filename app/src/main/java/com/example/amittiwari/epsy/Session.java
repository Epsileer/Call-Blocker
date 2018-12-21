package com.example.amittiwari.epsy;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Amit Tiwari on 02-12-2018.
 */

public class Session {

    SharedPreferences sharedpreferences;
    Context context;
    TextView rej, ans;
    SharedPreferences.Editor ed;
    public static final String mypreference = "mypref";

    public Session(Context context){
        this.context = context;
        sharedpreferences = context.getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        ed = sharedpreferences.edit();
    }

    public void setRejected(){
        int r = sharedpreferences.getInt("rejected", 0);
        r+=1;
        ed.putInt("rejected", r);
        ed.commit();
    }

    public void setAnswered(){
        int a = sharedpreferences.getInt("answered", 0);
        a+=1;
        ed.putInt("answered", a);
        ed.commit();
    }

    public String getRejected(){
        return Integer.toString(sharedpreferences.getInt("rejected", 0));
    }

    public String getAnswered(){
        return Integer.toString(sharedpreferences.getInt("answered", 0));
    }
}
