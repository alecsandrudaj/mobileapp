package com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.a.ab;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;
import java.util.Locale;

public class bx implements bu {
    public void a(w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get(AdActivity.URL_PARAM);
        if (str == null) {
            g.e("Could not get URL from click gmsg.");
            return;
        }
        Uri parse;
        Uri a;
        ab m = wVar.m();
        if (m != null) {
            parse = Uri.parse(str);
            String host = parse.getHost();
            if (host != null && host.toLowerCase(Locale.US).endsWith(".admob.com")) {
                host = null;
                String path = parse.getPath();
                if (path != null) {
                    String[] split = path.split("/");
                    if (split.length >= 4) {
                        host = split[2] + "/" + split[3];
                    }
                }
                m.a(host);
            }
        }
        bt h = wVar.h();
        Context context = (Context) h.f.a();
        parse = Uri.parse(str);
        try {
            ak akVar = (ak) h.s.a();
            if (akVar != null && akVar.a(parse)) {
                a = akVar.a(parse, context);
                new Thread(new o(a.toString(), context)).start();
            }
        } catch (al e) {
            g.e("Unable to append parameter to URL: " + str);
        }
        a = parse;
        new Thread(new o(a.toString(), context)).start();
    }
}
