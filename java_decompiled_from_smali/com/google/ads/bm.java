package com.google.ads;

import android.app.Activity;
import com.google.ads.b.a;
import com.google.ads.b.b;
import com.google.ads.b.c;
import com.google.ads.b.e;
import com.google.ads.b.g;
import com.google.ads.b.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class bm implements Runnable {
    private final bk a;
    private final String b;
    private final d c;
    private final HashMap d;
    private final boolean e = a(this.d);
    private final WeakReference f;

    public bm(bk bkVar, Activity activity, String str, d dVar, HashMap hashMap) {
        this.a = bkVar;
        this.b = str;
        this.f = new WeakReference(activity);
        this.c = dVar;
        this.d = new HashMap(hashMap);
    }

    private void a(b bVar) {
        Activity activity = (Activity) this.f.get();
        if (activity == null) {
            throw new bn("Activity became null while trying to instantiate adapter.");
        }
        g gVar;
        this.a.a(bVar);
        Class c = bVar.c();
        if (c != null) {
            g gVar2 = (g) c.newInstance();
            gVar2.a(this.d);
            gVar = gVar2;
        } else {
            gVar = null;
        }
        c = bVar.b();
        j jVar = c != null ? (j) this.c.a(c) : null;
        a aVar = new a(this.c, activity, this.e);
        if (this.a.a.a()) {
            if (bVar instanceof e) {
                ((e) bVar).a(new bp(this.a), activity, gVar, aVar, jVar);
            } else {
                throw new bn("Adapter " + this.b + " doesn't support the MediationInterstitialAdapter" + " interface.");
            }
        } else if (bVar instanceof c) {
            ((c) bVar).a(new bo(this.a), activity, gVar, this.a.a.c(), aVar, jVar);
        } else {
            throw new bn("Adapter " + this.b + " doesn't support the MediationBannerAdapter interface");
        }
        this.a.g();
    }

    private void a(String str, Throwable th, bj bjVar) {
        com.google.ads.util.g.b(str, th);
        this.a.a(false, bjVar);
    }

    private static boolean a(Map map) {
        String str = (String) map.remove("gwhirl_share_location");
        if ("1".equals(str)) {
            return true;
        }
        if (!(str == null || "0".equals(str))) {
            com.google.ads.util.g.b("Received an illegal value, '" + str + "', for the special share location parameter from mediation server" + " (expected '0' or '1'). Will not share the location.");
        }
        return false;
    }

    public void run() {
        try {
            com.google.ads.util.g.a("Trying to instantiate: " + this.b);
            a((b) bi.a(this.b, b.class));
        } catch (ClassNotFoundException e) {
            a("Cannot find adapter class '" + this.b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", e, bj.NOT_FOUND);
        } catch (Throwable th) {
            a("Error while creating adapter and loading ad from ad network. Skipping ad network.", th, bj.EXCEPTION);
        }
    }
}
