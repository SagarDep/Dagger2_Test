package com.example.testing.daggertest;

import android.util.Log;

/**
 * Created by sangcomz on 16. 3. 7.
 */
public class UserModel2 {
    String name;

    UserModel2(){
        name = "Hee Won";
        Log.d("UserModel2","My Name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
