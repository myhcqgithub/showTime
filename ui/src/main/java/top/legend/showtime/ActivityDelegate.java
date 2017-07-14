package top.legend.showtime;

import android.os.Bundle;

import java.util.List;

import butterknife.Unbinder;
import top.legend.showtime.base.BasePresenter;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public class ActivityDelegate {


    public static void create(Bundle state) {

    }

    public static void save(Bundle state) {

    }

    public static void destroy(Unbinder unbinder, List<BasePresenter> presenters) {
        if (unbinder != null) {
            unbinder.unbind();
        }
        if (presenters != null && !presenters.isEmpty()) {
            for (BasePresenter presenter : presenters) {
                presenter.setupView(null);
                presenter.destroyPresenter();
                presenter = null;
            }
            presenters.clear();
            presenters = null;
        }
    }

    public static void resume() {

    }

    public static void pause() {

    }
}
