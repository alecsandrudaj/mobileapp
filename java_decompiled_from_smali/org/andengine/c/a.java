package org.andengine.c;

import org.andengine.b.b.d;
import org.andengine.d.a.a.b;
import org.andengine.d.c;
import org.andengine.opengl.util.e;

public class a implements c {
    private static final float[] a = new float[2];
    private static final float[] b = new float[2];
    private static final org.andengine.d.c.a c = new b();
    protected float A;
    protected float B;
    protected float C;
    protected float D;
    protected float E;
    protected float F;
    protected float G;
    protected float H;
    private org.andengine.d.a.d.a I;
    private org.andengine.d.a.d.a J;
    private c d;
    private org.andengine.c.a.a e;
    private d f;
    private boolean g;
    private boolean h;
    private org.andengine.d.a.d.a i;
    private org.andengine.d.a.d.a j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    protected boolean q;
    protected int r;
    protected int s;
    protected b t;
    protected org.andengine.d.d.a u;
    protected float v;
    protected float w;
    protected float x;
    protected float y;
    protected float z;

    public a() {
        this(0.0f, 0.0f);
    }

    public a(float f, float f2) {
        this.l = true;
        this.o = true;
        this.r = Integer.MIN_VALUE;
        this.s = 0;
        this.u = new org.andengine.d.d.a(1.0f, 1.0f, 1.0f, 1.0f);
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.g = true;
        this.h = true;
        this.v = f;
        this.w = f2;
    }

    private void a() {
        this.t = new b(4);
    }

    private void c(c cVar) {
        if (cVar.d()) {
            String simpleName = cVar.getClass().getSimpleName();
            String simpleName2 = cVar.e().getClass().getSimpleName();
            throw new IllegalStateException("pEntity '" + simpleName + "' already has a parent: '" + simpleName2 + "'. New parent: '" + getClass().getSimpleName() + "'!");
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(float f) {
        if (this.e != null) {
            this.e.a_(f);
        }
        if (this.f != null) {
            this.f.a_(f);
        }
        if (this.t != null && !this.p) {
            b bVar = this.t;
            int size = bVar.size();
            for (int i = 0; i < size; i++) {
                ((c) bVar.get(i)).a_(f);
            }
        }
    }

    public void a(StringBuilder stringBuilder) {
        stringBuilder.append(getClass().getSimpleName());
        if (this.t != null && this.t.size() > 0) {
            stringBuilder.append(" [");
            b bVar = this.t;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= bVar.size()) {
                    stringBuilder.append("]");
                    return;
                }
                ((c) bVar.get(i2)).a(stringBuilder);
                if (i2 < bVar.size() - 1) {
                    stringBuilder.append(", ");
                }
                i = i2 + 1;
            }
        }
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(e eVar) {
        b(eVar);
        c(eVar);
        d(eVar);
        e(eVar);
    }

    public final void a(e eVar, org.andengine.b.a.a aVar) {
        if (!this.l) {
            return;
        }
        if (!this.m || !a(aVar)) {
            e(eVar, aVar);
        }
    }

    public void a(boolean z) {
        this.l = z;
    }

    public boolean a(org.andengine.b.a.a aVar) {
        return false;
    }

    public float[] a(float f, float f2, float[] fArr) {
        org.andengine.d.a.d.a k = k();
        fArr[0] = f;
        fArr[1] = f2;
        k.a(fArr);
        return fArr;
    }

    public final void a_(float f) {
        if (!this.n) {
            a(f);
        }
    }

    public float[] a_(float f, float f2) {
        return a(f, f2, b);
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    public void b(float f) {
        if (this.u.a(f)) {
            b();
        }
    }

    public void b(c cVar) {
        c(cVar);
        if (this.t == null) {
            a();
        }
        this.t.add(cVar);
        cVar.a((c) this);
        cVar.m();
    }

    /* Access modifiers changed, original: protected */
    public void b(e eVar) {
        eVar.a(this.v, this.w, 0.0f);
    }

    /* Access modifiers changed, original: protected */
    public void b(e eVar, org.andengine.b.a.a aVar) {
    }

    public float[] b(float f, float f2) {
        return b(f, f2, a);
    }

    public float[] b(float f, float f2, float[] fArr) {
        fArr[0] = f;
        fArr[1] = f2;
        l().a(fArr);
        return fArr;
    }

    /* Access modifiers changed, original: protected */
    public void c(e eVar) {
        float f = this.x;
        if (f != 0.0f) {
            float f2 = this.y;
            float f3 = this.z;
            eVar.a(f2, f3, 0.0f);
            eVar.a(f, 0.0f, 0.0f, 1.0f);
            eVar.a(-f2, -f3, 0.0f);
        }
    }

    /* Access modifiers changed, original: protected */
    public void c(e eVar, org.andengine.b.a.a aVar) {
    }

    public boolean c() {
        return this.k;
    }

    /* Access modifiers changed, original: protected */
    public void d(e eVar) {
        float f = this.E;
        float f2 = this.F;
        if (f != 0.0f || f2 != 0.0f) {
            float f3 = this.G;
            float f4 = this.H;
            eVar.a(f3, f4, 0.0f);
            eVar.a(f, f2);
            eVar.a(-f3, -f4, 0.0f);
        }
    }

    /* Access modifiers changed, original: protected */
    public void d(e eVar, org.andengine.b.a.a aVar) {
    }

    public boolean d() {
        return this.d != null;
    }

    public c e() {
        return this.d;
    }

    /* Access modifiers changed, original: protected */
    public void e(e eVar) {
        float f = this.A;
        float f2 = this.B;
        if (f != 1.0f || f2 != 1.0f) {
            float f3 = this.C;
            float f4 = this.D;
            eVar.a(f3, f4, 0.0f);
            eVar.a(f, f2, 1);
            eVar.a(-f3, -f4, 0.0f);
        }
    }

    /* Access modifiers changed, original: protected */
    public void e(e eVar, org.andengine.b.a.a aVar) {
        int i = 0;
        eVar.j();
        a(eVar);
        b bVar = this.t;
        if (bVar == null || !this.o) {
            b(eVar, aVar);
            c(eVar, aVar);
            d(eVar, aVar);
        } else {
            if (this.q) {
                d.a().a(this.t);
                this.q = false;
            }
            int size = bVar.size();
            while (i < size) {
                c cVar = (c) bVar.get(i);
                if (cVar.f() >= 0) {
                    break;
                }
                cVar.a(eVar, aVar);
                i++;
            }
            b(eVar, aVar);
            c(eVar, aVar);
            d(eVar, aVar);
            while (i < size) {
                ((c) bVar.get(i)).a(eVar, aVar);
                i++;
            }
        }
        eVar.k();
    }

    public int f() {
        return this.s;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        if (!this.k) {
            n();
        }
    }

    public org.andengine.d.d.a g() {
        return this.u;
    }

    public float[] h() {
        return a_(0.0f, 0.0f);
    }

    public org.andengine.d.a.d.a i() {
        if (this.i == null) {
            this.i = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.i;
        if (this.g) {
            float f;
            float f2;
            aVar.a();
            float f3 = this.A;
            float f4 = this.B;
            if (!(f3 == 1.0f && f4 == 1.0f)) {
                f = this.C;
                f2 = this.D;
                aVar.a(-f, -f2);
                aVar.b(f3, f4);
                aVar.a(f, f2);
            }
            f3 = this.E;
            f4 = this.F;
            if (!(f3 == 0.0f && f4 == 0.0f)) {
                f = this.G;
                f2 = this.H;
                aVar.a(-f, -f2);
                aVar.c(f3, f4);
                aVar.a(f, f2);
            }
            f3 = this.x;
            if (f3 != 0.0f) {
                f4 = this.y;
                f = this.z;
                aVar.a(-f4, -f);
                aVar.a(f3);
                aVar.a(f4, f);
            }
            aVar.a(this.v, this.w);
            this.g = false;
        }
        return aVar;
    }

    public org.andengine.d.a.d.a j() {
        if (this.j == null) {
            this.j = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.j;
        if (this.h) {
            float f;
            float f2;
            float f3;
            aVar.a();
            aVar.a(-this.v, -this.w);
            float f4 = this.x;
            if (f4 != 0.0f) {
                f = this.y;
                f2 = this.z;
                aVar.a(-f, -f2);
                aVar.a(-f4);
                aVar.a(f, f2);
            }
            f4 = this.E;
            f = this.F;
            if (!(f4 == 0.0f && f == 0.0f)) {
                f2 = this.G;
                f3 = this.H;
                aVar.a(-f2, -f3);
                aVar.c(-f4, -f);
                aVar.a(f2, f3);
            }
            f4 = this.A;
            f = this.B;
            if (!(f4 == 1.0f && f == 1.0f)) {
                f2 = this.C;
                f3 = this.D;
                aVar.a(-f2, -f3);
                aVar.b(1.0f / f4, 1.0f / f);
                aVar.a(f2, f3);
            }
            this.h = false;
        }
        return aVar;
    }

    public org.andengine.d.a.d.a k() {
        if (this.I == null) {
            this.I = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.I;
        aVar.a(i());
        c cVar = this.d;
        if (cVar != null) {
            aVar.b(cVar.k());
        }
        return aVar;
    }

    public org.andengine.d.a.d.a l() {
        if (this.J == null) {
            this.J = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a aVar = this.J;
        aVar.a(j());
        c cVar = this.d;
        if (cVar != null) {
            aVar.c(cVar.l());
        }
        return aVar;
    }

    public void m() {
    }

    public void n() {
        if (this.k) {
            throw new c();
        }
        this.k = true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        a(stringBuilder);
        return stringBuilder.toString();
    }
}
