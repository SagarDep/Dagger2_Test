package com.example.testing.daggertest;

import dagger.Component;

/**
 * Created by sangcomz on 16. 3. 9.
 */
@Component(modules = BModule.class,
        dependencies = AComponent.class)
public interface BComponent {
    void inject(MainActivity target);
}
