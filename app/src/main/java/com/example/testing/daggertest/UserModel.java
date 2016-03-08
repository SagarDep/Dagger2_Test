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
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        System.out.println("UserModel thread!" + i );
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
