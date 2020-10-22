package com.google.android.gms.common.data;

import com.google.android.gms.internal.do;
import java.util.ArrayList;
import java.util.HashMap;

public class e {
    private final String[] a;
    private final ArrayList b;
    private final String c;
    private final HashMap d;
    private boolean e;
    private String f;

    private e(String[] strArr, String str) {
        this.a = (String[]) do.a((Object) strArr);
        this.b = new ArrayList();
        this.c = str;
        this.d = new HashMap();
        this.e = false;
        this.f = null;
    }

    /* synthetic */ e(String[] strArr, String str, c cVar) {
        this(strArr, str);
    }
}
