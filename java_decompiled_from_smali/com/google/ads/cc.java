package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.n;
import com.google.ads.a.u;
import com.google.ads.a.w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

public class cc implements bu {
    public void a(w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("url");
        String str2 = (String) hashMap.get("type");
        String str3 = (String) hashMap.get("afma_notify_dt");
        String str4 = (String) hashMap.get("activation_overlay_url");
        String str5 = (String) hashMap.get("check_packages");
        boolean equals = "1".equals(hashMap.get("drt_include"));
        String str6 = (String) hashMap.get("request_scenario");
        boolean equals2 = "1".equals(hashMap.get("use_webview_loadurl"));
        u uVar = u.OFFLINE_EMPTY.e.equals(str6) ? u.OFFLINE_EMPTY : u.OFFLINE_USING_BUFFERED_ADS.e.equals(str6) ? u.OFFLINE_USING_BUFFERED_ADS : u.ONLINE_USING_BUFFERED_ADS.e.equals(str6) ? u.ONLINE_USING_BUFFERED_ADS : u.ONLINE_SERVER_REQUEST;
        g.c("Received ad url: <url: \"" + str + "\" type: \"" + str2 + "\" afmaNotifyDt: \"" + str3 + "\" activationOverlayUrl: \"" + str4 + "\" useWebViewLoadUrl: \"" + equals2 + "\">");
        if (!(TextUtils.isEmpty(str5) || TextUtils.isEmpty(str))) {
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str5.split(",");
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (AdUtil.a((Context) wVar.h().c.a(), split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            str2 = String.format(Locale.US, "%X", new Object[]{bigInteger2});
            str = str.replaceAll("%40installed_markets%40", str2);
            br.a().a.a(str2);
            g.c("Ad url modified to " + str);
        }
        n j = wVar.j();
        if (j != null) {
            j.d(equals);
            j.a(uVar);
            j.e(equals2);
            j.e(str4);
            j.d(str);
        }
    }
}
