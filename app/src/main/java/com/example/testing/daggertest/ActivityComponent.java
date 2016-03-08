package com.example.testing.daggertest;

import dagger.Component;

/**
 * Created by sangcomz on 16. 3. 7.
 */


@Component(
        modules = {
        ActivityModule.class
        }
)
public interface ActivityComponent {
void inject(Main2Activity activity);
}

