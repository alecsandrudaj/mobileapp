package com.flappy;

public class f extends m {
    public i a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public void a(float f) {
        int i = g.D.u;
        int[] iArr = g.D.s;
        int[] iArr2 = g.D.t;
        this.i = false;
        int i2 = 0;
        while (i2 < i) {
            if (iArr[i2] > this.b && iArr[i2] < this.b + this.d && iArr2[i2] > this.c && iArr2[i2] < this.c + this.e) {
                this.i = true;
                break;
            }
            i2++;
        }
        this.g = false;
        this.h = false;
        if (this.i == this.f) {
            return;
        }
        if (this.f) {
            this.h = true;
            this.f = false;
            return;
        }
        this.g = true;
        this.f = true;
    }

    public void a(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.F = true;
        this.G = true;
        this.i = false;
        this.g = false;
        this.h = false;
        this.f = false;
    }

    public void a(g gVar) {
        if (this.f) {
            gVar.a(this.a.i, this.b, this.c + 2, 1.0f, 1.0f, 1.0f);
            return;
        }
        gVar.a(this.a.i, this.b, this.c, 1.0f, 1.0f, 1.0f);
    }

    public void a(String str) {
        this.a = g.D.b(str);
        this.d = this.a.b;
        this.e = this.a.c;
    }
}
