package top.legend.showtime.common;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.List;

import butterknife.Unbinder;
import top.legend.commonlibrary.utils.Logger;
import top.legend.showtime.common.base.BasePresenter;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public class ActivityLifeCycleDelegate {
    private static final String TAG = "ActivityLifeCycleDelegate";
    IViewDelegate mViewDelegate;

    public ActivityLifeCycleDelegate(IViewDelegate viewDelegate) {
        mViewDelegate = viewDelegate;
    }

    public void onResume() {
        Logger.d(TAG, "onResume");
    }

    public void onPause() {
        Logger.d(TAG, "onPause");
    }

    public void onDestroy(Unbinder bind, List<BasePresenter> presenters) {
        Logger.d(TAG, "onDestroy");
        if (bind != null) {
            bind.unbind();
        }
        if (presenters != null && !presenters.isEmpty()) {
            for (BasePresenter presenter : presenters) {
                presenter.setupView(null);
                presenter.destroyPresenter();
                presenter = null;
            }
            presenters.clear();
            presenters = null;
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        Logger.d(TAG, "onSaveInstanceState");
    }

    public void onCreate(Bundle bundle) {
        Logger.d(TAG, "onCreate");
        mViewDelegate.initControl();
        mViewDelegate.initData();

    }


    public void onCreateView(ViewGroup container, Bundle savedInstanceState) {

    }
}
