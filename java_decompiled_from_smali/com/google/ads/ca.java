package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class ca implements bu {
    public void a(w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get(AdActivity.URL_PARAM);
        if (TextUtils.isEmpty(str)) {
            g.e("Could not get URL from track gmsg.");
        } else {
            new Thread(new o(str, (Context) wVar.h().f.a())).start();
        }
    }
}
