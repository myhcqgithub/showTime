package top.legend.commonlibrary.base.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Legend on 2017/7/16.
 */

public class DefaultAdapter<D extends MuchItemEntity, V extends DefaultViewHolder> extends RecyclerView.Adapter<V> {
    private List<D> mData;
    private SparseArray<V> mLayoutTypeArray;

    public DefaultAdapter() {
        this(null);
    }

    public DefaultAdapter(List<D> data) {
        mData = data;
        mLayoutTypeArray = new SparseArray<>();
    }

    @Override
    public int getItemViewType(int position) {
        D d = mData.get(position);
        int itemType = d.itemType(d);
        return itemType;
    }

    @Override
    public V onCreateViewHolder(ViewGroup parent, int viewType) {
        V v = mLayoutTypeArray.get(viewType);
        return v;
    }

    @Override
    public void onBindViewHolder(V holder, int position) {
        holder.convert(position, mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public DefaultAdapter<D, V> register(V holder) {
        mLayoutTypeArray.put(holder.layoutType(), holder);
        return this;
    }

    public DefaultAdapter<D, V> setItems(List<D> datas) {
        mData = datas;
        return this;
    }

    public DefaultAdapter<D, V> atttch(RecyclerView recyclerView) {
        recyclerView.setAdapter(this);
        return this;
    }
}
