package org.andengine.ui.activity;

import org.andengine.ui.d;

class a implements d {
    final /* synthetic */ BaseGameActivity a;

    a(BaseGameActivity baseGameActivity) {
        this.a = baseGameActivity;
    }

    public void a() {
        try {
            org.andengine.d.e.a.b(new StringBuilder(String.valueOf(this.a.getClass().getSimpleName())).append(".onGameCreated").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            this.a.r();
        } catch (Throwable th) {
            org.andengine.d.e.a.b(new StringBuilder(String.valueOf(this.a.getClass().getSimpleName())).append(".onGameCreated failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
        this.a.c();
    }
}
