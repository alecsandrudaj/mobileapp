package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.b;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k extends v implements l {
    private int a;
    private List b = Collections.emptyList();
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    private k() {
        l();
    }

    private void l() {
    }

    private static k m() {
        return new k();
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList(this.b);
            this.a |= 1;
        }
    }

    /* renamed from: a */
    public k g() {
        return m().a(d());
    }

    public k a(int i) {
        this.a |= 2;
        this.c = i;
        return this;
    }

    public k a(i iVar) {
        if (iVar != i.a()) {
            if (!iVar.f.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = iVar.f;
                    this.a &= -2;
                } else {
                    n();
                    this.b.addAll(iVar.f);
                }
            }
            if (iVar.f()) {
                a(iVar.g());
            }
            if (iVar.h()) {
                b(iVar.i());
            }
            if (iVar.k()) {
                a(iVar.l());
            }
            if (iVar.m()) {
                b(iVar.q());
            }
            a(r().a(iVar.d));
        }
        return this;
    }

    /* renamed from: a */
    public k c(com.google.tagmanager.a.k kVar, o oVar) {
        Throwable th;
        i iVar;
        i iVar2;
        try {
            iVar2 = (i) i.a.b(kVar, oVar);
            if (iVar2 != null) {
                a(iVar2);
            }
            return this;
        } catch (af e) {
            af afVar = e;
            iVar2 = (i) afVar.a();
            throw afVar;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            iVar = iVar2;
            th = th3;
        }
        if (iVar != null) {
            a(iVar);
        }
        throw th;
    }

    public k a(boolean z) {
        this.a |= 8;
        this.e = z;
        return this;
    }

    /* renamed from: b */
    public i p() {
        return i.a();
    }

    public k b(int i) {
        this.a |= 4;
        this.d = i;
        return this;
    }

    public k b(boolean z) {
        this.a |= 16;
        this.f = z;
        return this;
    }

    /* renamed from: c */
    public i h() {
        i d = d();
        if (d.j()) {
            return d;
        }
        throw b.a(d);
    }

    public i d() {
        int i = 1;
        i iVar = new i((v) this, null);
        int i2 = this.a;
        if ((this.a & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
            this.a &= -2;
        }
        iVar.f = this.b;
        if ((i2 & 2) != 2) {
            i = 0;
        }
        iVar.g = this.c;
        if ((i2 & 4) == 4) {
            i |= 2;
        }
        iVar.h = this.d;
        if ((i2 & 8) == 8) {
            i |= 4;
        }
        iVar.i = this.e;
        if ((i2 & 16) == 16) {
            i |= 8;
        }
        iVar.j = this.f;
        iVar.e = i;
        return iVar;
    }

    public boolean i() {
        return (this.a & 2) == 2;
    }

    public final boolean j() {
        return i();
    }
}
