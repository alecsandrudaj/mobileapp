package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class j implements SafeParcelable {
    private static final Object a = new Object();
    private static ClassLoader b = null;
    private static Integer c = null;
    private boolean d = false;

    private static boolean a(Class cls) {
        boolean z = false;
        try {
            return SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return z;
        }
    }

    protected static boolean b(String str) {
        ClassLoader t = t();
        if (t == null) {
            return true;
        }
        try {
            return a(t.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    protected static ClassLoader t() {
        ClassLoader classLoader;
        synchronized (a) {
            classLoader = b;
        }
        return classLoader;
    }

    protected static Integer u() {
        Integer num;
        synchronized (a) {
            num = c;
        }
        return num;
    }

    /* Access modifiers changed, original: protected */
    public boolean v() {
        return this.d;
    }
}
