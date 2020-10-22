package com.google.ads.a;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import com.google.ads.bu;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;
import com.google.ads.util.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class h {
    public static final o a = new j();
    public static final Map b = Collections.unmodifiableMap(new k());
    public static final Map c = Collections.unmodifiableMap(new l());
    public static final Map d = Collections.unmodifiableMap(new i());
    private static final h e = new h();

    public String a(Uri uri, HashMap hashMap) {
        if (c(uri)) {
            String host = uri.getHost();
            if (host == null) {
                g.e("An error occurred while parsing the AMSG parameters.");
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
                g.e("An error occurred while parsing the AMSG: " + uri.toString());
                return null;
            }
        } else if (b(uri)) {
            return uri.getPath();
        } else {
            g.e("Message was neither a GMSG nor an AMSG.");
            return null;
        }
    }

    public void a(WebView webView) {
        a(webView, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
    }

    public void a(WebView webView, String str) {
        g.a("Sending JS to a WebView: " + str);
        webView.loadUrl("javascript:" + str);
    }

    public void a(WebView webView, String str, String str2) {
        String str3 = "AFMA_ReceiveMessage";
        if (str2 != null) {
            a(webView, str3 + "('" + str + "', " + str2 + ");");
        } else {
            a(webView, str3 + "('" + str + "');");
        }
    }

    public void a(WebView webView, Map map) {
        a(webView, "openableURLs", new JSONObject(map).toString());
    }

    public void a(w wVar, Map map, Uri uri, WebView webView) {
        HashMap b = AdUtil.b(uri);
        if (b == null) {
            g.e("An error occurred while parsing the message parameters.");
            return;
        }
        String a = a(uri, b);
        if (a == null) {
            g.e("An error occurred while parsing the message.");
            return;
        }
        bu buVar = (bu) map.get(a);
        if (buVar == null) {
            g.e("No AdResponse found, <message: " + a + ">");
        } else {
            buVar.a(wVar, b, webView);
        }
    }

    public boolean a(Uri uri) {
        return (uri == null || !uri.isHierarchical()) ? false : b(uri) || c(uri);
    }

    public void b(WebView webView) {
        a(webView, "onhide", null);
    }

    public boolean b(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals("gmsg")) {
            return false;
        }
        scheme = uri.getAuthority();
        return scheme != null && scheme.equals("mobileads.google.com");
    }

    public boolean c(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("admob");
    }
}
