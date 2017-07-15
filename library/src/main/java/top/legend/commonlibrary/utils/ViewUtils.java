package top.legend.commonlibrary.utils;

import android.view.View;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/15
 */

public class ViewUtils {


    public static <T extends View> T findViewById(View rootView, int id) {
        if (rootView == null) {
            throw new NullPointerException("RootView is null...");
        }
        return (T) rootView.findViewById(id);

    }


}
