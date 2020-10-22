package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import com.google.ads.a.ac;
import com.google.ads.a.w;
import com.google.ads.util.e;
import com.google.ads.util.g;
import java.util.HashMap;
import java.util.List;

public class bd {
    private final w a;
    private bk b;
    private final Object c;
    private Thread d;
    private final Object e;
    private boolean f;
    private final Object g;

    protected bd() {
        this.b = null;
        this.c = new Object();
        this.d = null;
        this.e = new Object();
        this.f = false;
        this.g = new Object();
        this.a = null;
    }

    public bd(w wVar) {
        this.b = null;
        this.c = new Object();
        this.d = null;
        this.e = new Object();
        this.f = false;
        this.g = new Object();
        e.a(wVar);
        this.a = wVar;
    }

    public static boolean a(ba baVar, w wVar) {
        if (baVar.j() == null) {
            return true;
        }
        if (!wVar.h().b()) {
            g c = ((ac) wVar.h().g.a()).c();
            if (baVar.j().a()) {
                g.e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + c + ") in the ad-type field in the mediation UI.");
                return false;
            }
            g c2 = baVar.j().c();
            if (c2 == c) {
                return true;
            }
            g.e("Mediation server returned ad size: '" + c2 + "', while the AdView was created with ad size: '" + c + "'. Using the ad-size passed to the AdView on creation.");
            return false;
        } else if (baVar.j().a()) {
            return true;
        } else {
            g.e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
            return false;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    private boolean a(java.lang.String r8, android.app.Activity r9, com.google.ads.d r10, com.google.ads.bh r11, java.util.HashMap r12, long r13) {
        /*
        r7 = this;
        r0 = new com.google.ads.bk;
        r1 = r7.a;
        r1 = r1.h();
        r1 = r1.g;
        r2 = r1.a();
        r2 = (com.google.ads.a.ac) r2;
        r1 = r7;
        r3 = r11;
        r4 = r8;
        r5 = r10;
        r6 = r12;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        monitor-enter(r0);
        r0.a(r9);	 Catch:{ all -> 0x00ba }
    L_0x001c:
        r1 = r0.b();	 Catch:{ InterruptedException -> 0x0037 }
        if (r1 != 0) goto L_0x004e;
    L_0x0022:
        r1 = 0;
        r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x004e;
    L_0x0028:
        r1 = android.os.SystemClock.elapsedRealtime();	 Catch:{ InterruptedException -> 0x0037 }
        r0.wait(r13);	 Catch:{ InterruptedException -> 0x0037 }
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ InterruptedException -> 0x0037 }
        r1 = r3 - r1;
        r13 = r13 - r1;
        goto L_0x001c;
    L_0x0037:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ba }
        r1.<init>();	 Catch:{ all -> 0x00ba }
        r2 = "Interrupted while waiting for ad network to load ad using adapter class: ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ba }
        r1 = r1.append(r8);	 Catch:{ all -> 0x00ba }
        r1 = r1.toString();	 Catch:{ all -> 0x00ba }
        com.google.ads.util.g.a(r1);	 Catch:{ all -> 0x00ba }
    L_0x004e:
        r1 = r7.a;	 Catch:{ all -> 0x00ba }
        r1 = r1.m();	 Catch:{ all -> 0x00ba }
        r2 = r0.d();	 Catch:{ all -> 0x00ba }
        r1.a(r2);	 Catch:{ all -> 0x00ba }
        r1 = r0.b();	 Catch:{ all -> 0x00ba }
        if (r1 == 0) goto L_0x0093;
    L_0x0061:
        r1 = r0.c();	 Catch:{ all -> 0x00ba }
        if (r1 == 0) goto L_0x0093;
    L_0x0067:
        r1 = r7.a;	 Catch:{ all -> 0x00ba }
        r1 = r1.h();	 Catch:{ all -> 0x00ba }
        r1 = r1.b();	 Catch:{ all -> 0x00ba }
        if (r1 == 0) goto L_0x008d;
    L_0x0073:
        r1 = 0;
        r2 = r1;
    L_0x0075:
        r1 = com.google.ads.br.a();	 Catch:{ all -> 0x00ba }
        r1 = r1.c;	 Catch:{ all -> 0x00ba }
        r1 = r1.a();	 Catch:{ all -> 0x00ba }
        r1 = (android.os.Handler) r1;	 Catch:{ all -> 0x00ba }
        r3 = new com.google.ads.bg;	 Catch:{ all -> 0x00ba }
        r3.<init>(r7, r0, r2, r11);	 Catch:{ all -> 0x00ba }
        r1.post(r3);	 Catch:{ all -> 0x00ba }
        r1 = 1;
        monitor-exit(r0);	 Catch:{ all -> 0x00ba }
        r0 = r1;
    L_0x008c:
        return r0;
    L_0x008d:
        r1 = r0.e();	 Catch:{ all -> 0x00ba }
        r2 = r1;
        goto L_0x0075;
    L_0x0093:
        r1 = r0.b();	 Catch:{ all -> 0x00ba }
        if (r1 != 0) goto L_0x00b3;
    L_0x0099:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ba }
        r1.<init>();	 Catch:{ all -> 0x00ba }
        r2 = "Timeout occurred in adapter class: ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ba }
        r2 = r0.f();	 Catch:{ all -> 0x00ba }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ba }
        r1 = r1.toString();	 Catch:{ all -> 0x00ba }
        com.google.ads.util.g.a(r1);	 Catch:{ all -> 0x00ba }
    L_0x00b3:
        r0.a();	 Catch:{ all -> 0x00ba }
        r1 = 0;
        monitor-exit(r0);	 Catch:{ all -> 0x00ba }
        r0 = r1;
        goto L_0x008c;
    L_0x00ba:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ba }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.bd.a(java.lang.String, android.app.Activity, com.google.ads.d, com.google.ads.bh, java.util.HashMap, long):boolean");
    }

    private void b(ba baVar, d dVar) {
        synchronized (this.e) {
            e.a(Thread.currentThread(), this.d);
        }
        List<k> f = baVar.f();
        long b = baVar.a() ? (long) baVar.b() : 10000;
        for (k kVar : f) {
            g.a("Looking to fetch ads from network: " + kVar.b());
            List<String> c = kVar.c();
            HashMap e = kVar.e();
            List d = kVar.d();
            String a = kVar.a();
            String b2 = kVar.b();
            String c2 = baVar.c();
            if (d == null) {
                d = baVar.g();
            }
            bh bhVar = new bh(a, b2, c2, d, baVar.h(), baVar.i());
            for (String b22 : c) {
                Activity activity = (Activity) this.a.h().c.a();
                if (activity == null) {
                    g.a("Activity is null while mediating.  Terminating mediation thread.");
                    return;
                }
                this.a.m().c();
                if (!a(b22, activity, dVar, bhVar, e, b)) {
                    if (b()) {
                        g.a("GWController.destroy() called. Terminating mediation thread.");
                        return;
                    }
                }
                return;
            }
        }
        ((Handler) br.a().c.a()).post(new bf(this, baVar));
    }

    private boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.f;
        }
        return z;
    }

    private boolean b(bk bkVar) {
        boolean z;
        synchronized (this.g) {
            if (b()) {
                bkVar.a();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void a(ba baVar, d dVar) {
        synchronized (this.e) {
            if (a()) {
                g.c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
                return;
            }
            if (baVar.d()) {
                this.a.a((float) baVar.e());
                if (!this.a.r()) {
                    this.a.f();
                }
            } else if (this.a.r()) {
                this.a.e();
            }
            a(baVar, this.a);
            this.d = new Thread(new be(this, baVar, dVar));
            this.d.start();
        }
    }

    public void a(bk bkVar) {
        synchronized (this.c) {
            if (this.b != bkVar) {
                if (this.b != null) {
                    this.b.a();
                }
                this.b = bkVar;
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.e) {
            z = this.d != null;
        }
        return z;
    }
}
