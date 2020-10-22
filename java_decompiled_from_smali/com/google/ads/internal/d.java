package com.google.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.ads.Ad;
import com.google.ads.AdActivity;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.google.ads.AppEventListener;
import com.google.ads.InterstitialAd;
import com.google.ads.SwipeableAdListener;
import com.google.ads.ae;
import com.google.ads.af;
import com.google.ads.at;
import com.google.ads.c;
import com.google.ads.doublec.SwipeableDfpAdView;
import com.google.ads.e;
import com.google.ads.f;
import com.google.ads.g;
import com.google.ads.h;
import com.google.ads.l;
import com.google.ads.m;
import com.google.ads.m.a;
import com.google.ads.n;
import com.google.ads.util.AdUtil;
import com.google.ads.util.IcsUtil.IcsAdWebView;
import com.google.ads.util.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class d {
    private static final Object a = new Object();
    private String A = null;
    private String B = null;
    private final n b;
    private c c;
    private AdRequest d;
    private g e;
    private AdWebView f;
    private i g;
    private boolean h = false;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private SharedPreferences o;
    private long p;
    private af q;
    private boolean r;
    private LinkedList<String> s;
    private LinkedList<String> t;
    private LinkedList<String> u;
    private int v = -1;
    private Boolean w;
    private com.google.ads.d x;
    private e y;
    private f z;

    public d(Ad ad, Activity activity, AdSize adSize, String str, ViewGroup viewGroup, boolean z) {
        this.r = z;
        this.e = new g();
        this.c = null;
        this.d = null;
        this.k = false;
        this.p = 60000;
        this.l = false;
        this.n = false;
        this.m = true;
        h a = adSize == null ? h.a : h.a(adSize, activity.getApplicationContext());
        if (ad instanceof SwipeableDfpAdView) {
            a.a(true);
        }
        m a2;
        AdView adView;
        InterstitialAd interstitialAd;
        if (activity == null) {
            a2 = m.a();
            if (ad instanceof AdView) {
                adView = (AdView) ad;
            } else {
                adView = null;
            }
            if (ad instanceof InterstitialAd) {
                interstitialAd = (InterstitialAd) ad;
            } else {
                interstitialAd = null;
            }
            this.b = new n(a2, ad, adView, interstitialAd, str, null, null, viewGroup, a, this);
            return;
        }
        synchronized (a) {
            this.o = activity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
            if (z) {
                long j = this.o.getLong("Timeout" + str, -1);
                if (j < 0) {
                    this.i = 5000;
                } else {
                    this.i = j;
                }
            } else {
                this.i = 60000;
            }
        }
        a2 = m.a();
        if (ad instanceof AdView) {
            adView = (AdView) ad;
        } else {
            adView = null;
        }
        if (ad instanceof InterstitialAd) {
            interstitialAd = (InterstitialAd) ad;
        } else {
            interstitialAd = null;
        }
        this.b = new n(a2, ad, adView, interstitialAd, str, activity, activity.getApplicationContext(), viewGroup, a, this);
        this.q = new af(this);
        this.s = new LinkedList();
        this.t = new LinkedList();
        this.u = new LinkedList();
        a();
        AdUtil.h((Context) this.b.f.a());
        this.x = new com.google.ads.d();
        this.y = new e(this);
        this.w = null;
        this.z = null;
    }

    public synchronized void a() {
        AdSize c = ((h) this.b.g.a()).c();
        this.f = AdUtil.a >= 14 ? new IcsAdWebView(this.b, c) : new AdWebView(this.b, c);
        this.f.setVisibility(8);
        this.g = i.a(this, a.d, true, this.b.b());
        this.f.setWebViewClient(this.g);
        if (AdUtil.a < ((Integer) ((a) ((m) this.b.d.a()).b.a()).b.a()).intValue() && !((h) this.b.g.a()).a()) {
            b.a("Disabling hardware acceleration for a banner.");
            this.f.g();
        }
    }

    public synchronized void b() {
        if (this.y != null) {
            this.y.b();
        }
        this.b.o.a(null);
        this.b.p.a(null);
        C();
        f();
        if (this.f != null) {
            this.f.destroy();
        }
        this.h = true;
    }

    public void a(String str) {
        this.B = str;
        Uri build = new Builder().encodedQuery(str).build();
        StringBuilder stringBuilder = new StringBuilder();
        HashMap b = AdUtil.b(build);
        for (String str2 : b.keySet()) {
            stringBuilder.append(str2).append(" = ").append((String) b.get(str2)).append("\n");
        }
        this.A = stringBuilder.toString().trim();
        if (TextUtils.isEmpty(this.A)) {
            this.A = null;
        }
    }

    public String c() {
        return this.A;
    }

    public String d() {
        return this.B;
    }

    public synchronized void e() {
        this.m = false;
        b.a("Refreshing is no longer allowed on this AdView.");
    }

    public synchronized void f() {
        if (this.l) {
            b.a("Disabling refreshing.");
            ((Handler) m.a().c.a()).removeCallbacks(this.q);
            this.l = false;
        } else {
            b.a("Refreshing is already disabled.");
        }
    }

    public synchronized void g() {
        this.n = false;
        if (!this.b.a()) {
            b.a("Tried to enable refreshing on something other than an AdView.");
        } else if (!this.m) {
            b.a("Refreshing disabled on this AdView");
        } else if (this.l) {
            b.a("Refreshing is already enabled.");
        } else {
            b.a("Enabling refreshing every " + this.p + " milliseconds.");
            ((Handler) m.a().c.a()).postDelayed(this.q, this.p);
            this.l = true;
        }
    }

    public void h() {
        g();
        this.n = true;
    }

    public n i() {
        return this.b;
    }

    public synchronized com.google.ads.d j() {
        return this.x;
    }

    public synchronized c k() {
        return this.c;
    }

    public synchronized AdWebView l() {
        return this.f;
    }

    public synchronized i m() {
        return this.g;
    }

    public g n() {
        return this.e;
    }

    public synchronized void a(int i) {
        this.v = i;
    }

    public synchronized int o() {
        return this.v;
    }

    public long p() {
        return this.i;
    }

    public synchronized boolean q() {
        return this.c != null;
    }

    public synchronized boolean r() {
        return this.j;
    }

    public synchronized boolean s() {
        return this.k;
    }

    public synchronized boolean t() {
        return this.l;
    }

    public synchronized void a(AdRequest adRequest) {
        b.d("v6.4.1 RC00");
        if (this.h) {
            b.e("loadAd called after ad was destroyed.");
        } else if (q()) {
            b.e("loadAd called while the ad is already loading, so aborting.");
        } else if (AdActivity.isShowing()) {
            b.e("loadAd called while an interstitial or landing page is displayed, so aborting");
        } else if (AdUtil.c((Context) this.b.f.a()) && AdUtil.b((Context) this.b.f.a())) {
            if (at.a((Context) this.b.f.a(), this.o.getLong("GoogleAdMobDoritosLife", 60000))) {
                at.a((Activity) this.b.c.a());
            }
            this.k = false;
            this.s.clear();
            this.t.clear();
            this.d = adRequest;
            if (this.x.a()) {
                this.y.a(this.x.b(), adRequest);
            } else {
                l lVar = new l(this.b);
                this.b.m.a(lVar);
                this.c = (c) lVar.b.a();
                this.c.a(adRequest);
            }
        }
    }

    public synchronized void a(ErrorCode errorCode) {
        this.c = null;
        if (errorCode == ErrorCode.NETWORK_ERROR) {
            a(60.0f);
            if (!t()) {
                h();
            }
        }
        if (this.b.b()) {
            if (errorCode == ErrorCode.NO_FILL) {
                this.e.B();
            } else if (errorCode == ErrorCode.NETWORK_ERROR) {
                this.e.z();
            }
        }
        b.c("onFailedToReceiveAd(" + errorCode + ")");
        AdListener adListener = (AdListener) this.b.o.a();
        if (adListener != null) {
            adListener.onFailedToReceiveAd((Ad) this.b.a.a(), errorCode);
        }
    }

    public synchronized void a(c cVar) {
        this.c = null;
        this.y.a(cVar, this.d);
    }

    public synchronized void a(View view, h hVar, f fVar, boolean z) {
        b.a("AdManager.onReceiveGWhirlAd() called.");
        this.k = true;
        this.z = fVar;
        if (this.b.a()) {
            a(view);
            a(fVar, Boolean.valueOf(z));
        }
        this.y.d(hVar);
        AdListener adListener = (AdListener) this.b.o.a();
        if (adListener != null) {
            adListener.onReceiveAd((Ad) this.b.a.a());
        }
    }

    public synchronized void a(f fVar, boolean z) {
        b.a(String.format(Locale.US, "AdManager.onGWhirlAdClicked(%b) called.", new Object[]{Boolean.valueOf(z)}));
        b(fVar, Boolean.valueOf(z));
    }

    public synchronized void b(c cVar) {
        b.a("AdManager.onGWhirlNoFill() called.");
        a(cVar.i(), cVar.c());
        AdListener adListener = (AdListener) this.b.o.a();
        if (adListener != null) {
            adListener.onFailedToReceiveAd((Ad) this.b.a.a(), ErrorCode.NO_FILL);
        }
    }

    public synchronized void u() {
        this.e.C();
        b.c("onDismissScreen()");
        AdListener adListener = (AdListener) this.b.o.a();
        if (adListener != null) {
            adListener.onDismissScreen((Ad) this.b.a.a());
        }
    }

    public synchronized void v() {
        b.c("onPresentScreen()");
        AdListener adListener = (AdListener) this.b.o.a();
        if (adListener != null) {
            adListener.onPresentScreen((Ad) this.b.a.a());
        }
    }

    public synchronized void w() {
        b.c("onLeaveApplication()");
        AdListener adListener = (AdListener) this.b.o.a();
        if (adListener != null) {
            adListener.onLeaveApplication((Ad) this.b.a.a());
        }
    }

    public synchronized void a(String str, String str2) {
        AppEventListener appEventListener = (AppEventListener) this.b.p.a();
        if (appEventListener != null) {
            appEventListener.onAppEvent((Ad) this.b.a.a(), str, str2);
        }
    }

    public void x() {
        this.e.f();
        D();
    }

    private void a(f fVar, Boolean bool) {
        List d = fVar.d();
        if (d == null) {
            d = new ArrayList();
            d.add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
        }
        String b = fVar.b();
        a(d, fVar.a(), b, fVar.c(), bool, this.e.d(), this.e.e());
    }

    private void b(f fVar, Boolean bool) {
        List e = fVar.e();
        if (e == null) {
            e = new ArrayList();
            e.add("http://e.admob.com/clk?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@");
        }
        a(e, fVar.a(), fVar.b(), fVar.c(), bool, null, null);
    }

    private void a(List<String> list, String str) {
        List arrayList;
        if (list == null) {
            arrayList = new ArrayList();
            arrayList.add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
        } else {
            List<String> arrayList2 = list;
        }
        a(arrayList2, null, null, str, null, this.e.d(), this.e.e());
    }

    private void a(List<String> list, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        String a = AdUtil.a((Context) this.b.f.a());
        com.google.ads.b a2 = com.google.ads.b.a();
        String bigInteger = a2.b().toString();
        String bigInteger2 = a2.c().toString();
        for (String a3 : list) {
            new Thread(new ae(g.a(a3, (String) this.b.h.a(), bool, a, str, str2, str3, bigInteger, bigInteger2, str4, str5), (Context) this.b.f.a())).start();
        }
        this.e.b();
    }

    public synchronized void y() {
        Activity activity = (Activity) this.b.c.a();
        if (activity == null) {
            b.e("activity was null while trying to ping tracking URLs.");
        } else {
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                new Thread(new ae((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    public synchronized void z() {
        Activity activity = (Activity) this.b.c.a();
        if (activity == null) {
            b.e("activity was null while trying to ping manual tracking URLs.");
        } else {
            Iterator it = this.t.iterator();
            while (it.hasNext()) {
                new Thread(new ae((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    public synchronized void A() {
        if (!this.h) {
            if (this.d == null) {
                b.a("Tried to refresh before calling loadAd().");
            } else if (this.b.a()) {
                if (((AdView) this.b.j.a()).isShown() && AdUtil.d()) {
                    b.c("Refreshing ad.");
                    a(this.d);
                } else {
                    b.a("Not refreshing because the ad is not visible.");
                }
                if (this.n) {
                    f();
                } else {
                    ((Handler) m.a().c.a()).postDelayed(this.q, this.p);
                }
            } else {
                b.a("Tried to refresh an ad that wasn't an AdView.");
            }
        }
    }

    public void a(long j) {
        synchronized (a) {
            Editor edit = this.o.edit();
            edit.putLong("Timeout" + this.b.h, j);
            edit.commit();
            if (this.r) {
                this.i = j;
            }
        }
    }

    public synchronized void a(boolean z) {
        this.j = z;
    }

    public void a(View view) {
        ((ViewGroup) this.b.i.a()).setVisibility(0);
        ((ViewGroup) this.b.i.a()).removeAllViews();
        ((ViewGroup) this.b.i.a()).addView(view);
        if (((h) this.b.g.a()).b()) {
            ((d) this.b.b.a()).a((l) this.b.l.a(), false, -1, -1, -1, -1);
            if (((ActivationOverlay) this.b.e.a()).a()) {
                ((ViewGroup) this.b.i.a()).addView((View) this.b.e.a(), AdUtil.a((Context) this.b.f.a(), ((h) this.b.g.a()).c().getWidth()), AdUtil.a((Context) this.b.f.a(), ((h) this.b.g.a()).c().getHeight()));
            }
        }
    }

    public synchronized void a(float f) {
        long j = this.p;
        this.p = (long) (1000.0f * f);
        if (t() && this.p != j) {
            f();
            g();
        }
    }

    public synchronized void b(long j) {
        if (j > 0) {
            this.o.edit().putLong("GoogleAdMobDoritosLife", j).commit();
        }
    }

    public synchronized void B() {
        com.google.ads.util.a.a(this.b.b());
        if (this.k) {
            this.k = false;
            if (this.w == null) {
                b.b("isMediationFlag is null in show() with isReady() true. we should have an ad and know whether this is a mediation request or not. ");
            } else if (!this.w.booleanValue()) {
                AdActivity.launchAdActivity(this, new e("interstitial"));
                y();
            } else if (this.y.c()) {
                a(this.z, Boolean.valueOf(false));
            }
        } else {
            b.c("Cannot show interstitial because it is not loaded and ready.");
        }
    }

    public synchronized void C() {
        if (this.c != null) {
            this.c.a();
            this.c = null;
        }
        if (this.f != null) {
            this.f.stopLoading();
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void D() {
        Activity activity = (Activity) this.b.c.a();
        if (activity == null) {
            b.e("activity was null while trying to ping click tracking URLs.");
        } else {
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                new Thread(new ae((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void E() {
        this.c = null;
        this.k = true;
        this.f.setVisibility(0);
        if (this.b.a()) {
            a(this.f);
        }
        this.e.g();
        if (this.b.a()) {
            y();
        }
        b.c("onReceiveAd()");
        AdListener adListener = (AdListener) this.b.o.a();
        if (adListener != null) {
            adListener.onReceiveAd((Ad) this.b.a.a());
        }
        this.b.l.a(this.b.m.a());
        this.b.m.a(null);
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void b(String str) {
        b.a("Adding a tracking URL: " + str);
        this.s.add(str);
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void c(String str) {
        b.a("Adding a manual tracking URL: " + str);
        F().add(str);
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void a(LinkedList<String> linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b.a("Adding a click tracking URL: " + ((String) it.next()));
        }
        this.u = linkedList;
    }

    public void b(boolean z) {
        this.w = Boolean.valueOf(z);
    }

    public void a(l lVar, boolean z, int i, int i2, int i3, int i4) {
        ((ActivationOverlay) this.b.e.a()).setOverlayActivated(!z);
        a(i, i2, i3, i4);
        if (this.b.q.a() == null) {
            return;
        }
        if (z) {
            ((SwipeableAdListener) this.b.q.a()).onAdActivated((Ad) this.b.a.a());
        } else {
            ((SwipeableAdListener) this.b.q.a()).onAdDeactivated((Ad) this.b.a.a());
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ActivationOverlay activationOverlay = (ActivationOverlay) this.b.e.a();
        int a = AdUtil.a((Context) this.b.f.a(), i3 < 0 ? ((h) this.b.g.a()).c().getWidth() : i3);
        Context context = (Context) this.b.f.a();
        if (i4 < 0) {
            i4 = ((h) this.b.g.a()).c().getHeight();
        }
        LayoutParams layoutParams = new LayoutParams(a, AdUtil.a(context, i4));
        if (i3 < 0) {
            i5 = 0;
            i6 = 0;
        } else {
            i5 = i2;
            i6 = i;
        }
        if (i6 < 0) {
            a = ((ActivationOverlay) this.b.e.a()).d();
        } else {
            a = i6;
        }
        if (i5 < 0) {
            i5 = ((ActivationOverlay) this.b.e.a()).c();
        }
        ((ActivationOverlay) this.b.e.a()).setXPosition(a);
        ((ActivationOverlay) this.b.e.a()).setYPosition(i5);
        layoutParams.setMargins(AdUtil.a((Context) this.b.f.a(), a), AdUtil.a((Context) this.b.f.a(), i5), 0, 0);
        activationOverlay.setLayoutParams(layoutParams);
    }

    public LinkedList<String> F() {
        return this.t;
    }
}
