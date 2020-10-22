package com.flappy;

import android.util.Log;

public class h {
    public static String l = "0123456789";
    public i[] a = new i[256];
    protected int[] b = new int[256];
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected float h;
    public char[] i = new char[256];
    public char[] j = new char[256];
    public int k = 0;

    public h(String str, int i) {
        int i2 = 0;
        i[] a = g.D.a(str);
        while (i2 < a.length) {
            int parseInt = Integer.parseInt(a[i2].a.split("_")[1]);
            this.a[parseInt] = a[i2];
            this.b[parseInt] = a[i2].b;
            this.c = this.c > a[i2].c ? this.c : a[i2].c;
            Log.i("FlappyBird", "Number: " + a[i2].a + " " + parseInt);
            i2++;
        }
        this.b[32] = this.b[48];
        this.d = i;
    }

    public void a(int i, int i2) {
        this.k = 0;
        int i3 = i;
        while (i2 > 0) {
            if (i3 > 0) {
                int i4 = i3 % 10;
                i3 /= 10;
                this.j[this.k] = l.charAt(i4);
                this.k++;
            }
            i2--;
        }
        for (i3 = 0; i3 < this.k; i3++) {
            this.i[i3] = this.j[(this.k - i3) - 1];
        }
        if (this.k == 0) {
            this.i[0] = '0';
            this.k = 1;
        }
    }

    public void a(int i, int i2, int i3, float f) {
        this.f = i;
        this.g = i2;
        this.e = i3;
        this.h = f;
    }

    public void a(g gVar) {
        int i;
        int i2 = 0;
        int i3 = this.k;
        int i4 = 0;
        for (i = 0; i < i3; i++) {
            i4 = (i4 + this.b[this.i[i]]) - this.d;
        }
        i = i4 + 2;
        i4 = this.c;
        if ((this.e & 2) != 0) {
            this.f -= i / 2;
        } else if ((this.e & 1) != 0) {
            this.f -= i;
        }
        if ((this.e & 4) != 0) {
            this.g -= i4 / 2;
        } else if ((this.e & 8) != 0) {
            this.g -= i4;
        }
        i = this.f;
        i4 = this.g;
        while (i2 < i3) {
            if (this.a[this.i[i2]] != null) {
                gVar.a(this.a[this.i[i2]], i, i4, this.h);
            }
            i = (i + this.b[this.i[i2]]) - this.d;
            i2++;
        }
    }
}
