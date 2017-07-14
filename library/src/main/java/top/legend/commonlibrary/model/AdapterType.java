package top.legend.commonlibrary.model;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public interface AdapterType<D> {

    boolean itemType(D item);

    int itemLayoutId();

}
