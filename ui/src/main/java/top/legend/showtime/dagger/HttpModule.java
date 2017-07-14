package top.legend.showtime.dagger;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import top.legend.http.LoggerInterceptor;
import top.legend.showtime.R;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */

@Module
public class HttpModule {
    Context mContext;

    public HttpModule(Context context) {
        mContext = context.getApplicationContext();
    }

    @Singleton
    @Provides
    OkHttpClient providesOkHttpClient() {
        return new OkHttpClient.Builder().readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .addInterceptor(new LoggerInterceptor("okHttp", true))
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    Retrofit providesRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(mContext.getString(R.string.server_ip))
                .client(client)
                .build();
    }

}
