package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.e;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class bz implements bu {
    public void a(w wVar, HashMap hashMap, WebView webView) {
        if (webView instanceof e) {
            ((e) webView).setCustomClose("1".equals(hashMap.get(AdActivity.CUSTOM_CLOSE_PARAM)));
        } else {
            g.b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
        }
    }
}
