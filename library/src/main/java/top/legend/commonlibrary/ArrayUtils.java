package top.legend.commonlibrary;

import java.util.List;

/**
 * Created by hcqi on.
 * Des:数据容器工具类
 * Date: 2017/7/13
 */

public class ArrayUtils {
    public static boolean isEmpty(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }
    public static boolean isEmpty(Object[] obj) {
        if (obj == null || obj.length == 0) {
            return true;
        }
        return false;
    }
    public static <T> T find(List<T> list, ArrayFindCondition<T> condition) {
        if (condition == null) {
            throw new NullPointerException("condition is null");
        }
        if (!isEmpty(list)) {
            for (T t : list) {
                if (condition.condition(t)) {
                    return t;
                }
            }
        }
        return null;
    }

    public interface ArrayFindCondition<T> {
        boolean condition(T t);
    }
}
