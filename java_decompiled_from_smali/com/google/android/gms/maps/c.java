package com.google.android.gms.maps;

import android.view.ViewGroup;
import com.google.android.gms.b.a;
import com.google.android.gms.internal.do;
import com.google.android.gms.maps.a.m;

class c implements a {
    private final ViewGroup a;
    private final m b;

    public c(ViewGroup viewGroup, m mVar) {
        this.b = (m) do.a((Object) mVar);
        this.a = (ViewGroup) do.a((Object) viewGroup);
    }

    public m a() {
        return this.b;
    }
}
