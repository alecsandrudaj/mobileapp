package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.e;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class by implements bu {
    public void a(w wVar, HashMap hashMap, WebView webView) {
        if (webView instanceof e) {
            ((e) webView).f();
        } else {
            g.b("Trying to close WebView that isn't an AdWebView");
        }
    }
}
