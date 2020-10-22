package com.google.ads;

class be implements Runnable {
    final /* synthetic */ ba a;
    final /* synthetic */ d b;
    final /* synthetic */ bd c;

    be(bd bdVar, ba baVar, d dVar) {
        this.c = bdVar;
        this.a = baVar;
        this.b = dVar;
    }

    public void run() {
        this.c.b(this.a, this.b);
        synchronized (this.c.e) {
            this.c.d = null;
        }
    }
}
