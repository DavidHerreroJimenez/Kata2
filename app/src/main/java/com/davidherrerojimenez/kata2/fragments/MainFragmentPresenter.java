package com.davidherrerojimenez.kata2.fragments;

import javax.inject.Inject;

/**
 * Proyect: Kata2.
 * Package name: com.davidherrerojimenez.kata2.fragments.
 * Created by udhj1a on 06/09/2017 17:49.
 */

public class MainFragmentPresenter {

    MainFragmentView mainFragmentView;

    @Inject
    public MainFragmentPresenter(MainFragmentView mainFragmentView) {
        this.mainFragmentView = mainFragmentView;
        mainFragmentView.onDetailFragmentLoaded();
    }
}
