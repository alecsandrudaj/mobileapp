package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.a.ac;
import com.google.ads.b.b;
import com.google.ads.util.e;
import java.util.HashMap;

public class bk {
    final ac a;
    private final bh b;
    private boolean c = false;
    private boolean d = false;
    private bj e = null;
    private final bd f;
    private b g = null;
    private boolean h = false;
    private boolean i = false;
    private View j = null;
    private final String k;
    private final d l;
    private final HashMap m;

    public bk(bd bdVar, ac acVar, bh bhVar, String str, d dVar, HashMap hashMap) {
        e.a(TextUtils.isEmpty(str));
        this.f = bdVar;
        this.a = acVar;
        this.b = bhVar;
        this.k = str;
        this.l = dVar;
        this.m = hashMap;
    }

    public synchronized void a() {
        e.a(this.h, "destroy() called but startLoadAdTask has not been called.");
        ((Handler) br.a().c.a()).post(new bl(this));
    }

    public synchronized void a(Activity activity) {
        e.b(this.h, "startLoadAdTask has already been called.");
        this.h = true;
        ((Handler) br.a().c.a()).post(new bm(this, activity, this.k, this.l, this.m));
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(b bVar) {
        this.g = bVar;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(boolean z, bj bjVar) {
        this.d = z;
        this.c = true;
        this.e = bjVar;
        notify();
    }

    public synchronized boolean b() {
        return this.c;
    }

    public synchronized boolean c() {
        e.a(this.c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
        return this.d;
    }

    public synchronized bj d() {
        return this.e == null ? bj.TIMEOUT : this.e;
    }

    public synchronized View e() {
        e.a(this.c, "getAdView() called when isLoadAdTaskDone() is false.");
        return this.j;
    }

    public synchronized String f() {
        return this.g != null ? this.g.getClass().getName() : "\"adapter was not created.\"";
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void g() {
        this.i = true;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized boolean h() {
        return this.i;
    }
}
