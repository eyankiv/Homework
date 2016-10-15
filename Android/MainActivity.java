package com.example.eyankiv.mytimepicker;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TimePicker timepicker = (TimePicker)findViewById(R.id.TimePicker);
        //Toast.makeText(this,"The Hour is "+timepicker.getHour(),Toast.LENGTH_SHORT).show();

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.activity_main);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        MyTimePicker mytimepicker = new MyTimePicker(this);
        linearLayout.addView(mytimepicker,layoutParams);


    }
}


