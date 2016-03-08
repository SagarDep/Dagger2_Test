package com.example.testing.daggertest;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sangcomz on 16. 3. 7.
 */
@Module
public class ActivityModule {

    @Provides
    UserModel userModel(){
        Log.d("ActivityModule", "Provides UserModel");
        return new UserModel();
    }
}
