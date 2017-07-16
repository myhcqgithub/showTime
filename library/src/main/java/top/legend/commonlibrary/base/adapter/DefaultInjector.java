package top.legend.commonlibrary.base.adapter;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Legend on 2017/7/16.
 */

public class DefaultInjector implements  AbsInjector {
    @Override
    public <T extends View> T findViewById(@IdRes int id) {
        return null;
    }

    @Override
    public AbsInjector tag(@IdRes int id, Object object) {
        return null;
    }

    @Override
    public AbsInjector text(@IdRes int id, int res) {
        return null;
    }

    @Override
    public AbsInjector text(@IdRes int id, CharSequence charSequence) {
        return null;
    }

    @Override
    public AbsInjector typeface(@IdRes int id, Typeface typeface, int style) {
        return null;
    }

    @Override
    public AbsInjector typeface(@IdRes int id, Typeface typeface) {
        return null;
    }

    @Override
    public AbsInjector textColor(@IdRes int id, int color) {
        return null;
    }

    @Override
    public AbsInjector textSize(@IdRes int id, int sp) {
        return null;
    }

    @Override
    public AbsInjector alpha(@IdRes int id, float alpha) {
        return null;
    }

    @Override
    public AbsInjector image(@IdRes int id, int res) {
        return null;
    }

    @Override
    public AbsInjector image(@IdRes int id, Drawable drawable) {
        return null;
    }

    @Override
    public AbsInjector background(@IdRes int id, @DrawableRes int res) {
        return null;
    }

    @Override
    public AbsInjector background(@IdRes int id, Drawable drawable) {
        return null;
    }

    @Override
    public AbsInjector visible(@IdRes int id) {
        return null;
    }

    @Override
    public AbsInjector invisible(@IdRes int id) {
        return null;
    }

    @Override
    public AbsInjector gone(@IdRes int id) {
        return null;
    }

    @Override
    public AbsInjector visibility(@IdRes int id, int visibility) {
        return null;
    }

    @Override
    public <V extends View> AbsInjector with(@IdRes int id, Action<V> action) {
        return null;
    }

    @Override
    public AbsInjector clicked(@IdRes int id, View.OnClickListener listener) {
        return null;
    }

    @Override
    public AbsInjector longClicked(@IdRes int id, View.OnLongClickListener listener) {
        return null;
    }

    @Override
    public AbsInjector enable(@IdRes int id, boolean enable) {
        return null;
    }

    @Override
    public AbsInjector enable(@IdRes int id) {
        return null;
    }

    @Override
    public AbsInjector disable(@IdRes int id) {
        return null;
    }

    @Override
    public AbsInjector checked(@IdRes int id, boolean checked) {
        return null;
    }

    @Override
    public AbsInjector selected(@IdRes int id, boolean selected) {
        return null;
    }

    @Override
    public AbsInjector pressed(@IdRes int id, boolean pressed) {
        return null;
    }

    @Override
    public AbsInjector addView(@IdRes int id, View... views) {
        return null;
    }

    @Override
    public AbsInjector addView(@IdRes int id, View view, ViewGroup.LayoutParams params) {
        return null;
    }

    @Override
    public AbsInjector removeAllViews(@IdRes int id) {
        return null;
    }

    @Override
    public AbsInjector removeView(@IdRes int id, View view) {
        return null;
    }
}
