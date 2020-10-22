package com.google.ads;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.util.a;
import com.google.ads.util.b;

class j implements MediationBannerListener {
    private final h a;
    private boolean b;

    public j(h hVar) {
        this.a = hVar;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public void onReceivedAd(com.google.ads.mediation.MediationBannerAdapter<?, ?> r5) {
        /*
        r4 = this;
        r1 = r4.a;
        monitor-enter(r1);
        r0 = r4.a;	 Catch:{ all -> 0x005f }
        r0 = r0.i();	 Catch:{ all -> 0x005f }
        com.google.ads.util.a.a(r5, r0);	 Catch:{ all -> 0x005f }
        r0 = r4.a;	 Catch:{ Throwable -> 0x002a }
        r2 = r5.getBannerView();	 Catch:{ Throwable -> 0x002a }
        r0.a(r2);	 Catch:{ Throwable -> 0x002a }
        r0 = r4.a;	 Catch:{ all -> 0x005f }
        r0 = r0.c();	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x0062;
    L_0x001d:
        r0 = 0;
        r4.b = r0;	 Catch:{ all -> 0x005f }
        r0 = r4.a;	 Catch:{ all -> 0x005f }
        r2 = 1;
        r3 = com.google.ads.g.a.AD;	 Catch:{ all -> 0x005f }
        r0.a(r2, r3);	 Catch:{ all -> 0x005f }
        monitor-exit(r1);	 Catch:{ all -> 0x005f }
    L_0x0029:
        return;
    L_0x002a:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005f }
        r2.<init>();	 Catch:{ all -> 0x005f }
        r3 = "Error while getting banner View from adapter (";
        r2 = r2.append(r3);	 Catch:{ all -> 0x005f }
        r3 = r4.a;	 Catch:{ all -> 0x005f }
        r3 = r3.h();	 Catch:{ all -> 0x005f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x005f }
        r3 = "): ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x005f }
        r2 = r2.toString();	 Catch:{ all -> 0x005f }
        com.google.ads.util.b.b(r2, r0);	 Catch:{ all -> 0x005f }
        r0 = r4.a;	 Catch:{ all -> 0x005f }
        r0 = r0.c();	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x005d;
    L_0x0055:
        r0 = r4.a;	 Catch:{ all -> 0x005f }
        r2 = 0;
        r3 = com.google.ads.g.a.EXCEPTION;	 Catch:{ all -> 0x005f }
        r0.a(r2, r3);	 Catch:{ all -> 0x005f }
    L_0x005d:
        monitor-exit(r1);	 Catch:{ all -> 0x005f }
        goto L_0x0029;
    L_0x005f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x005f }
        throw r0;
    L_0x0062:
        r0 = 1;
        r4.b = r0;	 Catch:{ all -> 0x005f }
        r0 = r4.a;	 Catch:{ all -> 0x005f }
        r0 = r0.j();	 Catch:{ all -> 0x005f }
        r2 = r4.a;	 Catch:{ all -> 0x005f }
        r3 = r4.a;	 Catch:{ all -> 0x005f }
        r3 = r3.f();	 Catch:{ all -> 0x005f }
        r0.a(r2, r3);	 Catch:{ all -> 0x005f }
        monitor-exit(r1);	 Catch:{ all -> 0x005f }
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.j.onReceivedAd(com.google.ads.mediation.MediationBannerAdapter):void");
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> adapter, ErrorCode error) {
        synchronized (this.a) {
            a.a((Object) adapter, this.a.i());
            b.a("Mediation adapter " + adapter.getClass().getName() + " failed to receive ad with error code: " + error);
            if (!this.a.c()) {
                this.a.a(false, error == ErrorCode.NO_FILL ? g.a.NO_FILL : g.a.ERROR);
            }
        }
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        synchronized (this.a) {
            this.a.j().a(this.a);
        }
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        synchronized (this.a) {
            this.a.j().b(this.a);
        }
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        synchronized (this.a) {
            this.a.j().c(this.a);
        }
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        synchronized (this.a) {
            a.a(this.a.c());
            this.a.j().a(this.a, this.b);
        }
    }
}
