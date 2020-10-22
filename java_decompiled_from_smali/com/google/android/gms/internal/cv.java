package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class cv implements ServiceConnection {
    final /* synthetic */ cr a;

    cv(cr crVar) {
        this.a = crVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.c(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.a.g = null;
        this.a.l();
    }
}
