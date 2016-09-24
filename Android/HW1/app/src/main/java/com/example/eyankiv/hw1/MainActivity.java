package com.example.eyankiv.hw1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGoSecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void btnGoThirdActivity(View view) {
        //btnGoSecondActivity(view); //To avoid stacking activities
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
