package com.google.analytics.a.a;

import com.google.android.gms.e;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.io.IOException;
import java.io.OutputStream;

public final class m extends t implements p {
    public static aq a = new n();
    private static final m c = new m(true);
    private static volatile ap j = null;
    private final h d;
    private int e;
    private int f;
    private int g;
    private byte h;
    private int i;

    static {
        c.l();
    }

    private m(k kVar, o oVar) {
        this.h = (byte) -1;
        this.i = -1;
        l();
        OutputStream i = h.i();
        com.google.tagmanager.a.m a = com.google.tagmanager.a.m.a(i);
        Object obj = null;
        while (obj == null) {
            try {
                int a2 = kVar.a();
                switch (a2) {
                    case e.MapAttrs_mapType /*0*/:
                        obj = 1;
                        break;
                    case e.MapAttrs_uiScrollGestures /*8*/:
                        this.e |= 1;
                        this.f = kVar.f();
                        break;
                    case 16:
                        this.e |= 2;
                        this.g = kVar.f();
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

    private m(v vVar) {
        super(vVar);
        this.h = (byte) -1;
        this.i = -1;
        this.d = vVar.r();
    }

    private m(boolean z) {
        this.h = (byte) -1;
        this.i = -1;
        this.d = h.a;
    }

    public static m a() {
        return c;
    }

    public static o a(m mVar) {
        return h().a(mVar);
    }

    public static o h() {
        return o.n();
    }

    private void l() {
        this.f = 0;
        this.g = 0;
    }

    /* renamed from: b */
    public m p() {
        return c;
    }

    public aq c() {
        return a;
    }

    public boolean d() {
        return (this.e & 1) == 1;
    }

    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        boolean z = d() == mVar.d();
        if (d()) {
            z = z && e() == mVar.e();
        }
        z = z && f() == mVar.f();
        return f() ? z && g() == mVar.g() : z;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public int g() {
        return this.g;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = m.class.hashCode() + 779;
        if (d()) {
            hashCode = (((hashCode * 37) + 1) * 53) + e();
        }
        if (f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g();
        }
        hashCode = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public o o() {
        return h();
    }

    public final boolean j() {
        byte b = this.h;
        if (b != (byte) -1) {
            return b == (byte) 1;
        } else {
            if (!d()) {
                this.h = (byte) 0;
                return false;
            } else if (f()) {
                this.h = (byte) 1;
                return true;
            } else {
                this.h = (byte) 0;
                return false;
            }
        }
    }

    /* renamed from: k */
    public o n() {
        return a(this);
    }
}
