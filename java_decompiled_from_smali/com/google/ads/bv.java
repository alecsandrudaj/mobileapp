package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class bv implements bu {
    public void a(w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("name");
        if (str == null) {
            g.b("Error: App event with no name parameter.");
        } else {
            wVar.a(str, (String) hashMap.get("info"));
        }
    }
}
