package com.example.lx.android_learn.util;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;

/**
 * Created by IntelliJ IDEA.
 * User: LX
 * Date: 2015/11/28
 * Time: 14:30
 * To change this template use File | Settings | File Templates.
 */
public class LocationManagerUtil {

    private boolean isConnectEnable(Context activity, String context) {

        LocationManager locationManager = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);

        boolean networkEnable = locationManager.isProviderEnabled(context);

        return networkEnable;

    }

    public boolean isGpsEnable(Context activity) {

        return isConnectEnable(activity, LocationManager.GPS_PROVIDER);
    }

    public boolean isNetWorkEnable(Context activity) {

        return isConnectEnable(activity, LocationManager.NETWORK_PROVIDER);
    }


}
