package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.g.a;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.util.b;
import java.util.HashMap;

public class h {
    final com.google.ads.internal.h a;
    private final f b;
    private boolean c = false;
    private boolean d = false;
    private a e = null;
    private final e f;
    private MediationAdapter<?, ?> g = null;
    private boolean h = false;
    private boolean i = false;
    private View j = null;
    private final String k;
    private final AdRequest l;
    private final HashMap<String, String> m;

    public h(e eVar, com.google.ads.internal.h hVar, f fVar, String str, AdRequest adRequest, HashMap<String, String> hashMap) {
        com.google.ads.util.a.b(TextUtils.isEmpty(str));
        this.f = eVar;
        this.a = hVar;
        this.b = fVar;
        this.k = str;
        this.l = adRequest;
        this.m = hashMap;
    }

    public f a() {
        return this.b;
    }

    public synchronized void a(Activity activity) {
        com.google.ads.util.a.b(this.h, "startLoadAdTask has already been called.");
        this.h = true;
        ((Handler) m.a().c.a()).post(new i(this, activity, this.k, this.l, this.m));
    }

    public synchronized void b() {
        com.google.ads.util.a.a(this.h, "destroy() called but startLoadAdTask has not been called.");
        ((Handler) m.a().c.a()).post(new Runnable() {
            public void run() {
                if (h.this.l()) {
                    com.google.ads.util.a.b(h.this.g);
                    try {
                        h.this.g.destroy();
                        b.a("Called destroy() for adapter with class: " + h.this.g.getClass().getName());
                    } catch (Throwable th) {
                        b.b("Error while destroying adapter (" + h.this.h() + "):", th);
                    }
                }
            }
        });
    }

    public synchronized boolean c() {
        return this.c;
    }

    public synchronized boolean d() {
        com.google.ads.util.a.a(this.c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
        return this.d;
    }

    public synchronized a e() {
        a aVar;
        if (this.e == null) {
            aVar = a.TIMEOUT;
        } else {
            aVar = this.e;
        }
        return aVar;
    }

    public synchronized View f() {
        com.google.ads.util.a.a(this.c, "getAdView() called when isLoadAdTaskDone() is false.");
        return this.j;
    }

    public synchronized void g() {
        com.google.ads.util.a.a(this.a.a());
        try {
            final MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.g;
            ((Handler) m.a().c.a()).post(new Runnable() {
                public void run() {
                    try {
                        mediationInterstitialAdapter.showInterstitial();
                    } catch (Throwable th) {
                        b.b("Error while telling adapter (" + h.this.h() + ") ad to show interstitial: ", th);
                    }
                }
            });
        } catch (ClassCastException e) {
            b.b("In Ambassador.show(): ambassador.adapter does not implement the MediationInterstitialAdapter interface.", e);
        }
        return;
    }

    public synchronized String h() {
        return this.g != null ? this.g.getClass().getName() : "\"adapter was not created.\"";
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(boolean z, a aVar) {
        this.d = z;
        this.c = true;
        this.e = aVar;
        notify();
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(MediationAdapter<?, ?> mediationAdapter) {
        this.g = mediationAdapter;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized MediationAdapter<?, ?> i() {
        return this.g;
    }

    /* Access modifiers changed, original: 0000 */
    public e j() {
        return this.f;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(View view) {
        this.j = view;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void k() {
        this.i = true;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized boolean l() {
        return this.i;
    }
}
