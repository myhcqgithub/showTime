package top.legend.showtime.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import top.legend.showtime.ActivityDelegate;
import top.legend.showtime.IViewDelegate;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public abstract class BaseActivity extends AppCompatActivity implements IViewDelegate {

    private Unbinder mBind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(contentLayoutId());
        mBind = ButterKnife.bind(this);
        ActivityDelegate.create(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ActivityDelegate.save(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityDelegate.destroy(mBind, setupPresenter());
    }

    @Override
    protected void onPause() {
        super.onPause();
        ActivityDelegate.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ActivityDelegate.resume();
    }

    protected abstract List<BasePresenter> setupPresenter();
}
