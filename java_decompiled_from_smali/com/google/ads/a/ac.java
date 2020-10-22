package com.google.ads.a;

import android.content.Context;
import com.google.ads.g;

public class ac {
    public static final ac a = new ac(null, true);
    private g b;
    private boolean c;
    private final boolean d;

    private ac(g gVar, boolean z) {
        this.b = gVar;
        this.d = z;
    }

    public static ac a(g gVar) {
        return a(gVar, null);
    }

    public static ac a(g gVar, Context context) {
        return new ac(g.a(gVar, context), false);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public boolean a() {
        return this.d;
    }

    public void b(g gVar) {
        if (!this.d) {
            this.b = gVar;
        }
    }

    public boolean b() {
        return this.c;
    }

    public g c() {
        return this.b;
    }
}
