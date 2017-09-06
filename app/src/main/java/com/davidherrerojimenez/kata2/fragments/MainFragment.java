package com.davidherrerojimenez.kata2.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davidherrerojimenez.kata2.R;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;


public class MainFragment extends Fragment implements MainFragmentView{

    @Inject
    MainFragmentPresenter mainFragmentPresenter;


    public MainFragment() {
        // Required empty public constructor
    }



    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }

    @Override
    public void onDetailFragmentLoaded() {
        Log.v("TEST", "OnDetailFragmentLoaded.");
    }
}
