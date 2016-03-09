package com.example.testing.daggertest;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sangcomz on 16. 3. 9.
 */
@Module
public class Dagger2TestApplicationModule {

    Application application;

    Dagger2TestApplicationModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    Context providesContext(){
        return application;
    }

    @Provides//있으면 하나 없으면 계속 생성에서 리턴.
    UserModel providesUserModel(){
        return new UserModel();
    }
}
