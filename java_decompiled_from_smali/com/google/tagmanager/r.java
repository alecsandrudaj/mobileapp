package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.e;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class r {
    private static r f;
    private final v a;
    private final Context b;
    private final e c;
    private volatile w d;
    private final ConcurrentMap e;

    r(Context context, v vVar, e eVar) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.b = context.getApplicationContext();
        this.a = vVar;
        this.d = w.STANDARD;
        this.e = new ConcurrentHashMap();
        this.c = eVar;
        this.c.a(new s(this));
        this.c.a(new a(this.b));
    }

    public static r a(Context context) {
        r rVar;
        synchronized (r.class) {
            if (f == null) {
                f = new r(context, new t(), new e());
            }
            rVar = f;
        }
        return rVar;
    }

    public w a() {
        return this.d;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized boolean a(Uri uri) {
        boolean z;
        m a = m.a();
        if (a.a(uri)) {
            String d = a.d();
            switch (u.a[a.b().ordinal()]) {
                case e.MapAttrs_cameraBearing /*1*/:
                    c cVar = (c) this.e.get(d);
                    if (cVar != null) {
                        cVar.a(null);
                        cVar.a();
                        break;
                    }
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                case e.MapAttrs_cameraTargetLng /*3*/:
                    for (Entry entry : this.e.entrySet()) {
                        c cVar2 = (c) entry.getValue();
                        if (((String) entry.getKey()).equals(d)) {
                            cVar2.a(a.c());
                            cVar2.a();
                        } else if (cVar2.b() != null) {
                            cVar2.a(null);
                            cVar2.a();
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
