package top.legend.commonlibrary.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import top.legend.commonlibrary.model.Entity;

/**
 * Created by hcqi on.
 * Des:FragmentPagerAdapter 封装类
 * Date: 2017/7/14
 */
public class DefaultFragmentPageAdapter extends FragmentPagerAdapter {
    private List<Entity> mEntityList;

    public DefaultFragmentPageAdapter(FragmentManager fm, List<Entity> entityList) {
        super(fm);
        mEntityList = entityList;
        if (mEntityList == null) {
            throw new NullPointerException("entityList is null");
        }
    }

    @Override
    public Fragment getItem(int position) {
        return mEntityList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return mEntityList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mEntityList.get(position).getTitle();
    }
}
