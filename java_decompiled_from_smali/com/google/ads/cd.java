package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.a;
import com.google.ads.a.ac;
import com.google.ads.a.e;
import com.google.ads.a.w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ae;
import com.google.ads.util.g;
import com.google.ads.util.p;
import java.util.HashMap;

public class cd implements bu {
    private void a(HashMap hashMap, String str, ae aeVar) {
        try {
            String str2 = (String) hashMap.get(str);
            if (!TextUtils.isEmpty(str2)) {
                aeVar.a(Integer.valueOf(str2));
            }
        } catch (NumberFormatException e) {
            g.a("Could not parse \"" + str + "\" constant.");
        }
    }

    private void b(HashMap hashMap, String str, ae aeVar) {
        try {
            String str2 = (String) hashMap.get(str);
            if (!TextUtils.isEmpty(str2)) {
                aeVar.a(Long.valueOf(str2));
            }
        } catch (NumberFormatException e) {
            g.a("Could not parse \"" + str + "\" constant.");
        }
    }

    private void c(HashMap hashMap, String str, ae aeVar) {
        String str2 = (String) hashMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            aeVar.a(str2);
        }
    }

    public void a(w wVar, HashMap hashMap, WebView webView) {
        boolean k;
        bt h = wVar.h();
        bs bsVar = (bs) ((br) h.d.a()).b.a();
        c(hashMap, "as_domains", bsVar.a);
        c(hashMap, "bad_ad_report_path", bsVar.h);
        a(hashMap, "min_hwa_banner", bsVar.b);
        a(hashMap, "min_hwa_activation_overlay", bsVar.c);
        a(hashMap, "min_hwa_overlay", bsVar.d);
        c(hashMap, "mraid_banner_path", bsVar.e);
        c(hashMap, "mraid_expanded_banner_path", bsVar.f);
        c(hashMap, "mraid_interstitial_path", bsVar.g);
        b(hashMap, "ac_max_size", bsVar.i);
        b(hashMap, "ac_padding", bsVar.j);
        b(hashMap, "ac_total_quota", bsVar.k);
        b(hashMap, "db_total_quota", bsVar.l);
        b(hashMap, "db_quota_per_origin", bsVar.m);
        b(hashMap, "db_quota_step_size", bsVar.n);
        e k2 = wVar.k();
        if (AdUtil.a >= 11) {
            p.a(k2.getSettings(), h);
            p.a(webView.getSettings(), h);
        }
        if (!((ac) h.g.a()).a()) {
            k = k2.k();
            boolean z = AdUtil.a < ((Integer) bsVar.b.a()).intValue();
            if (!z && k) {
                g.a("Re-enabling hardware acceleration for a banner after reading constants.");
                k2.h();
            } else if (z && !k) {
                g.a("Disabling hardware acceleration for a banner after reading constants.");
                k2.g();
            }
        }
        a aVar = (a) h.e.a();
        if (!(((ac) h.g.a()).b() || aVar == null)) {
            k = aVar.k();
            boolean z2 = AdUtil.a < ((Integer) bsVar.c.a()).intValue();
            if (!z2 && k) {
                g.a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
                aVar.h();
            } else if (z2 && !k) {
                g.a("Disabling hardware acceleration for an activation overlay after reading constants.");
                aVar.g();
            }
        }
        String str = (String) bsVar.a.a();
        ak akVar = (ak) h.s.a();
        if (!(akVar == null || TextUtils.isEmpty(str))) {
            akVar.a(str);
        }
        bsVar.o.a(Boolean.valueOf(true));
    }
}
