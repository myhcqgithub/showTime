package top.legend.commonlibrary.listener;

import top.legend.commonlibrary.base.adapter.DefaultAdapter;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public interface OnItemLongClickListener<D> {
    boolean onItemLongClick(DefaultAdapter adapter, D item, int position);
}
