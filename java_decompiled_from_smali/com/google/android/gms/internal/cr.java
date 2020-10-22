package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.f;
import java.util.ArrayList;

public abstract class cr implements b {
    public static final String[] e = new String[]{"service_esmobile", "service_googleme"};
    final Handler a;
    final ArrayList b = new ArrayList();
    boolean c = false;
    boolean d = false;
    private final Context f;
    private IInterface g;
    private ArrayList h;
    private boolean i = false;
    private ArrayList j;
    private boolean k = false;
    private final ArrayList l = new ArrayList();
    private cv m;
    private final String[] n;
    private final Object o = new Object();

    protected cr(Context context, c cVar, d dVar, String... strArr) {
        this.f = (Context) do.a((Object) context);
        this.h = new ArrayList();
        this.h.add(do.a((Object) cVar));
        this.j = new ArrayList();
        this.j.add(do.a((Object) dVar));
        this.a = new cs(this, context.getMainLooper());
        a(strArr);
        this.n = strArr;
    }

    public void a() {
        this.c = true;
        synchronized (this.o) {
            this.d = true;
        }
        int a = f.a(this.f);
        if (a != 0) {
            this.a.sendMessage(this.a.obtainMessage(3, Integer.valueOf(a)));
            return;
        }
        if (this.m != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
            this.g = null;
            cx.a(this.f).b(c(), this.m);
        }
        this.m = new cv(this);
        if (!cx.a(this.f).a(c(), this.m)) {
            Log.e("GmsClient", "unable to connect to service: " + c());
            this.a.sendMessage(this.a.obtainMessage(3, Integer.valueOf(9)));
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, IBinder iBinder, Bundle bundle) {
        this.a.sendMessage(this.a.obtainMessage(1, new cw(this, i, iBinder, bundle)));
    }

    /* Access modifiers changed, original: protected */
    public void a(a aVar) {
        this.a.removeMessages(4);
        synchronized (this.j) {
            this.k = true;
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.c) {
                    if (this.j.contains(arrayList.get(i))) {
                        ((d) arrayList.get(i)).a(aVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
            this.k = false;
        }
    }

    public final void a(ct ctVar) {
        synchronized (this.l) {
            this.l.add(ctVar);
        }
        this.a.sendMessage(this.a.obtainMessage(2, ctVar));
    }

    public abstract void a(df dfVar, cu cuVar);

    /* Access modifiers changed, original: protected|varargs */
    public void a(String... strArr) {
    }

    public abstract IInterface b(IBinder iBinder);

    public void b() {
        this.c = false;
        synchronized (this.o) {
            this.d = false;
        }
        synchronized (this.l) {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                ((ct) this.l.get(i)).d();
            }
            this.l.clear();
        }
        this.g = null;
        if (this.m != null) {
            cx.a(this.f).b(c(), this.m);
            this.m = null;
        }
    }

    public abstract String c();

    /* Access modifiers changed, original: protected|final */
    public final void c(IBinder iBinder) {
        try {
            a(dg.a(iBinder), new cu(this));
        } catch (RemoteException e) {
            Log.w("GmsClient", "service died");
        }
    }

    public abstract String d();

    /* Access modifiers changed, original: protected */
    public Bundle e() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void f() {
        boolean z = true;
        synchronized (this.h) {
            do.a(!this.i);
            this.a.removeMessages(4);
            this.i = true;
            if (this.b.size() != 0) {
                z = false;
            }
            do.a(z);
            Bundle e = e();
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.c && h(); i++) {
                this.b.size();
                if (!this.b.contains(arrayList.get(i))) {
                    ((c) arrayList.get(i)).a(e);
                }
            }
            this.b.clear();
            this.i = false;
        }
    }

    public boolean h() {
        return this.g != null;
    }

    public boolean i() {
        boolean z;
        synchronized (this.o) {
            z = this.d;
        }
        return z;
    }

    public final Context j() {
        return this.f;
    }

    public final String[] k() {
        return this.n;
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        this.a.removeMessages(4);
        synchronized (this.h) {
            this.i = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.c; i++) {
                if (this.h.contains(arrayList.get(i))) {
                    ((c) arrayList.get(i)).a();
                }
            }
            this.i = false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void m() {
        if (!h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final IInterface n() {
        m();
        return this.g;
    }
}
