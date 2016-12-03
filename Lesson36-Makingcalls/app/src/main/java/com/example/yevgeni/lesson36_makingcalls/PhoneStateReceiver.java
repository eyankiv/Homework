package com.example.yevgeni.lesson36_makingcalls;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/**
 * Created by yevgeni on 20/11/2016.
 */

public class PhoneStateReceiver extends BroadcastReceiver {

    TelephonyManager telephonyManager; //not to confuse with telecom
    PhoneStateListener listener;
    boolean alreadyListening;

    @Override
    public void onReceive(Context context, Intent intent) {
        //here we put basic commands because they need to finish fast and not on going activity
        listener = new PhoneReceiver(context);
        telephonyManager = (TelephonyManager)context.getSystemService(Context.TELECOM_SERVICE);
        alreadyListening = true;

    }
}
