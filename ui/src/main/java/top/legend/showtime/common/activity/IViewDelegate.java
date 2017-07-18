package top.legend.showtime.common.activity;

import java.util.List;

import top.legend.showtime.common.base.BasePresenter;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public interface IViewDelegate {

    int contentLayoutId();

    void injector();

    void initControl();

    void initData();


    List<BasePresenter> setupPresenter();
}
