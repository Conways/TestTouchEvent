package com.conways.testtouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by John on 2016/11/3.
 */

class Child extends View {


    public Child(Context context) {
        super(context);
    }

    public Child(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Child(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    String TAG="Child";

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent: "+TouchUtil.getTouchAction(event.getAction()));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(TAG, "dispatchTouchEvent: "+TouchUtil.getTouchAction(event.getAction()));
        return super.dispatchTouchEvent(event);
    }
}
