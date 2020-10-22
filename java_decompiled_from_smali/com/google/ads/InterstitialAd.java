package com.google.ads;

import android.app.Activity;
import com.google.ads.internal.d;

public class InterstitialAd implements Ad {
    private d a;

    public InterstitialAd(Activity activity, String adUnitId) {
        this(activity, adUnitId, false);
    }

    public InterstitialAd(Activity activity, String adUnitId, boolean shortTimeout) {
        this.a = new d(this, activity, null, adUnitId, null, shortTimeout);
    }

    public boolean isReady() {
        return this.a.s();
    }

    public void loadAd(AdRequest adRequest) {
        this.a.a(adRequest);
    }

    public void show() {
        this.a.B();
    }

    public void setAdListener(AdListener adListener) {
        this.a.i().o.a(adListener);
    }

    /* Access modifiers changed, original: protected */
    public void setAppEventListener(AppEventListener appEventListener) {
        this.a.i().p.a(appEventListener);
    }

    public void stopLoading() {
        this.a.C();
    }
}
