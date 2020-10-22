package org.andengine.opengl.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.andengine.d.e.a;

public class e {
    private final HashSet a = new HashSet();
    private final HashMap b = new HashMap();
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private g f;

    public synchronized void a() {
        this.f = new g();
    }

    public synchronized void a(org.andengine.opengl.util.e eVar) {
        int size;
        a aVar;
        int i;
        HashSet hashSet = this.a;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.d;
        ArrayList arrayList3 = this.e;
        for (size = arrayList.size() - 1; size >= 0; size--) {
            aVar = (a) arrayList.get(size);
            if (aVar.e()) {
                try {
                    aVar.c(eVar);
                } catch (IOException e) {
                    a.a(e);
                }
            }
        }
        int size2 = arrayList2.size();
        if (size2 > 0) {
            for (i = size2 - 1; i >= 0; i--) {
                aVar = (a) arrayList2.remove(i);
                if (!aVar.c()) {
                    try {
                        aVar.a(eVar);
                        this.f.a(eVar, aVar);
                    } catch (IOException e2) {
                        a.a(e2);
                    }
                }
                arrayList.add(aVar);
            }
        }
        i = arrayList3.size();
        if (i > 0) {
            for (size = i - 1; size >= 0; size--) {
                aVar = (a) arrayList3.remove(size);
                if (aVar.c()) {
                    aVar.b(eVar);
                }
                arrayList.remove(aVar);
                hashSet.remove(aVar);
            }
        }
        if (size2 > 0 || i > 0) {
            System.gc();
        }
    }

    public synchronized boolean a(a aVar) {
        boolean z;
        if (aVar == null) {
            throw new IllegalArgumentException("pTexture must not be null!");
        } else if (this.a.contains(aVar)) {
            this.e.remove(aVar);
            z = false;
        } else {
            this.a.add(aVar);
            this.d.add(aVar);
            z = true;
        }
        return z;
    }

    public synchronized void b() {
        HashSet hashSet = this.a;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((a) it.next()).d();
            }
        }
        if (!this.c.isEmpty()) {
            this.d.addAll(this.c);
            this.c.clear();
        }
        if (!this.e.isEmpty()) {
            this.a.removeAll(this.e);
            this.e.clear();
        }
        this.f.e();
    }

    public synchronized void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).d();
        }
        this.d.clear();
        this.c.clear();
        this.a.clear();
        this.b.clear();
        this.f.n();
        this.f = null;
    }
}
