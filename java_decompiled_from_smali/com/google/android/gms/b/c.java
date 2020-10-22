package com.google.android.gms.b;

import java.util.Iterator;

class c implements i {
    final /* synthetic */ b a;

    c(b bVar) {
        this.a = bVar;
    }

    public void a(a aVar) {
        this.a.a = aVar;
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this.a.a);
        }
        this.a.c.clear();
        this.a.b = null;
    }
}
