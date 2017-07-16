package top.legend.commonlibrary.utils;

import android.text.TextUtils;

import java.util.Objects;

/**
 * Created by Legend on 2017/7/16.
 */

public class NullUtils {


    public static boolean checkNull(Object... params) {

        if (params == null || params.length == 0) {
            return true;
        }
        for (Object param : params) {
            if (param instanceof String) {
                String str = (String) param;
                if (TextUtils.isEmpty(str)) {
                    return true;
                }
            } else {
                if (param == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
