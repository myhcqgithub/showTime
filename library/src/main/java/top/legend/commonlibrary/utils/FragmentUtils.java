package top.legend.commonlibrary.utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

/**
 * Created by Legend on 2017/7/16.
 */

public class FragmentUtils {

    private Fragment[] mFragments;
    private int mViewContainer;
    private FragmentManager mFragmentManager;
    private int currentIndex;

    private FragmentUtils() {

    }

    private FragmentUtils(FragmentManager fragmentManager, Fragment[] fragments, int viewContainer) {
        if (NullUtils.checkNull(fragmentManager, false, viewContainer)) {
            throw new NullPointerException("params is null");
        }

        mFragments = fragments;
        mFragmentManager = fragmentManager;
        mViewContainer = viewContainer;


        initParams();
    }

    private void initParams() {
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        for (Fragment fragment : mFragments) {
            transaction.add(mViewContainer, fragment).hide(fragment);
        }
        transaction.show(mFragments[0]).commit();
    }


    public void show(int index) {
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        if (index == mFragments.length || index > mFragments.length) {
            throw new IllegalArgumentException("index error:" + index);
        }
        for (int i = 0; i < mFragments.length; i++) {
            transaction.hide(mFragments[i]);

            if (i == index) {
                transaction.show(mFragments[i]);
                currentIndex = index;
            }
        }
        transaction.commit();
    }

    public static FragmentUtils newInstance(FragmentManager fragmentManager, Fragment[] fragments, int viewContainer) {
        FragmentUtils fragment = new FragmentUtils(fragmentManager, fragments, viewContainer);
        return fragment;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }
}
