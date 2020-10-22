package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.do;

public abstract class b {
    protected final d a;
    protected final int b;
    private final int c;

    public b(d dVar, int i) {
        this.a = (d) do.a((Object) dVar);
        boolean z = i >= 0 && i < dVar.g();
        do.a(z);
        this.b = i;
        this.c = dVar.a(this.b);
    }

    /* Access modifiers changed, original: protected */
    public long a(String str) {
        return this.a.a(str, this.b, this.c);
    }

    /* Access modifiers changed, original: protected */
    public int b(String str) {
        return this.a.b(str, this.b, this.c);
    }

    /* Access modifiers changed, original: protected */
    public boolean c(String str) {
        return this.a.d(str, this.b, this.c);
    }

    /* Access modifiers changed, original: protected */
    public String d(String str) {
        return this.a.c(str, this.b, this.c);
    }

    /* Access modifiers changed, original: protected */
    public Uri e(String str) {
        return this.a.e(str, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return dl.a(Integer.valueOf(bVar.b), Integer.valueOf(this.b)) && dl.a(Integer.valueOf(bVar.c), Integer.valueOf(this.c)) && bVar.a == this.a;
    }

    /* Access modifiers changed, original: protected */
    public boolean f(String str) {
        return this.a.f(str, this.b, this.c);
    }

    public int hashCode() {
        return dl.a(Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }
}
