package top.legend.showtime.common.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import top.legend.showtime.common.ActivityManager;
import top.legend.showtime.common.IActivityManager;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */
@Module
public class AppModule {
    @Provides
    @Singleton
    IActivityManager provideActivityManager(ActivityManager activityManager) {
        return activityManager;
    }
}
