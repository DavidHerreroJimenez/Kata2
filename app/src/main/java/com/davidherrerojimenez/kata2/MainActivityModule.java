package com.davidherrerojimenez.kata2;

import com.davidherrerojimenez.kata2.data.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.
 * Created by udhj1a on 06/09/2017 17:02.
 */

@Module
public class MainActivityModule {

    @Provides
    MainView provideMainView(MainActivity mainActivity){
        return mainActivity;
    }

    @Provides
    MainPresenter provideMainPresenter(MainView mainView, ApiService apiService){
        return new MainPresenterImpl(mainView, apiService);
    }
}