package com.google.ads.a;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;

public class a extends e {
    private volatile boolean b = true;
    private boolean c = true;
    private int d = 0;
    private int e = 0;
    private final ad f;

    public a(bt btVar) {
        super(btVar, null);
        if (AdUtil.a < ((Integer) ((bs) ((br) btVar.d.a()).b.a()).c.a()).intValue()) {
            g.a("Disabling hardware acceleration for an activation overlay.");
            g();
        }
        this.f = ad.a((w) btVar.b.a(), h.c, true, true);
        setWebViewClient(this.f);
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public boolean canScrollHorizontally(int i) {
        return false;
    }

    public boolean canScrollVertically(int i) {
        return false;
    }

    public int d() {
        return this.d;
    }

    public ad e() {
        return this.f;
    }

    public void setOverlayActivated(boolean z) {
        this.c = z;
    }

    public void setOverlayEnabled(boolean z) {
        if (!z) {
            ((Handler) br.a().c.a()).post(new b(this, this));
        }
        this.b = z;
    }

    public void setXPosition(int i) {
        this.d = i;
    }

    public void setYPosition(int i) {
        this.e = i;
    }
}
