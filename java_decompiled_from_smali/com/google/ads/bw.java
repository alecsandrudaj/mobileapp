package com.google.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.a.h;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;
import java.util.Map;

public class bw implements bu {
    private static final h a = ((h) h.a.b());

    public void a(w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("urls");
        if (str == null) {
            g.e("Could not get the urls param from canOpenURLs gmsg.");
            return;
        }
        String[] split = str.split(",");
        Map hashMap2 = new HashMap();
        PackageManager packageManager = webView.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            hashMap2.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length >= 2 ? split2[1] : "android.intent.action.VIEW", Uri.parse(split2[0])), 65536) != null));
        }
        a.a(webView, hashMap2);
    }
}
