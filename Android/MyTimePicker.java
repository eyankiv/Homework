package com.example.eyankiv.mytimepicker;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by eyankiv on 14-Oct-16.
 */

public class MyTimePicker extends LinearLayout {

    private int hour = 20;
    private int minute;

    public MyTimePicker(Context context) {
        super(context);
        super.setOrientation(VERTICAL);

        //initialize layout

        LinearLayout rowTop = new LinearLayout(context);
        rowTop.setOrientation(HORIZONTAL);
        LinearLayout rowNumbers = new LinearLayout(context);
        rowNumbers.setOrientation(HORIZONTAL);
        LinearLayout rowBottom = new LinearLayout(context);
        rowBottom.setOrientation(HORIZONTAL);
        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        this.addView(rowTop,layoutParams);
        this.addView(rowNumbers,layoutParams);
        this.addView(rowBottom, layoutParams);


        //create the top buttons
        Button plusHourBtn = new Button(context);
        plusHourBtn.setText("+ Hour");
        rowTop.addView(plusHourBtn,layoutParams);
        //Setup button
        plusHourBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                hour++;
                setHour(hour);
            }
        });

        Button plusMinBtn = new Button(context);
        plusMinBtn.setText("+ Min");
        rowTop.addView(plusMinBtn,layoutParams);
        //setup buttons
        plusMinBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                minute++;
                setMinute(minute);
            }
        });

        //create the time view:
        //Hours text view
        TextView hourDisp = new TextView(context);
        hourDisp.setTextSize(35);
        hourDisp.setText("    "+  getHour());
        rowNumbers.addView(hourDisp,layoutParams);
        //Minutes text view
        TextView minDisp = new TextView(context);
        minDisp.setTextSize(35);
        minDisp.setText("        " +getMinute());
        rowNumbers.addView(minDisp,layoutParams);


        //creat the minus buttons
        //Hour button
        Button minusHourBtn = new Button(context);
        minusHourBtn.setText("- Hour");
        rowBottom.addView(minusHourBtn,layoutParams);
        //setup button
        minusHourBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                --hour;
                setHour(hour);
            }
        });

        //Min button
        Button minusMinBtn = new Button(context);
        minusMinBtn.setText("- Min");
        rowBottom.addView(minusMinBtn,layoutParams);
        minusMinBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                --minute;
                setMinute(minute);
            }
        });

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public void setOrientation(int orientation) {

    }
}
