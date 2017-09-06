package com.davidherrerojimenez.kata2;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.
 * Created by udhj1a on 06/09/2017 16:56.
 */

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
