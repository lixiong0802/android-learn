package com.example.lx.android_learn.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/2
 * Time: 17:07
 * To change this template use File | Settings | File Templates.
 */
public class BindSerivce extends Service {

    private int count;
    private boolean quit;
    private MyBinder binder = new MyBinder();

    public class MyBinder extends Binder {
        public int getCount() {
            return count;
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("------------onBind------------");
        return binder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("------------onCreate------------");

        new Thread() {
            @Override
            public void run() {

                while (!quit) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
                }
            }
        }.start();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        System.out.println("------------onUnbind------------");
        return true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.quit = true;
        System.out.println("------------onDestroy------------");
    }
}
