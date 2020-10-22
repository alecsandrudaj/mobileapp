package org.andengine.opengl.c.c;

import org.andengine.opengl.c.a;

public class c extends a {
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected float i;
    protected final float j;
    protected final boolean k;

    public c(a aVar, float f, float f2, float f3, float f4, float f5, boolean z) {
        super(aVar);
        this.b = f;
        this.c = f2;
        if (z) {
            this.k = true;
            this.d = f4;
            this.e = f3;
        } else {
            this.k = false;
            this.d = f3;
            this.e = f4;
        }
        this.j = f5;
        l();
    }

    public c(a aVar, float f, float f2, float f3, float f4, boolean z) {
        this(aVar, f, f2, f3, f4, 1.0f, z);
    }

    public void a(float f, float f2, float f3, float f4) {
        this.f = f;
        this.h = f2;
        this.g = f3;
        this.i = f4;
    }

    public float b() {
        return this.k ? this.e * this.j : this.d * this.j;
    }

    public float c() {
        return this.k ? this.d * this.j : this.e * this.j;
    }

    public float d() {
        return this.f;
    }

    public float e() {
        return this.g;
    }

    public float f() {
        return this.h;
    }

    public float g() {
        return this.i;
    }

    public boolean h() {
        return this.k;
    }

    public c i() {
        return this.k ? new c(this.a, this.b, this.c, this.e, this.d, this.j, this.k) : new c(this.a, this.b, this.c, this.d, this.e, this.j, this.k);
    }

    public float j() {
        return this.b;
    }

    public float k() {
        return this.c;
    }

    public void l() {
        a aVar = this.a;
        float a = (float) aVar.a();
        float b = (float) aVar.b();
        float j = j();
        float k = k();
        this.f = j / a;
        this.g = (j + this.d) / a;
        this.h = k / b;
        this.i = (this.e + k) / b;
    }
}
