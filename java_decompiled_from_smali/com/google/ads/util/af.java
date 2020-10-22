package com.google.ads.util;

import java.lang.ref.WeakReference;

public final class af extends ac {
    final /* synthetic */ aa d;

    public af(aa aaVar, String str, Object obj) {
        this.d = aaVar;
        super(aaVar, str, new WeakReference(obj), null);
    }

    public Object a() {
        return ((WeakReference) this.a).get();
    }

    public String toString() {
        return this.d.toString() + "." + this.b + " = " + a() + " (?)";
    }
}
