package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class at {
    private final Deque a;

    private at() {
        this.a = new ArrayDeque(ar.c.length);
    }

    private int a(int i) {
        int binarySearch = Arrays.binarySearch(ar.c, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    private h a(h hVar, h hVar2) {
        a(hVar);
        a(hVar2);
        h hVar3 = (h) this.a.pop();
        while (!this.a.isEmpty()) {
            hVar3 = new ar((h) this.a.pop(), hVar3);
        }
        return hVar3;
    }

    private void a(h hVar) {
        if (hVar.k()) {
            b(hVar);
        } else if (hVar instanceof ar) {
            ar arVar = (ar) hVar;
            a(arVar.e);
            a(arVar.f);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + hVar.getClass());
        }
    }

    private void b(h hVar) {
        int a = a(hVar.a());
        int i = ar.c[a + 1];
        if (this.a.isEmpty() || ((h) this.a.peek()).a() >= i) {
            this.a.push(hVar);
            return;
        }
        int i2 = ar.c[a];
        h hVar2 = (h) this.a.pop();
        while (!this.a.isEmpty() && ((h) this.a.peek()).a() < i2) {
            hVar2 = new ar((h) this.a.pop(), hVar2);
        }
        hVar2 = new ar(hVar2, hVar);
        while (!this.a.isEmpty()) {
            if (((h) this.a.peek()).a() >= ar.c[a(hVar2.a()) + 1]) {
                break;
            }
            hVar2 = new ar((h) this.a.pop(), hVar2);
        }
        this.a.push(hVar2);
    }
}
