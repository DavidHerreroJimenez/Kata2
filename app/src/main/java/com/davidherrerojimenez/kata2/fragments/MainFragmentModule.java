package com.davidherrerojimenez.kata2.fragments;

import dagger.Module;
import dagger.Provides;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.fragments.
 * Created by udhj1a on 06/09/2017 17:43.
 */

@Module
public class MainFragmentModule {

    @Provides
    MainFragmentView provideMainFragmentView(MainFragment mainFragment){
        return mainFragment;
    }


}
