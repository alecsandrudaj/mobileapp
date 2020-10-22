package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.a;
import com.google.android.gms.e;

public final class cw extends ct {
    public final int a;
    public final Bundle c;
    public final IBinder d;
    final /* synthetic */ cr e;

    public cw(cr crVar, int i, IBinder iBinder, Bundle bundle) {
        this.e = crVar;
        super(crVar, Boolean.valueOf(true));
        this.a = i;
        this.d = iBinder;
        this.c = bundle;
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    /* Access modifiers changed, original: protected */
    public void a(Boolean bool) {
        if (bool != null) {
            switch (this.a) {
                case e.MapAttrs_mapType /*0*/:
                    try {
                        if (this.e.d().equals(this.d.getInterfaceDescriptor())) {
                            this.e.g = this.e.b(this.d);
                            if (this.e.g != null) {
                                this.e.f();
                                return;
                            }
                        }
                    } catch (RemoteException e) {
                    }
                    cx.a(this.e.f).b(this.e.c(), this.e.m);
                    this.e.m = null;
                    this.e.g = null;
                    this.e.a(new a(8, null));
                    return;
                case e.MapAttrs_uiZoomControls /*10*/:
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    PendingIntent pendingIntent = this.c != null ? (PendingIntent) this.c.getParcelable("pendingIntent") : null;
                    if (this.e.m != null) {
                        cx.a(this.e.f).b(this.e.c(), this.e.m);
                        this.e.m = null;
                    }
                    this.e.g = null;
                    this.e.a(new a(this.a, pendingIntent));
                    return;
            }
        }
    }
}
