package com.google.analytics.a.a;

import com.google.ads.AdSize;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i extends t implements l {
    public static aq a = new j();
    private static final i c = new i(true);
    private static volatile ap m = null;
    private final h d;
    private int e;
    private List f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private byte k;
    private int l;

    static {
        c.u();
    }

    private i(k kVar, o oVar) {
        Object obj = null;
        this.k = (byte) -1;
        this.l = -1;
        u();
        OutputStream i = h.i();
        m a = m.a(i);
        int i2 = 0;
        while (obj == null) {
            try {
                int a2 = kVar.a();
                switch (a2) {
                    case e.MapAttrs_mapType /*0*/:
                        obj = 1;
                        break;
                    case e.MapAttrs_uiScrollGestures /*8*/:
                        this.e |= 8;
                        this.j = kVar.i();
                        break;
                    case 16:
                        this.e |= 1;
                        this.g = kVar.f();
                        break;
                    case 24:
                        if ((i2 & 1) != 1) {
                            this.f = new ArrayList();
                            i2 |= 1;
                        }
                        this.f.add(Integer.valueOf(kVar.f()));
                        break;
                    case 26:
                        a2 = kVar.c(kVar.s());
                        if ((i2 & 1) != 1 && kVar.w() > 0) {
                            this.f = new ArrayList();
                            i2 |= 1;
                        }
                        while (kVar.w() > 0) {
                            this.f.add(Integer.valueOf(kVar.f()));
                        }
                        kVar.d(a2);
                        break;
                    case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                        this.e |= 2;
                        this.h = kVar.f();
                        break;
                    case 48:
                        this.e |= 4;
                        this.i = kVar.i();
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
                if ((i2 & 1) == 1) {
                    this.f = Collections.unmodifiableList(this.f);
                }
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
        if ((i2 & 1) == 1) {
            this.f = Collections.unmodifiableList(this.f);
        }
        try {
            a.a();
        } catch (IOException e4) {
        } finally {
            this.d = i.a();
        }
        R();
    }

    private i(v vVar) {
        super(vVar);
        this.k = (byte) -1;
        this.l = -1;
        this.d = vVar.r();
    }

    private i(boolean z) {
        this.k = (byte) -1;
        this.l = -1;
        this.d = h.a;
    }

    public static i a() {
        return c;
    }

    public static k a(i iVar) {
        return r().a(iVar);
    }

    public static k r() {
        return k.m();
    }

    private void u() {
        this.f = Collections.emptyList();
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
    }

    /* renamed from: b */
    public i p() {
        return c;
    }

    public aq c() {
        return a;
    }

    public List d() {
        return this.f;
    }

    public int e() {
        return this.f.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return super.equals(obj);
        }
        i iVar = (i) obj;
        boolean z = (d().equals(iVar.d())) && f() == iVar.f();
        if (f()) {
            z = z && g() == iVar.g();
        }
        z = z && h() == iVar.h();
        if (h()) {
            z = z && i() == iVar.i();
        }
        z = z && k() == iVar.k();
        if (k()) {
            z = z && l() == iVar.l();
        }
        z = z && m() == iVar.m();
        return m() ? z && q() == iVar.q() : z;
    }

    public boolean f() {
        return (this.e & 1) == 1;
    }

    public int g() {
        return this.g;
    }

    public boolean h() {
        return (this.e & 2) == 2;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = i.class.hashCode() + 779;
        if (e() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + d().hashCode();
        }
        if (f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g();
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 4) * 53) + i();
        }
        if (k()) {
            hashCode = (((hashCode * 37) + 6) * 53) + ac.a(l());
        }
        if (m()) {
            hashCode = (((hashCode * 37) + 1) * 53) + ac.a(q());
        }
        hashCode = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public int i() {
        return this.h;
    }

    public final boolean j() {
        byte b = this.k;
        if (b != (byte) -1) {
            return b == (byte) 1;
        } else {
            if (f()) {
                this.k = (byte) 1;
                return true;
            }
            this.k = (byte) 0;
            return false;
        }
    }

    public boolean k() {
        return (this.e & 4) == 4;
    }

    public boolean l() {
        return this.i;
    }

    public boolean m() {
        return (this.e & 8) == 8;
    }

    public boolean q() {
        return this.j;
    }

    /* renamed from: s */
    public k o() {
        return r();
    }

    /* renamed from: t */
    public k n() {
        return a(this);
    }
}
