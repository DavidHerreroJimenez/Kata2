package com.davidherrerojimenez.kata2.di;

import android.app.Application;
import android.content.Context;

import com.davidherrerojimenez.kata2.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.di.
 * Created by udhj1a on 06/09/2017 16:55.
 */

@Module(subcomponents = MainActivityComponent.class)
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application){
        return application;
    }
}
