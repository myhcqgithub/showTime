package top.legend.showtime.common;

import java.util.Date;

import top.legend.showtime.BaseApplication;
import top.legend.showtime.common.dagger.AppComponent;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/15
 */

public class Durable {
    private static AppComponent sAppComponent;
    private static BaseApplication sApplication;
    private static Date appStartDate;

    public static void setAppComponent(AppComponent appComponent) {
        sAppComponent = appComponent;
    }

    public static void setApplication(BaseApplication application) {
        sApplication = application;
    }

    public static AppComponent getAppComponent() {
        return sAppComponent;
    }

    public static BaseApplication getApplication() {
        return sApplication;
    }

    public static Date getAppStartDate() {
        return appStartDate;
    }

    public static void setAppStartDate(Date appStartDate) {
        Durable.appStartDate = appStartDate;
    }
}
