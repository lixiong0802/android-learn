package com.example.lx.android_learn.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/2
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 */
public class FirstService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("-------onCreate-------");
//        Log.i("FirstService","-------onCreate-------");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("-------onDestroy-------");
//        Log.i("FirstService", "-------onDestroy-------");

    }
}
