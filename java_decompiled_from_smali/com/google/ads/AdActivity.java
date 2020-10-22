package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.ads.internal.AdVideoView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.a;
import com.google.ads.internal.d;
import com.google.ads.internal.e;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.g;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdActivity extends Activity implements OnClickListener {
    public static final String BASE_URL_PARAM = "baseurl";
    public static final String COMPONENT_NAME_PARAM = "c";
    public static final String CUSTOM_CLOSE_PARAM = "custom_close";
    public static final String HTML_PARAM = "html";
    public static final String INTENT_ACTION_PARAM = "i";
    public static final String INTENT_EXTRAS_PARAM = "e";
    public static final String INTENT_FLAGS_PARAM = "f";
    public static final String ORIENTATION_PARAM = "o";
    public static final String PACKAGE_NAME_PARAM = "p";
    public static final String TYPE_PARAM = "m";
    public static final String URL_PARAM = "u";
    private static final a a = ((a) a.a.b());
    private static final Object b = new Object();
    private static AdActivity c = null;
    private static d d = null;
    private static AdActivity e = null;
    private static AdActivity f = null;
    private static final StaticMethodWrapper g = new StaticMethodWrapper();
    private AdWebView h;
    private FrameLayout i;
    private int j;
    private ViewGroup k = null;
    private boolean l;
    private long m;
    private RelativeLayout n;
    private AdActivity o = null;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private AdVideoView t;

    public static class StaticMethodWrapper {
        public boolean isShowing() {
            boolean z;
            synchronized (AdActivity.b) {
                z = AdActivity.e != null;
            }
            return z;
        }

        public boolean leftApplication() {
            boolean z;
            synchronized (AdActivity.b) {
                z = AdActivity.c != null;
            }
            return z;
        }

        /* JADX WARNING: Missing block: B:7:0x000f, code skipped:
            r0 = (android.app.Activity) r5.i().c.a();
     */
        /* JADX WARNING: Missing block: B:8:0x001b, code skipped:
            if (r0 != null) goto L_0x0033;
     */
        /* JADX WARNING: Missing block: B:9:0x001d, code skipped:
            com.google.ads.util.b.e("activity was null while launching an AdActivity.");
     */
        /* JADX WARNING: Missing block: B:19:0x0033, code skipped:
            r1 = new android.content.Intent(r0.getApplicationContext(), com.google.ads.AdActivity.class);
            r1.putExtra("com.google.ads.AdOpener", r6.a());
     */
        /* JADX WARNING: Missing block: B:21:?, code skipped:
            com.google.ads.util.b.a("Launching AdActivity.");
            r0.startActivity(r1);
     */
        /* JADX WARNING: Missing block: B:22:0x0050, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:23:0x0051, code skipped:
            com.google.ads.util.b.b("Activity not found.", r0);
     */
        /* JADX WARNING: Missing block: B:24:?, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:26:?, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:27:?, code skipped:
            return;
     */
        public void launchAdActivity(com.google.ads.internal.d r5, com.google.ads.internal.e r6) {
            /*
            r4 = this;
            r1 = com.google.ads.AdActivity.b;
            monitor-enter(r1);
            r0 = com.google.ads.AdActivity.d;	 Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0023;
        L_0x000b:
            com.google.ads.AdActivity.d = r5;	 Catch:{ all -> 0x0030 }
        L_0x000e:
            monitor-exit(r1);	 Catch:{ all -> 0x0030 }
            r0 = r5.i();
            r0 = r0.c;
            r0 = r0.a();
            r0 = (android.app.Activity) r0;
            if (r0 != 0) goto L_0x0033;
        L_0x001d:
            r0 = "activity was null while launching an AdActivity.";
            com.google.ads.util.b.e(r0);
        L_0x0022:
            return;
        L_0x0023:
            r0 = com.google.ads.AdActivity.d;	 Catch:{ all -> 0x0030 }
            if (r0 == r5) goto L_0x000e;
        L_0x0029:
            r0 = "Tried to launch a new AdActivity with a different AdManager.";
            com.google.ads.util.b.b(r0);	 Catch:{ all -> 0x0030 }
            monitor-exit(r1);	 Catch:{ all -> 0x0030 }
            goto L_0x0022;
        L_0x0030:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0030 }
            throw r0;
        L_0x0033:
            r1 = new android.content.Intent;
            r2 = r0.getApplicationContext();
            r3 = com.google.ads.AdActivity.class;
            r1.<init>(r2, r3);
            r2 = "com.google.ads.AdOpener";
            r3 = r6.a();
            r1.putExtra(r2, r3);
            r2 = "Launching AdActivity.";
            com.google.ads.util.b.a(r2);	 Catch:{ ActivityNotFoundException -> 0x0050 }
            r0.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0050 }
            goto L_0x0022;
        L_0x0050:
            r0 = move-exception;
            r1 = "Activity not found.";
            com.google.ads.util.b.b(r1, r0);
            goto L_0x0022;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.AdActivity$StaticMethodWrapper.launchAdActivity(com.google.ads.internal.d, com.google.ads.internal.e):void");
        }
    }

    /* Access modifiers changed, original: protected */
    public View a(int i, boolean z) {
        this.j = (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
        this.i = new FrameLayout(getApplicationContext());
        this.i.setMinimumWidth(this.j);
        this.i.setMinimumHeight(this.j);
        this.i.setOnClickListener(this);
        setCustomClose(z);
        return this.i;
    }

    private void a(String str) {
        b.b(str);
        finish();
    }

    private void a(String str, Throwable th) {
        b.b(str, th);
        finish();
    }

    public AdVideoView getAdVideoView() {
        return this.t;
    }

    public AdWebView getOpeningAdWebView() {
        if (this.o != null) {
            return this.o.h;
        }
        synchronized (b) {
            if (d == null) {
                b.e("currentAdManager was null while trying to get the opening AdWebView.");
                return null;
            }
            AdWebView l = d.l();
            if (l != this.h) {
                return l;
            }
            return null;
        }
    }

    public static boolean isShowing() {
        return g.isShowing();
    }

    public static boolean leftApplication() {
        return g.leftApplication();
    }

    public static void launchAdActivity(d adManager, e adOpener) {
        g.launchAdActivity(adManager, adOpener);
    }

    /* Access modifiers changed, original: protected */
    public void a(HashMap<String, String> hashMap, d dVar) {
        int i = 0;
        if (hashMap == null) {
            a("Could not get the paramMap in launchIntent()");
            return;
        }
        int i2;
        Intent intent = new Intent();
        String str = (String) hashMap.get(URL_PARAM);
        String str2 = (String) hashMap.get(TYPE_PARAM);
        String str3 = (String) hashMap.get(INTENT_ACTION_PARAM);
        String str4 = (String) hashMap.get(PACKAGE_NAME_PARAM);
        String str5 = (String) hashMap.get(COMPONENT_NAME_PARAM);
        String str6 = (String) hashMap.get(INTENT_FLAGS_PARAM);
        String str7 = (String) hashMap.get(INTENT_EXTRAS_PARAM);
        int i3 = !TextUtils.isEmpty(str) ? 1 : 0;
        if (TextUtils.isEmpty(str2)) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i3 != 0 && i2 != 0) {
            intent.setDataAndType(Uri.parse(str), str2);
        } else if (i3 != 0) {
            intent.setData(Uri.parse(str));
        } else if (i2 != 0) {
            intent.setType(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.setAction(str3);
        } else if (i3 != 0) {
            intent.setAction("android.intent.action.VIEW");
        }
        if (!TextUtils.isEmpty(str4) && AdUtil.a >= 4) {
            com.google.ads.util.e.a(intent, str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/");
            if (split.length < 2) {
                b.e("Warning: Could not parse component name from open GMSG: " + str5);
            }
            intent.setClassName(split[0], split[1]);
        }
        if (!TextUtils.isEmpty(str6)) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(str6);
            } catch (NumberFormatException e) {
                b.e("Warning: Could not parse flags from open GMSG: " + str6);
                parseInt = 0;
            }
            intent.addFlags(parseInt);
        }
        if (!TextUtils.isEmpty(str7)) {
            try {
                JSONObject jSONObject = new JSONObject(str7);
                JSONArray names = jSONObject.names();
                while (i < names.length()) {
                    str3 = names.getString(i);
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str3);
                    int i4 = jSONObject2.getInt("t");
                    str6 = "v";
                    switch (i4) {
                        case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                            intent.putExtra(str3, jSONObject2.getBoolean(str6));
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                            intent.putExtra(str3, jSONObject2.getDouble(str6));
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                            intent.putExtra(str3, jSONObject2.getInt(str6));
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                            intent.putExtra(str3, jSONObject2.getLong(str6));
                            break;
                        case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                            intent.putExtra(str3, jSONObject2.getString(str6));
                            break;
                        default:
                            b.e("Warning: Unknown type in extras from open GMSG: " + str3 + " (type: " + i4 + ")");
                            break;
                    }
                    i++;
                }
            } catch (JSONException e2) {
                b.e("Warning: Could not parse extras from open GMSG: " + str7);
            }
        }
        if (intent.filterEquals(new Intent())) {
            a("Tried to launch empty intent.");
            return;
        }
        try {
            b.a("Launching an intent from AdActivity: " + intent);
            startActivity(intent);
            a(dVar);
        } catch (ActivityNotFoundException e3) {
            a(e3.getMessage(), e3);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(d dVar) {
        this.h = null;
        this.m = SystemClock.elapsedRealtime();
        this.p = true;
        synchronized (b) {
            if (c == null) {
                c = this;
                dVar.w();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public AdVideoView a(Activity activity) {
        return new AdVideoView(activity, this.h);
    }

    public void moveAdVideoView(int x, int y, int width, int height) {
        if (this.t != null) {
            this.t.setLayoutParams(a(x, y, width, height));
            this.t.requestLayout();
        }
    }

    public void newAdVideoView(int x, int y, int width, int height) {
        if (this.t == null) {
            this.t = a((Activity) this);
            this.n.addView(this.t, 0, a(x, y, width, height));
            synchronized (b) {
                if (d == null) {
                    b.e("currentAdManager was null while trying to get the opening AdWebView.");
                    return;
                }
                d.m().b(false);
            }
        }
    }

    private LayoutParams a(int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = new LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    public void onClick(View v) {
        finish();
    }

    /* JADX WARNING: Missing block: B:30:0x0088, code skipped:
            r11.n = null;
            r11.p = false;
            r11.q = true;
            r11.t = null;
            r0 = getIntent().getBundleExtra("com.google.ads.AdOpener");
     */
    /* JADX WARNING: Missing block: B:31:0x009a, code skipped:
            if (r0 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Missing block: B:32:0x009c, code skipped:
            a("Could not get the Bundle used to create AdActivity.");
     */
    /* JADX WARNING: Missing block: B:42:0x00b0, code skipped:
            r1 = new com.google.ads.internal.e(r0);
            r0 = r1.b();
            r10 = r1.c();
     */
    /* JADX WARNING: Missing block: B:43:0x00c3, code skipped:
            if (r0.equals("intent") == false) goto L_0x00c9;
     */
    /* JADX WARNING: Missing block: B:44:0x00c5, code skipped:
            a(r10, r8);
     */
    /* JADX WARNING: Missing block: B:45:0x00c9, code skipped:
            r11.n = new android.widget.RelativeLayout(getApplicationContext());
     */
    /* JADX WARNING: Missing block: B:46:0x00da, code skipped:
            if (r0.equals("webapp") == false) goto L_0x017a;
     */
    /* JADX WARNING: Missing block: B:47:0x00dc, code skipped:
            r11.h = new com.google.ads.internal.AdWebView(r8.i(), null);
            r1 = com.google.ads.internal.a.d;
     */
    /* JADX WARNING: Missing block: B:48:0x00e9, code skipped:
            if (r9 != false) goto L_0x014b;
     */
    /* JADX WARNING: Missing block: B:49:0x00eb, code skipped:
            r0 = true;
     */
    /* JADX WARNING: Missing block: B:50:0x00ec, code skipped:
            r0 = com.google.ads.internal.i.a(r8, r1, true, r0);
            r0.d(true);
     */
    /* JADX WARNING: Missing block: B:51:0x00f3, code skipped:
            if (r9 == false) goto L_0x00f8;
     */
    /* JADX WARNING: Missing block: B:52:0x00f5, code skipped:
            r0.a(true);
     */
    /* JADX WARNING: Missing block: B:53:0x00f8, code skipped:
            r11.h.setWebViewClient(r0);
            r0 = (java.lang.String) r10.get(URL_PARAM);
            r1 = (java.lang.String) r10.get(BASE_URL_PARAM);
            r2 = (java.lang.String) r10.get(HTML_PARAM);
     */
    /* JADX WARNING: Missing block: B:54:0x0115, code skipped:
            if (r0 == null) goto L_0x014d;
     */
    /* JADX WARNING: Missing block: B:55:0x0117, code skipped:
            r11.h.loadUrl(r0);
     */
    /* JADX WARNING: Missing block: B:56:0x011c, code skipped:
            r0 = (java.lang.String) r10.get(ORIENTATION_PARAM);
     */
    /* JADX WARNING: Missing block: B:57:0x012a, code skipped:
            if (PACKAGE_NAME_PARAM.equals(r0) == false) goto L_0x0160;
     */
    /* JADX WARNING: Missing block: B:58:0x012c, code skipped:
            r3 = com.google.ads.util.AdUtil.b();
     */
    /* JADX WARNING: Missing block: B:59:0x0130, code skipped:
            r1 = r11.h;
     */
    /* JADX WARNING: Missing block: B:60:0x0132, code skipped:
            if (r10 == null) goto L_0x0178;
     */
    /* JADX WARNING: Missing block: B:62:0x0140, code skipped:
            if ("1".equals(r10.get(CUSTOM_CLOSE_PARAM)) == false) goto L_0x0178;
     */
    /* JADX WARNING: Missing block: B:63:0x0142, code skipped:
            r5 = true;
     */
    /* JADX WARNING: Missing block: B:64:0x0143, code skipped:
            a(r1, false, r3, r9, r5);
     */
    /* JADX WARNING: Missing block: B:65:0x014b, code skipped:
            r0 = false;
     */
    /* JADX WARNING: Missing block: B:66:0x014d, code skipped:
            if (r2 == null) goto L_0x0159;
     */
    /* JADX WARNING: Missing block: B:67:0x014f, code skipped:
            r11.h.loadDataWithBaseURL(r1, r2, "text/html", "utf-8", null);
     */
    /* JADX WARNING: Missing block: B:68:0x0159, code skipped:
            a("Could not get the URL or HTML parameter to show a web app.");
     */
    /* JADX WARNING: Missing block: B:70:0x0166, code skipped:
            if ("l".equals(r0) == false) goto L_0x016d;
     */
    /* JADX WARNING: Missing block: B:71:0x0168, code skipped:
            r3 = com.google.ads.util.AdUtil.a();
     */
    /* JADX WARNING: Missing block: B:73:0x016f, code skipped:
            if (r11 != e) goto L_0x0176;
     */
    /* JADX WARNING: Missing block: B:74:0x0171, code skipped:
            r3 = r8.o();
     */
    /* JADX WARNING: Missing block: B:75:0x0176, code skipped:
            r3 = -1;
     */
    /* JADX WARNING: Missing block: B:76:0x0178, code skipped:
            r5 = false;
     */
    /* JADX WARNING: Missing block: B:78:0x0180, code skipped:
            if (r0.equals("interstitial") != false) goto L_0x018a;
     */
    /* JADX WARNING: Missing block: B:80:0x0188, code skipped:
            if (r0.equals("expand") == false) goto L_0x01d9;
     */
    /* JADX WARNING: Missing block: B:81:0x018a, code skipped:
            r11.h = r8.l();
            r3 = r8.o();
     */
    /* JADX WARNING: Missing block: B:82:0x019a, code skipped:
            if (r0.equals("expand") == false) goto L_0x01d1;
     */
    /* JADX WARNING: Missing block: B:83:0x019c, code skipped:
            r11.h.setIsExpandedMraid(true);
            r11.q = false;
     */
    /* JADX WARNING: Missing block: B:84:0x01a3, code skipped:
            if (r10 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Missing block: B:86:0x01b1, code skipped:
            if ("1".equals(r10.get(CUSTOM_CLOSE_PARAM)) == false) goto L_0x01b4;
     */
    /* JADX WARNING: Missing block: B:87:0x01b3, code skipped:
            r7 = true;
     */
    /* JADX WARNING: Missing block: B:89:0x01b6, code skipped:
            if (r11.r == false) goto L_0x01f7;
     */
    /* JADX WARNING: Missing block: B:91:0x01ba, code skipped:
            if (r11.s != false) goto L_0x01f7;
     */
    /* JADX WARNING: Missing block: B:92:0x01bc, code skipped:
            com.google.ads.util.b.a("Re-enabling hardware acceleration on expanding MRAID WebView.");
            r11.h.h();
            r5 = r7;
     */
    /* JADX WARNING: Missing block: B:93:0x01c7, code skipped:
            a(r11.h, true, r3, r9, r5);
     */
    /* JADX WARNING: Missing block: B:94:0x01d1, code skipped:
            r5 = r11.h.j();
     */
    /* JADX WARNING: Missing block: B:95:0x01d9, code skipped:
            a("Unknown AdOpener, <action: " + r0 + ">");
     */
    /* JADX WARNING: Missing block: B:96:0x01f7, code skipped:
            r5 = r7;
     */
    /* JADX WARNING: Missing block: B:97:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:99:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:100:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:101:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:102:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:103:?, code skipped:
            return;
     */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        r5 = 0;
        r7 = 0;
        r6 = 1;
        super.onCreate(r12);
        r11.l = r7;
        r2 = b;
        monitor-enter(r2);
        r0 = d;	 Catch:{ all -> 0x00a9 }
        if (r0 == 0) goto L_0x00a2;
    L_0x000f:
        r8 = d;	 Catch:{ all -> 0x00a9 }
        r0 = e;	 Catch:{ all -> 0x00a9 }
        if (r0 != 0) goto L_0x001a;
    L_0x0015:
        e = r11;	 Catch:{ all -> 0x00a9 }
        r8.v();	 Catch:{ all -> 0x00a9 }
    L_0x001a:
        r0 = r11.o;	 Catch:{ all -> 0x00a9 }
        if (r0 != 0) goto L_0x0026;
    L_0x001e:
        r0 = f;	 Catch:{ all -> 0x00a9 }
        if (r0 == 0) goto L_0x0026;
    L_0x0022:
        r0 = f;	 Catch:{ all -> 0x00a9 }
        r11.o = r0;	 Catch:{ all -> 0x00a9 }
    L_0x0026:
        f = r11;	 Catch:{ all -> 0x00a9 }
        r0 = r8.i();	 Catch:{ all -> 0x00a9 }
        r0 = r0.a();	 Catch:{ all -> 0x00a9 }
        if (r0 == 0) goto L_0x0036;
    L_0x0032:
        r0 = e;	 Catch:{ all -> 0x00a9 }
        if (r0 == r11) goto L_0x0046;
    L_0x0036:
        r0 = r8.i();	 Catch:{ all -> 0x00a9 }
        r0 = r0.b();	 Catch:{ all -> 0x00a9 }
        if (r0 == 0) goto L_0x0049;
    L_0x0040:
        r0 = r11.o;	 Catch:{ all -> 0x00a9 }
        r1 = e;	 Catch:{ all -> 0x00a9 }
        if (r0 != r1) goto L_0x0049;
    L_0x0046:
        r8.x();	 Catch:{ all -> 0x00a9 }
    L_0x0049:
        r9 = r8.r();	 Catch:{ all -> 0x00a9 }
        r0 = r8.i();	 Catch:{ all -> 0x00a9 }
        r0 = r0.d;	 Catch:{ all -> 0x00a9 }
        r0 = r0.a();	 Catch:{ all -> 0x00a9 }
        r0 = (com.google.ads.m) r0;	 Catch:{ all -> 0x00a9 }
        r0 = r0.b;	 Catch:{ all -> 0x00a9 }
        r0 = r0.a();	 Catch:{ all -> 0x00a9 }
        r0 = (com.google.ads.m.a) r0;	 Catch:{ all -> 0x00a9 }
        r3 = com.google.ads.util.AdUtil.a;	 Catch:{ all -> 0x00a9 }
        r1 = r0.b;	 Catch:{ all -> 0x00a9 }
        r1 = r1.a();	 Catch:{ all -> 0x00a9 }
        r1 = (java.lang.Integer) r1;	 Catch:{ all -> 0x00a9 }
        r1 = r1.intValue();	 Catch:{ all -> 0x00a9 }
        if (r3 < r1) goto L_0x00ac;
    L_0x0071:
        r1 = r6;
    L_0x0072:
        r11.s = r1;	 Catch:{ all -> 0x00a9 }
        r1 = com.google.ads.util.AdUtil.a;	 Catch:{ all -> 0x00a9 }
        r0 = r0.d;	 Catch:{ all -> 0x00a9 }
        r0 = r0.a();	 Catch:{ all -> 0x00a9 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x00a9 }
        r0 = r0.intValue();	 Catch:{ all -> 0x00a9 }
        if (r1 < r0) goto L_0x00ae;
    L_0x0084:
        r0 = r6;
    L_0x0085:
        r11.r = r0;	 Catch:{ all -> 0x00a9 }
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        r11.n = r5;
        r11.p = r7;
        r11.q = r6;
        r11.t = r5;
        r0 = r11.getIntent();
        r1 = "com.google.ads.AdOpener";
        r0 = r0.getBundleExtra(r1);
        if (r0 != 0) goto L_0x00b0;
    L_0x009c:
        r0 = "Could not get the Bundle used to create AdActivity.";
        r11.a(r0);
    L_0x00a1:
        return;
    L_0x00a2:
        r0 = "Could not get currentAdManager.";
        r11.a(r0);	 Catch:{ all -> 0x00a9 }
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        goto L_0x00a1;
    L_0x00a9:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00a9 }
        throw r0;
    L_0x00ac:
        r1 = r7;
        goto L_0x0072;
    L_0x00ae:
        r0 = r7;
        goto L_0x0085;
    L_0x00b0:
        r1 = new com.google.ads.internal.e;
        r1.<init>(r0);
        r0 = r1.b();
        r10 = r1.c();
        r1 = "intent";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x00c9;
    L_0x00c5:
        r11.a(r10, r8);
        goto L_0x00a1;
    L_0x00c9:
        r1 = new android.widget.RelativeLayout;
        r2 = r11.getApplicationContext();
        r1.<init>(r2);
        r11.n = r1;
        r1 = "webapp";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x017a;
    L_0x00dc:
        r0 = new com.google.ads.internal.AdWebView;
        r1 = r8.i();
        r0.<init>(r1, r5);
        r11.h = r0;
        r1 = com.google.ads.internal.a.d;
        if (r9 != 0) goto L_0x014b;
    L_0x00eb:
        r0 = r6;
    L_0x00ec:
        r0 = com.google.ads.internal.i.a(r8, r1, r6, r0);
        r0.d(r6);
        if (r9 == 0) goto L_0x00f8;
    L_0x00f5:
        r0.a(r6);
    L_0x00f8:
        r1 = r11.h;
        r1.setWebViewClient(r0);
        r0 = "u";
        r0 = r10.get(r0);
        r0 = (java.lang.String) r0;
        r1 = "baseurl";
        r1 = r10.get(r1);
        r1 = (java.lang.String) r1;
        r2 = "html";
        r2 = r10.get(r2);
        r2 = (java.lang.String) r2;
        if (r0 == 0) goto L_0x014d;
    L_0x0117:
        r1 = r11.h;
        r1.loadUrl(r0);
    L_0x011c:
        r0 = "o";
        r0 = r10.get(r0);
        r0 = (java.lang.String) r0;
        r1 = "p";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0160;
    L_0x012c:
        r3 = com.google.ads.util.AdUtil.b();
    L_0x0130:
        r1 = r11.h;
        if (r10 == 0) goto L_0x0178;
    L_0x0134:
        r0 = "1";
        r2 = "custom_close";
        r2 = r10.get(r2);
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0178;
    L_0x0142:
        r5 = r6;
    L_0x0143:
        r0 = r11;
        r2 = r7;
        r4 = r9;
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x00a1;
    L_0x014b:
        r0 = r7;
        goto L_0x00ec;
    L_0x014d:
        if (r2 == 0) goto L_0x0159;
    L_0x014f:
        r0 = r11.h;
        r3 = "text/html";
        r4 = "utf-8";
        r0.loadDataWithBaseURL(r1, r2, r3, r4, r5);
        goto L_0x011c;
    L_0x0159:
        r0 = "Could not get the URL or HTML parameter to show a web app.";
        r11.a(r0);
        goto L_0x00a1;
    L_0x0160:
        r1 = "l";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x016d;
    L_0x0168:
        r3 = com.google.ads.util.AdUtil.a();
        goto L_0x0130;
    L_0x016d:
        r0 = e;
        if (r11 != r0) goto L_0x0176;
    L_0x0171:
        r3 = r8.o();
        goto L_0x0130;
    L_0x0176:
        r3 = -1;
        goto L_0x0130;
    L_0x0178:
        r5 = r7;
        goto L_0x0143;
    L_0x017a:
        r1 = "interstitial";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x018a;
    L_0x0182:
        r1 = "expand";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x01d9;
    L_0x018a:
        r1 = r8.l();
        r11.h = r1;
        r3 = r8.o();
        r1 = "expand";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x01d1;
    L_0x019c:
        r0 = r11.h;
        r0.setIsExpandedMraid(r6);
        r11.q = r7;
        if (r10 == 0) goto L_0x01b4;
    L_0x01a5:
        r0 = "1";
        r1 = "custom_close";
        r1 = r10.get(r1);
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x01b4;
    L_0x01b3:
        r7 = r6;
    L_0x01b4:
        r0 = r11.r;
        if (r0 == 0) goto L_0x01f7;
    L_0x01b8:
        r0 = r11.s;
        if (r0 != 0) goto L_0x01f7;
    L_0x01bc:
        r0 = "Re-enabling hardware acceleration on expanding MRAID WebView.";
        com.google.ads.util.b.a(r0);
        r0 = r11.h;
        r0.h();
        r5 = r7;
    L_0x01c7:
        r1 = r11.h;
        r0 = r11;
        r2 = r6;
        r4 = r9;
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x00a1;
    L_0x01d1:
        r0 = r11.h;
        r7 = r0.j();
        r5 = r7;
        goto L_0x01c7;
    L_0x01d9:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unknown AdOpener, <action: ";
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = ">";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r11.a(r0);
        goto L_0x00a1;
    L_0x01f7:
        r5 = r7;
        goto L_0x01c7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.AdActivity.onCreate(android.os.Bundle):void");
    }

    /* Access modifiers changed, original: protected */
    public void a(AdWebView adWebView, boolean z, int i, boolean z2, boolean z3) {
        requestWindowFeature(1);
        Window window = getWindow();
        window.setFlags(1024, 1024);
        if (AdUtil.a >= 11) {
            if (this.r) {
                b.a("Enabling hardware acceleration on the AdActivity window.");
                g.a(window);
            } else {
                b.a("Disabling hardware acceleration on the AdActivity WebView.");
                adWebView.g();
            }
        }
        ViewParent parent = adWebView.getParent();
        if (parent != null) {
            if (!z2) {
                a("Interstitial created with an AdWebView that has a parent.");
                return;
            } else if (parent instanceof ViewGroup) {
                this.k = (ViewGroup) parent;
                this.k.removeView(adWebView);
            } else {
                a("MRAID banner was not a child of a ViewGroup.");
                return;
            }
        }
        if (adWebView.i() != null) {
            a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
            return;
        }
        setRequestedOrientation(i);
        adWebView.setAdActivity(this);
        View a = a(z2 ? 50 : 32, z3);
        this.n.addView(adWebView, -1, -1);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (z2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        }
        this.n.addView(a, layoutParams);
        this.n.setKeepScreenOn(true);
        setContentView(this.n);
        this.n.getRootView().setBackgroundColor(-16777216);
        if (z) {
            a.a((WebView) adWebView);
        }
    }

    public void onDestroy() {
        if (this.n != null) {
            this.n.removeAllViews();
        }
        if (isFinishing()) {
            e();
            if (this.q && this.h != null) {
                this.h.stopLoading();
                this.h.destroy();
                this.h = null;
            }
        }
        super.onDestroy();
    }

    public void onPause() {
        if (isFinishing()) {
            e();
        }
        super.onPause();
    }

    private void e() {
        if (!this.l) {
            if (this.h != null) {
                a.b(this.h);
                this.h.setAdActivity(null);
                this.h.setIsExpandedMraid(false);
                if (!(this.q || this.n == null || this.k == null)) {
                    if (this.r && !this.s) {
                        b.a("Disabling hardware acceleration on collapsing MRAID WebView.");
                        this.h.g();
                    } else if (!this.r && this.s) {
                        b.a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
                        this.h.h();
                    }
                    this.n.removeView(this.h);
                    this.k.addView(this.h);
                }
            }
            if (this.t != null) {
                this.t.e();
                this.t = null;
            }
            if (this == c) {
                c = null;
            }
            f = this.o;
            synchronized (b) {
                if (!(d == null || !this.q || this.h == null)) {
                    if (this.h == d.l()) {
                        d.a();
                    }
                    this.h.stopLoading();
                }
                if (this == e) {
                    e = null;
                    if (d != null) {
                        d.u();
                        d = null;
                    } else {
                        b.e("currentAdManager is null while trying to destroy AdActivity.");
                    }
                }
            }
            this.l = true;
            b.a("AdActivity is closing.");
        }
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        if (this.p && hasFocus && SystemClock.elapsedRealtime() - this.m > 250) {
            b.d("Launcher AdActivity got focus and is closing.");
            finish();
        }
        super.onWindowFocusChanged(hasFocus);
    }

    public void setCustomClose(boolean useCustomClose) {
        if (this.i != null) {
            this.i.removeAllViews();
            if (!useCustomClose) {
                ImageButton imageButton = new ImageButton(this);
                imageButton.setImageResource(17301527);
                imageButton.setBackgroundColor(0);
                imageButton.setOnClickListener(this);
                imageButton.setPadding(0, 0, 0, 0);
                this.i.addView(imageButton, new FrameLayout.LayoutParams(this.j, this.j, 17));
            }
        }
    }
}
