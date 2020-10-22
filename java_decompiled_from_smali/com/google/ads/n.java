package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.d;
import com.google.ads.internal.h;
import com.google.ads.util.i;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;

public class n extends i {
    public final b<Ad> a;
    public final b<d> b;
    public final i.d<Activity> c;
    public final b<m> d;
    public final b<ActivationOverlay> e;
    public final b<Context> f;
    public final b<h> g;
    public final b<String> h;
    public final b<ViewGroup> i;
    public final b<AdView> j;
    public final b<InterstitialAd> k;
    public final c<l> l = new c("currentAd", null);
    public final c<l> m = new c("nextAd", null);
    public final c<AdSize[]> n;
    public final c<AdListener> o = new c("adListener");
    public final c<AppEventListener> p = new c("appEventListener");
    public final c<SwipeableAdListener> q = new c("swipeableEventListener");
    public final c<ak> r = new c("spamSignals", null);
    public final c<al> s = new c("spamSignalsUtil", null);
    public final c<Boolean> t = new c("usesManualImpressions", Boolean.valueOf(false));

    public boolean a() {
        return !b();
    }

    public boolean b() {
        return ((h) this.g.a()).a();
    }

    public n(m mVar, Ad ad, AdView adView, InterstitialAd interstitialAd, String str, Activity activity, Context context, ViewGroup viewGroup, h hVar, d dVar) {
        Object obj = null;
        this.d = new b("appState", mVar);
        this.a = new b("ad", ad);
        this.j = new b("adView", adView);
        this.g = new b("adType", hVar);
        this.h = new b("adUnitId", str);
        this.c = new i.d("activity", activity);
        this.k = new b("interstitialAd", interstitialAd);
        this.i = new b("bannerContainer", viewGroup);
        this.f = new b("applicationContext", context);
        this.n = new c("adSizes", null);
        this.b = new b("adManager", dVar);
        if (hVar != null && hVar.b()) {
            obj = new ActivationOverlay(this);
        }
        this.e = new b("activationOverlay", obj);
    }
}
