package top.legend.commonlibrary.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import top.legend.commonlibrary.listener.OnItemClickListener;
import top.legend.commonlibrary.listener.OnItemLongClickListener;
import top.legend.commonlibrary.model.AdapterType;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public class DefaultRecyclerAdapter<D extends AdapterType, V extends DefaultViewHolder<D>> extends RecyclerView.Adapter {
    private List<D> mData;
    private SparseArray<V> itemViewTypes;
    private OnItemClickListener<D> mItemClickListener;
    private OnItemLongClickListener<D> mItemLongClickListener;
    private Context mContext;

    public DefaultRecyclerAdapter(List<D> data) {
        mData = data;
        if (mData == null) {
            throw new NullPointerException("data is null");
        }
    }

    @Override
    public int getItemViewType(int position) {

        D d = mData.get(position);
        if (d != null) {
            boolean b = d.itemType(mData.get(position));
            int index = d.itemLayoutId();
            V v = itemViewTypes.get(index);

        }
        return super.getItemViewType(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        V v = itemViewTypes.get(viewType);
        if (v != null) {
            int adapterPosition = v.getAdapterPosition();
            callItemClick(null, adapterPosition);
            callItemLongClick(null, adapterPosition);
            return v;
        }

        return null;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        V v = itemViewTypes.get(itemViewType);
        if (v != null) {
            v.convert(holder.itemView, mData.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    private void callItemClick(View view, final int position) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mItemClickListener != null) {
                    mItemClickListener.onItemClick(DefaultRecyclerAdapter.this, mData.get(position)
                            , position);
                }
            }
        });
    }


    private void callItemLongClick(View view, final int position) {
        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (mItemLongClickListener != null) {
                    return mItemLongClickListener.onItemLongClick(DefaultRecyclerAdapter.this,
                            mData.get(position), position);
                }
                return false;
            }
        });
    }


    public void setItemClickListener(OnItemClickListener<D> itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    public void setItemLongClickListener(OnItemLongClickListener<D> itemLongClickListener) {
        mItemLongClickListener = itemLongClickListener;
    }
}
