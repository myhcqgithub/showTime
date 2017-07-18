package top.legend.showtime.common.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import javax.inject.Inject;

import top.legend.showtime.common.activity.IActivityManager;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/15
 */

public class AppActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    IActivityManager mActivityManager;

    @Inject
    public AppActivityLifecycleCallbacks(IActivityManager activityManager) {
        mActivityManager = activityManager;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        mActivityManager.add(activity);
        if (activity instanceof FragmentActivity) {
            FragmentActivity fActivity = (FragmentActivity) activity;
            fActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(new AppFragmentLifecycleCallbacks(), true);
        }


    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        mActivityManager.remove(activity);
    }
}
