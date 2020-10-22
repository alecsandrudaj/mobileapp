package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class u implements o {
    public void a(d dVar, HashMap<String, String> hashMap, WebView webView) {
        String str = (String) hashMap.get(AdActivity.URL_PARAM);
        if (TextUtils.isEmpty(str)) {
            b.e("Could not get URL from track gmsg.");
        } else {
            new Thread(new ae(str, (Context) dVar.i().f.a())).start();
        }
    }
}
