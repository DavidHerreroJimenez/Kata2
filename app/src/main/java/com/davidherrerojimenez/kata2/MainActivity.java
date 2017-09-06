package com.davidherrerojimenez.kata2;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.davidherrerojimenez.kata2.fragments.MainFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class  MainActivity extends AppCompatActivity implements MainView, HasSupportFragmentInjector{

    @Inject
    MainPresenter mainPresenter;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.loadMain();

getSupportFragmentManager().beginTransaction().add(R.id.main_fragment_container, MainFragment.newInstance()).commitAllowingStateLoss();

//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, DetailActivity.class));
//            }
//        });
    }

    @Override
    public void onMainLoaded() {
        Log.v("TEST", "Main page is loaded.");
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
}
