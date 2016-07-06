package cn.lee.pagertab.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Ye on 2016/7/6.
 */
public class APSTSViewPager extends ViewPager {
    private boolean mNoFocus=false;
    public APSTSViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (mNoFocus){
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public void setmNoFocus(boolean mNoFocus) {
        this.mNoFocus = mNoFocus;
    }
}
