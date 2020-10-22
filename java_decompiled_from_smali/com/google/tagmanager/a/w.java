package com.google.tagmanager.a;

public abstract class w extends v implements y {
    private q a = q.b();
    private boolean b;

    protected w() {
    }

    private void a() {
        if (!this.b) {
            this.a = this.a.clone();
            this.b = true;
        }
    }

    private q b() {
        this.a.c();
        this.b = false;
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(x xVar) {
        a();
        this.a.a(xVar.a);
    }

    /* renamed from: o */
    public w g() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* Access modifiers changed, original: protected */
    public boolean s() {
        return this.a.e();
    }
}
