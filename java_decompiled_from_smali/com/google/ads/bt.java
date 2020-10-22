package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.a.a;
import com.google.ads.a.ac;
import com.google.ads.a.w;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.af;

public class bt extends aa {
    public final ad a;
    public final ad b;
    public final af c;
    public final ad d;
    public final ad e;
    public final ad f;
    public final ad g;
    public final ad h;
    public final ad i;
    public final ad j;
    public final ad k;
    public final ae l = new ae(this, "currentAd", null);
    public final ae m = new ae(this, "nextAd", null);
    public final ae n;
    public final ae o = new ae(this, "adListener");
    public final ae p = new ae(this, "appEventListener");
    public final ae q = new ae(this, "swipeableEventListener");
    public final ae r = new ae(this, "spamSignals", null);
    public final ae s = new ae(this, "spamSignalsUtil", null);
    public final ae t = new ae(this, "usesManualImpressions", Boolean.valueOf(false));

    public bt(br brVar, a aVar, AdView adView, i iVar, String str, Activity activity, Context context, ViewGroup viewGroup, ac acVar, w wVar) {
        Object obj = null;
        this.d = new ad(this, "appState", brVar);
        this.a = new ad(this, "ad", aVar);
        this.j = new ad(this, "adView", adView);
        this.g = new ad(this, "adType", acVar);
        this.h = new ad(this, "adUnitId", str);
        this.c = new af(this, "activity", activity);
        this.k = new ad(this, "interstitialAd", iVar);
        this.i = new ad(this, "bannerContainer", viewGroup);
        this.f = new ad(this, "applicationContext", context);
        this.n = new ae(this, "adSizes", null);
        this.b = new ad(this, "adManager", wVar);
        if (acVar != null && acVar.b()) {
            obj = new a(this);
        }
        this.e = new ad(this, "activationOverlay", obj);
    }

    public boolean a() {
        return !b();
    }

    public boolean b() {
        return ((ac) this.g.a()).a();
    }
}
