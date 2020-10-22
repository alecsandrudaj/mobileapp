package org.andengine.input.a.a;

import android.view.MotionEvent;
import org.andengine.d.a.b.g;

public abstract class a implements d {
    private e a;
    private final g b = new b(this);

    /* Access modifiers changed, original: protected */
    public void a(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        c cVar = (c) this.b.d();
        cVar.a(org.andengine.input.a.a.a(f, f2, i, i2, MotionEvent.obtain(motionEvent)));
        this.b.b(cVar);
    }

    public void a(e eVar) {
        this.a = eVar;
    }

    public void a_(float f) {
        this.b.a_(f);
    }
}
