package com.example.admin.w4d2broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by admin on 4/19/2016.
 */
public class NetworkReceiver extends BroadcastReceiver {
    private static final String TAG = "NetworkReceiverTAG_";

    public NetworkReceiver() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: ");
    }

}
