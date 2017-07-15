package top.legend.showtime.common;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public class FragmentLifeCycleDelegate extends ActivityLifeCycleDelegate {
    private static final String TAG = "ActivityLifeCycleDelegate";
    IViewDelegate mViewDelegate;

    public FragmentLifeCycleDelegate(IViewDelegate viewDelegate) {
        super(viewDelegate);
    }

    public void onCreateView(ViewGroup container, Bundle savedInstanceState) {

    }

    public void onViewCreated(View view, Bundle savedInstanceState) {

        mViewDelegate.initControl();
        mViewDelegate.initData();
    }

    public void onDestroyView() {
    }
}
