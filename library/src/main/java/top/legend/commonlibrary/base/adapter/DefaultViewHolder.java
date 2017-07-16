package top.legend.commonlibrary.base.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.ArrayMap;
import android.view.View;

/**
 * Created by Legend on 2017/7/16.
 */

public abstract class DefaultViewHolder extends RecyclerView.ViewHolder {

    public DefaultViewHolder(View itemView) {
        super(itemView);

    }

    public abstract int layoutType();

    public abstract void convert(int position, Object item);
}
