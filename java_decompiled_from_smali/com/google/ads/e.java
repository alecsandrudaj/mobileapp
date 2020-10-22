package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.google.ads.internal.d;
import com.google.ads.internal.h;
import com.google.ads.util.a;
import com.google.ads.util.b;
import java.util.HashMap;
import java.util.List;

public class e {
    private final d a;
    private h b;
    private final Object c;
    private Thread d;
    private final Object e;
    private boolean f;
    private final Object g;

    public e(d dVar) {
        this.b = null;
        this.c = new Object();
        this.d = null;
        this.e = new Object();
        this.f = false;
        this.g = new Object();
        a.b((Object) dVar);
        this.a = dVar;
    }

    public boolean a() {
        boolean z;
        synchronized (this.e) {
            z = this.d != null;
        }
        return z;
    }

    public void b() {
        synchronized (this.g) {
            this.f = true;
            d(null);
            synchronized (this.e) {
                if (this.d != null) {
                    this.d.interrupt();
                }
            }
        }
    }

    public void a(final c cVar, final AdRequest adRequest) {
        synchronized (this.e) {
            if (a()) {
                b.c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
                return;
            }
            if (cVar.d()) {
                this.a.a((float) cVar.e());
                if (!this.a.t()) {
                    this.a.g();
                }
            } else if (this.a.t()) {
                this.a.f();
            }
            a(cVar, this.a);
            this.d = new Thread(new Runnable() {
                public void run() {
                    e.this.b(cVar, adRequest);
                    synchronized (e.this.e) {
                        e.this.d = null;
                    }
                }
            });
            this.d.start();
        }
    }

    public static boolean a(c cVar, d dVar) {
        if (cVar.j() == null) {
            return true;
        }
        if (!dVar.i().b()) {
            AdSize c = ((h) dVar.i().g.a()).c();
            if (cVar.j().a()) {
                b.e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + c + ") in the ad-type field in the mediation UI.");
                return false;
            }
            AdSize c2 = cVar.j().c();
            if (c2 == c) {
                return true;
            }
            b.e("Mediation server returned ad size: '" + c2 + "', while the AdView was created with ad size: '" + c + "'. Using the ad-size passed to the AdView on creation.");
            return false;
        } else if (cVar.j().a()) {
            return true;
        } else {
            b.e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
            return false;
        }
    }

    private boolean a(h hVar, String str) {
        if (e() == hVar) {
            return true;
        }
        b.c("GWController: ignoring callback to " + str + " from non showing ambassador with adapter class: '" + hVar.h() + "'.");
        return false;
    }

    public void a(h hVar, final boolean z) {
        if (a(hVar, "onAdClicked()")) {
            final f a = hVar.a();
            ((Handler) m.a().c.a()).post(new Runnable() {
                public void run() {
                    e.this.a.a(a, z);
                }
            });
        }
    }

    public void a(h hVar, final View view) {
        if (e() != hVar) {
            b.c("GWController: ignoring onAdRefreshed() callback from non-showing ambassador (adapter class name is '" + hVar.h() + "').");
            return;
        }
        this.a.n().a(g.a.AD);
        final f a = this.b.a();
        ((Handler) m.a().c.a()).post(new Runnable() {
            public void run() {
                e.this.a.a(view, e.this.b, a, true);
            }
        });
    }

    public void a(h hVar) {
        if (a(hVar, "onPresentScreen")) {
            ((Handler) m.a().c.a()).post(new Runnable() {
                public void run() {
                    e.this.a.v();
                }
            });
        }
    }

    public void b(h hVar) {
        if (a(hVar, "onDismissScreen")) {
            ((Handler) m.a().c.a()).post(new Runnable() {
                public void run() {
                    e.this.a.u();
                }
            });
        }
    }

    public void c(h hVar) {
        if (a(hVar, "onLeaveApplication")) {
            ((Handler) m.a().c.a()).post(new Runnable() {
                public void run() {
                    e.this.a.w();
                }
            });
        }
    }

    public boolean c() {
        a.a(this.a.i().b());
        h e = e();
        if (e != null) {
            e.g();
            return true;
        }
        b.b("There is no ad ready to show.");
        return false;
    }

    protected e() {
        this.b = null;
        this.c = new Object();
        this.d = null;
        this.e = new Object();
        this.f = false;
        this.g = new Object();
        this.a = null;
    }

    private boolean d() {
        boolean z;
        synchronized (this.g) {
            z = this.f;
        }
        return z;
    }

    private void b(final c cVar, AdRequest adRequest) {
        synchronized (this.e) {
            a.a(Thread.currentThread(), this.d);
        }
        List<a> f = cVar.f();
        long b = cVar.a() ? (long) cVar.b() : 10000;
        for (a aVar : f) {
            b.a("Looking to fetch ads from network: " + aVar.b());
            List<String> c = aVar.c();
            HashMap e = aVar.e();
            List d = aVar.d();
            String a = aVar.a();
            String b2 = aVar.b();
            String c2 = cVar.c();
            if (d == null) {
                d = cVar.g();
            }
            f fVar = new f(a, b2, c2, d, cVar.h(), cVar.i());
            for (String b22 : c) {
                Activity activity = (Activity) this.a.i().c.a();
                if (activity == null) {
                    b.a("Activity is null while mediating.  Terminating mediation thread.");
                    return;
                }
                this.a.n().c();
                if (!a(b22, activity, adRequest, fVar, e, b)) {
                    if (d()) {
                        b.a("GWController.destroy() called. Terminating mediation thread.");
                        return;
                    }
                }
                return;
            }
        }
        ((Handler) m.a().c.a()).post(new Runnable() {
            public void run() {
                e.this.a.b(cVar);
            }
        });
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    private boolean a(java.lang.String r8, android.app.Activity r9, com.google.ads.AdRequest r10, final com.google.ads.f r11, java.util.HashMap<java.lang.String, java.lang.String> r12, long r13) {
        /*
        r7 = this;
        r0 = new com.google.ads.h;
        r1 = r7.a;
        r1 = r1.i();
        r1 = r1.g;
        r2 = r1.a();
        r2 = (com.google.ads.internal.h) r2;
        r1 = r7;
        r3 = r11;
        r4 = r8;
        r5 = r10;
        r6 = r12;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        monitor-enter(r0);
        r0.a(r9);	 Catch:{ all -> 0x00ba }
    L_0x001c:
        r1 = r0.c();	 Catch:{ InterruptedException -> 0x0037 }
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
        com.google.ads.util.b.a(r1);	 Catch:{ all -> 0x00ba }
    L_0x004e:
        r1 = r7.a;	 Catch:{ all -> 0x00ba }
        r1 = r1.n();	 Catch:{ all -> 0x00ba }
        r2 = r0.e();	 Catch:{ all -> 0x00ba }
        r1.a(r2);	 Catch:{ all -> 0x00ba }
        r1 = r0.c();	 Catch:{ all -> 0x00ba }
        if (r1 == 0) goto L_0x0093;
    L_0x0061:
        r1 = r0.d();	 Catch:{ all -> 0x00ba }
        if (r1 == 0) goto L_0x0093;
    L_0x0067:
        r1 = r7.a;	 Catch:{ all -> 0x00ba }
        r1 = r1.i();	 Catch:{ all -> 0x00ba }
        r1 = r1.b();	 Catch:{ all -> 0x00ba }
        if (r1 == 0) goto L_0x008d;
    L_0x0073:
        r1 = 0;
        r2 = r1;
    L_0x0075:
        r1 = com.google.ads.m.a();	 Catch:{ all -> 0x00ba }
        r1 = r1.c;	 Catch:{ all -> 0x00ba }
        r1 = r1.a();	 Catch:{ all -> 0x00ba }
        r1 = (android.os.Handler) r1;	 Catch:{ all -> 0x00ba }
        r3 = new com.google.ads.e$8;	 Catch:{ all -> 0x00ba }
        r3.<init>(r0, r2, r11);	 Catch:{ all -> 0x00ba }
        r1.post(r3);	 Catch:{ all -> 0x00ba }
        r1 = 1;
        monitor-exit(r0);	 Catch:{ all -> 0x00ba }
        r0 = r1;
    L_0x008c:
        return r0;
    L_0x008d:
        r1 = r0.f();	 Catch:{ all -> 0x00ba }
        r2 = r1;
        goto L_0x0075;
    L_0x0093:
        r1 = r0.c();	 Catch:{ all -> 0x00ba }
        if (r1 != 0) goto L_0x00b3;
    L_0x0099:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ba }
        r1.<init>();	 Catch:{ all -> 0x00ba }
        r2 = "Timeout occurred in adapter class: ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ba }
        r2 = r0.h();	 Catch:{ all -> 0x00ba }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00ba }
        r1 = r1.toString();	 Catch:{ all -> 0x00ba }
        com.google.ads.util.b.a(r1);	 Catch:{ all -> 0x00ba }
    L_0x00b3:
        r0.b();	 Catch:{ all -> 0x00ba }
        r1 = 0;
        monitor-exit(r0);	 Catch:{ all -> 0x00ba }
        r0 = r1;
        goto L_0x008c;
    L_0x00ba:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ba }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.e.a(java.lang.String, android.app.Activity, com.google.ads.AdRequest, com.google.ads.f, java.util.HashMap, long):boolean");
    }

    private boolean e(h hVar) {
        boolean z;
        synchronized (this.g) {
            if (d()) {
                hVar.b();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private h e() {
        h hVar;
        synchronized (this.c) {
            hVar = this.b;
        }
        return hVar;
    }

    public void d(h hVar) {
        synchronized (this.c) {
            if (this.b != hVar) {
                if (this.b != null) {
                    this.b.b();
                }
                this.b = hVar;
            }
        }
    }
}
