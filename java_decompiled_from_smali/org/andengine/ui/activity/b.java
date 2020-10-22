package org.andengine.ui.activity;

import org.andengine.c.b.e;
import org.andengine.d.e.a;
import org.andengine.ui.c;
import org.andengine.ui.d;

class b implements c {
    final /* synthetic */ BaseGameActivity a;
    private final /* synthetic */ d b;

    b(BaseGameActivity baseGameActivity, d dVar) {
        this.a = baseGameActivity;
        this.b = dVar;
    }

    public void a(e eVar) {
        this.a.k.a(eVar);
        try {
            a.b(new StringBuilder(String.valueOf(this.a.getClass().getSimpleName())).append(".onPopulateScene").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            this.a.a(eVar, this.b);
        } catch (Throwable th) {
            a.b(new StringBuilder(String.valueOf(this.a.getClass().getSimpleName())).append(".onPopulateScene failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
    }
}
