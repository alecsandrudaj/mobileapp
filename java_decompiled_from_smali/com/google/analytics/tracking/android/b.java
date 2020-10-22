package com.google.analytics.tracking.android;

public class b {
    private static a a;

    private static c a() {
        if (a == null) {
            a = a.a();
        }
        return a != null ? a.b() : null;
    }

    public static void a(String str) {
        c a = a();
        if (a != null) {
            a.a(str);
        }
    }
}
