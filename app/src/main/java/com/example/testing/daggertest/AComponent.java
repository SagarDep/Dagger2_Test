package com.example.testing.daggertest;

import dagger.Component;

/**
 * Created by sangcomz on 16. 3. 9.
 */
@Component(modules = BModule.class)
public interface AComponent {
    void inject(MainActivity target);
}
