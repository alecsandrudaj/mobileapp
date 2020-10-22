package org.andengine.d.h;

import java.util.Comparator;

class b implements Comparator {
    b() {
    }

    /* renamed from: a */
    public int compare(a aVar, a aVar2) {
        float c = aVar.c();
        float c2 = aVar2.c();
        return c < c2 ? 1 : c > c2 ? -1 : 0;
    }
}
