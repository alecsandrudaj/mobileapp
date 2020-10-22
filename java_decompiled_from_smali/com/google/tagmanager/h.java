package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

class h {
    static Map a = new HashMap();
    private static String b;

    h() {
    }

    static String a(String str, String str2) {
        return str2 == null ? str.length() > 0 ? str : null : Uri.parse("http://hostname/?" + str).getQueryParameter(str2);
    }

    static void a(Context context, String str) {
        p.a(context, "gtm_install_referrer", "referrer", str);
        b(context, str);
    }

    static void a(String str) {
        synchronized (h.class) {
            b = str;
        }
    }

    static void b(Context context, String str) {
        String a = a(str, "conv");
        if (a != null && a.length() > 0) {
            a.put(a, str);
            p.a(context, "gtm_click_referrers", a, str);
        }
    }
}
