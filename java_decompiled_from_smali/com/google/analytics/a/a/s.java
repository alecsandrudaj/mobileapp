package com.google.analytics.a.a;

import com.google.analytics.b.a.a.c;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.b;
import com.google.tagmanager.a.bg;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class s extends v implements t {
    private int a;
    private ai b = ah.a;
    private List c = Collections.emptyList();
    private List d = Collections.emptyList();
    private List e = Collections.emptyList();
    private List f = Collections.emptyList();
    private List g = Collections.emptyList();
    private List h = Collections.emptyList();
    private Object i = "";
    private Object j = "";
    private Object k = "0";
    private Object l = "";
    private c m = c.a();
    private float n;
    private boolean o;
    private ai p = ah.a;
    private int q;

    private s() {
        q();
    }

    private void A() {
        if ((this.a & 16384) != 16384) {
            this.p = new ah(this.p);
            this.a |= 16384;
        }
    }

    private void q() {
    }

    private static s s() {
        return new s();
    }

    private void t() {
        if ((this.a & 1) != 1) {
            this.b = new ah(this.b);
            this.a |= 1;
        }
    }

    private void u() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList(this.c);
            this.a |= 2;
        }
    }

    private void v() {
        if ((this.a & 4) != 4) {
            this.d = new ArrayList(this.d);
            this.a |= 4;
        }
    }

    private void w() {
        if ((this.a & 8) != 8) {
            this.e = new ArrayList(this.e);
            this.a |= 8;
        }
    }

    private void x() {
        if ((this.a & 16) != 16) {
            this.f = new ArrayList(this.f);
            this.a |= 16;
        }
    }

    private void y() {
        if ((this.a & 32) != 32) {
            this.g = new ArrayList(this.g);
            this.a |= 32;
        }
    }

    private void z() {
        if ((this.a & 64) != 64) {
            this.h = new ArrayList(this.h);
            this.a |= 64;
        }
    }

    /* renamed from: a */
    public s g() {
        return s().a(d());
    }

    public s a(float f) {
        this.a |= 4096;
        this.n = f;
        return this;
    }

    public s a(c cVar) {
        if ((this.a & 2048) != 2048 || this.m == c.a()) {
            this.m = cVar;
        } else {
            this.m = c.a(this.m).a(cVar).d();
        }
        this.a |= 2048;
        return this;
    }

    public s a(q qVar) {
        if (qVar != q.a()) {
            if (!qVar.f.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = qVar.f;
                    this.a &= -2;
                } else {
                    t();
                    this.b.addAll(qVar.f);
                }
            }
            if (!qVar.g.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = qVar.g;
                    this.a &= -3;
                } else {
                    u();
                    this.c.addAll(qVar.g);
                }
            }
            if (!qVar.h.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = qVar.h;
                    this.a &= -5;
                } else {
                    v();
                    this.d.addAll(qVar.h);
                }
            }
            if (!qVar.i.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = qVar.i;
                    this.a &= -9;
                } else {
                    w();
                    this.e.addAll(qVar.i);
                }
            }
            if (!qVar.j.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = qVar.j;
                    this.a &= -17;
                } else {
                    x();
                    this.f.addAll(qVar.j);
                }
            }
            if (!qVar.k.isEmpty()) {
                if (this.g.isEmpty()) {
                    this.g = qVar.k;
                    this.a &= -33;
                } else {
                    y();
                    this.g.addAll(qVar.k);
                }
            }
            if (!qVar.l.isEmpty()) {
                if (this.h.isEmpty()) {
                    this.h = qVar.l;
                    this.a &= -65;
                } else {
                    z();
                    this.h.addAll(qVar.l);
                }
            }
            if (qVar.v()) {
                this.a |= 128;
                this.i = qVar.m;
            }
            if (qVar.x()) {
                this.a |= 256;
                this.j = qVar.n;
            }
            if (qVar.z()) {
                this.a |= 512;
                this.k = qVar.o;
            }
            if (qVar.B()) {
                this.a |= 1024;
                this.l = qVar.p;
            }
            if (qVar.D()) {
                a(qVar.E());
            }
            if (qVar.F()) {
                a(qVar.G());
            }
            if (qVar.H()) {
                a(qVar.I());
            }
            if (!qVar.t.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = qVar.t;
                    this.a &= -16385;
                } else {
                    A();
                    this.p.addAll(qVar.t);
                }
            }
            if (qVar.L()) {
                f(qVar.M());
            }
            a(r().a(qVar.d));
        }
        return this;
    }

    /* renamed from: a */
    public s c(k kVar, o oVar) {
        Throwable th;
        q qVar;
        q qVar2;
        try {
            qVar2 = (q) q.a.b(kVar, oVar);
            if (qVar2 != null) {
                a(qVar2);
            }
            return this;
        } catch (af e) {
            af afVar = e;
            qVar2 = (q) afVar.a();
            throw afVar;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            qVar = qVar2;
            th = th3;
        }
        if (qVar != null) {
            a(qVar);
        }
        throw th;
    }

    public s a(boolean z) {
        this.a |= 8192;
        this.o = z;
        return this;
    }

    public c a(int i) {
        return (c) this.c.get(i);
    }

    public m b(int i) {
        return (m) this.d.get(i);
    }

    /* renamed from: b */
    public q p() {
        return q.a();
    }

    public i c(int i) {
        return (i) this.e.get(i);
    }

    /* renamed from: c */
    public q h() {
        q d = d();
        if (d.j()) {
            return d;
        }
        throw b.a(d);
    }

    public i d(int i) {
        return (i) this.f.get(i);
    }

    public q d() {
        int i = 1;
        q qVar = new q((v) this, null);
        int i2 = this.a;
        if ((this.a & 1) == 1) {
            this.b = new bg(this.b);
            this.a &= -2;
        }
        qVar.f = this.b;
        if ((this.a & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
            this.a &= -3;
        }
        qVar.g = this.c;
        if ((this.a & 4) == 4) {
            this.d = Collections.unmodifiableList(this.d);
            this.a &= -5;
        }
        qVar.h = this.d;
        if ((this.a & 8) == 8) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= -9;
        }
        qVar.i = this.e;
        if ((this.a & 16) == 16) {
            this.f = Collections.unmodifiableList(this.f);
            this.a &= -17;
        }
        qVar.j = this.f;
        if ((this.a & 32) == 32) {
            this.g = Collections.unmodifiableList(this.g);
            this.a &= -33;
        }
        qVar.k = this.g;
        if ((this.a & 64) == 64) {
            this.h = Collections.unmodifiableList(this.h);
            this.a &= -65;
        }
        qVar.l = this.h;
        if ((i2 & 128) != 128) {
            i = 0;
        }
        qVar.m = this.i;
        if ((i2 & 256) == 256) {
            i |= 2;
        }
        qVar.n = this.j;
        if ((i2 & 512) == 512) {
            i |= 4;
        }
        qVar.o = this.k;
        if ((i2 & 1024) == 1024) {
            i |= 8;
        }
        qVar.p = this.l;
        if ((i2 & 2048) == 2048) {
            i |= 16;
        }
        qVar.q = this.m;
        if ((i2 & 4096) == 4096) {
            i |= 32;
        }
        qVar.r = this.n;
        if ((i2 & 8192) == 8192) {
            i |= 64;
        }
        qVar.s = this.o;
        if ((this.a & 16384) == 16384) {
            this.p = new bg(this.p);
            this.a &= -16385;
        }
        qVar.t = this.p;
        if ((i2 & 32768) == 32768) {
            i |= 128;
        }
        qVar.u = this.q;
        qVar.e = i;
        return qVar;
    }

    public i e(int i) {
        return (i) this.g.get(i);
    }

    public s f(int i) {
        this.a |= 32768;
        this.q = i;
        return this;
    }

    public int i() {
        return this.c.size();
    }

    public final boolean j() {
        int i;
        for (i = 0; i < i(); i++) {
            if (!a(i).j()) {
                return false;
            }
        }
        for (i = 0; i < k(); i++) {
            if (!b(i).j()) {
                return false;
            }
        }
        for (i = 0; i < l(); i++) {
            if (!c(i).j()) {
                return false;
            }
        }
        for (i = 0; i < m(); i++) {
            if (!d(i).j()) {
                return false;
            }
        }
        for (i = 0; i < n(); i++) {
            if (!e(i).j()) {
                return false;
            }
        }
        return true;
    }

    public int k() {
        return this.d.size();
    }

    public int l() {
        return this.e.size();
    }

    public int m() {
        return this.f.size();
    }

    public int n() {
        return this.g.size();
    }
}
