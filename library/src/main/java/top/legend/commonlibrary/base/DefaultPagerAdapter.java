package top.legend.commonlibrary.base;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by hcqi on.
 * Des:PagerAdapter 封装类
 * Date: 2017/7/14
 */

public abstract class DefaultPagerAdapter<T> extends PagerAdapter {
    private List<T> data;
    private int layoutId;

    public DefaultPagerAdapter(List<T> data, int layoutId) {
        this.data = data;
        if (data == null) {
            throw new NullPointerException("data is null");
        }
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext())
                .inflate(layoutId, container, false);
        convert(view, data.get(position), position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
//        super.destroyItem(container, position, object);
    }

    public abstract void convert(View view, T item, int position);
}
