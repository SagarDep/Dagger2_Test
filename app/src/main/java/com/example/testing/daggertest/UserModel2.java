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
        int i = 0;
//        do{
//            if(i%1000 == 0)
//            System.out.println("UserModel2 thread!" + i++ );
//        }while (!name.equals(""));
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    for (int i = 0; i < 100; i++) {
//                        System.out.println("UserModel2 thread!" + i );
//                        Thread.sleep(2000);
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
//        t.start();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
