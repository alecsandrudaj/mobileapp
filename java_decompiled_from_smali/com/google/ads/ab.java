package com.google.ads;

import android.app.Activity;
import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class ab implements o {
    public void a(d dVar, HashMap<String, String> hashMap, WebView webView) {
        if (((Activity) dVar.i().c.a()) == null) {
            b.e("Activity was null while responding to touch gmsg.");
            return;
        }
        String str = (String) hashMap.get("ty");
        String str2 = (String) hashMap.get("td");
        try {
            int parseInt = Integer.parseInt((String) hashMap.get("tx"));
            int parseInt2 = Integer.parseInt(str);
            int parseInt3 = Integer.parseInt(str2);
            ak akVar = (ak) dVar.i().r.a();
            if (akVar != null) {
                akVar.a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException e) {
            b.e("Could not parse touch parameters from gmsg.");
        }
    }
}
