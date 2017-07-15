package top.legend.showtime.common;

import android.app.Activity;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/15
 */

public interface IActivityManager {
    void remove(Activity activity);

    void add(Activity activity);

    int size();

    void remove(Class<?> classZ);

    void removeAll();


    Activity find(Class<?> classZ);


}
