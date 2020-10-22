package com.flappy;

public class o extends m {
    public int a = 12;
    public int b = 14;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    private i[] m = g.D.a("number_context");

    public void a(float f) {
        if (this.F && this.d > 0) {
            this.d--;
            if (this.g < 2) {
                this.k += this.g;
                this.i++;
                if (this.i == 4) {
                    this.i = 0;
                    this.g += this.h;
                }
            }
            if (this.d <= 0) {
                this.F = false;
                this.G = false;
            }
        }
    }

    public void a(g gVar) {
        if (this.G) {
            if (this.c) {
                gVar.a(this.m[10].i, this.j, this.k, 1.0f, 1.0f, 1.0f);
            }
            a(gVar, this.e, this.j + this.l, this.k, false, this.f);
        }
    }

    public void a(g gVar, int i, int i2, int i3, boolean z, int i4) {
        int i5 = i2 - this.a;
        boolean z2 = true;
        int i6 = i;
        while (i4 > 0) {
            int i7;
            if (i6 > 0 || z2) {
                int i8 = i6 % 10;
                gVar.a(this.m[i8].i, i5, i3, 1.0f, 1.0f, 1.0f);
                i7 = i6 / 10;
                i5 = i8 != 1 ? i5 - (this.a - 2) : i5 - 4;
                z2 = z;
            } else {
                i7 = i6;
            }
            i4--;
            i6 = i7;
        }
    }
}
