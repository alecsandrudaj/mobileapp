package com.google.tagmanager.a;

import java.util.Iterator;
import java.util.Map.Entry;

class bd implements Iterator {
    final /* synthetic */ ax a;
    private int b;
    private boolean c;
    private Iterator d;

    private bd(ax axVar) {
        this.a = axVar;
        this.b = -1;
    }

    /* synthetic */ bd(ax axVar, ay ayVar) {
        this(axVar);
    }

    private Iterator b() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    /* renamed from: a */
    public Entry next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        return i < this.a.b.size() ? (Entry) this.a.b.get(this.b) : (Entry) b().next();
    }

    public boolean hasNext() {
        return this.b + 1 < this.a.b.size() || b().hasNext();
    }

    public void remove() {
        if (this.c) {
            this.c = false;
            this.a.e();
            if (this.b < this.a.b.size()) {
                ax axVar = this.a;
                int i = this.b;
                this.b = i - 1;
                axVar.c(i);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
