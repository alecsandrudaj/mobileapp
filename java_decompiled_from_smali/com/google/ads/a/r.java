package com.google.ads.a;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.e;

class r implements Runnable {
    private final w a;
    private final WebView b;
    private final y c;
    private final e d;
    private final boolean e;

    public r(w wVar, WebView webView, y yVar, e eVar, boolean z) {
        this.a = wVar;
        this.b = webView;
        this.c = yVar;
        this.d = eVar;
        this.e = z;
    }

    public void run() {
        if (this.b != null) {
            this.b.stopLoading();
            this.b.destroy();
        }
        if (this.c != null) {
            this.c.a();
        }
        if (this.e) {
            this.a.k().stopLoading();
            if (this.a.h().i.a() != null) {
                ((ViewGroup) this.a.h().i.a()).setVisibility(8);
            }
        }
        this.a.a(this.d);
    }
}
