package top.legend.showtime.common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import top.legend.showtime.common.lifecycle.FragmentLifeCycleDelegate;
import top.legend.showtime.common.activity.IViewDelegate;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public abstract class BaseFragment extends Fragment implements IViewDelegate {
    protected View mRootView;
    private FragmentLifeCycleDelegate mLifeCycleDelegate;
    private Unbinder mBind;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLifeCycleDelegate = new FragmentLifeCycleDelegate(this);
        mLifeCycleDelegate.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(contentLayoutId(), container, false);
        mBind = ButterKnife.bind(this, mRootView);
        mLifeCycleDelegate.onCreateView(container, savedInstanceState);
        return mRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mLifeCycleDelegate.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        mLifeCycleDelegate.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mLifeCycleDelegate.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mLifeCycleDelegate.onDestroy(mBind, setupPresenter());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mLifeCycleDelegate.onDestroyView();
    }


}
