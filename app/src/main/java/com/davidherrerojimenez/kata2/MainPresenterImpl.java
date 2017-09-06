package com.davidherrerojimenez.kata2;

import com.davidherrerojimenez.kata2.data.ApiService;

import javax.inject.Inject;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.
 * Created by udhj1a on 06/09/2017 17:04.
 */

public class MainPresenterImpl implements MainPresenter{
    MainView mainView;
    ApiService apiService;

    @Inject
    public MainPresenterImpl(MainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void loadMain(){
        apiService.loadData();
        mainView.onMainLoaded();
    }
}
