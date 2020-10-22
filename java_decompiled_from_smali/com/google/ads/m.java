package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.util.i;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;

public class m extends i {
    private static final m d = new m();
    public final c<String> a = new c("marketPackages", null);
    public final b<a> b = new b("constants", new a());
    public final b<Handler> c = new b("uiHandler", new Handler(Looper.getMainLooper()));

    public static final class a extends i {
        public final c<String> a = new c("ASDomains", null);
        public final c<Integer> b = new c("minHwAccelerationVersionBanner", Integer.valueOf(18));
        public final c<Integer> c = new c("minHwAccelerationVersionOverlay", Integer.valueOf(18));
        public final c<Integer> d = new c("minHwAccelerationVersionOverlay", Integer.valueOf(14));
        public final c<String> e = new c("mraidBannerPath", "http://media.admob.com/mraid/v1/mraid_app_banner.js");
        public final c<String> f = new c("mraidExpandedBannerPath", "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
        public final c<String> g = new c("mraidInterstitialPath", "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
        public final c<String> h = new c("badAdReportPath", "https://badad.googleplex.com/s/reportAd");
        public final c<Long> i = new c("appCacheMaxSize", Long.valueOf(0));
        public final c<Long> j = new c("appCacheMaxSizePaddingInBytes", Long.valueOf(131072));
        public final c<Long> k = new c("maxTotalAppCacheQuotaInBytes", Long.valueOf(5242880));
        public final c<Long> l = new c("maxTotalDatabaseQuotaInBytes", Long.valueOf(5242880));
        public final c<Long> m = new c("maxDatabaseQuotaPerOriginInBytes", Long.valueOf(1048576));
        public final c<Long> n = new c("databaseQuotaIncreaseStepInBytes", Long.valueOf(131072));
        public final c<Boolean> o = new c("isInitialized", Boolean.valueOf(false));
    }

    public static m a() {
        return d;
    }

    private m() {
    }
}
