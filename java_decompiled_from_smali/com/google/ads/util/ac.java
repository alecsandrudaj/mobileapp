package com.google.ads.util;

public abstract class ac {
    protected Object a;
    protected final String b;
    final /* synthetic */ aa c;

    private ac(aa aaVar, String str) {
        this(aaVar, str, null);
    }

    private ac(aa aaVar, String str, Object obj) {
        this.c = aaVar;
        this.b = str;
        aaVar.a(this);
        this.a = obj;
    }

    /* synthetic */ ac(aa aaVar, String str, Object obj, ab abVar) {
        this(aaVar, str, obj);
    }

    public String toString() {
        return this.c.toString() + "." + this.b + " = " + this.a;
    }
}
