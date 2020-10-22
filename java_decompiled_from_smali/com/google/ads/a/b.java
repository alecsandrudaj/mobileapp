package com.google.ads.a;

import com.google.ads.AdView;

class b implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ a b;

    b(a aVar, a aVar2) {
        this.b = aVar;
        this.a = aVar2;
    }

    public void run() {
        ((AdView) this.b.a.j.a()).removeView(this.a);
    }
}
