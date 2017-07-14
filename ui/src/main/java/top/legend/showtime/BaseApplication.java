package top.legend.showtime;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import retrofit2.Retrofit;
import top.legend.commonlibrary.Logger;
import top.legend.showtime.dagger.AppModule;
import top.legend.showtime.dagger.DaggerAppComponent;
import top.legend.showtime.dagger.DbModule;
import top.legend.showtime.dagger.HttpModule;


/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

public class BaseApplication extends Application {
    private static final String TAG = "BaseApplication";
    private static BaseApplication sApplication;

    @Inject
    Retrofit mRetrofit;
    @Inject IA mA;
    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        Logger.init(sApplication, new Logger.LoggerConfig().setGlobalTag(TAG));
        Logger.d(TAG, "Application Init...");

        DaggerAppComponent.builder().httpModule(new HttpModule(this))
                .appModule(new AppModule())
                .dbModule(new DbModule())
                .build().inject(this);
        if (mRetrofit!=null) {

        }
        if (mA!=null) {

        }


    }

    public static Context getApp() {
        return sApplication;
    }
}
