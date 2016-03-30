package com.example.testing.daggertest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sangcomz on 16. 3. 9.
 */
@Component(modules = AModule.class)
public interface AComponent {
    void inject(MainActivity target);
}
