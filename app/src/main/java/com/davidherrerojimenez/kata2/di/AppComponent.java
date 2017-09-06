package com.davidherrerojimenez.kata2.di;

import android.app.Application;

import com.davidherrerojimenez.kata2.KataApp;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.di.
 * Created by udhj1a on 06/09/2017 16:51.
 */

@Component (modules = {AndroidInjectionModule.class, AppModule.class, AppBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
         Builder app(Application application);
        AppComponent build();
    }

    void inject(KataApp kataApp);
}
