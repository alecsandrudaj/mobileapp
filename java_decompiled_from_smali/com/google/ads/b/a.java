package com.google.ads.b;

import android.content.Context;
import com.google.ads.d;

public class a {
    private d a;
    private boolean b;
    private boolean c;

    public a(d dVar, Context context, boolean z) {
        this.a = dVar;
        this.c = z;
        if (context == null) {
            this.b = true;
        } else {
            this.b = dVar.b(context);
        }
    }
}
