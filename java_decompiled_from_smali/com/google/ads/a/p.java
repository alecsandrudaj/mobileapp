package com.google.ads.a;

import com.google.ads.ba;
import com.google.ads.bt;

class p implements Runnable {
    final /* synthetic */ ba a;
    final /* synthetic */ n b;

    p(n nVar, ba baVar) {
        this.b = nVar;
        this.a = baVar;
    }

    public void run() {
        if (this.b.i != null) {
            this.b.i.stopLoading();
            this.b.i.destroy();
        }
        ((w) ((bt) this.b.j.a.a()).b.a()).a(this.b.n);
        if (this.b.o != null) {
            ((ac) ((bt) this.b.j.a.a()).g.a()).b(this.b.o);
        }
        ((w) ((bt) this.b.j.a.a()).b.a()).a(this.a);
    }
}
