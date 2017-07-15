package top.legend.showtime.common.dagger;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import top.legend.showtime.BaseApplication;
import top.legend.showtime.common.IActivityManager;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    void inject(BaseApplication context);

    OkHttpClient getOkHttpClient();

    Retrofit getRetrofit();

    IActivityManager getActivityManager();
}
