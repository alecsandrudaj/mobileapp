package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.d;
import com.google.ads.internal.h;
import com.google.ads.m.a;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.g;
import com.google.ads.util.i.c;
import java.util.HashMap;

public class x implements o {
    public void a(d dVar, HashMap<String, String> hashMap, WebView webView) {
        boolean k;
        n i = dVar.i();
        a aVar = (a) ((m) i.d.a()).b.a();
        c(hashMap, "as_domains", aVar.a);
        c(hashMap, "bad_ad_report_path", aVar.h);
        a((HashMap) hashMap, "min_hwa_banner", aVar.b);
        a((HashMap) hashMap, "min_hwa_activation_overlay", aVar.c);
        a((HashMap) hashMap, "min_hwa_overlay", aVar.d);
        c(hashMap, "mraid_banner_path", aVar.e);
        c(hashMap, "mraid_expanded_banner_path", aVar.f);
        c(hashMap, "mraid_interstitial_path", aVar.g);
        b(hashMap, "ac_max_size", aVar.i);
        b(hashMap, "ac_padding", aVar.j);
        b(hashMap, "ac_total_quota", aVar.k);
        b(hashMap, "db_total_quota", aVar.l);
        b(hashMap, "db_quota_per_origin", aVar.m);
        b(hashMap, "db_quota_step_size", aVar.n);
        AdWebView l = dVar.l();
        if (AdUtil.a >= 11) {
            g.a(l.getSettings(), i);
            g.a(webView.getSettings(), i);
        }
        if (!((h) i.g.a()).a()) {
            k = l.k();
            boolean z = AdUtil.a < ((Integer) aVar.b.a()).intValue();
            if (!z && k) {
                b.a("Re-enabling hardware acceleration for a banner after reading constants.");
                l.h();
            } else if (z && !k) {
                b.a("Disabling hardware acceleration for a banner after reading constants.");
                l.g();
            }
        }
        ActivationOverlay activationOverlay = (ActivationOverlay) i.e.a();
        if (!(((h) i.g.a()).b() || activationOverlay == null)) {
            boolean z2;
            k = activationOverlay.k();
            if (AdUtil.a < ((Integer) aVar.c.a()).intValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && k) {
                b.a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
                activationOverlay.h();
            } else if (z2 && !k) {
                b.a("Disabling hardware acceleration for an activation overlay after reading constants.");
                activationOverlay.g();
            }
        }
        String str = (String) aVar.a.a();
        al alVar = (al) i.s.a();
        if (!(alVar == null || TextUtils.isEmpty(str))) {
            alVar.a(str);
        }
        aVar.o.a(Boolean.valueOf(true));
    }

    private void a(HashMap<String, String> hashMap, String str, c<Integer> cVar) {
        try {
            String str2 = (String) hashMap.get(str);
            if (!TextUtils.isEmpty(str2)) {
                cVar.a(Integer.valueOf(str2));
            }
        } catch (NumberFormatException e) {
            b.a("Could not parse \"" + str + "\" constant.");
        }
    }

    private void b(HashMap<String, String> hashMap, String str, c<Long> cVar) {
        try {
            String str2 = (String) hashMap.get(str);
            if (!TextUtils.isEmpty(str2)) {
                cVar.a(Long.valueOf(str2));
            }
        } catch (NumberFormatException e) {
            b.a("Could not parse \"" + str + "\" constant.");
        }
    }

    private void c(HashMap<String, String> hashMap, String str, c<String> cVar) {
        String str2 = (String) hashMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            cVar.a(str2);
        }
    }
}
