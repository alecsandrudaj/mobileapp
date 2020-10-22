package com.google.ads;

import com.google.ads.a.n;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

public final class bq extends aa {
    public final ad a;
    public final ae b;
    public final ae c = new ae(this, "disableNativeScroll", Boolean.valueOf(false));

    public bq(bt btVar) {
        this.a = new ad(this, "slotState", btVar);
        this.b = new ae(this, "adLoader", new n(this));
    }
}
