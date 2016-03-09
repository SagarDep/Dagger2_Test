package com.example.testing.daggertest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Context context;

    @Inject
            UserModel userModel1;

    @Inject
            UserModel userModel2;

    TextView txtFirst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((Dagger2TestApplication)getApplication()).getComponent().inject(this);


        if (context != null)
            Log.d("Dagger2", "Context is not null!");
        if (userModel1 != null)
            Log.d("Dagger2", "userModel1 is not null!" + userModel1);
        if (userModel2 != null)
            Log.d("Dagger2", "userModel2 is not null!" + userModel2);



//        ActivityComponent2 mActivityComponent2= Dagge
        txtFirst = (TextView)findViewById(R.id.txt_first);


        txtFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });

    }


    String whatName(UserModel userModel){
        return userModel.getName();
    }
}
