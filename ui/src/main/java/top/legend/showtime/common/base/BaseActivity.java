package top.legend.showtime.common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import top.legend.showtime.common.lifecycle.ActivityLifeCycleDelegate;
import top.legend.showtime.common.activity.IViewDelegate;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public abstract class BaseActivity extends AppCompatActivity implements IViewDelegate {

    private Unbinder mBind;
    private ActivityLifeCycleDelegate mLifeCycleDelegate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLifeCycleDelegate = new ActivityLifeCycleDelegate(this);
        setContentView(contentLayoutId());
        mBind = ButterKnife.bind(this);
        mLifeCycleDelegate.onCreate(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mLifeCycleDelegate.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLifeCycleDelegate.onDestroy(mBind, setupPresenter());
    }

    @Override
    protected void onPause() {
        super.onPause();
        mLifeCycleDelegate.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mLifeCycleDelegate.onResume();
    }

}
