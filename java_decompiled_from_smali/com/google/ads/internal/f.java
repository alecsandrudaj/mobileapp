package com.google.ads.internal;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.l;
import com.google.ads.n;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public final class f implements Runnable {
    private final l a;
    private final a b;
    private volatile boolean c;
    private boolean d;
    private String e;
    private Thread f;

    public interface a {
        HttpURLConnection a(URL url) throws IOException;
    }

    f(l lVar) {
        this(lVar, new a() {
            public HttpURLConnection a(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }
        });
    }

    f(l lVar, a aVar) {
        this.f = null;
        this.a = lVar;
        this.b = aVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void a() {
        this.c = true;
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

    private void b(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Debug-Dialog");
        if (!TextUtils.isEmpty(headerField)) {
            ((c) this.a.b.a()).f(headerField);
        }
    }

    private void c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Type");
        if (!TextUtils.isEmpty(headerField)) {
            ((c) this.a.b.a()).b(headerField);
        }
    }

    private void d(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Mediation");
        if (!TextUtils.isEmpty(headerField)) {
            ((c) this.a.b.a()).b(Boolean.valueOf(headerField).booleanValue());
        }
    }

    private void e(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                ((d) ((n) this.a.a.a()).b.a()).a((long) (Float.parseFloat(headerField) * 1000.0f));
            } catch (NumberFormatException e) {
                b.d("Could not get timeout value: " + headerField, e);
            }
        }
    }

    private void f(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String b : headerField.trim().split("\\s+")) {
                ((d) ((n) this.a.a.a()).b.a()).b(b);
            }
        }
    }

    private void g(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String c : headerField.trim().split("\\s+")) {
                ((d) ((n) this.a.a.a()).b.a()).c(c);
            }
        }
    }

    private void h(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
        if (!TextUtils.isEmpty(headerField)) {
            for (String a : headerField.trim().split("\\s+")) {
                ((c) this.a.b.a()).a(a);
            }
        }
    }

    private void i(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                float parseFloat = Float.parseFloat(headerField);
                d dVar = (d) ((n) this.a.a.a()).b.a();
                if (parseFloat > 0.0f) {
                    dVar.a(parseFloat);
                    if (!dVar.t()) {
                        dVar.g();
                    }
                } else if (dVar.t()) {
                    dVar.f();
                }
            } catch (NumberFormatException e) {
                b.d("Could not get refresh value: " + headerField, e);
            }
        }
    }

    private void j(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Orientation");
        if (!TextUtils.isEmpty(headerField)) {
            if (headerField.equals("portrait")) {
                ((c) this.a.b.a()).a(AdUtil.b());
            } else if (headerField.equals("landscape")) {
                ((c) this.a.b.a()).a(AdUtil.a());
            }
        }
    }

    private void k(HttpURLConnection httpURLConnection) {
        if (!TextUtils.isEmpty(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {
            try {
                ((d) ((n) this.a.a.a()).b.a()).b(Long.parseLong(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life")));
            } catch (NumberFormatException e) {
                b.e("Got bad value of Doritos cookie cache life from header: " + httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
            }
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    private void l(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Cache-Control");
        if (!TextUtils.isEmpty(headerField)) {
            ((c) this.a.b.a()).c(headerField);
        }
    }

    private void m(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Ad-Size");
        if (!TextUtils.isEmpty(headerField)) {
            try {
                String[] split = headerField.split("x", 2);
                if (split.length != 2) {
                    b.e("Could not parse size header: " + headerField);
                    return;
                }
                ((c) this.a.b.a()).a(new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
            } catch (NumberFormatException e) {
                b.e("Could not parse size header: " + headerField);
            }
        }
    }

    private void n(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
        if (!TextUtils.isEmpty(headerField)) {
            ((c) this.a.b.a()).a(headerField.equals("1"));
        }
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

    private void a(HttpURLConnection httpURLConnection, int i) throws IOException {
        if (300 <= i && i < 400) {
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                b.c("Could not get redirect location from a " + i + " redirect.");
                ((c) this.a.b.a()).a(ErrorCode.INTERNAL_ERROR);
                a();
                return;
            }
            a(httpURLConnection);
            this.e = headerField;
        } else if (i == 200) {
            a(httpURLConnection);
            String trim = AdUtil.a(new InputStreamReader(httpURLConnection.getInputStream())).trim();
            b.a("Response content is: " + trim);
            if (TextUtils.isEmpty(trim)) {
                b.a("Response message is null or zero length: " + trim);
                ((c) this.a.b.a()).a(ErrorCode.NO_FILL);
                a();
                return;
            }
            ((c) this.a.b.a()).a(trim, this.e);
            a();
        } else if (i == 400) {
            b.c("Bad request");
            ((c) this.a.b.a()).a(ErrorCode.INVALID_REQUEST);
            a();
        } else {
            b.c("Invalid response code: " + i);
            ((c) this.a.b.a()).a(ErrorCode.INTERNAL_ERROR);
            a();
        }
    }

    public void run() {
        try {
            b();
        } catch (MalformedURLException e) {
            b.b("Received malformed ad url from javascript.", e);
            ((c) this.a.b.a()).a(ErrorCode.INTERNAL_ERROR);
        } catch (IOException e2) {
            b.b("IOException connecting to ad url.", e2);
            ((c) this.a.b.a()).a(ErrorCode.NETWORK_ERROR);
        } catch (Throwable th) {
            b.b("An unknown error occurred in AdResponseLoader.", th);
            ((c) this.a.b.a()).a(ErrorCode.INTERNAL_ERROR);
        }
    }

    private void b() throws MalformedURLException, IOException {
        while (!this.c) {
            HttpURLConnection a = this.b.a(new URL(this.e));
            try {
                a((Context) ((n) this.a.a.a()).f.a(), a);
                AdUtil.a(a, (Context) ((n) this.a.a.a()).f.a());
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
}
