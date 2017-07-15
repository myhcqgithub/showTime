package top.legend.commonlibrary.utils;

/**
 * Created by hcqi on.
 * Des:断言
 * Date: 2017/7/15
 */
public class Assert {

    public static void notNull(Object object, String message) {
        if (object == null) {
            IllegalArgumentException exception = new IllegalArgumentException(message);
            exception.printStackTrace();
            throw exception;
        }
    }

    public static <T> T checkNull(T obj, String message) {
        if (obj == null) {
            NullPointerException exception = new NullPointerException(message);
            exception.printStackTrace();
            throw exception;
        }
        return obj;
    }

    public static <T> T checkNull(T obj) {

        return checkNull(obj, "params is null... ");
    }
}
