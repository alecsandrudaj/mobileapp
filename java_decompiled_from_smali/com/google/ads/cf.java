package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.a.x;
import com.google.ads.util.g;
import java.util.HashMap;

public class cf implements bu {
    private b a;

    public cf() {
        this(new b());
    }

    public cf(b bVar) {
        this.a = bVar;
    }

    public void a(w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("a");
        if (str == null) {
            g.a("Could not get the action parameter for open GMSG.");
        } else if (str.equals("webapp")) {
            this.a.a(wVar, new x("webapp", hashMap));
        } else if (str.equals("expand")) {
            this.a.a(wVar, new x("expand", hashMap));
        } else {
            this.a.a(wVar, new x("intent", hashMap));
        }
    }
}
