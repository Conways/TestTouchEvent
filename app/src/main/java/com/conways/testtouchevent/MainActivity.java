package com.conways.testtouchevent;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {
    
    String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent: "+TouchUtil.getTouchAction(event.getAction()));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG, "dispatchTouchEvent: "+TouchUtil.getTouchAction(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }



}
