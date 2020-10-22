package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.n;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class cb implements bu {
    public void a(w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("errors");
        g.e("Invalid " + ((String) hashMap.get("type")) + " request error: " + str);
        n j = wVar.j();
        if (j != null) {
            j.a(e.a);
        }
    }
}
