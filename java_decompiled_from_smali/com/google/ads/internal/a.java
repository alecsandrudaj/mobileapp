package com.google.ads.internal;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import com.google.ads.aa;
import com.google.ads.ab;
import com.google.ads.ac;
import com.google.ads.o;
import com.google.ads.p;
import com.google.ads.q;
import com.google.ads.r;
import com.google.ads.s;
import com.google.ads.t;
import com.google.ads.u;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.f;
import com.google.ads.v;
import com.google.ads.w;
import com.google.ads.x;
import com.google.ads.y;
import com.google.ads.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a {
    public static final f<a> a = new f<a>() {
        /* renamed from: a */
        public a b() {
            return a.e;
        }
    };
    public static final Map<String, o> b = Collections.unmodifiableMap(new HashMap<String, o>() {
        {
            put("/invalidRequest", new v());
            put("/loadAdURL", new w());
            put("/loadSdkConstants", new x());
            put("/log", new y());
        }
    });
    public static final Map<String, o> c = Collections.unmodifiableMap(new HashMap<String, o>() {
        {
            put("/log", new y());
            put("/setNativeActivationOverlay", new aa());
        }
    });
    public static final Map<String, o> d = Collections.unmodifiableMap(new HashMap<String, o>() {
        {
            put("/open", new z());
            put("/canOpenURLs", new q());
            put("/close", new s());
            put("/customClose", new t());
            put("/appEvent", new p());
            put("/log", new y());
            put("/click", new r());
            put("/httpTrack", new u());
            put("/touch", new ab());
            put("/video", new ac());
        }
    });
    private static final a e = new a();

    public String a(Uri uri, HashMap<String, String> hashMap) {
        if (c(uri)) {
            String host = uri.getHost();
            if (host == null) {
                b.e("An error occurred while parsing the AMSG parameters.");
                return null;
            } else if (host.equals("launch")) {
                hashMap.put("a", "intent");
                hashMap.put(AdActivity.URL_PARAM, hashMap.get("url"));
                hashMap.remove("url");
                return "/open";
            } else if (host.equals("closecanvas")) {
                return "/close";
            } else {
                if (host.equals("log")) {
                    return "/log";
                }
                b.e("An error occurred while parsing the AMSG: " + uri.toString());
                return null;
            }
        } else if (b(uri)) {
            return uri.getPath();
        } else {
            b.e("Message was neither a GMSG nor an AMSG.");
            return null;
        }
    }

    public void a(d dVar, Map<String, o> map, Uri uri, WebView webView) {
        HashMap b = AdUtil.b(uri);
        if (b == null) {
            b.e("An error occurred while parsing the message parameters.");
            return;
        }
        String a = a(uri, b);
        if (a == null) {
            b.e("An error occurred while parsing the message.");
            return;
        }
        o oVar = (o) map.get(a);
        if (oVar == null) {
            b.e("No AdResponse found, <message: " + a + ">");
        } else {
            oVar.a(dVar, b, webView);
        }
    }

    public boolean a(Uri uri) {
        if (uri == null || !uri.isHierarchical()) {
            return false;
        }
        if (b(uri) || c(uri)) {
            return true;
        }
        return false;
    }

    public boolean b(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals("gmsg")) {
            return false;
        }
        scheme = uri.getAuthority();
        if (scheme == null || !scheme.equals("mobileads.google.com")) {
            return false;
        }
        return true;
    }

    public boolean c(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals("admob")) {
            return false;
        }
        return true;
    }

    public void a(WebView webView, String str, String str2) {
        String str3 = "AFMA_ReceiveMessage";
        if (str2 != null) {
            a(webView, str3 + "('" + str + "', " + str2 + ");");
        } else {
            a(webView, str3 + "('" + str + "');");
        }
    }

    public void a(WebView webView, String str) {
        b.a("Sending JS to a WebView: " + str);
        webView.loadUrl("javascript:" + str);
    }

    public void a(WebView webView, Map<String, Boolean> map) {
        a(webView, "openableURLs", new JSONObject(map).toString());
    }

    public void a(WebView webView) {
        a(webView, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
    }

    public void b(WebView webView) {
        a(webView, "onhide", null);
    }
}
