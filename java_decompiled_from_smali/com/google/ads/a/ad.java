package com.google.ads.a;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.e;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;
import com.google.ads.util.y;
import java.util.Map;

public class ad extends WebViewClient {
    private static final h c = ((h) h.a.b());
    protected w a;
    protected boolean b = false;
    private final Map d;
    private final boolean e;
    private boolean f;
    private boolean g;
    private boolean h = false;
    private boolean i = false;

    public ad(w wVar, Map map, boolean z, boolean z2) {
        this.a = wVar;
        this.d = map;
        this.e = z;
        this.g = z2;
    }

    public static ad a(w wVar, Map map, boolean z, boolean z2) {
        return AdUtil.a >= 11 ? new y(wVar, map, z, z2) : new ad(wVar, map, z, z2);
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean a() {
        return this.f;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.h = z;
    }

    public void d(boolean z) {
        this.i = z;
    }

    public void onPageFinished(WebView webView, String str) {
        this.f = false;
        if (this.h) {
            n j = this.a.j();
            if (j != null) {
                j.b();
            } else {
                g.a("adLoader was null while trying to setFinishedLoadingHtml().");
            }
            this.h = false;
        }
        if (this.i) {
            c.a(webView);
            this.i = false;
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f = true;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f = false;
        n j = this.a.j();
        if (j != null) {
            j.a(e.c);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
        /*
        r5 = this;
        r3 = 1;
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00cf }
        r0.<init>();	 Catch:{ Throwable -> 0x00cf }
        r1 = "shouldOverrideUrlLoading(\"";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x00cf }
        r0 = r0.append(r7);	 Catch:{ Throwable -> 0x00cf }
        r1 = "\")";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x00cf }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00cf }
        com.google.ads.util.g.a(r0);	 Catch:{ Throwable -> 0x00cf }
        r2 = android.net.Uri.parse(r7);	 Catch:{ Throwable -> 0x00cf }
        r0 = c;	 Catch:{ Throwable -> 0x00cf }
        r0 = r0.a(r2);	 Catch:{ Throwable -> 0x00cf }
        if (r0 == 0) goto L_0x0034;
    L_0x0029:
        r0 = c;	 Catch:{ Throwable -> 0x00cf }
        r1 = r5.a;	 Catch:{ Throwable -> 0x00cf }
        r4 = r5.d;	 Catch:{ Throwable -> 0x00cf }
        r0.a(r1, r4, r2, r6);	 Catch:{ Throwable -> 0x00cf }
        r0 = r3;
    L_0x0033:
        return r0;
    L_0x0034:
        r0 = r5.g;	 Catch:{ Throwable -> 0x00cf }
        if (r0 == 0) goto L_0x005b;
    L_0x0038:
        r0 = com.google.ads.util.AdUtil.a(r2);	 Catch:{ Throwable -> 0x00cf }
        if (r0 == 0) goto L_0x0043;
    L_0x003e:
        r0 = super.shouldOverrideUrlLoading(r6, r7);	 Catch:{ Throwable -> 0x00cf }
        goto L_0x0033;
    L_0x0043:
        r0 = new java.util.HashMap;	 Catch:{ Throwable -> 0x00cf }
        r0.<init>();	 Catch:{ Throwable -> 0x00cf }
        r1 = "u";
        r0.put(r1, r7);	 Catch:{ Throwable -> 0x00cf }
        r1 = r5.a;	 Catch:{ Throwable -> 0x00cf }
        r2 = new com.google.ads.a.x;	 Catch:{ Throwable -> 0x00cf }
        r4 = "intent";
        r2.<init>(r4, r0);	 Catch:{ Throwable -> 0x00cf }
        com.google.ads.AdActivity.a(r1, r2);	 Catch:{ Throwable -> 0x00cf }
        r0 = r3;
        goto L_0x0033;
    L_0x005b:
        r0 = r5.e;	 Catch:{ Throwable -> 0x00cf }
        if (r0 == 0) goto L_0x00b6;
    L_0x005f:
        r0 = r5.a;	 Catch:{ al -> 0x009d }
        r1 = r0.h();	 Catch:{ al -> 0x009d }
        r0 = r1.f;	 Catch:{ al -> 0x009d }
        r0 = r0.a();	 Catch:{ al -> 0x009d }
        r0 = (android.content.Context) r0;	 Catch:{ al -> 0x009d }
        r1 = r1.s;	 Catch:{ al -> 0x009d }
        r1 = r1.a();	 Catch:{ al -> 0x009d }
        r1 = (com.google.ads.ak) r1;	 Catch:{ al -> 0x009d }
        if (r1 == 0) goto L_0x00b4;
    L_0x0077:
        r4 = r1.a(r2);	 Catch:{ al -> 0x009d }
        if (r4 == 0) goto L_0x00b4;
    L_0x007d:
        r0 = r1.a(r2, r0);	 Catch:{ al -> 0x009d }
    L_0x0081:
        r1 = new java.util.HashMap;	 Catch:{ Throwable -> 0x00cf }
        r1.<init>();	 Catch:{ Throwable -> 0x00cf }
        r2 = "u";
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00cf }
        r1.put(r2, r0);	 Catch:{ Throwable -> 0x00cf }
        r0 = r5.a;	 Catch:{ Throwable -> 0x00cf }
        r2 = new com.google.ads.a.x;	 Catch:{ Throwable -> 0x00cf }
        r4 = "intent";
        r2.<init>(r4, r1);	 Catch:{ Throwable -> 0x00cf }
        com.google.ads.AdActivity.a(r0, r2);	 Catch:{ Throwable -> 0x00cf }
        r0 = r3;
        goto L_0x0033;
    L_0x009d:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00cf }
        r0.<init>();	 Catch:{ Throwable -> 0x00cf }
        r1 = "Unable to append parameter to URL: ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x00cf }
        r0 = r0.append(r7);	 Catch:{ Throwable -> 0x00cf }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00cf }
        com.google.ads.util.g.e(r0);	 Catch:{ Throwable -> 0x00cf }
    L_0x00b4:
        r0 = r2;
        goto L_0x0081;
    L_0x00b6:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00cf }
        r0.<init>();	 Catch:{ Throwable -> 0x00cf }
        r1 = "URL is not a GMSG and can't handle URL: ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x00cf }
        r0 = r0.append(r7);	 Catch:{ Throwable -> 0x00cf }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00cf }
        com.google.ads.util.g.e(r0);	 Catch:{ Throwable -> 0x00cf }
    L_0x00cc:
        r0 = r3;
        goto L_0x0033;
    L_0x00cf:
        r0 = move-exception;
        r1 = "An unknown error occurred in shouldOverrideUrlLoading.";
        com.google.ads.util.g.d(r1, r0);
        goto L_0x00cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.a.ad.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
