package cn.lee.pagertab.tabActivity;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.lhh.apst.library.AdvancedPagerSlidingTabStrip;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.lee.pagertab.R;
import cn.lee.pagertab.fragment.FirstFragment;
import cn.lee.pagertab.fragment.FourthFragment;
import cn.lee.pagertab.fragment.SecondFragment;
import cn.lee.pagertab.fragment.ThirdFragment;
import cn.lee.pagertab.view.APSTSViewPager;

/**
 * Created by Ye on 2016/7/6.
 */
public class IconTabActivity extends FragmentActivity implements ViewPager.OnPageChangeListener{


    @Bind(R.id.icon_tab)
    AdvancedPagerSlidingTabStrip icon_tab;
    @Bind(R.id.vp)
    APSTSViewPager vp;

    private static final int VIEW_FIRST 		= 0;
    private static final int VIEW_SECOND	    = 1;
    private static final int VIEW_THIRD       = 2;
    private static final int VIEW_FOURTH    = 3;
    private static final int VIEW_SIZE = 4;
    private FirstFragment mFirstFragment=null;
    private SecondFragment mSecondFragment=null;
    private ThirdFragment mThirdFragment=null;
    private FourthFragment mFourthFragment=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_tab);
        ButterKnife.bind(this);
        initView();
    }

    private void initView(){
        vp.setOffscreenPageLimit(VIEW_SIZE);
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        icon_tab.setViewPager(vp);
        icon_tab.setOnPageChangeListener(this);
        vp.setCurrentItem(VIEW_FIRST);
        icon_tab.showDot(VIEW_FIRST,"99+");

    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    class FragmentAdapter extends FragmentStatePagerAdapter implements AdvancedPagerSlidingTabStrip.IconTabProvider{


        public FragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position >= 0 && position < VIEW_SIZE){
                switch (position){
                    case  VIEW_FIRST:
                        if(null == mFirstFragment)
                            mFirstFragment = FirstFragment.instance();
                        return mFirstFragment;

                    case VIEW_SECOND:
                        if(null == mSecondFragment)
                            mSecondFragment = SecondFragment.instance();
                        return mSecondFragment;

                    case VIEW_THIRD:
                        if(null == mThirdFragment)
                            mThirdFragment = ThirdFragment.instance();
                        return mThirdFragment;

                    case VIEW_FOURTH:
                        if(null == mFourthFragment)
                            mFourthFragment = FourthFragment.instance();
                        return mFourthFragment;
                    default:
                        break;
                }
            }
            return null;
        }

        @Override
        public int getCount() {
            return VIEW_SIZE;
        }

        @Override
        public Integer getPageIcon(int position) {
            if(position >= 0 && position < VIEW_SIZE){
                switch (position){
                    case  VIEW_FIRST:
                        return  R.mipmap.home_main_icon_n;
                    case VIEW_SECOND:
                        return  R.mipmap.home_categry_icon_n;
                    case VIEW_THIRD:
                        return  R.mipmap.home_live_icon_n;
                    case VIEW_FOURTH:
                        return  R.mipmap.home_mine_icon_n;
                    default:
                        break;
                }
            }
            return 0;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if(position >= 0 && position < VIEW_SIZE){
                switch (position){
                    case  VIEW_FIRST:
                        return  "first";
                    case  VIEW_SECOND:
                        return  "second";
                    case  VIEW_THIRD:
                        return  "third";
                    case  VIEW_FOURTH:
                        return  "fourth";
                    default:
                        break;
                }
            }
            return super.getPageTitle(position);
        }

        @Override
        public Integer getPageSelectIcon(int position) {
            if(position >= 0 && position < VIEW_SIZE){
                switch (position){
                    case  VIEW_FIRST:
                        return  R.mipmap.home_main_icon_f_n;
                    case VIEW_SECOND:
                        return  R.mipmap.home_categry_icon_f_n;
                    case VIEW_THIRD:
                        return  R.mipmap.home_live_icon_f_n;
                    case VIEW_FOURTH:
                        return  R.mipmap.home_mine_icon_f_n;
                    default:
                        break;
                }
            }
            return 0;
        }

        @Override
        public Rect getPageIconBounds(int position) {
            return null;
        }
    }
}
