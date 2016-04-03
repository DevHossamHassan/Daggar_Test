package me.branded.hossamhassan.daggar_test;

import android.app.Application;

import me.branded.hossamhassan.daggar_test.Dependencies_Injection.Components.DaggerNetComponent;
import me.branded.hossamhassan.daggar_test.Dependencies_Injection.Components.NetComponent;
import me.branded.hossamhassan.daggar_test.Dependencies_Injection.Modules.AppModule;
import me.branded.hossamhassan.daggar_test.Dependencies_Injection.Modules.NetModule;

/**
 * Created by HossamHassan on 4/3/2016.
 */
public class MyApp extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Dagger%COMPONENT_NAME%
        mNetComponent = DaggerNetComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this)) // This also corresponds to the name of your module: %component_name%Module
                .netModule(new NetModule("https://api.github.com"))
                .build();

        // If a Dagger 2 component does not have any constructor arguments for any of its modules,
        // then we can use .create() as a shortcut instead:
        //  mAppComponent = com.codepath.dagger.components.DaggerNetComponent.create();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}