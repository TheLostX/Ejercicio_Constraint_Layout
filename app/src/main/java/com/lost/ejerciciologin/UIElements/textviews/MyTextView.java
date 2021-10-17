package com.lost.ejerciciologin.UIElements.textviews;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import timber.log.Timber;

public class MyTextView extends AppCompatTextView {

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d( "MyTextView", "CustomTextView " + " onTouchEventCallBack");
        decorateTextView();
        return super.onTouchEvent(event);
    }

    private void decorateTextView(){

        if(getText().toString().isEmpty()){
            setShadowLayer(6, 4, 4, Color.rgb(250, 00, 250));
            setBackgroundColor(Color.CYAN);
        }
        else{
            setBackgroundColor(Color.RED);
        }

    }
}
