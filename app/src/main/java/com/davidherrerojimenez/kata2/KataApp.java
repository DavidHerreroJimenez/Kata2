package com.davidherrerojimenez.kata2;

import android.app.Activity;
import android.app.Application;


import com.davidherrerojimenez.kata2.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.
 * Created by udhj1a on 06/09/2017 16:47.
 */

public class KataApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent
                .builder()
                .app(this)
                .build()
                .inject(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
