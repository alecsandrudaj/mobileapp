package com.flappy.pig;

import com.flappy.g;
import com.flappy.i;
import com.flappy.m;
import com.flappy.r;

public class e extends m {
    public r a = new r();
    public i b = g.D.b("text_game_over");
    public int c;
    public float d;
    public float e;
    public int f;

    public void a() {
        this.F = true;
        this.G = true;
        this.a.a(0.0f, 1.0f, 11, 1.0f);
        this.c = -1;
        this.d = -2.0f;
        this.e = 0.25f;
        this.f = 0;
        c.D.c(10, 0);
    }

    public void a(float f) {
        this.a.a(f);
        if (this.c < 0) {
            this.c = (int) (((float) this.c) + this.d);
            this.d += this.e;
        } else {
            this.c = 0;
        }
        switch (this.f) {
            case com.google.android.gms.e.MapAttrs_mapType /*0*/:
                if (this.a.g) {
                    this.f = 1;
                    g.D.C.a(g.D.y, g.D.z, 10, 20, 30, 40);
                    c.D.c(10, 0);
                    return;
                }
                return;
            case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                if (g.D.C.k == 2) {
                    this.f = 2;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void a(g gVar) {
        gVar.a(this.b, (288 - this.b.b) >> 1, this.c + 130, this.a.a);
    }
}
