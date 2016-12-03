package com.example.yevgeni.lesson36_blockingoutgoingcalls;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by yevgeni on 20/11/2016.
 */

public class OutGoingCallsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String phoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        if(phoneNumber.contains("123456")){ //searching a subarray in an array so to speak , part of a total number
            setResultData(null);
            Toast.makeText(context, "this call is not allowed", Toast.LENGTH_SHORT).show();
            //now we need a permission
        }
    }
}
