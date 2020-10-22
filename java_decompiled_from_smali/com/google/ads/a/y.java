package com.google.ads.a;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.e;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public final class y implements Runnable {
    private final bq a;
    private final aa b;
    private volatile boolean c;
    private boolean d;
    private String e;
    private Thread f;

    y(bq bqVar) {
        this(bqVar, new z());
    }

    y(bq bqVar, aa aaVar) {
        this.f = null;
        this.a = bqVar;
        this.b = aaVar;
    }

    private void a(Context context, HttpURLConnection httpURLConnection) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("drt", "");
        if (this.d && !TextUtils.isEmpty(string)) {
            if (AdUtil.a == 8) {
                httpURLConnection.addRequestProperty("X-Afma-drt-Cookie", string);
            } else {
                httpURLConnection.addRequestProperty("Cookie", string);
            }
        }
    }

    private void a(HttpURLConnection httpURLConnection) {
        b(httpURLConnection);
        f(httpURLConnection);
        g(httpURLConnection);
        h(httpURLConnection);
        i(httpURLConnection);
        e(httpURLConnection);
        j(httpURLConnection);
        k(httpURLConnection);
        l(httpURLConnection);
        d(httpURLConnection);
        c(httpURLConnection);
        m(httpURLConnection);
        n(httpURLConnection);
    }

    private void a(HttpURLConnection httpURLConnection, int i) {
        if (300 <= i && i < 400) {
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                g.c("Could not get redirect location from a " + i + " redirect.");
                ((n) this.a.b.a()).a(e.d);
                a();
                return;
            }
            a(httpURLConnection);
            this.e = headerField;
        } else if (i == 200) {
            a(httpURLConnection);
            String trim = AdUtil.a(new InputStreamReader(httpURLConnection.getInputStream())).trim();
            g.a("Response content is: " + trim);
            if (TextUtils.isEmpty(trim)) {
                g.a("Response message is null or zero length: " + trim);
                ((n) this.a.b.a()).a(e.b);
                a();
                return;
            }
            ((n) this.a.b.a()).a(trim, this.e);
            a();
        } else if (i == 400) {
            g.c("Bad request");
            ((n) this.a.b.a()).a(e.a);
            a();
        } else {
            g.c("Invalid response code: " + i);
            ((n) this.a.b.a()).a(e.d);
            a();
        }
    }

    private void b() {
        while (!this.c) {
            HttpURLConnection a = this.b.a(new URL(this.e));
            try {
                a((Context) ((bt) this.a.a.a()).f.a(), a);
                AdUtil.a(a, (Context) ((bt) this.a.a.a()).f.a());
                a.setInstanceFollowRedirects(false);
                a.connect();
                a(a, a.getResponseCode());
                a.disconnect();
            } catch (Throwable th) {
                a.disconnect();
                throw th;
            }
        }
    }

    private void b(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Debug-Dialog");
        if (!TextUtils.isEmpty(headerField)) {
            ((n) this.a.b.a()).f(headerField);
        }
    }

    private void c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Type");
        if (!TextUtils.isEmpty(headerField)) {
            ((n) this.a.b.a()).b(headerField);
        }
    }

    private void d(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Mediation");
        if (!TextUtils.isEmpty(headerField)) {
            ((n) this.a.b.a()).b(Boolean.valueOf(headerField).booleanValue());
        }
    }

    private void e(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                ((w) ((bt) this.a.a.a()).b.a()).a((long) (Float.parseFloat(headerField) * 1000.0f));
            } catch (NumberFormatException e) {
                g.d("Could not get timeout value: " + headerField, e);
            }
        }
    }

    private void f(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String b : headerField.trim().split("\\s+")) {
                ((w) ((bt) this.a.a.a()).b.a()).b(b);
            }
        }
    }

    private void g(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String c : headerField.trim().split("\\s+")) {
                ((w) ((bt) this.a.a.a()).b.a()).c(c);
            }
        }
    }

    private void h(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String a : headerField.trim().split("\\s+")) {
                ((n) this.a.b.a()).a(a);
            }
        }
    }

    private void i(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                float parseFloat = Float.parseFloat(headerField);
                w wVar = (w) ((bt) this.a.a.a()).b.a();
                if (parseFloat > 0.0f) {
                    wVar.a(parseFloat);
                    if (!wVar.r()) {
                        wVar.f();
                    }
                } else if (wVar.r()) {
                    wVar.e();
                }
            } catch (NumberFormatException e) {
                g.d("Could not get refresh value: " + headerField, e);
            }
        }
    }

    private void j(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Orientation");
        if (!TextUtils.isEmpty(headerField)) {
            if (headerField.equals("portrait")) {
                ((n) this.a.b.a()).a(AdUtil.b());
            } else if (headerField.equals("landscape")) {
                ((n) this.a.b.a()).a(AdUtil.a());
            }
        }
    }

    private void k(HttpURLConnection httpURLConnection) {
        if (!TextUtils.isEmpty(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {
            try {
                ((w) ((bt) this.a.a.a()).b.a()).b(Long.parseLong(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life")));
            } catch (NumberFormatException e) {
                g.e("Got bad value of Doritos cookie cache life from header: " + httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
            }
        }
    }

    private void l(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Cache-Control");
        if (!TextUtils.isEmpty(headerField)) {
            ((n) this.a.b.a()).c(headerField);
        }
    }

    private void m(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Ad-Size");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                String[] split = headerField.split("x", 2);
                if (split.length != 2) {
                    g.e("Could not parse size header: " + headerField);
                    return;
                }
                ((n) this.a.b.a()).a(new com.google.ads.g(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
            } catch (NumberFormatException e) {
                g.e("Could not parse size header: " + headerField);
            }
        }
    }

    private void n(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
        if (!TextUtils.isEmpty(headerField)) {
            ((n) this.a.b.a()).a(headerField.equals("1"));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a() {
        this.c = true;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized void a(String str) {
        if (this.f == null) {
            this.e = str;
            this.c = false;
            this.f = new Thread(this);
            this.f.start();
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void run() {
        try {
            b();
        } catch (MalformedURLException e) {
            g.b("Received malformed ad url from javascript.", e);
            ((n) this.a.b.a()).a(e.d);
        } catch (IOException e2) {
            g.b("IOException connecting to ad url.", e2);
            ((n) this.a.b.a()).a(e.c);
        } catch (Throwable th) {
            g.b("An unknown error occurred in AdResponseLoader.", th);
            ((n) this.a.b.a()).a(e.d);
        }
    }
}
