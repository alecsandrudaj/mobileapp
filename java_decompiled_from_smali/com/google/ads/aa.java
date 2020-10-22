package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class aa implements o {
    public void a(d dVar, HashMap<String, String> hashMap, WebView webView) {
        int i = -1;
        if (webView instanceof ActivationOverlay) {
            try {
                int i2;
                int i3;
                int i4;
                if (TextUtils.isEmpty((CharSequence) hashMap.get("w"))) {
                    i2 = -1;
                } else {
                    i2 = Integer.parseInt((String) hashMap.get("w"));
                }
                if (TextUtils.isEmpty((CharSequence) hashMap.get("h"))) {
                    i3 = -1;
                } else {
                    i3 = Integer.parseInt((String) hashMap.get("h"));
                }
                if (TextUtils.isEmpty((CharSequence) hashMap.get("x"))) {
                    i4 = -1;
                } else {
                    i4 = Integer.parseInt((String) hashMap.get("x"));
                }
                if (!TextUtils.isEmpty((CharSequence) hashMap.get("y"))) {
                    i = Integer.parseInt((String) hashMap.get("y"));
                }
                if (hashMap.get("a") != null && ((String) hashMap.get("a")).equals("1")) {
                    dVar.a(null, true, i4, i, i2, i3);
                    return;
                } else if (hashMap.get("a") == null || !((String) hashMap.get("a")).equals("0")) {
                    dVar.a(i4, i, i2, i3);
                    return;
                } else {
                    dVar.a(null, false, i4, i, i2, i3);
                    return;
                }
            } catch (NumberFormatException e) {
                b.d("Invalid number format in activation overlay response.", e);
                return;
            }
        }
        b.b("Trying to activate an overlay when this is not an overlay.");
    }
}
