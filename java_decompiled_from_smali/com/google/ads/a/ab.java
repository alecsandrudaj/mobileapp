package com.google.ads.a;

import android.os.SystemClock;
import com.google.ads.bj;
import com.google.ads.util.g;
import java.util.Iterator;
import java.util.LinkedList;

public class ab {
    private static long f = 0;
    private static long g = 0;
    private static long h = 0;
    private static long i = 0;
    private static long j = -1;
    private final LinkedList a = new LinkedList();
    private long b;
    private long c;
    private long d;
    private final LinkedList e = new LinkedList();
    private boolean k = false;
    private boolean l = false;
    private String m;
    private long n;
    private final LinkedList o = new LinkedList();
    private final LinkedList p = new LinkedList();

    public ab() {
        a();
    }

    public static long E() {
        if (j != -1) {
            return SystemClock.elapsedRealtime() - j;
        }
        j = SystemClock.elapsedRealtime();
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public boolean A() {
        return this.l;
    }

    /* Access modifiers changed, original: protected */
    public void B() {
        g.d("Interstitial no fill.");
        this.l = true;
    }

    public void C() {
        g.d("Landing page dismissed.");
        this.e.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* Access modifiers changed, original: protected */
    public String D() {
        return this.m;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void a() {
        this.a.clear();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e.clear();
        this.n = -1;
        this.o.clear();
        this.p.clear();
        this.k = false;
        this.l = false;
    }

    public synchronized void a(bj bjVar) {
        this.o.add(Long.valueOf(SystemClock.elapsedRealtime() - this.n));
        this.p.add(bjVar);
    }

    public void a(String str) {
        g.d("Prior impression ticket = " + str);
        this.m = str;
    }

    public synchronized void b() {
        this.o.clear();
        this.p.clear();
    }

    public synchronized void c() {
        this.n = SystemClock.elapsedRealtime();
    }

    public synchronized String d() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(longValue);
        }
        return stringBuilder.toString();
    }

    public synchronized String e() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            bj bjVar = (bj) it.next();
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(bjVar.ordinal());
        }
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public void f() {
        g.d("Ad clicked.");
        this.a.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* Access modifiers changed, original: protected */
    public void g() {
        g.d("Ad request loaded.");
        this.b = SystemClock.elapsedRealtime();
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void h() {
        g.d("Ad request before rendering.");
        this.c = SystemClock.elapsedRealtime();
    }

    /* Access modifiers changed, original: protected */
    public void i() {
        g.d("Ad request started.");
        this.d = SystemClock.elapsedRealtime();
        f++;
    }

    /* Access modifiers changed, original: protected */
    public long j() {
        return this.a.size() != this.e.size() ? -1 : (long) this.a.size();
    }

    /* Access modifiers changed, original: protected */
    public String k() {
        if (this.a.isEmpty() || this.a.size() != this.e.size()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.size()) {
                return stringBuilder.toString();
            }
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Long.toString(((Long) this.e.get(i2)).longValue() - ((Long) this.a.get(i2)).longValue()));
            i = i2 + 1;
        }
    }

    /* Access modifiers changed, original: protected */
    public String l() {
        if (this.a.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.size()) {
                return stringBuilder.toString();
            }
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(Long.toString(((Long) this.a.get(i2)).longValue() - this.b));
            i = i2 + 1;
        }
    }

    /* Access modifiers changed, original: protected */
    public long m() {
        return this.b - this.d;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized long n() {
        return this.c - this.d;
    }

    /* Access modifiers changed, original: protected */
    public long o() {
        return f;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized long p() {
        return g;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void q() {
        g.d("Ad request network error");
        g++;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void r() {
        g = 0;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized long s() {
        return h;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void t() {
        h++;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void u() {
        h = 0;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized long v() {
        return i;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void w() {
        i++;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void x() {
        i = 0;
    }

    /* Access modifiers changed, original: protected */
    public boolean y() {
        return this.k;
    }

    /* Access modifiers changed, original: protected */
    public void z() {
        g.d("Interstitial network error.");
        this.k = true;
    }
}
