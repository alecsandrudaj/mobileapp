package com.google.ads.util;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.google.ads.bt;

@TargetApi(17)
public final class z {
    public static void a(WebSettings webSettings, bt btVar) {
        p.a(webSettings, btVar);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
