package com.example.testing.daggertest;

import com.example.testing.daggertest.scope.PerActivity;

import javax.inject.Scope;

import dagger.Component;

/**
 * Created by sangcomz on 16. 3. 7.
 */

@PerActivity
@Component(
        modules = {
        ActivityModule2.class
        }
)
public interface ActivityComponent2 {
void inject(MainActivity activity);
}

