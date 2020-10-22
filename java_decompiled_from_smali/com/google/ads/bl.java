package com.google.ads;

import com.google.ads.util.e;
import com.google.ads.util.g;

class bl implements Runnable {
    final /* synthetic */ bk a;

    bl(bk bkVar) {
        this.a = bkVar;
    }

    public void run() {
        if (this.a.h()) {
            e.a(this.a.g);
            try {
                this.a.g.a();
                g.a("Called destroy() for adapter with class: " + this.a.g.getClass().getName());
            } catch (Throwable th) {
                g.b("Error while destroying adapter (" + this.a.f() + "):", th);
            }
        }
    }
}
