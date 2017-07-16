package top.legend.showtime.app.main;

import android.os.Bundle;

import java.util.List;

import top.legend.showtime.R;
import top.legend.showtime.common.base.BaseFragment;
import top.legend.showtime.common.base.BasePresenter;

/**
 * Created by Legend on 2017/7/16.
 */

public class SignInFragment extends BaseFragment {
    @Override
    public int contentLayoutId() {
        return R.layout.fragment_sign_in;
    }

    @Override
    public void initControl() {

    }

    @Override
    public void initData() {

    }

    @Override
    public List<BasePresenter> setupPresenter() {
        return null;
    }

    public static SignInFragment newInstance() {
        
        Bundle args = new Bundle();
        
        SignInFragment fragment = new SignInFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
