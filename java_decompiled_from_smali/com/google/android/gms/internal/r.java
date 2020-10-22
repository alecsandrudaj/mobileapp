package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.games.PlayerEntity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class r extends cr {
    private final String f;
    private final String g;
    private final Map h;
    private PlayerEntity i;
    private final ai j;
    private boolean k = false;
    private final Binder l;
    private final long m;
    private final boolean n;

    public r(Context context, String str, String str2, c cVar, d dVar, String[] strArr, int i, View view, boolean z) {
        super(context, cVar, dVar, strArr);
        this.f = str;
        this.g = (String) do.a((Object) str2);
        this.l = new Binder();
        this.h = new HashMap();
        this.j = ai.a(this, i);
        a(view);
        this.m = (long) hashCode();
        this.n = z;
    }

    private void o() {
        this.i = null;
    }

    private void p() {
        for (an a : this.h.values()) {
            try {
                a.a();
            } catch (IOException e) {
                w.a("GamesClient", "IOException:", e);
            }
        }
        this.h.clear();
    }

    public Intent a(String str) {
        m();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", str);
        intent.addFlags(67108864);
        return v.a(intent);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public ad b(IBinder iBinder) {
        return af.a(iBinder);
    }

    public void a() {
        o();
        super.a();
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null) {
            this.k = bundle.getBoolean("show_welcome_popup");
        }
        super.a(i, iBinder, bundle);
    }

    public void a(IBinder iBinder, Bundle bundle) {
        if (h()) {
            try {
                ((ad) n()).a(iBinder, bundle);
            } catch (RemoteException e) {
                w.a("GamesClient", "service died");
            }
        }
    }

    public void a(View view) {
        this.j.a(view);
    }

    /* Access modifiers changed, original: protected */
    public void a(a aVar) {
        super.a(aVar);
        this.k = false;
    }

    public void a(com.google.android.gms.games.a.a aVar, String str, long j) {
        y yVar;
        if (aVar == null) {
            yVar = null;
        } else {
            Object yVar2 = new s(this, aVar);
        }
        try {
            ((ad) n()).a(yVar2, str, j);
        } catch (RemoteException e) {
            w.a("GamesClient", "service died");
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(df dfVar, cu cuVar) {
        String locale = j().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.n);
        dfVar.a(cuVar, 3265100, j().getPackageName(), this.g, k(), this.f, this.j.b(), locale, bundle);
    }

    /* Access modifiers changed, original: protected|varargs */
    public void a(String... strArr) {
        int i = 0;
        boolean z = false;
        for (String str : strArr) {
            if (str.equals("https://www.googleapis.com/auth/games")) {
                z = true;
            } else if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
                i = 1;
            }
        }
        if (i != 0) {
            do.a(!z, String.format("Cannot have both %s and %s!", new Object[]{"https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"}));
            return;
        }
        do.a(z, String.format("GamesClient requires %s to function.", new Object[]{"https://www.googleapis.com/auth/games"}));
    }

    public void b() {
        this.k = false;
        if (h()) {
            try {
                ad adVar = (ad) n();
                adVar.c();
                adVar.b(this.m);
                adVar.a(this.m);
            } catch (RemoteException e) {
                w.a("GamesClient", "Failed to notify client disconnect.");
            }
        }
        p();
        super.b();
    }

    /* Access modifiers changed, original: protected */
    public String c() {
        return "com.google.android.gms.games.service.START";
    }

    /* Access modifiers changed, original: protected */
    public String d() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    /* Access modifiers changed, original: protected */
    public Bundle e() {
        try {
            Bundle b = ((ad) n()).b();
            if (b == null) {
                return b;
            }
            b.setClassLoader(r.class.getClassLoader());
            return b;
        } catch (RemoteException e) {
            w.a("GamesClient", "service died");
            return null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void f() {
        super.f();
        if (this.k) {
            this.j.a();
            this.k = false;
        }
    }

    public void g() {
        if (h()) {
            try {
                ((ad) n()).c();
            } catch (RemoteException e) {
                w.a("GamesClient", "service died");
            }
        }
    }
}
