package com.wmh.android.mhwebview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @author wangmh
 */
public class IndexViewPager extends ViewPager {
  
    public IndexViewPager(Context context) {
        super(context);  
    }  
  
    public IndexViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);  
    }  
  
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        super.onInterceptTouchEvent(ev);  
        return true;  
    }  
  
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (getChildCount() <= 1) {  
            super.onTouchEvent(ev);  
        }  
        switch (ev.getAction()) {  
            case MotionEvent.ACTION_DOWN:
                if (getParent() != null) {  
                    getParent().requestDisallowInterceptTouchEvent(true);   //让事件不再分发  
                }  
                break;  
            case MotionEvent.ACTION_MOVE:
                if (getParent() != null) {  
                    getParent().requestDisallowInterceptTouchEvent(true);   //让事件不再分发  
                }  
                break;  
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                if (getParent() != null) {  
                    getParent().requestDisallowInterceptTouchEvent(true);   //让事件不再分发  
                }  
                break;  
        }  
        super.onTouchEvent(ev);  
        return true;        //让事件不再分发  
    }  
}  