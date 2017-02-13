package com.gmail.ahmedozmaan.diiwaan;

import android.app.Application;

import com.gmail.ahmedozmaan.diiwaan.dagger.component.DaggerNetComponent;
import com.gmail.ahmedozmaan.diiwaan.dagger.component.NetComponent;
import com.gmail.ahmedozmaan.diiwaan.dagger.module.AppModule;
import com.gmail.ahmedozmaan.diiwaan.dagger.module.NetModule;

/**
 * Created by Aditya on 09-May-16.
 */
public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://192.168.2.78:3000/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
