package com.google.ads;

import android.content.Context;
import android.net.Uri;

public class al {
    private String a = "googleads.g.doubleclick.net";
    private String b = "/pagead/ads";
    private String[] c = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private ai d;
    private ah e = new ah();

    public al(ai aiVar) {
        this.d = aiVar;
    }

    public boolean a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.c) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public void a(String str) {
        this.c = str.split(",");
    }

    public Uri a(Uri uri, Context context) throws am {
        try {
            return a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new am("Provided Uri is not in a valid state");
        }
    }

    private Uri a(Uri uri, String str, String str2) throws UnsupportedOperationException {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private Uri a(Uri uri, Context context, String str, boolean z) throws am {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new am("Query parameter already exists: ms");
            }
            String a;
            if (z) {
                a = this.d.a(context, str);
            } else {
                a = this.d.a(context);
            }
            return a(uri, "ms", a);
        } catch (UnsupportedOperationException e) {
            throw new am("Provided Uri is not in a valid state");
        }
    }
}
