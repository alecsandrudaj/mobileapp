package com.google.ads.a;

import android.content.Context;
import com.google.ads.util.AdUtil;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ae implements Runnable {
    private String a;
    private Context b;

    public ae(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    /* Access modifiers changed, original: protected */
    public BufferedOutputStream a(HttpURLConnection httpURLConnection) {
        return new BufferedOutputStream(httpURLConnection.getOutputStream());
    }

    /* Access modifiers changed, original: protected */
    public HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(true);
        AdUtil.a(httpURLConnection, this.b);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        return httpURLConnection;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public void run() {
        /*
        r3 = this;
        r0 = com.google.ads.br.a();
        r0 = r0.b;
        r0 = r0.a();
        r0 = (com.google.ads.bs) r0;
        r0 = r0.h;
        r0 = r0.a();
        r0 = (java.lang.String) r0;
        r1 = new java.net.URL;	 Catch:{ IOException -> 0x0069 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0069 }
        r1 = r3.a(r1);	 Catch:{ IOException -> 0x0069 }
        r0 = new com.google.ads.a.af;	 Catch:{ IOException -> 0x0069 }
        r2 = r3.a;	 Catch:{ IOException -> 0x0069 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0069 }
        r0 = r0.a();	 Catch:{ IOException -> 0x0069 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0069 }
        r0 = r0.getBytes();	 Catch:{ IOException -> 0x0069 }
        r2 = r0.length;	 Catch:{ IOException -> 0x0069 }
        r1.setFixedLengthStreamingMode(r2);	 Catch:{ IOException -> 0x0069 }
        r2 = r3.a(r1);	 Catch:{ all -> 0x0064 }
        r2.write(r0);	 Catch:{ all -> 0x0064 }
        r2.close();	 Catch:{ all -> 0x0064 }
        r0 = r1.getResponseCode();	 Catch:{ all -> 0x0064 }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 == r2) goto L_0x0060;
    L_0x0046:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0064 }
        r0.<init>();	 Catch:{ all -> 0x0064 }
        r2 = "Got error response from BadAd backend: ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0064 }
        r2 = r1.getResponseMessage();	 Catch:{ all -> 0x0064 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0064 }
        r0 = r0.toString();	 Catch:{ all -> 0x0064 }
        com.google.ads.util.g.b(r0);	 Catch:{ all -> 0x0064 }
    L_0x0060:
        r1.disconnect();	 Catch:{ IOException -> 0x0069 }
    L_0x0063:
        return;
    L_0x0064:
        r0 = move-exception;
        r1.disconnect();	 Catch:{ IOException -> 0x0069 }
        throw r0;	 Catch:{ IOException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        r1 = "Error reporting bad ad.";
        com.google.ads.util.g.b(r1, r0);
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.a.ae.run():void");
    }
}
