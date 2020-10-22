package com.google.ads.a;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.util.g;
import java.lang.ref.WeakReference;

class d implements Runnable {
    private final WeakReference a;

    public d(c cVar) {
        this.a = new WeakReference(cVar);
    }

    public void a() {
        ((Handler) br.a().c.a()).postDelayed(this, 250);
    }

    public void run() {
        c cVar = (c) this.a.get();
        if (cVar == null) {
            g.d("The video must be gone, so cancelling the timeupdate task.");
            return;
        }
        cVar.f();
        ((Handler) br.a().c.a()).postDelayed(this, 250);
    }
}
