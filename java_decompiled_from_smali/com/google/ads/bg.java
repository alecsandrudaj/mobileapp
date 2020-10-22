package com.google.ads;

import android.view.View;
import com.google.ads.util.g;

class bg implements Runnable {
    final /* synthetic */ bk a;
    final /* synthetic */ View b;
    final /* synthetic */ bh c;
    final /* synthetic */ bd d;

    bg(bd bdVar, bk bkVar, View view, bh bhVar) {
        this.d = bdVar;
        this.a = bkVar;
        this.b = view;
        this.c = bhVar;
    }

    public void run() {
        if (this.d.b(this.a)) {
            g.a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
        } else {
            this.d.a.a(this.b, this.a, this.c, false);
        }
    }
}
