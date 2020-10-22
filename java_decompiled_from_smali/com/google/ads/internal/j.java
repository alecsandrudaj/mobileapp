package com.google.ads.internal;

import android.content.Context;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class j implements Runnable {
    private String a;
    private Context b;

    public static class a {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("debugHeader", this.a);
            } catch (JSONException e) {
                b.b("Could not build ReportAdJson from inputs.", e);
            }
            return jSONObject;
        }
    }

    public j(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    /* Access modifiers changed, original: protected */
    public HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(true);
        AdUtil.a(httpURLConnection, this.b);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        return httpURLConnection;
    }

    /* Access modifiers changed, original: protected */
    public BufferedOutputStream a(HttpURLConnection httpURLConnection) throws IOException {
        return new BufferedOutputStream(httpURLConnection.getOutputStream());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public void run() {
        /*
        r3 = this;
        r0 = com.google.ads.m.a();
        r0 = r0.b;
        r0 = r0.a();
        r0 = (com.google.ads.m.a) r0;
        r0 = r0.h;
        r0 = r0.a();
        r0 = (java.lang.String) r0;
        r1 = new java.net.URL;	 Catch:{ IOException -> 0x0069 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0069 }
        r1 = r3.a(r1);	 Catch:{ IOException -> 0x0069 }
        r0 = new com.google.ads.internal.j$a;	 Catch:{ IOException -> 0x0069 }
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
        com.google.ads.util.b.b(r0);	 Catch:{ all -> 0x0064 }
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
        com.google.ads.util.b.b(r1, r0);
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.internal.j.run():void");
    }
}
