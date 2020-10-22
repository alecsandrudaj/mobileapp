package com.google.ads;

import com.google.ads.util.i;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;

public final class l extends i {
    public final b<n> a;
    public final c<com.google.ads.internal.c> b;
    public final c<Boolean> c = new c("disableNativeScroll", Boolean.valueOf(false));

    public l(n nVar) {
        this.a = new b("slotState", nVar);
        this.b = new c("adLoader", new com.google.ads.internal.c(this));
    }
}
