package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;

final class cs extends Handler {
    final /* synthetic */ cr a;

    public cs(cr crVar, Looper looper) {
        this.a = crVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        ct ctVar;
        if (message.what != 1 || this.a.i()) {
            synchronized (this.a.o) {
                this.a.d = false;
            }
            if (message.what == 3) {
                this.a.a(new a(((Integer) message.obj).intValue(), null));
                return;
            } else if (message.what == 4) {
                synchronized (this.a.h) {
                    if (this.a.c && this.a.h() && this.a.h.contains(message.obj)) {
                        ((c) message.obj).a(this.a.e());
                    }
                }
                return;
            } else if (message.what == 2 && !this.a.h()) {
                ctVar = (ct) message.obj;
                ctVar.a();
                ctVar.c();
                return;
            } else if (message.what == 2 || message.what == 1) {
                ((ct) message.obj).b();
                return;
            } else {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }
        ctVar = (ct) message.obj;
        ctVar.a();
        ctVar.c();
    }
}
