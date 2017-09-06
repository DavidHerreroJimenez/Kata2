package com.davidherrerojimenez.kata2;



import android.support.v4.app.Fragment;

import com.davidherrerojimenez.kata2.fragments.MainFragment;
import com.davidherrerojimenez.kata2.fragments.MainFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.
 * Created by udhj1a on 06/09/2017 17:53.
 */

@Module
public abstract class MainActivityProvider {

    @Binds
    @IntoMap
    @FragmentKey(MainFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> provideMainFragmentFactory(MainFragmentComponent.Builder builder);

}
