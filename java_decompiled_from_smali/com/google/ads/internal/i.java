package com.google.ads.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.o;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g.b;
import java.util.Map;

public class i extends WebViewClient {
    private static final a c = ((a) a.a.b());
    protected d a;
    protected boolean b = false;
    private final Map<String, o> d;
    private final boolean e;
    private boolean f;
    private boolean g;
    private boolean h = false;
    private boolean i = false;

    public i(d dVar, Map<String, o> map, boolean z, boolean z2) {
        this.a = dVar;
        this.d = map;
        this.e = z;
        this.g = z2;
    }

    public static i a(d dVar, Map<String, o> map, boolean z, boolean z2) {
        if (AdUtil.a >= 11) {
            return new b(dVar, map, z, z2);
        }
        return new i(dVar, map, z, z2);
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
        com.google.ads.util.b.a(r0);	 Catch:{ Throwable -> 0x00cf }
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
        r2 = new com.google.ads.internal.e;	 Catch:{ Throwable -> 0x00cf }
        r4 = "intent";
        r2.<init>(r4, r0);	 Catch:{ Throwable -> 0x00cf }
        com.google.ads.AdActivity.launchAdActivity(r1, r2);	 Catch:{ Throwable -> 0x00cf }
        r0 = r3;
        goto L_0x0033;
    L_0x005b:
        r0 = r5.e;	 Catch:{ Throwable -> 0x00cf }
        if (r0 == 0) goto L_0x00b6;
    L_0x005f:
        r0 = r5.a;	 Catch:{ am -> 0x009d }
        r1 = r0.i();	 Catch:{ am -> 0x009d }
        r0 = r1.f;	 Catch:{ am -> 0x009d }
        r0 = r0.a();	 Catch:{ am -> 0x009d }
        r0 = (android.content.Context) r0;	 Catch:{ am -> 0x009d }
        r1 = r1.s;	 Catch:{ am -> 0x009d }
        r1 = r1.a();	 Catch:{ am -> 0x009d }
        r1 = (com.google.ads.al) r1;	 Catch:{ am -> 0x009d }
        if (r1 == 0) goto L_0x00b4;
    L_0x0077:
        r4 = r1.a(r2);	 Catch:{ am -> 0x009d }
        if (r4 == 0) goto L_0x00b4;
    L_0x007d:
        r0 = r1.a(r2, r0);	 Catch:{ am -> 0x009d }
    L_0x0081:
        r1 = new java.util.HashMap;	 Catch:{ Throwable -> 0x00cf }
        r1.<init>();	 Catch:{ Throwable -> 0x00cf }
        r2 = "u";
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00cf }
        r1.put(r2, r0);	 Catch:{ Throwable -> 0x00cf }
        r0 = r5.a;	 Catch:{ Throwable -> 0x00cf }
        r2 = new com.google.ads.internal.e;	 Catch:{ Throwable -> 0x00cf }
        r4 = "intent";
        r2.<init>(r4, r1);	 Catch:{ Throwable -> 0x00cf }
        com.google.ads.AdActivity.launchAdActivity(r0, r2);	 Catch:{ Throwable -> 0x00cf }
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
        com.google.ads.util.b.e(r0);	 Catch:{ Throwable -> 0x00cf }
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
        com.google.ads.util.b.e(r0);	 Catch:{ Throwable -> 0x00cf }
    L_0x00cc:
        r0 = r3;
        goto L_0x0033;
    L_0x00cf:
        r0 = move-exception;
        r1 = "An unknown error occurred in shouldOverrideUrlLoading.";
        com.google.ads.util.b.d(r1, r0);
        goto L_0x00cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.internal.i.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public void onPageStarted(WebView webView, String url, Bitmap favicon) {
        this.f = true;
    }

    public void onPageFinished(WebView view, String url) {
        this.f = false;
        if (this.h) {
            c k = this.a.k();
            if (k != null) {
                k.c();
            } else {
                com.google.ads.util.b.a("adLoader was null while trying to setFinishedLoadingHtml().");
            }
            this.h = false;
        }
        if (this.i) {
            c.a(view);
            this.i = false;
        }
    }

    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        this.f = false;
        c k = this.a.k();
        if (k != null) {
            k.a(ErrorCode.NETWORK_ERROR);
        }
    }

    public void a(boolean z) {
        this.b = z;
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

    public boolean a() {
        return this.f;
    }
}
