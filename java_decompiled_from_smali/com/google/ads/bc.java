package com.google.ads;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class bc {
    private ba a = null;
    private long b = -1;

    public void a(ba baVar, int i) {
        this.a = baVar;
        this.b = TimeUnit.MILLISECONDS.convert((long) i, TimeUnit.SECONDS) + SystemClock.elapsedRealtime();
    }

    public boolean a() {
        return this.a != null && SystemClock.elapsedRealtime() < this.b;
    }

    public ba b() {
        return this.a;
    }
}
