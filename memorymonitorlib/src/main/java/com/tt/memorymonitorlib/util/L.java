package com.tt.memorymonitorlib.util;

import android.util.Log;

/**
 * Description: <日志打印>
 * Author: hui.zhao
 * Date: 2016/7/13
 * Copyright: Ctrip
 */
public class L {
    private static final String TAG = "Memory";

    private static boolean sIsDebug;

    public static void d(String msg) {
        d(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (sIsDebug) {
            Log.d(tag, msg);
        }
    }

    public static boolean isDebug() {
        return sIsDebug;
    }

    public static void setIsDebug(boolean isDebug) {
        L.sIsDebug = isDebug;
    }
}
