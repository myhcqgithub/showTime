package top.legend.showtime.common.dagger;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import top.legend.showtime.BaseApplication;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class, DbModule.class})
public interface AppComponent {

    void inject(BaseApplication context);
    OkHttpClient getOkHttpClient();
    Retrofit getRetrofit();
}
