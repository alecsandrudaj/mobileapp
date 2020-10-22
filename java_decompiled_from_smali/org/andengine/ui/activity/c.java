package org.andengine.ui.activity;

import org.andengine.d.e.a;
import org.andengine.ui.b;

class c implements b {
    final /* synthetic */ BaseGameActivity a;
    private final /* synthetic */ org.andengine.ui.c b;

    c(BaseGameActivity baseGameActivity, org.andengine.ui.c cVar) {
        this.a = baseGameActivity;
        this.b = cVar;
    }

    public void a() {
        try {
            a.b(new StringBuilder(String.valueOf(this.a.getClass().getSimpleName())).append(".onCreateScene").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            this.a.a(this.b);
        } catch (Throwable th) {
            a.b(new StringBuilder(String.valueOf(this.a.getClass().getSimpleName())).append(".onCreateScene failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
    }
}
