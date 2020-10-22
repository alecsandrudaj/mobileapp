package com.flappy;

public class l {
    public int a = this.c[0].b;
    public int b = this.c[0].c;
    private i[] c;

    public l(String str) {
        this.c = g.D.a(str);
    }

    public void a(g gVar, int i, int i2, int i3, boolean z, int i4) {
        int i5 = i2 - this.a;
        boolean z2 = true;
        int i6 = i;
        while (i4 > 0) {
            int i7;
            if (i6 > 0 || z2) {
                gVar.a(this.c[i6 % 10].i, i5, i3, 1.0f, 1.0f, 1.0f);
                i5 -= this.a;
                i7 = i6 / 10;
                z2 = z;
            } else {
                i7 = i6;
            }
            i4--;
            i6 = i7;
        }
    }
}
