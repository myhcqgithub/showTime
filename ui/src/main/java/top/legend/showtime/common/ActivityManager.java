package top.legend.showtime.common;

import android.app.Activity;

import java.lang.ref.WeakReference;
import java.util.Stack;

import javax.inject.Inject;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/15
 */
public class ActivityManager implements IActivityManager {
    private Stack<WeakReference<Activity>> mActivityList;

    @Inject
    public ActivityManager() {
        mActivityList = new Stack<>();
    }

    @Override
    public void remove(Activity activity) {
        mActivityList.remove(activity);
    }

    @Override
    public void add(Activity activity) {
        mActivityList.add(new WeakReference<>(activity));
    }

    @Override
    public int size() {
        return mActivityList.size();
    }

    @Override
    public void remove(Class<?> classZ) {
        Activity activity = find(classZ);
        if (activity != null) {
            activity.finish();
            mActivityList.remove(activity);
        }
    }

    @Override
    public void removeAll() {
        for (WeakReference<Activity> activityWeakReference : mActivityList) {
            activityWeakReference.get().finish();
        }
        mActivityList.clear();
    }


    @Override
    public Activity find(Class<?> classZ) {
        for (WeakReference<Activity> weakReference : mActivityList) {
            Activity activity = weakReference.get();
            if (activity.getClass().equals(classZ)) {
                return activity;
            }
        }
        return null;
    }


}
