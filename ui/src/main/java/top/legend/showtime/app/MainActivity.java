package top.legend.showtime.app;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import top.legend.showtime.R;
import top.legend.showtime.common.base.BaseActivity;
import top.legend.showtime.common.base.BasePresenter;

public class MainActivity extends BaseActivity {
    @BindView(R.id.tv)
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public int contentLayoutId() {
        return R.layout.activity_main;
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
}
