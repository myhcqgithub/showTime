package top.legend.showtime.common.lifecycle;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.Unbinder;
import top.legend.showtime.common.activity.IViewDelegate;
import top.legend.showtime.common.base.BasePresenter;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public class FragmentLifeCycleDelegate extends ActivityLifeCycleDelegate {
    private static final String TAG = "ActivityLifeCycleDelegate";

    public FragmentLifeCycleDelegate(IViewDelegate viewDelegate) {
        super(viewDelegate);
    }

    public void onCreateView(ViewGroup container, Bundle savedInstanceState) {

    }

    @Override
    public void onCreate(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        mViewDelegate.initControl();
        mViewDelegate.initData();
    }

    public void onDestroyView() {
    }

    @Override
    public void onDestroy(Unbinder bind, List<BasePresenter> presenters) {
        super.onDestroy(bind, presenters);
    }
}
