package top.legend.showtime.app.main;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import net.idik.lib.slimadapter.SlimAdapter;
import net.idik.lib.slimadapter.SlimInjector;
import net.idik.lib.slimadapter.viewinjector.IViewInjector;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import top.legend.commonlibrary.base.adapter.DefaultAdapter;
import top.legend.commonlibrary.base.adapter.DefaultViewHolder;
import top.legend.showtime.R;
import top.legend.showtime.app.main.plan.model.PlanBean;
import top.legend.showtime.common.base.BaseFragment;
import top.legend.showtime.common.base.BasePresenter;

/**
 * Created by Legend on 2017/7/16.
 */

public class PlanFragment extends BaseFragment {
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    private SlimAdapter mAdapter;

    @Override
    public int contentLayoutId() {
        return R.layout.fragment_plan;
    }

    @Override
    public void initControl() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = SlimAdapter.create()
                .register(R.layout.item_plan, new SlimInjector<PlanBean>() {
                    @Override
                    public void onInject(PlanBean data, IViewInjector injector) {
                        injector.text(R.id.tv_title, data.getTitle())
                                .text(R.id.tv_content, data.getContent())
                                .text(R.id.tv_language, data.getLanguage());
                    }
                })
                .attachTo(mRecyclerView);


        List<PlanBean> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(new PlanBean("title" + i, "content" + i, "android" + i));
        }
        mAdapter.updateData(data);
    }

    @Override
    public void initData() {

    }

    @Override
    public List<BasePresenter> setupPresenter() {
        return null;
    }

    public static PlanFragment newInstance() {

        Bundle args = new Bundle();

        PlanFragment fragment = new PlanFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
