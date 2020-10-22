package com.google.tagmanager;

import com.google.analytics.a.a.q;

public class c {
    private final r a;
    private d b;
    private o c;
    private b d;
    private volatile String e;
    private volatile q f;
    private volatile long g;
    private volatile int h;

    private boolean b(long j) {
        if (this.g == 0) {
            this.h--;
            return true;
        }
        long j2 = j - this.g;
        if (j2 < 5000) {
            return false;
        }
        if (this.h < 30) {
            this.h = Math.min(30, ((int) Math.floor((double) (j2 / 900000))) + this.h);
        }
        if (this.h <= 0) {
            return false;
        }
        this.h--;
        return true;
    }

    private synchronized o c() {
        return this.c;
    }

    private boolean d() {
        return this.a.a() == w.b;
    }

    public synchronized void a() {
        if (c() == null) {
            i.b("refresh called for closed container");
        } else {
            try {
                if (d()) {
                    i.b("Container is in DEFAULT_CONTAINER mode. Refresh request is ignored.");
                } else {
                    long a = this.d.a();
                    if (b(a)) {
                        i.d("Container refresh requested");
                        a(0);
                        this.g = a;
                    } else {
                        i.d("Container refresh was called too often. Ignored.");
                    }
                }
            } catch (Exception e) {
                i.a("Calling refresh() throws an exception: " + e.getMessage());
            }
        }
        return;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(long j) {
        if (!(this.b == null || d())) {
            this.b.a(j, this.f == null ? null : this.f.C());
        }
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(String str) {
        this.e = str;
        if (this.b != null) {
            this.b.a(str);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String b() {
        return this.e;
    }
}
