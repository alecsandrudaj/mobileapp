package com.google.ads.util;

public final class ae extends ac {
    final /* synthetic */ aa d;
    private boolean e;

    public ae(aa aaVar, String str) {
        this.d = aaVar;
        super(aaVar, str, null);
        this.e = false;
        this.e = false;
    }

    public ae(aa aaVar, String str, Object obj) {
        this.d = aaVar;
        super(aaVar, str, obj, null);
        this.e = false;
        this.e = false;
    }

    public synchronized Object a() {
        return this.a;
    }

    public synchronized void a(Object obj) {
        g.d("State changed - " + this.d.toString() + "." + this.b + ": '" + obj + "' <-- '" + this.a + "'.");
        this.a = obj;
        this.e = true;
    }

    public String toString() {
        return super.toString() + (this.e ? " (*)" : "");
    }
}
