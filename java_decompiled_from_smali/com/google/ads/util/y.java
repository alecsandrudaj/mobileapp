package com.google.ads.util;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.ads.a.ad;
import com.google.ads.a.n;
import com.google.ads.a.w;
import com.google.ads.br;
import com.google.ads.bs;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class y extends ad {
    public y(w wVar, Map map, boolean z, boolean z2) {
        super(wVar, map, z, z2);
    }

    private static WebResourceResponse a(String str, Context context) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            AdUtil.a(httpURLConnection, context.getApplicationContext());
            httpURLConnection.connect();
            String str2 = "UTF-8";
            WebResourceResponse webResourceResponse = new WebResourceResponse("application/javascript", str2, new ByteArrayInputStream(AdUtil.a(new InputStreamReader(httpURLConnection.getInputStream())).getBytes(str2)));
            return webResourceResponse;
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if ("mraid.js".equalsIgnoreCase(new File(str).getName())) {
                n j = this.a.j();
                if (j != null) {
                    j.c(true);
                } else {
                    this.a.a(true);
                }
                bs bsVar = (bs) ((br) this.a.h().d.a()).b.a();
                String str2;
                if (this.a.h().b()) {
                    str2 = (String) bsVar.g.a();
                    g.a("shouldInterceptRequest(" + str2 + ")");
                    return a(str2, webView.getContext());
                } else if (this.b) {
                    str2 = (String) bsVar.f.a();
                    g.a("shouldInterceptRequest(" + str2 + ")");
                    return a(str2, webView.getContext());
                } else {
                    str2 = (String) bsVar.e.a();
                    g.a("shouldInterceptRequest(" + str2 + ")");
                    return a(str2, webView.getContext());
                }
            }
        } catch (IOException e) {
            g.d("IOException fetching MRAID JS.", e);
        } catch (Throwable th) {
            g.d("An unknown error occurred fetching MRAID JS.", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
