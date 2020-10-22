package org.andengine.d.i;

import android.os.Build.VERSION;

public class a {
    public static final boolean a = (VERSION.SDK_INT >= 5);
    public static final boolean b = (VERSION.SDK_INT >= 8);
    public static final boolean c = (VERSION.SDK_INT >= 9);
    public static final boolean d = (VERSION.SDK_INT >= 11);
    public static final boolean e;

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 14) {
            z = false;
        }
        e = z;
    }

    public static boolean a(int i) {
        return VERSION.SDK_INT <= i;
    }

    public static boolean a(int i, int i2) {
        return VERSION.SDK_INT >= i && VERSION.SDK_INT <= i2;
    }
}
