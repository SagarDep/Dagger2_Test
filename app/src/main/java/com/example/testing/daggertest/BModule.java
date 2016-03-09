package com.example.testing.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sangcomz on 16. 3. 9.
 */
@Module
public class BModule {

    @Provides
    BModel providesBModel(){
        return new BModel();
    }
}
