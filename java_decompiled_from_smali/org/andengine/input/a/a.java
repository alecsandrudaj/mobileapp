package org.andengine.input.a;

import android.view.MotionEvent;

public class a {
    private static final b f = new b();
    protected int a;
    protected float b;
    protected float c;
    protected int d;
    protected MotionEvent e;

    public static a a(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        a aVar = (a) f.d();
        aVar.b(f, f2, i, i2, motionEvent);
        return aVar;
    }

    private void b(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        this.b = f;
        this.c = f2;
        this.d = i;
        this.a = i2;
        this.e = motionEvent;
    }

    public void a() {
        f.c(this);
    }

    public void a(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public float b() {
        return this.b;
    }

    public void b(float f, float f2) {
        this.b += f;
        this.c += f2;
    }

    public float c() {
        return this.c;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return this.d == 0;
    }

    public boolean g() {
        return this.d == 1;
    }

    public boolean h() {
        return this.d == 2;
    }

    public boolean i() {
        return this.d == 3;
    }

    public boolean j() {
        return this.d == 4;
    }

    public MotionEvent k() {
        return this.e;
    }
}
