package com.google.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.google.ads.ak;
import com.google.ads.al;
import com.google.ads.l;
import com.google.ads.m;
import com.google.ads.n;
import com.google.ads.searchads.SearchAdRequest;
import com.google.ads.util.AdUtil;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

public class c implements Runnable {
    boolean a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private f g;
    private AdRequest h;
    private WebView i;
    private l j;
    private String k;
    private String l;
    private LinkedList<String> m;
    private String n;
    private AdSize o;
    private boolean p = false;
    private volatile boolean q;
    private boolean r;
    private ErrorCode s;
    private boolean t;
    private int u;
    private Thread v;
    private boolean w;
    private d x = d.ONLINE_SERVER_REQUEST;

    /* renamed from: com.google.ads.internal.c$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[d.values().length];

        static {
            try {
                a[d.ONLINE_SERVER_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[d.ONLINE_USING_BUFFERED_ADS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[d.OFFLINE_USING_BUFFERED_ADS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[d.OFFLINE_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    private static class a implements Runnable {
        private final d a;
        private final WebView b;
        private final f c;
        private final ErrorCode d;
        private final boolean e;

        public a(d dVar, WebView webView, f fVar, ErrorCode errorCode, boolean z) {
            this.a = dVar;
            this.b = webView;
            this.c = fVar;
            this.d = errorCode;
            this.e = z;
        }

        public void run() {
            if (this.b != null) {
                this.b.stopLoading();
                this.b.destroy();
            }
            if (this.c != null) {
                this.c.a();
            }
            if (this.e) {
                this.a.l().stopLoading();
                if (this.a.i().i.a() != null) {
                    ((ViewGroup) this.a.i().i.a()).setVisibility(8);
                }
            }
            this.a.a(this.d);
        }
    }

    private class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    private class c implements Runnable {
        private final String b;
        private final String c;
        private final WebView d;

        public c(WebView webView, String str, String str2) {
            this.d = webView;
            this.b = str;
            this.c = str2;
        }

        public void run() {
            c.this.j.c.a(Boolean.valueOf(c.this.p));
            ((d) ((n) c.this.j.a.a()).b.a()).l().a(c.this.p);
            if (((n) c.this.j.a.a()).e.a() != null) {
                ((ActivationOverlay) ((n) c.this.j.a.a()).e.a()).setOverlayEnabled(!c.this.p);
            }
            if (this.c != null) {
                this.d.loadDataWithBaseURL(this.b, this.c, "text/html", "utf-8", null);
            } else {
                this.d.loadUrl(this.b);
            }
        }
    }

    public enum d {
        ONLINE_USING_BUFFERED_ADS("online_buffered"),
        ONLINE_SERVER_REQUEST("online_request"),
        OFFLINE_USING_BUFFERED_ADS("offline_buffered"),
        OFFLINE_EMPTY("offline_empty");
        
        public String e;

        private d(String str) {
            this.e = str;
        }
    }

    private class e implements Runnable {
        private final d b;
        private final WebView c;
        private final LinkedList<String> d;
        private final int e;
        private final boolean f;
        private final String g;
        private final AdSize h;

        public e(d dVar, WebView webView, LinkedList<String> linkedList, int i, boolean z, String str, AdSize adSize) {
            this.b = dVar;
            this.c = webView;
            this.d = linkedList;
            this.e = i;
            this.f = z;
            this.g = str;
            this.h = adSize;
        }

        public void run() {
            if (this.c != null) {
                this.c.stopLoading();
                this.c.destroy();
            }
            this.b.a(this.d);
            this.b.a(this.e);
            this.b.a(this.f);
            this.b.a(this.g);
            if (this.h != null) {
                ((h) ((n) c.this.j.a.a()).g.a()).b(this.h);
                this.b.l().setAdSize(this.h);
            }
            this.b.E();
        }
    }

    public synchronized void a(boolean z) {
        this.p = z;
    }

    protected c() {
    }

    public c(l lVar) {
        this.j = lVar;
        this.k = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = new LinkedList();
        this.s = null;
        this.t = false;
        this.u = -1;
        this.f = false;
        this.r = false;
        this.n = null;
        this.o = null;
        if (((Activity) ((n) lVar.a.a()).c.a()) != null) {
            this.i = new AdWebView((n) lVar.a.a(), null);
            this.i.setWebViewClient(i.a((d) ((n) lVar.a.a()).b.a(), a.b, false, false));
            this.i.setVisibility(8);
            this.i.setWillNotDraw(true);
            this.g = new f(lVar);
            return;
        }
        this.i = null;
        this.g = null;
        com.google.ads.util.b.e("activity was null while trying to create an AdLoader.");
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void a(String str) {
        this.m.add(str);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        com.google.ads.util.b.a("AdLoader cancelled.");
        if (this.i != null) {
            this.i.stopLoading();
            this.i.destroy();
        }
        if (this.v != null) {
            this.v.interrupt();
            this.v = null;
        }
        if (this.g != null) {
            this.g.a();
        }
        this.q = true;
    }

    /* Access modifiers changed, original: protected */
    public void a(AdRequest adRequest) {
        this.h = adRequest;
        this.q = false;
        this.v = new Thread(this);
        this.v.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f2 A:{SYNTHETIC, Splitter:B:146:0x02f2} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e9 A:{Catch:{ Throwable -> 0x0115 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e9 A:{Catch:{ Throwable -> 0x0115 }} */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f2 A:{SYNTHETIC, Splitter:B:146:0x02f2} */
    public void run() {
        /*
        r12 = this;
        r3 = 0;
        r10 = 0;
        monitor-enter(r12);
        r0 = r12.i;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r0 = r12.g;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x0019;
    L_0x000c:
        r0 = "adRequestWebView was null while trying to load an ad.";
        com.google.ads.util.b.e(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
    L_0x0018:
        return;
    L_0x0019:
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.c;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (android.app.Activity) r0;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x003d;
    L_0x002d:
        r0 = "activity was null while forming an ad request.";
        com.google.ads.util.b.e(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r1 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.n) r1;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.b;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.internal.d) r1;	 Catch:{ Throwable -> 0x0115 }
        r4 = r1.p();	 Catch:{ Throwable -> 0x0115 }
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x0115 }
        r2 = r12.h;	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.n) r1;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.f;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (android.content.Context) r1;	 Catch:{ Throwable -> 0x0115 }
        r8 = r2.getRequestMap(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = "extras";
        r1 = r8.get(r1);	 Catch:{ Throwable -> 0x0115 }
        r2 = r1 instanceof java.util.Map;	 Catch:{ Throwable -> 0x0115 }
        if (r2 == 0) goto L_0x00e1;
    L_0x0079:
        r1 = (java.util.Map) r1;	 Catch:{ Throwable -> 0x0115 }
        r2 = "_adUrl";
        r2 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r9 = r2 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x0089;
    L_0x0085:
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x0115 }
        r12.b = r2;	 Catch:{ Throwable -> 0x0115 }
    L_0x0089:
        r2 = "_requestUrl";
        r2 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r9 = r2 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x0097;
    L_0x0093:
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x0115 }
        r12.k = r2;	 Catch:{ Throwable -> 0x0115 }
    L_0x0097:
        r2 = "_activationOverlayUrl";
        r2 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r9 = r2 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x00a5;
    L_0x00a1:
        r2 = (java.lang.String) r2;	 Catch:{ Throwable -> 0x0115 }
        r12.l = r2;	 Catch:{ Throwable -> 0x0115 }
    L_0x00a5:
        r2 = "_orientation";
        r2 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r9 = r2 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x00ba;
    L_0x00af:
        r9 = "p";
        r9 = r2.equals(r9);	 Catch:{ Throwable -> 0x0115 }
        if (r9 == 0) goto L_0x0109;
    L_0x00b7:
        r2 = 1;
        r12.u = r2;	 Catch:{ Throwable -> 0x0115 }
    L_0x00ba:
        r2 = "_norefresh";
        r1 = r1.get(r2);	 Catch:{ Throwable -> 0x0115 }
        r2 = r1 instanceof java.lang.String;	 Catch:{ Throwable -> 0x0115 }
        if (r2 == 0) goto L_0x00e1;
    L_0x00c4:
        r2 = "t";
        r1 = r1.equals(r2);	 Catch:{ Throwable -> 0x0115 }
        if (r1 == 0) goto L_0x00e1;
    L_0x00cc:
        r1 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.n) r1;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.b;	 Catch:{ Throwable -> 0x0115 }
        r1 = r1.a();	 Catch:{ Throwable -> 0x0115 }
        r1 = (com.google.ads.internal.d) r1;	 Catch:{ Throwable -> 0x0115 }
        r1.e();	 Catch:{ Throwable -> 0x0115 }
    L_0x00e1:
        r1 = r12.b;	 Catch:{ Throwable -> 0x0115 }
        if (r1 != 0) goto L_0x030e;
    L_0x00e5:
        r1 = r12.k;	 Catch:{ Throwable -> 0x0115 }
        if (r1 != 0) goto L_0x01c2;
    L_0x00e9:
        r0 = r12.a(r8, r0);	 Catch:{ b -> 0x0124 }
        r1 = r12.f();	 Catch:{ Throwable -> 0x0115 }
        r12.b(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x0115 }
        r0 = r0 - r6;
        r0 = r4 - r0;
        r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x0102;
    L_0x00ff:
        r12.wait(r0);	 Catch:{ InterruptedException -> 0x0144 }
    L_0x0102:
        r0 = r12.q;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x015e;
    L_0x0106:
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0109:
        r9 = "l";
        r2 = r2.equals(r9);	 Catch:{ Throwable -> 0x0115 }
        if (r2 == 0) goto L_0x00ba;
    L_0x0111:
        r2 = 0;
        r12.u = r2;	 Catch:{ Throwable -> 0x0115 }
        goto L_0x00ba;
    L_0x0115:
        r0 = move-exception;
        r1 = "An unknown error occurred in AdLoader.";
        com.google.ads.util.b.b(r1, r0);	 Catch:{ all -> 0x003a }
        r0 = com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;	 Catch:{ all -> 0x003a }
        r1 = 1;
        r12.a(r0, r1);	 Catch:{ all -> 0x003a }
    L_0x0121:
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0124:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r2 = "Caught internal exception: ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0115 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0144:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r2 = "AdLoader InterruptedException while getting the URL: ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0115 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.a(r0);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x015e:
        r0 = r12.s;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x016b;
    L_0x0162:
        r0 = r12.s;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x016b:
        r0 = r12.k;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x0194;
    L_0x016f:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "AdLoader timed out after ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x0115 }
        r1 = "ms while getting the URL.";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0194:
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.g;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.internal.h) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.b();	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x01c2;
    L_0x01ac:
        r0 = r12.l;	 Catch:{ Throwable -> 0x0115 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x01c2;
    L_0x01b4:
        r0 = "AdLoader doesn't have a URL for the activation overlay";
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x01c2:
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.b;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.internal.d) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.n();	 Catch:{ Throwable -> 0x0115 }
        r1 = com.google.ads.internal.c.AnonymousClass3.a;	 Catch:{ Throwable -> 0x0115 }
        r2 = r12.x;	 Catch:{ Throwable -> 0x0115 }
        r2 = r2.ordinal();	 Catch:{ Throwable -> 0x0115 }
        r1 = r1[r2];	 Catch:{ Throwable -> 0x0115 }
        switch(r1) {
            case 1: goto L_0x0278;
            case 2: goto L_0x0288;
            case 3: goto L_0x0292;
            case 4: goto L_0x029f;
            default: goto L_0x01e5;
        };	 Catch:{ Throwable -> 0x0115 }
    L_0x01e5:
        r0 = r12.a;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x02f2;
    L_0x01e9:
        r0 = "Not using loadUrl().";
        com.google.ads.util.b.a(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r12.g;	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.w;	 Catch:{ Throwable -> 0x0115 }
        r0.a(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.g;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.internal.h) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.b();	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0479;
    L_0x020d:
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.e;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.internal.ActivationOverlay) r0;	 Catch:{ Throwable -> 0x0115 }
        r3 = r0.e();	 Catch:{ Throwable -> 0x0115 }
        r0 = 1;
        r3.c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.m.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.c;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (android.os.Handler) r0;	 Catch:{ Throwable -> 0x0115 }
        r1 = new com.google.ads.internal.c$1;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r0.post(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r3;
    L_0x023c:
        r1 = r12.g;	 Catch:{ Throwable -> 0x0115 }
        r2 = r12.k;	 Catch:{ Throwable -> 0x0115 }
        r1.a(r2);	 Catch:{ Throwable -> 0x0115 }
    L_0x0243:
        r1 = r12.q;	 Catch:{ InterruptedException -> 0x025e }
        if (r1 != 0) goto L_0x02b5;
    L_0x0247:
        r1 = r12.s;	 Catch:{ InterruptedException -> 0x025e }
        if (r1 != 0) goto L_0x02b5;
    L_0x024b:
        r1 = r12.c;	 Catch:{ InterruptedException -> 0x025e }
        if (r1 != 0) goto L_0x02b5;
    L_0x024f:
        r1 = android.os.SystemClock.elapsedRealtime();	 Catch:{ InterruptedException -> 0x025e }
        r1 = r1 - r6;
        r1 = r4 - r1;
        r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x02b5;
    L_0x025a:
        r12.wait(r1);	 Catch:{ InterruptedException -> 0x025e }
        goto L_0x0243;
    L_0x025e:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r2 = "AdLoader InterruptedException while getting the ad server's response: ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0115 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.a(r0);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0278:
        r0.r();	 Catch:{ Throwable -> 0x0115 }
        r0.u();	 Catch:{ Throwable -> 0x0115 }
        r0.x();	 Catch:{ Throwable -> 0x0115 }
        r0 = "Request scenario: Online server request.";
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        goto L_0x01e5;
    L_0x0288:
        r0.t();	 Catch:{ Throwable -> 0x0115 }
        r0 = "Request scenario: Online using buffered ads.";
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        goto L_0x01e5;
    L_0x0292:
        r0.w();	 Catch:{ Throwable -> 0x0115 }
        r0.q();	 Catch:{ Throwable -> 0x0115 }
        r0 = "Request scenario: Offline using buffered ads.";
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        goto L_0x01e5;
    L_0x029f:
        r0.q();	 Catch:{ Throwable -> 0x0115 }
        r0 = "Request scenario: Offline with no buffered ads.";
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = "Network is unavailable.  Aborting ad request.";
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x02b5:
        r1 = r12.q;	 Catch:{ Throwable -> 0x0115 }
        if (r1 == 0) goto L_0x02bc;
    L_0x02b9:
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x02bc:
        r1 = r12.s;	 Catch:{ Throwable -> 0x0115 }
        if (r1 == 0) goto L_0x02c9;
    L_0x02c0:
        r0 = r12.s;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x02c9:
        r1 = r12.c;	 Catch:{ Throwable -> 0x0115 }
        if (r1 != 0) goto L_0x0476;
    L_0x02cd:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "AdLoader timed out after ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x0115 }
        r1 = "ms while waiting for the ad server's response.";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x02f2:
        r0 = r12.k;	 Catch:{ Throwable -> 0x0115 }
        r12.b = r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "Using loadUrl.  adBaseUrl: ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.b;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.a(r0);	 Catch:{ Throwable -> 0x0115 }
    L_0x030e:
        r1 = r3;
    L_0x030f:
        r0 = r12.a;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x03e1;
    L_0x0313:
        r0 = r12.f;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0333;
    L_0x0317:
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.b;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.internal.d) r0;	 Catch:{ Throwable -> 0x0115 }
        r1 = 1;
        r0.b(r1);	 Catch:{ Throwable -> 0x0115 }
        r12.b();	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0333:
        r0 = r12.e;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0372;
    L_0x0337:
        r0 = r12.e;	 Catch:{ Throwable -> 0x0115 }
        r2 = "application/json";
        r0 = r0.startsWith(r2);	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x034b;
    L_0x0341:
        r0 = r12.e;	 Catch:{ Throwable -> 0x0115 }
        r2 = "text/javascript";
        r0 = r0.startsWith(r2);	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0372;
    L_0x034b:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "Expected HTML but received ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.e;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = ".";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.b(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0372:
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.n;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x03d5;
    L_0x0384:
        r0 = r12.o;	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x0396;
    L_0x0388:
        r0 = "Multiple supported ad sizes were specified, but the server did not respond with a size.";
        com.google.ads.util.b.b(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0396:
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.n;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (java.lang.Object[]) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ Throwable -> 0x0115 }
        r2 = r12.o;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.contains(r2);	 Catch:{ Throwable -> 0x0115 }
        if (r0 != 0) goto L_0x03e1;
    L_0x03b4:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "The ad server did not respond with a supported AdSize: ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r1 = r12.o;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.b(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 0;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x03d5:
        r0 = r12.o;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x03e1;
    L_0x03d9:
        r0 = "adSize was expected to be null in AdLoader.";
        com.google.ads.util.b.e(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = 0;
        r12.o = r0;	 Catch:{ Throwable -> 0x0115 }
    L_0x03e1:
        r0 = r12.j;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.n) r0;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.b;	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.a();	 Catch:{ Throwable -> 0x0115 }
        r0 = (com.google.ads.internal.d) r0;	 Catch:{ Throwable -> 0x0115 }
        r2 = 0;
        r0.b(r2);	 Catch:{ Throwable -> 0x0115 }
        r12.i();	 Catch:{ Throwable -> 0x0115 }
    L_0x03fa:
        r0 = r12.q;	 Catch:{ InterruptedException -> 0x042f }
        if (r0 != 0) goto L_0x0449;
    L_0x03fe:
        r0 = r12.t;	 Catch:{ InterruptedException -> 0x042f }
        if (r0 == 0) goto L_0x0420;
    L_0x0402:
        r0 = r12.j;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.a();	 Catch:{ InterruptedException -> 0x042f }
        r0 = (com.google.ads.n) r0;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.g;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.a();	 Catch:{ InterruptedException -> 0x042f }
        r0 = (com.google.ads.internal.h) r0;	 Catch:{ InterruptedException -> 0x042f }
        r0 = r0.b();	 Catch:{ InterruptedException -> 0x042f }
        if (r0 == 0) goto L_0x0449;
    L_0x041a:
        r0 = r1.a();	 Catch:{ InterruptedException -> 0x042f }
        if (r0 == 0) goto L_0x0449;
    L_0x0420:
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ InterruptedException -> 0x042f }
        r2 = r2 - r6;
        r2 = r4 - r2;
        r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x0449;
    L_0x042b:
        r12.wait(r2);	 Catch:{ InterruptedException -> 0x042f }
        goto L_0x03fa;
    L_0x042f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r1.<init>();	 Catch:{ Throwable -> 0x0115 }
        r2 = "AdLoader InterruptedException while loading the HTML: ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0115 }
        r0 = r1.append(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.a(r0);	 Catch:{ Throwable -> 0x0115 }
        monitor-exit(r12);	 Catch:{ all -> 0x003a }
        goto L_0x0018;
    L_0x0449:
        r0 = r12.t;	 Catch:{ Throwable -> 0x0115 }
        if (r0 == 0) goto L_0x0452;
    L_0x044d:
        r12.j();	 Catch:{ Throwable -> 0x0115 }
        goto L_0x0121;
    L_0x0452:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0115 }
        r0.<init>();	 Catch:{ Throwable -> 0x0115 }
        r1 = "AdLoader timed out after ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x0115 }
        r1 = "ms while loading the HTML.";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0115 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0115 }
        com.google.ads.util.b.c(r0);	 Catch:{ Throwable -> 0x0115 }
        r0 = com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR;	 Catch:{ Throwable -> 0x0115 }
        r1 = 1;
        r12.a(r0, r1);	 Catch:{ Throwable -> 0x0115 }
        goto L_0x0121;
    L_0x0476:
        r1 = r0;
        goto L_0x030f;
    L_0x0479:
        r0 = r3;
        goto L_0x023c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.internal.c.run():void");
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        try {
            if (TextUtils.isEmpty(this.e)) {
                com.google.ads.util.b.b("Got a mediation response with no content type. Aborting mediation.");
                a(ErrorCode.INTERNAL_ERROR, false);
            } else if (this.e.startsWith("application/json")) {
                final com.google.ads.c a = com.google.ads.c.a(this.c);
                a(this.d, a, ((d) ((n) this.j.a.a()).b.a()).j());
                ((Handler) m.a().c.a()).post(new Runnable() {
                    public void run() {
                        if (c.this.i != null) {
                            c.this.i.stopLoading();
                            c.this.i.destroy();
                        }
                        ((d) ((n) c.this.j.a.a()).b.a()).a(c.this.n);
                        if (c.this.o != null) {
                            ((h) ((n) c.this.j.a.a()).g.a()).b(c.this.o);
                        }
                        ((d) ((n) c.this.j.a.a()).b.a()).a(a);
                    }
                });
            } else {
                com.google.ads.util.b.b("Got a mediation response with a content type: '" + this.e + "'. Expected something starting with 'application/json'. Aborting mediation.");
                a(ErrorCode.INTERNAL_ERROR, false);
            }
        } catch (JSONException e) {
            com.google.ads.util.b.b("AdLoader can't parse gWhirl server configuration.", e);
            a(ErrorCode.INTERNAL_ERROR, false);
        }
    }

    static void a(String str, com.google.ads.c cVar, com.google.ads.d dVar) {
        if (str != null && !str.contains("no-store") && !str.contains("no-cache")) {
            Matcher matcher = Pattern.compile("max-age\\s*=\\s*(\\d+)").matcher(str);
            if (matcher.find()) {
                try {
                    dVar.a(cVar, Integer.parseInt(matcher.group(1)));
                    com.google.ads.util.b.c(String.format(Locale.US, "Caching gWhirl configuration for: %d seconds", new Object[]{Integer.valueOf(r0)}));
                    return;
                } catch (NumberFormatException e) {
                    com.google.ads.util.b.b("Caught exception trying to parse cache control directive. Overflow?", e);
                    return;
                }
            }
            com.google.ads.util.b.c("Unrecognized cacheControlDirective: '" + str + "'. Not caching configuration.");
        }
    }

    public String a(Map<String, Object> map, Activity activity) throws b {
        int i = 0;
        Context applicationContext = activity.getApplicationContext();
        g n = ((d) ((n) this.j.a.a()).b.a()).n();
        long m = n.m();
        if (m > 0) {
            map.put("prl", Long.valueOf(m));
        }
        m = n.n();
        if (m > 0) {
            map.put("prnl", Long.valueOf(m));
        }
        String l = n.l();
        if (l != null) {
            map.put("ppcl", l);
        }
        l = n.k();
        if (l != null) {
            map.put("pcl", l);
        }
        m = n.j();
        if (m > 0) {
            map.put("pcc", Long.valueOf(m));
        }
        map.put("preqs", Long.valueOf(n.o()));
        map.put("oar", Long.valueOf(n.p()));
        map.put("bas_on", Long.valueOf(n.s()));
        map.put("bas_off", Long.valueOf(n.v()));
        if (n.y()) {
            map.put("aoi_timeout", "true");
        }
        if (n.A()) {
            map.put("aoi_nofill", "true");
        }
        l = n.D();
        if (l != null) {
            map.put("pit", l);
        }
        map.put("ptime", Long.valueOf(g.E()));
        n.a();
        n.i();
        if (((n) this.j.a.a()).b()) {
            map.put("format", "interstitial_mb");
        } else {
            AdSize c = ((h) ((n) this.j.a.a()).g.a()).c();
            if (c.isFullWidth()) {
                map.put("smart_w", "full");
            }
            if (c.isAutoHeight()) {
                map.put("smart_h", "auto");
            }
            if (c.isCustomAdSize()) {
                HashMap hashMap = new HashMap();
                hashMap.put("w", Integer.valueOf(c.getWidth()));
                hashMap.put("h", Integer.valueOf(c.getHeight()));
                map.put("ad_frame", hashMap);
            } else {
                map.put("format", c.toString());
            }
        }
        map.put("slotname", ((n) this.j.a.a()).h.a());
        map.put("js", "afma-sdk-a-v6.4.1");
        try {
            int i2;
            int i3 = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
            String f = AdUtil.f(applicationContext);
            if (!TextUtils.isEmpty(f)) {
                map.put("mv", f);
            }
            f = (String) m.a().a.a();
            if (!TextUtils.isEmpty(f)) {
                map.put("imbf", f);
            }
            map.put("msid", AdView.getPkgName(applicationContext.getPackageName()));
            map.put("app_name", i3 + ".android." + AdView.getPkgName(applicationContext.getPackageName()));
            map.put("isu", AdUtil.a(applicationContext));
            Object d = AdUtil.d(applicationContext);
            l = "net";
            if (d == null) {
                d = "null";
            }
            map.put(l, d);
            f = AdUtil.e(applicationContext);
            if (!(f == null || f.length() == 0)) {
                map.put("cap", f);
            }
            map.put("u_audio", Integer.valueOf(AdUtil.g(applicationContext).ordinal()));
            DisplayMetrics a = AdUtil.a(activity);
            map.put("u_sd", Float.valueOf(a.density));
            map.put("u_h", Integer.valueOf(AdUtil.a(applicationContext, a)));
            map.put("u_w", Integer.valueOf(AdUtil.b(applicationContext, a)));
            map.put("hl", Locale.getDefault().getLanguage());
            n nVar = (n) this.j.a.a();
            ak akVar = (ak) nVar.r.a();
            if (akVar == null) {
                akVar = ak.a("afma-sdk-a-v6.4.1", (Context) activity);
                nVar.r.a(akVar);
                nVar.s.a(new al(akVar));
            }
            map.put("ms", akVar.a(applicationContext));
            if (!(((n) this.j.a.a()).j == null || ((n) this.j.a.a()).j.a() == null)) {
                AdView adView = (AdView) ((n) this.j.a.a()).j.a();
                if (adView.getParent() != null) {
                    int[] iArr = new int[2];
                    adView.getLocationOnScreen(iArr);
                    i2 = iArr[0];
                    int i4 = iArr[1];
                    DisplayMetrics displayMetrics = ((Context) ((n) this.j.a.a()).f.a()).getResources().getDisplayMetrics();
                    int i5 = displayMetrics.widthPixels;
                    i3 = displayMetrics.heightPixels;
                    if (!adView.isShown() || adView.getWidth() + i2 <= 0 || adView.getHeight() + i4 <= 0 || i2 > i5 || i4 > i3) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("x", Integer.valueOf(i2));
                    hashMap2.put("y", Integer.valueOf(i4));
                    hashMap2.put("width", Integer.valueOf(adView.getWidth()));
                    hashMap2.put("height", Integer.valueOf(adView.getHeight()));
                    hashMap2.put("visible", Integer.valueOf(i3));
                    map.put("ad_pos", hashMap2);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            AdSize[] adSizeArr = (AdSize[]) ((n) this.j.a.a()).n.a();
            if (adSizeArr != null) {
                i2 = adSizeArr.length;
                while (i < i2) {
                    AdSize adSize = adSizeArr[i];
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    stringBuilder.append(adSize.getWidth() + "x" + adSize.getHeight());
                    i++;
                }
                map.put("sz", stringBuilder.toString());
            }
            TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
            l = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(l)) {
                map.put("carrier", l);
            }
            map.put("pt", Integer.valueOf(telephonyManager.getPhoneType()));
            map.put("gnt", Integer.valueOf(telephonyManager.getNetworkType()));
            if (AdUtil.c()) {
                map.put("simulator", Integer.valueOf(1));
            }
            map.put("session_id", com.google.ads.b.a().b().toString());
            map.put("seq_num", com.google.ads.b.a().c().toString());
            if (((h) ((n) this.j.a.a()).g.a()).b()) {
                map.put("swipeable", Integer.valueOf(1));
            }
            if (((Boolean) ((n) this.j.a.a()).t.a()).booleanValue()) {
                map.put("d_imp_hdr", Integer.valueOf(1));
            }
            l = AdUtil.a((Map) map);
            f = ((Boolean) ((com.google.ads.m.a) ((m) ((n) this.j.a.a()).d.a()).b.a()).o.a()).booleanValue() ? g() + d() + "(" + l + ");" + h() : g() + e() + d() + "(" + l + ");" + h();
            com.google.ads.util.b.c("adRequestUrlHtml: " + f);
            return f;
        } catch (NameNotFoundException e) {
            throw new b("NameNotFoundException");
        }
    }

    private String d() {
        if (this.h instanceof SearchAdRequest) {
            return "AFMA_buildAdURL";
        }
        return "AFMA_buildAdURL";
    }

    private String e() {
        if (this.h instanceof SearchAdRequest) {
            return "AFMA_getSdkConstants();";
        }
        return "AFMA_getSdkConstants();";
    }

    private String f() {
        if (this.h instanceof SearchAdRequest) {
            return "http://www.gstatic.com/safa/";
        }
        return "http://media.admob.com/";
    }

    private String g() {
        if (this.h instanceof SearchAdRequest) {
            return "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>";
        }
        return "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>";
    }

    private String h() {
        if (this.h instanceof SearchAdRequest) {
            return "</script></head><body></body></html>";
        }
        return "</script></head><body></body></html>";
    }

    /* Access modifiers changed, original: protected */
    public void a(ErrorCode errorCode, boolean z) {
        ((Handler) m.a().c.a()).post(new a((d) ((n) this.j.a.a()).b.a(), this.i, this.g, errorCode, z));
    }

    private void b(String str, String str2) {
        ((Handler) m.a().c.a()).post(new c(this.i, str2, str));
    }

    private void i() {
        AdWebView l = ((d) ((n) this.j.a.a()).b.a()).l();
        ((d) ((n) this.j.a.a()).b.a()).m().c(true);
        ((d) ((n) this.j.a.a()).b.a()).n().h();
        ((Handler) m.a().c.a()).post(new c(l, this.b, this.c));
    }

    private void j() {
        ((Handler) m.a().c.a()).post(new e((d) ((n) this.j.a.a()).b.a(), this.i, this.m, this.u, this.r, this.n, this.o));
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void b(boolean z) {
        this.f = z;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void b(String str) {
        this.e = str;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void a(String str, String str2) {
        this.b = str2;
        this.c = str;
        notify();
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void c(String str) {
        this.d = str;
    }

    public synchronized void d(String str) {
        this.k = str;
        notify();
    }

    public synchronized void e(String str) {
        this.l = str;
    }

    public synchronized void f(String str) {
        this.n = str;
    }

    public synchronized void a(AdSize adSize) {
        this.o = adSize;
    }

    public synchronized void a(ErrorCode errorCode) {
        this.s = errorCode;
        notify();
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void c() {
        this.t = true;
        notify();
    }

    public synchronized void c(boolean z) {
        this.r = z;
    }

    public synchronized void a(int i) {
        this.u = i;
    }

    public synchronized void d(boolean z) {
        this.w = z;
    }

    public synchronized void a(d dVar) {
        this.x = dVar;
    }

    public synchronized void e(boolean z) {
        this.a = z;
    }
}
