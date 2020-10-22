package com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.internal.g;
import com.google.ads.util.b;
import java.util.HashMap;
import java.util.Locale;

public class r implements o {
    public void a(d dVar, HashMap<String, String> hashMap, WebView webView) {
        String str = (String) hashMap.get(AdActivity.URL_PARAM);
        if (str == null) {
            b.e("Could not get URL from click gmsg.");
            return;
        }
        Uri parse;
        Uri a;
        g n = dVar.n();
        if (n != null) {
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
                n.a(host);
            }
        }
        n i = dVar.i();
        Context context = (Context) i.f.a();
        parse = Uri.parse(str);
        try {
            al alVar = (al) i.s.a();
            if (alVar != null && alVar.a(parse)) {
                a = alVar.a(parse, context);
                new Thread(new ae(a.toString(), context)).start();
            }
        } catch (am e) {
            b.e("Unable to append parameter to URL: " + str);
        }
        a = parse;
        new Thread(new ae(a.toString(), context)).start();
    }
}
