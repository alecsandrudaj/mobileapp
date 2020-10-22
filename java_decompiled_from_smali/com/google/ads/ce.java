package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class ce implements bu {
    public void a(w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("afma_notify_dt");
        g.c("Received log message: <\"string\": \"" + ((String) hashMap.get("string")) + "\", \"afmaNotifyDt\": \"" + str + "\">");
    }
}
