package com.google.ads.util;

import android.os.Build;

class m {
    static final m d = new m();
    static final m e = new m("unknown", "generic", "generic");
    static final m f = new m("unknown", "generic_x86", "Android");
    public final String a;
    public final String b;
    public final String c;

    m() {
        this.a = Build.BOARD;
        this.b = Build.DEVICE;
        this.c = Build.BRAND;
    }

    m(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    private static boolean a(String str, String str2) {
        return str != null ? str.equals(str2) : str == str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return a(this.a, mVar.a) && a(this.b, mVar.b) && a(this.c, mVar.c);
    }

    public int hashCode() {
        int i = 0;
        if (this.a != null) {
            i = 0 + this.a.hashCode();
        }
        if (this.b != null) {
            i += this.b.hashCode();
        }
        return this.c != null ? i + this.c.hashCode() : i;
    }
}
