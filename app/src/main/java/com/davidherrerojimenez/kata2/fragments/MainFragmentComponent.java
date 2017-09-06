package com.davidherrerojimenez.kata2.fragments;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.fragments.
 * Created by udhj1a on 06/09/2017 17:47.
 */

@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentComponent extends AndroidInjector<MainFragment>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainFragment>{

    }

}
