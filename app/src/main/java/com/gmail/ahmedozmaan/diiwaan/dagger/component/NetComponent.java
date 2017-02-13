package com.gmail.ahmedozmaan.diiwaan.dagger.component;


import com.gmail.ahmedozmaan.diiwaan.dagger.module.AppModule;
import com.gmail.ahmedozmaan.diiwaan.dagger.module.NetModule;
import com.gmail.ahmedozmaan.diiwaan.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Aditya on 09-May-16.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}
