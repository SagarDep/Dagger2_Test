package com.example.testing.daggertest;

import android.util.Log;

/**
 * Created by sangcomz on 16. 3. 7.
 */
public class UserModel {
    String name;

    UserModel(){
        name = "Seok Won";
        Log.d("UserModel","My Name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
