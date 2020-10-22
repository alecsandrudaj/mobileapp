package org.andengine.b.a;

import org.andengine.b.b.c;
import org.andengine.b.b.d;
import org.andengine.opengl.util.e;

public class a implements c {
    static final float[] a = new float[2];
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f = 0.0f;
    protected float g = 0.0f;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected boolean l;
    protected d m;
    private float n = -1.0f;
    private float o = 1.0f;
    private org.andengine.b.a.a.a p;
    private org.andengine.c.c q;

    public a(float f, float f2, float f3, float f4) {
        a(f, f2, f + f3, f2 + f4);
    }

    private void a(org.andengine.input.a.a aVar, float f, float f2) {
        float a = a();
        float b = b();
        float c = c();
        aVar.a(a + ((b - a) * f), ((d() - c) * f2) + c);
    }

    private static void a(e eVar, float f, float f2, float f3) {
        eVar.b(f, f2, 0.0f);
        eVar.b(f3, 0.0f, 0.0f, 1.0f);
        eVar.b(-f, -f2, 0.0f);
    }

    private void e(org.andengine.input.a.a aVar) {
        float f = this.f;
        if (f != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.a(a, -f, g(), h());
            aVar.a(a[0], a[1]);
        }
    }

    private void f(org.andengine.input.a.a aVar) {
        float f = this.f;
        if (f != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.b(a, f, g(), h());
            aVar.a(a[0], a[1]);
        }
    }

    private void g(org.andengine.input.a.a aVar) {
        float f = -this.g;
        if (f != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.a(a, f, (this.c - this.b) * 0.5f, (this.e - this.d) * 0.5f);
            aVar.a(a[0], a[1]);
        }
    }

    private void h(org.andengine.input.a.a aVar) {
        float f = -this.g;
        if (f != 0.0f) {
            a[0] = aVar.b();
            a[1] = aVar.c();
            org.andengine.d.g.a.b(a, f, (this.c - this.b) * 0.5f, (this.e - this.d) * 0.5f);
            aVar.a(a[0], a[1]);
        }
    }

    public float a() {
        return this.b;
    }

    public void a(float f, float f2) {
        float g = f - g();
        float h = f2 - h();
        this.b += g;
        this.c = g + this.c;
        this.d += h;
        this.e += h;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f3;
        this.d = f2;
        this.e = f4;
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.k == 0 && this.j == 0) {
            b(i, i2, i3, i4);
        } else if (this.j != i3 || this.k != i4) {
            a(this.h, this.i, this.j, this.k, i, i2, i3, i4);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.l) {
            float f = ((float) i7) / ((float) i3);
            float f2 = ((float) i8) / ((float) i4);
            float g = g();
            float h = h();
            f = (f * e()) * 0.5f;
            f2 = (f2 * f()) * 0.5f;
            a(g - f, h - f2, f + g, f2 + h);
        }
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
    }

    public void a(org.andengine.input.a.a aVar) {
        f(aVar);
        c(aVar);
        g(aVar);
    }

    public void a(org.andengine.input.a.a aVar, int i, int i2) {
        float b = aVar.b();
        float c = aVar.c();
        float f = this.f;
        if (f == 0.0f) {
            f = b / ((float) i);
            b = c / ((float) i2);
        } else if (f == 180.0f) {
            f = 1.0f - (b / ((float) i));
            b = 1.0f - (c / ((float) i2));
        } else {
            a[0] = b;
            a[1] = c;
            org.andengine.d.g.a.a(a, f, (float) (i >> 1), (float) (i2 >> 1));
            f = a[0] / ((float) i);
            b = a[1] / ((float) i2);
        }
        a(aVar, f, b);
    }

    public void a(e eVar) {
        if (this.p != null) {
            this.p.a(eVar, this);
        }
    }

    public void a_(float f) {
        if (this.m != null) {
            this.m.a_(f);
        }
        if (this.p != null) {
            this.p.a_(f);
        }
        l();
    }

    public float b() {
        return this.c;
    }

    /* Access modifiers changed, original: protected */
    public void b(int i, int i2, int i3, int i4) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public void b(org.andengine.input.a.a aVar) {
        h(aVar);
        d(aVar);
        e(aVar);
    }

    public void b(e eVar) {
        eVar.a(a(), b(), d(), c(), this.n, this.o);
        float f = this.f;
        if (f != 0.0f) {
            a(eVar, g(), h(), f);
        }
    }

    public float c() {
        return this.d;
    }

    /* Access modifiers changed, original: protected */
    public void c(org.andengine.input.a.a aVar) {
        aVar.b(-this.b, -this.d);
    }

    public void c(e eVar) {
        float e = e();
        float f = f();
        eVar.a(0.0f, e, f, 0.0f, this.n, this.o);
        float f2 = this.f;
        if (f2 != 0.0f) {
            a(eVar, e * 0.5f, f * 0.5f, f2);
        }
    }

    public float d() {
        return this.e;
    }

    /* Access modifiers changed, original: protected */
    public void d(org.andengine.input.a.a aVar) {
        aVar.b(this.b, this.d);
    }

    public void d(e eVar) {
        float e = e();
        float f = f();
        eVar.a(0.0f, e, f, 0.0f, this.n, this.o);
        float f2 = this.g;
        if (f2 != 0.0f) {
            a(eVar, e * 0.5f, f * 0.5f, f2);
        }
    }

    public float e() {
        return this.c - this.b;
    }

    public float f() {
        return this.e - this.d;
    }

    public float g() {
        return (this.b + this.c) * 0.5f;
    }

    public float h() {
        return (this.d + this.e) * 0.5f;
    }

    public org.andengine.b.a.a.a i() {
        return this.p;
    }

    public boolean j() {
        return this.p != null;
    }

    public float k() {
        return this.f;
    }

    public void l() {
        if (this.q != null) {
            float[] h = this.q.h();
            a(h[0], h[1]);
        }
    }
}
