package com.example.testing.daggertest;

import android.app.Application;

/**
 * Created by sangcomz on 16. 3. 8.
 */
public class Dagger2TestApplication extends Application {

    private Dagger2TestApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerDagger2TestApplicationComponent.builder()
                .dagger2TestApplicationModule(new Dagger2TestApplicationModule(this)).build();
    }

    Dagger2TestApplicationComponent getComponent(){
        return component;
    }
}
