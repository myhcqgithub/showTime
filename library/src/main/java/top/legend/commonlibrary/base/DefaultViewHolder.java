package top.legend.commonlibrary.base;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public abstract class DefaultViewHolder<D> extends ViewHolder {
    public DefaultViewHolder(View itemView) {
        super(itemView);
    }

    abstract void convert(View itemVew, D item);

}
