package com.local.embrace;

import android.app.Application;
import android.util.Log;

import io.embrace.android.embracesdk.Embrace;


public final class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Embrace.getInstance().start(this);

    }
}
