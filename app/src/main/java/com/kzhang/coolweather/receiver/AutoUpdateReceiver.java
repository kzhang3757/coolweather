package com.kzhang.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.kzhang.coolweather.service.AutoUpdataService;

/**
 * Created by ZK on 2016/3/23.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdataService.class);
        context.startService(i);
    }
}
