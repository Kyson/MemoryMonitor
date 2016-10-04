package com.tt.memorymonitorsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tt.memorymonitorlib.FloatCurveView;
import com.tt.memorymonitorlib.MemoryMonitor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MemoryMonitor.getInstance().start(FloatCurveView.MEMORY_TYPE_PSS);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MemoryMonitor.getInstance().stop();
    }
}
