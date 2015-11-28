package com.example.lx.android_learn.util;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


/**
 * Created by IntelliJ IDEA.
 * User: LX
 * Date: 2015/11/28
 * Time: 14:09
 * To change this template use File | Settings | File Templates.
 */
public class ConnectivityManagerUtil {

    /***
     * 判断是否联网
     *
     * @param activity
     * @return
     */

    public static boolean isNewWorkConnected(Context activity) {

        ConnectivityManager connMgr = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }

        return false;
    }


}
