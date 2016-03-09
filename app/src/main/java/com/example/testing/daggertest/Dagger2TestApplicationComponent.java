package com.example.testing.daggertest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sangcomz on 16. 3. 9.
 */
@Singleton
@Component(modules = Dagger2TestApplicationModule.class)
public interface Dagger2TestApplicationComponent {
    void inject(Dagger2TestApplication target);
    void inject(MainActivity target);
}
