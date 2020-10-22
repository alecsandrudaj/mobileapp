package org.andengine.c.b;

import org.andengine.opengl.util.e;

public class a extends e {
    protected org.andengine.b.a.a a;

    public a() {
        this(null);
    }

    public a(org.andengine.b.a.a aVar) {
        this.a = aVar;
    }

    public boolean a(org.andengine.input.a.a aVar) {
        if (this.a == null) {
            return false;
        }
        this.a.a(aVar);
        if (super.a(aVar)) {
            return true;
        }
        this.a.b(aVar);
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean b(org.andengine.input.a.a aVar) {
        if (!(this.I instanceof a)) {
            return super.b(aVar);
        }
        this.a.b(aVar);
        boolean b = super.b(aVar);
        this.a.a(aVar);
        return b;
    }

    /* Access modifiers changed, original: protected */
    public void f(e eVar, org.andengine.b.a.a aVar) {
        this.a.d(eVar);
    }
}
