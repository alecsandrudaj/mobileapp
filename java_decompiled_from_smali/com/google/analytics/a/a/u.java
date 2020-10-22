package com.google.analytics.a.a;

import com.google.ads.AdSize;
import com.google.android.gms.e;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class u extends t implements x {
    public static aq a = new v();
    private static final u c = new u(true);
    private static volatile ap q = null;
    private final h d;
    private List e;
    private List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;
    private List n;
    private byte o;
    private int p;

    static {
        c.E();
    }

    private u(k kVar, o oVar) {
        this.o = (byte) -1;
        this.p = -1;
        E();
        int i = 0;
        OutputStream i2 = h.i();
        m a = m.a(i2);
        Object obj = null;
        while (obj == null) {
            try {
                int a2 = kVar.a();
                switch (a2) {
                    case e.MapAttrs_mapType /*0*/:
                        obj = 1;
                        break;
                    case e.MapAttrs_uiScrollGestures /*8*/:
                        if ((i & 1) != 1) {
                            this.e = new ArrayList();
                            i |= 1;
                        }
                        this.e.add(Integer.valueOf(kVar.f()));
                        break;
                    case e.MapAttrs_uiZoomControls /*10*/:
                        a2 = kVar.c(kVar.s());
                        if ((i & 1) != 1 && kVar.w() > 0) {
                            this.e = new ArrayList();
                            i |= 1;
                        }
                        while (kVar.w() > 0) {
                            this.e.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case 16:
                        if ((i & 2) != 2) {
                            this.f = new ArrayList();
                            i |= 2;
                        }
                        this.f.add(Integer.valueOf(kVar.f()));
                        break;
                    case 18:
                        a2 = kVar.c(kVar.s());
                        if ((i & 2) != 2 && kVar.w() > 0) {
                            this.f = new ArrayList();
                            i |= 2;
                        }
                        while (kVar.w() > 0) {
                            this.f.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case 24:
                        if ((i & 4) != 4) {
                            this.g = new ArrayList();
                            i |= 4;
                        }
                        this.g.add(Integer.valueOf(kVar.f()));
                        break;
                    case 26:
                        a2 = kVar.c(kVar.s());
                        if ((i & 4) != 4 && kVar.w() > 0) {
                            this.g = new ArrayList();
                            i |= 4;
                        }
                        while (kVar.w() > 0) {
                            this.g.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                        if ((i & 8) != 8) {
                            this.h = new ArrayList();
                            i |= 8;
                        }
                        this.h.add(Integer.valueOf(kVar.f()));
                        break;
                    case 34:
                        a2 = kVar.c(kVar.s());
                        if ((i & 8) != 8 && kVar.w() > 0) {
                            this.h = new ArrayList();
                            i |= 8;
                        }
                        while (kVar.w() > 0) {
                            this.h.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case 40:
                        if ((i & 16) != 16) {
                            this.i = new ArrayList();
                            i |= 16;
                        }
                        this.i.add(Integer.valueOf(kVar.f()));
                        break;
                    case 42:
                        a2 = kVar.c(kVar.s());
                        if ((i & 16) != 16 && kVar.w() > 0) {
                            this.i = new ArrayList();
                            i |= 16;
                        }
                        while (kVar.w() > 0) {
                            this.i.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case 48:
                        if ((i & 32) != 32) {
                            this.j = new ArrayList();
                            i |= 32;
                        }
                        this.j.add(Integer.valueOf(kVar.f()));
                        break;
                    case AdSize.PORTRAIT_AD_HEIGHT /*50*/:
                        a2 = kVar.c(kVar.s());
                        if ((i & 32) != 32 && kVar.w() > 0) {
                            this.j = new ArrayList();
                            i |= 32;
                        }
                        while (kVar.w() > 0) {
                            this.j.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case 56:
                        if ((i & 64) != 64) {
                            this.k = new ArrayList();
                            i |= 64;
                        }
                        this.k.add(Integer.valueOf(kVar.f()));
                        break;
                    case 58:
                        a2 = kVar.c(kVar.s());
                        if ((i & 64) != 64 && kVar.w() > 0) {
                            this.k = new ArrayList();
                            i |= 64;
                        }
                        while (kVar.w() > 0) {
                            this.k.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case 64:
                        if ((i & 128) != 128) {
                            this.l = new ArrayList();
                            i |= 128;
                        }
                        this.l.add(Integer.valueOf(kVar.f()));
                        break;
                    case 66:
                        a2 = kVar.c(kVar.s());
                        if ((i & 128) != 128 && kVar.w() > 0) {
                            this.l = new ArrayList();
                            i |= 128;
                        }
                        while (kVar.w() > 0) {
                            this.l.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case 72:
                        if ((i & 256) != 256) {
                            this.m = new ArrayList();
                            i |= 256;
                        }
                        this.m.add(Integer.valueOf(kVar.f()));
                        break;
                    case 74:
                        a2 = kVar.c(kVar.s());
                        if ((i & 256) != 256 && kVar.w() > 0) {
                            this.m = new ArrayList();
                            i |= 256;
                        }
                        while (kVar.w() > 0) {
                            this.m.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case 80:
                        if ((i & 512) != 512) {
                            this.n = new ArrayList();
                            i |= 512;
                        }
                        this.n.add(Integer.valueOf(kVar.f()));
                        break;
                    case 82:
                        a2 = kVar.c(kVar.s());
                        if ((i & 512) != 512 && kVar.w() > 0) {
                            this.n = new ArrayList();
                            i |= 512;
                        }
                        while (kVar.w() > 0) {
                            this.n.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
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
                if ((i & 1) == 1) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if ((i & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                if ((i & 4) == 4) {
                    this.g = Collections.unmodifiableList(this.g);
                }
                if ((i & 8) == 8) {
                    this.h = Collections.unmodifiableList(this.h);
                }
                if ((i & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if ((i & 32) == 32) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if ((i & 64) == 64) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if ((i & 128) == 128) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if ((i & 256) == 256) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((i & 512) == 512) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                try {
                    a.a();
                } catch (IOException e3) {
                    R();
                } finally {
                    this.d = i2.a();
                }
                R();
            }
        }
        if ((i & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if ((i & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if ((i & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if ((i & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((i & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if ((i & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if ((i & 128) == 128) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if ((i & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
        }
        if ((i & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
        }
        try {
            a.a();
        } catch (IOException e4) {
        } finally {
            this.d = i2.a();
        }
        R();
    }

    private u(v vVar) {
        super(vVar);
        this.o = (byte) -1;
        this.p = -1;
        this.d = vVar.r();
    }

    private u(boolean z) {
        this.o = (byte) -1;
        this.p = -1;
        this.d = h.a;
    }

    public static w B() {
        return w.l();
    }

    private void E() {
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
        this.g = Collections.emptyList();
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
    }

    public static u a() {
        return c;
    }

    public static w a(u uVar) {
        return B().a(uVar);
    }

    public int A() {
        return this.n.size();
    }

    /* renamed from: C */
    public w o() {
        return B();
    }

    /* renamed from: D */
    public w n() {
        return a(this);
    }

    /* renamed from: b */
    public u p() {
        return c;
    }

    public aq c() {
        return a;
    }

    public List d() {
        return this.e;
    }

    public int e() {
        return this.e.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        boolean z = (d().equals(uVar.d())) && f().equals(uVar.f());
        z = z && h().equals(uVar.h());
        z = z && k().equals(uVar.k());
        z = z && m().equals(uVar.m());
        z = z && r().equals(uVar.r());
        z = z && t().equals(uVar.t());
        z = z && v().equals(uVar.v());
        z = z && x().equals(uVar.x());
        return z && z().equals(uVar.z());
    }

    public List f() {
        return this.f;
    }

    public int g() {
        return this.f.size();
    }

    public List h() {
        return this.g;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = u.class.hashCode() + 779;
        if (e() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
        }
        if (g() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
        }
        if (i() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (l() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + k().hashCode();
        }
        if (q() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + m().hashCode();
        }
        if (s() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + r().hashCode();
        }
        if (u() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + t().hashCode();
        }
        if (w() > 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + v().hashCode();
        }
        if (y() > 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + x().hashCode();
        }
        if (A() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + z().hashCode();
        }
        hashCode = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int i() {
        return this.g.size();
    }

    public final boolean j() {
        byte b = this.o;
        if (b != (byte) -1) {
            return b == (byte) 1;
        } else {
            this.o = (byte) 1;
            return true;
        }
    }

    public List k() {
        return this.h;
    }

    public int l() {
        return this.h.size();
    }

    public List m() {
        return this.i;
    }

    public int q() {
        return this.i.size();
    }

    public List r() {
        return this.j;
    }

    public int s() {
        return this.j.size();
    }

    public List t() {
        return this.k;
    }

    public int u() {
        return this.k.size();
    }

    public List v() {
        return this.l;
    }

    public int w() {
        return this.l.size();
    }

    public List x() {
        return this.m;
    }

    public int y() {
        return this.m.size();
    }

    public List z() {
        return this.n;
    }
}
