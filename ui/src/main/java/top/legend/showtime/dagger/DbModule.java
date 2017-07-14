package top.legend.showtime.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import top.legend.showtime.A;
import top.legend.showtime.IA;

/**
 * Created by hcqi on.
 * Des:
 * Date: 2017/7/14
 */
@Module
public class DbModule {
    @Provides
    @Singleton
    IA providesIA(A a) {
        return a;
    }
}
