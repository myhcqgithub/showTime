package top.legend.showtime;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import top.legend.showtime.base.BaseActivity;
import top.legend.showtime.base.BasePresenter;

public class MainActivity extends BaseActivity {
    @BindView(R.id.tv)
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);







    }

    @Override
    protected List<BasePresenter> setupPresenter() {
        return null;
    }

    @Override
    public int contentLayoutId() {
        return R.layout.activity_main;
    }
}
