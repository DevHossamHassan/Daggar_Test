package me.branded.hossamhassan.daggar_test.Dependencies_Injection.Components;

import javax.inject.Singleton;

import dagger.Component;
import me.branded.hossamhassan.daggar_test.Dependencies_Injection.Modules.AppModule;
import me.branded.hossamhassan.daggar_test.Dependencies_Injection.Modules.NetModule;
import me.branded.hossamhassan.daggar_test.MainActivity;

/**
 * Created by HossamHassan on 4/3/2016.
 */
@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}