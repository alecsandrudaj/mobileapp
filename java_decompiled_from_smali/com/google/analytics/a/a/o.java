package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.b;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.v;

public final class o extends v implements p {
    private int a;
    private int b;
    private int c;

    private o() {
        m();
    }

    private void m() {
    }

    private static o n() {
        return new o();
    }

    /* renamed from: a */
    public o g() {
        return n().a(d());
    }

    public o a(int i) {
        this.a |= 1;
        this.b = i;
        return this;
    }

    public o a(m mVar) {
        if (mVar != m.a()) {
            if (mVar.d()) {
                a(mVar.e());
            }
            if (mVar.f()) {
                b(mVar.g());
            }
            a(r().a(mVar.d));
        }
        return this;
    }

    /* renamed from: a */
    public o c(k kVar, com.google.tagmanager.a.o oVar) {
        Throwable th;
        m mVar;
        m mVar2;
        try {
            mVar2 = (m) m.a.b(kVar, oVar);
            if (mVar2 != null) {
                a(mVar2);
            }
            return this;
        } catch (af e) {
            af afVar = e;
            mVar2 = (m) afVar.a();
            throw afVar;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            mVar = mVar2;
            th = th3;
        }
        if (mVar != null) {
            a(mVar);
        }
        throw th;
    }

    /* renamed from: b */
    public m p() {
        return m.a();
    }

    public o b(int i) {
        this.a |= 2;
        this.c = i;
        return this;
    }

    /* renamed from: c */
    public m h() {
        m d = d();
        if (d.j()) {
            return d;
        }
        throw b.a(d);
    }

    public m d() {
        int i = 1;
        m mVar = new m((v) this, null);
        int i2 = this.a;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        mVar.f = this.b;
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        mVar.g = this.c;
        mVar.e = i;
        return mVar;
    }

    public boolean i() {
        return (this.a & 1) == 1;
    }

    public final boolean j() {
        return i() && k();
    }

    public boolean k() {
        return (this.a & 2) == 2;
    }
}
