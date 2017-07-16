package top.legend.showtime.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import top.legend.commonlibrary.utils.FragmentUtils;
import top.legend.showtime.R;
import top.legend.showtime.app.main.MeFragment;
import top.legend.showtime.app.main.PlanFragment;
import top.legend.showtime.app.main.SignInFragment;
import top.legend.showtime.common.base.BaseActivity;
import top.legend.showtime.common.base.BasePresenter;

public class MainActivity extends BaseActivity {
    public static final String FRAGMENT_INDEX = "fragment_index";
    @BindView(R.id.bottom_nav)
    BottomNavigationView mBottomNavigationView;
    private FragmentUtils mFragmentUtils;


    @Override
    public int contentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initControl() {
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int index = menuItemToIndex(item);
                mFragmentUtils.show(index);
                return true;
            }

            private int menuItemToIndex(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_sign_in:
                        return 1;
                    case R.id.item_me:
                        return 2;
                }
                return 0;
            }
        });
    }

    @Override
    public void initData() {
        mFragmentUtils = FragmentUtils.newInstance(getSupportFragmentManager(),
                new Fragment[]{PlanFragment.newInstance(), SignInFragment.newInstance()
                        , MeFragment.newInstance()}, R.id.rl_container);
    }

    @Override
    public List<BasePresenter> setupPresenter() {
        return null;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(FRAGMENT_INDEX, mFragmentUtils.getCurrentIndex());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mFragmentUtils.show(savedInstanceState.getInt(FRAGMENT_INDEX));
    }
}
