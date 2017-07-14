package top.legend.showtime.dagger;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import top.legend.showtime.BaseApplication;
import top.legend.showtime.IA;

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
    IA getIA();
    Retrofit getRetrofit();
}
