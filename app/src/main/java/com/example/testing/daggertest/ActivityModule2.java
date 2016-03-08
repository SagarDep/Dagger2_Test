package com.example.testing.daggertest;

import android.util.Log;

import com.example.testing.daggertest.UserModel;
import com.example.testing.daggertest.UserModel2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sangcomz on 16. 3. 7.
 */
@Module
public class ActivityModule2 {

    @Provides
    UserModel userModel(){
        Log.d("ActivityModule2", "Provides UserModel");
        return new UserModel();
    }

    @Provides
    UserModel2 userModel2(){
        Log.d("ActivityModule2", "Provides UserModel2");
        return new UserModel2();
    }
}
