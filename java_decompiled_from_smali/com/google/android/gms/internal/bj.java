package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

public final class bj extends cr {
    private final String f;

    public bj(Context context, c cVar, d dVar, String str, String[] strArr) {
        super(context, cVar, dVar, strArr);
        this.f = (String) do.a((Object) str);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public ce b(IBinder iBinder) {
        return cf.a(iBinder);
    }

    /* Access modifiers changed, original: protected */
    public void a(df dfVar, cu cuVar) {
        dfVar.a(cuVar, 3265100, j().getPackageName(), this.f, k());
    }

    /* Access modifiers changed, original: protected|varargs */
    public void a(String... strArr) {
        boolean z = false;
        for (String equals : strArr) {
            if (equals.equals("https://www.googleapis.com/auth/appstate")) {
                z = true;
            }
        }
        do.a(z, String.format("AppStateClient requires %s to function.", new Object[]{"https://www.googleapis.com/auth/appstate"}));
    }

    /* Access modifiers changed, original: protected */
    public String c() {
        return "com.google.android.gms.appstate.service.START";
    }

    /* Access modifiers changed, original: protected */
    public String d() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }
}
