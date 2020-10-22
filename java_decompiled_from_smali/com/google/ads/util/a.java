package com.google.ads.util;

import android.text.TextUtils;
import android.util.Log;

public class a {
    private static boolean a = Log.isLoggable("GoogleAdsAssertion", 3);

    public static class a extends Error {
        public a(String str) {
            super(str);
        }
    }

    public static void a(boolean z) {
        c(z, "Assertion failed.");
    }

    public static void a(boolean z, String str) {
        c(z, str);
    }

    public static void b(boolean z) {
        c(!z, "Assertion failed.");
    }

    public static void b(boolean z, String str) {
        c(!z, str);
    }

    public static void a(Object obj) {
        c(obj == null, "Assertion that an object is null failed.");
    }

    public static void b(Object obj) {
        c(obj != null, "Assertion that an object is not null failed.");
    }

    public static void a(Object obj, Object obj2) {
        c(obj == obj2, "Assertion that 'a' and 'b' refer to the same object failed.a: " + obj + ", b: " + obj2);
    }

    public static void a(String str) {
        c(!TextUtils.isEmpty(str), "Expected a non empty string, got: " + str);
    }

    private static void c(boolean z, String str) {
        if ((Log.isLoggable("GoogleAdsAssertion", 3) || a) && !z) {
            a aVar = new a(str);
            Log.d("GoogleAdsAssertion", str, aVar);
            throw aVar;
        }
    }
}
