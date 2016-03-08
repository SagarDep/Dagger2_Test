package com.example.testing.daggertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserModel2 userModel2;

    TextView txtFirst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ActivityComponent2 mActivityComponent2 = DaggerActivityComponent2.builder().activityModule2(new ActivityModule2()).build();
        mActivityComponent2.inject(this);


//        ActivityComponent2 mActivityComponent2= Dagge
        txtFirst = (TextView)findViewById(R.id.txt_first);
        txtFirst.setText(userModel2.getName());

        txtFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });

    }


    String whatName(UserModel userModel){
        return userModel.getName();
    }
}
