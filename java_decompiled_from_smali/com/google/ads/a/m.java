package com.google.ads.a;

import com.google.ads.util.g;

public final class m extends Exception {
    public final boolean a;

    public m(String str, boolean z) {
        super(str);
        this.a = z;
    }

    public m(String str, boolean z, Throwable th) {
        super(str, th);
        this.a = z;
    }

    public void a(String str) {
        g.b(c(str));
        g.a(null, this);
    }

    public void b(String str) {
        Throwable thisR;
        String c = c(str);
        if (!this.a) {
            thisR = null;
        }
        throw new RuntimeException(c, thisR);
    }

    public String c(String str) {
        return this.a ? str + ": " + getMessage() : str;
    }
}
