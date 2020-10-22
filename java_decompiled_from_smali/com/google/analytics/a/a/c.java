package com.google.analytics.a.a;

import com.google.android.gms.e;
import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.m;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.io.IOException;
import java.io.OutputStream;

public final class c extends t implements h {
    public static aq a = new d();
    private static final c c = new c(true);
    private static volatile ap k = null;
    private final h d;
    private int e;
    private f f;
    private int g;
    private int h;
    private byte i;
    private int j;

    static {
        c.q();
    }

    private c(k kVar, o oVar) {
        this.i = (byte) -1;
        this.j = -1;
        q();
        OutputStream i = h.i();
        m a = m.a(i);
        Object obj = null;
        while (obj == null) {
            try {
                int a2 = kVar.a();
                switch (a2) {
                    case e.MapAttrs_mapType /*0*/:
                        obj = 1;
                        break;
                    case e.MapAttrs_uiScrollGestures /*8*/:
                        int n = kVar.n();
                        f a3 = f.a(n);
                        if (a3 != null) {
                            this.e |= 1;
                            this.f = a3;
                            break;
                        }
                        a.d(a2);
                        a.d(n);
                        break;
                    case 16:
                        this.e |= 2;
                        this.g = kVar.f();
                        break;
                    case 24:
                        this.e |= 4;
                        this.h = kVar.f();
                        break;
                    default:
                        if (!a(kVar, a, oVar, a2)) {
                            obj = 1;
                            break;
                        }
                        break;
                }
            } catch (af e) {
                throw e.a(this);
            } catch (IOException e2) {
                throw new af(e2.getMessage()).a(this);
            } catch (Throwable th) {
                try {
                    a.a();
                } catch (IOException e3) {
                    R();
                } finally {
                    this.d = i.a();
                }
                R();
            }
        }
        try {
            a.a();
        } catch (IOException e4) {
        } finally {
            this.d = i.a();
        }
        R();
    }

    private c(v vVar) {
        super(vVar);
        this.i = (byte) -1;
        this.j = -1;
        this.d = vVar.r();
    }

    private c(boolean z) {
        this.i = (byte) -1;
        this.j = -1;
        this.d = h.a;
    }

    public static c a() {
        return c;
    }

    public static e a(c cVar) {
        return k().a(cVar);
    }

    public static e k() {
        return e.l();
    }

    private void q() {
        this.f = f.NO_CACHE;
        this.g = 0;
        this.h = 0;
    }

    /* renamed from: b */
    public c p() {
        return c;
    }

    public aq c() {
        return a;
    }

    public boolean d() {
        return (this.e & 1) == 1;
    }

    public f e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return super.equals(obj);
        }
        c cVar = (c) obj;
        boolean z = d() == cVar.d();
        if (d()) {
            z = z && e() == cVar.e();
        }
        z = z && f() == cVar.f();
        if (f()) {
            z = z && g() == cVar.g();
        }
        z = z && h() == cVar.h();
        return h() ? z && i() == cVar.i() : z;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return (this.e & 4) == 4;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = c.class.hashCode() + 779;
        if (d()) {
            hashCode = (((hashCode * 37) + 1) * 53) + ac.a(e());
        }
        if (f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g();
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 3) * 53) + i();
        }
        hashCode = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int i() {
        return this.h;
    }

    public final boolean j() {
        byte b = this.i;
        if (b != (byte) -1) {
            return b == (byte) 1;
        } else {
            this.i = (byte) 1;
            return true;
        }
    }

    /* renamed from: l */
    public e o() {
        return k();
    }

    /* renamed from: m */
    public e n() {
        return a(this);
    }
}
