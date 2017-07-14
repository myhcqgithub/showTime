package top.legend.commonlibrary.listener;

import top.legend.commonlibrary.base.DefaultRecyclerAdapter;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public interface OnItemClickListener<D> {

    void onItemClick(DefaultRecyclerAdapter adapter, D item, int position);

}
