package com.example.eyankiv.hwstarts;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.example.eyankiv.hwstarts.R.id.checkbox;
import static com.example.eyankiv.hwstarts.R.id.star1;
import static com.example.eyankiv.hwstarts.R.id.star2;
import static com.example.eyankiv.hwstarts.R.id.star3;

public class MainActivity extends Activity {

    RelativeLayout relativeLayout;
    CheckBox ratingStar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);

        for (int i = 1; i <5; i++) {

        ratingStar = (CheckBox) relativeLayout.findViewWithTag(String.valueOf(i));
        ratingStar.setOnClickListener(starsListener);

        }

    }



    View.OnClickListener starsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = Integer.valueOf((String) v.getTag());

            for (int i = 1 ; i <=5; i++) {
                ratingStar = (CheckBox) relativeLayout.findViewWithTag(String.valueOf(i));
                ratingStar.setChecked(true);
            }

            for (int i = tag+1; i <=5; i++) {
                ratingStar =(CheckBox) relativeLayout.findViewWithTag(String.valueOf(i));
                ratingStar.setChecked(false);

            }
        }
    };



}

/* final CheckBox star1 = (CheckBox) findViewById(R.id.star1); //Was in main acitivy
        final CheckBox star2 = (CheckBox) findViewById(R.id.star2);
        final CheckBox star3 = (CheckBox) findViewById(R.id.star3);
        final CheckBox star4 = (CheckBox) findViewById(R.id.star4);
        final CheckBox star5 = (CheckBox) findViewById(R.id.star5);




        star2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    star1.setChecked(true);
                }
            }
        });
        star3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    star1.setChecked(true);
                    star2.setChecked(true);
                }

            }
        });
        star4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    star1.setChecked(true);
                    star2.setChecked(true);
                    star3.setChecked(true);
                }
            }
        });
        star5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    star1.setChecked(true);
                    star2.setChecked(true);
                    star3.setChecked(true);
                    star4.setChecked(true);
                }
            }
        });
*/
