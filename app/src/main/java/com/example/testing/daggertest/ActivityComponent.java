package com.example.testing.daggertest;

import com.example.testing.daggertest.scope.PerActivity;

import dagger.Component;

/**
 * Created by sangcomz on 16. 3. 7.
 */

@PerActivity
@Component(
        modules = {
        ActivityModule.class
        }
)
public interface ActivityComponent {
void inject(MainActivity activity);
}

