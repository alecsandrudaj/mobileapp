package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

public class br extends aa {
    private static final br d = new br();
    public final ae a = new ae(this, "marketPackages", null);
    public final ad b = new ad(this, "constants", new bs());
    public final ad c = new ad(this, "uiHandler", new Handler(Looper.getMainLooper()));

    private br() {
    }

    public static br a() {
        return d;
    }
}
