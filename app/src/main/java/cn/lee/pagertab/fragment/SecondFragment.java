package cn.lee.pagertab.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.lee.pagertab.R;

/**
 * Created by Ye on 2016/7/6.
 */
public class SecondFragment extends Fragment {
    public static SecondFragment instance() {
        SecondFragment view= new SecondFragment();
        return view;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.first_fragment,container,false);
        return view;
    }
}
