package top.legend.showtime;

import android.app.Application;
import android.content.Context;

import java.util.Date;

import javax.inject.Inject;

import top.legend.commonlibrary.utils.Logger;
import top.legend.showtime.common.AppActivityLifecycleCallbacks;
import top.legend.showtime.common.Durable;
import top.legend.showtime.common.dagger.AppComponent;
import top.legend.showtime.common.dagger.AppModule;
import top.legend.showtime.common.dagger.DaggerAppComponent;
import top.legend.showtime.common.dagger.HttpModule;


/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public class BaseApplication extends Application {
    private static final String TAG = "BaseApplication";
    private static BaseApplication sApplication;
    private AppComponent mAppComponent;

    @Inject AppActivityLifecycleCallbacks mActivityLifecycleCallbacks;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        Logger.init(sApplication, new Logger.LoggerConfig().setGlobalTag(TAG));
        Logger.d(TAG, "Application Init...");

        mAppComponent = DaggerAppComponent.builder().httpModule(new HttpModule(this))
                .appModule(new AppModule())
                .build();
        mAppComponent.inject(this);

        Durable.setAppComponent(mAppComponent);
        Durable.setApplication(this);
        Durable.setAppStartDate(new Date());


        registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks);

    }

    public static Context getApp() {
        return sApplication;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
