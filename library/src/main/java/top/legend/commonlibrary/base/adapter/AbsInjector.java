package top.legend.commonlibrary.base.adapter;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

/**
 * Created by Legend on 2017/7/16.
 */

public interface AbsInjector {

    interface Action<V extends View> {
        void call(V view);
    }

    <T extends View> T findViewById(@IdRes int id);

    AbsInjector tag(@IdRes int id, Object object);

    AbsInjector text(@IdRes int id, int res);

    AbsInjector text(@IdRes int id, CharSequence charSequence);

    AbsInjector typeface(@IdRes int id, Typeface typeface, int style);

    AbsInjector typeface(@IdRes int id, Typeface typeface);

    AbsInjector textColor(@IdRes int id, int color);

    AbsInjector textSize(@IdRes int id, int sp);

    AbsInjector alpha(@IdRes int id, float alpha);

    AbsInjector image(@IdRes int id, int res);

    AbsInjector image(@IdRes int id, Drawable drawable);

    AbsInjector background(@IdRes int id, @DrawableRes int res);

    AbsInjector background(@IdRes int id, Drawable drawable);

    AbsInjector visible(@IdRes int id);

    AbsInjector invisible(@IdRes int id);

    AbsInjector gone(@IdRes int id);

    AbsInjector visibility(@IdRes int id, int visibility);

    <V extends View> AbsInjector with(@IdRes int id, Action<V> action);

    AbsInjector clicked(@IdRes int id, View.OnClickListener listener);

    AbsInjector longClicked(@IdRes int id, View.OnLongClickListener listener);

    AbsInjector enable(@IdRes int id, boolean enable);

    AbsInjector enable(@IdRes int id);

    AbsInjector disable(@IdRes int id);

    AbsInjector checked(@IdRes int id, boolean checked);

    AbsInjector selected(@IdRes int id, boolean selected);

    AbsInjector pressed(@IdRes int id, boolean pressed);


    AbsInjector addView(@IdRes int id, View... views);

    AbsInjector addView(@IdRes int id, View view, ViewGroup.LayoutParams params);

    AbsInjector removeAllViews(@IdRes int id);

    AbsInjector removeView(@IdRes int id, View view);


}
