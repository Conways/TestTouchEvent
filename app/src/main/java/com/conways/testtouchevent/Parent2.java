package com.conways.testtouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by John on 2016/11/3.
 */

public class Parent2 extends FrameLayout {

    public Parent2(Context context) {
        super(context);
    }

    public Parent2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Parent2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    String TAG="Parent2";


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(TAG, "onInterceptTouchEvent: "+TouchUtil.getTouchAction(ev.getAction()));
        return false;
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
