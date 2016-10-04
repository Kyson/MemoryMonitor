package com.tt.memorymonitorsample;

import android.app.Application;

import com.tt.memorymonitorlib.MemoryMonitor;

/**
 * Created by Kyson on 2016/10/4.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MemoryMonitor.getInstance().init(this);
    }
}
