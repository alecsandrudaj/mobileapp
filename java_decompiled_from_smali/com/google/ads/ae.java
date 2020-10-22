package com.google.ads;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ae implements Runnable {
    private final Context a;
    private final String b;

    public ae(String str, Context context) {
        this.b = str;
        this.a = context;
    }

    /* Access modifiers changed, original: protected */
    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public void run() {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0066 }
        r0.<init>();	 Catch:{ Throwable -> 0x0066 }
        r1 = "Pinging URL: ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0066 }
        r1 = r4.b;	 Catch:{ Throwable -> 0x0066 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0066 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0066 }
        com.google.ads.util.b.a(r0);	 Catch:{ Throwable -> 0x0066 }
        r0 = new java.net.URL;	 Catch:{ Throwable -> 0x0066 }
        r1 = r4.b;	 Catch:{ Throwable -> 0x0066 }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0066 }
        r1 = r4.a(r0);	 Catch:{ Throwable -> 0x0066 }
        r0 = r4.a;	 Catch:{ all -> 0x0061 }
        com.google.ads.util.AdUtil.a(r1, r0);	 Catch:{ all -> 0x0061 }
        r0 = 1;
        r1.setInstanceFollowRedirects(r0);	 Catch:{ all -> 0x0061 }
        r1.connect();	 Catch:{ all -> 0x0061 }
        r0 = r1.getResponseCode();	 Catch:{ all -> 0x0061 }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 < r2) goto L_0x003b;
    L_0x0037:
        r2 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r0 < r2) goto L_0x005d;
    L_0x003b:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0061 }
        r2.<init>();	 Catch:{ all -> 0x0061 }
        r3 = "Did not receive 2XX (got ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0061 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0061 }
        r2 = ") from pinging URL: ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0061 }
        r2 = r4.b;	 Catch:{ all -> 0x0061 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0061 }
        r0 = r0.toString();	 Catch:{ all -> 0x0061 }
        com.google.ads.util.b.e(r0);	 Catch:{ all -> 0x0061 }
    L_0x005d:
        r1.disconnect();	 Catch:{ Throwable -> 0x0066 }
    L_0x0060:
        return;
    L_0x0061:
        r0 = move-exception;
        r1.disconnect();	 Catch:{ Throwable -> 0x0066 }
        throw r0;	 Catch:{ Throwable -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unable to ping the URL: ";
        r1 = r1.append(r2);
        r2 = r4.b;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.google.ads.util.b.d(r1, r0);
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.ae.run():void");
    }
}
