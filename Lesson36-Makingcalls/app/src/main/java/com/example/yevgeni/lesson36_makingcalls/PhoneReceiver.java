package com.example.yevgeni.lesson36_makingcalls;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by yevgeni on 20/11/2016.
 */

public class PhoneReceiver extends PhoneStateListener {
    Context context;

    public  PhoneReceiver(Context context){
        this.context = context;
    }

    @Override
    public void onCallStateChanged(int state, String incomingNumber) {
        super.onCallStateChanged(state, incomingNumber);
//        TelephonyManager telephonyManager //this is just to activate the fuction in the swith
        String stateString = "";
        switch (state){
            case TelephonyManager.CALL_STATE_IDLE:
                stateString = "idle";
                break;
            case TelephonyManager.CALL_STATE_RINGING:
                stateString = "ringing";
                break;
            case TelephonyManager.CALL_STATE_OFFHOOK:
                stateString = "offhook";
                break;
        }
        Toast.makeText(context, stateString + " "+incomingNumber, Toast.LENGTH_SHORT).show();
    }
}
