package com.davidherrerojimenez.kata2.di;

import android.app.Activity;

import com.davidherrerojimenez.kata2.MainActivity;
import com.davidherrerojimenez.kata2.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.di.
 * Created by udhj1a on 06/09/2017 16:58.
 */

@Module
public abstract class AppBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

}
