package com.google.ads.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.ai;
import com.google.ads.bt;
import com.google.ads.g;
import com.google.ads.util.AdUtil;
import com.google.ads.util.p;
import com.google.ads.util.r;
import com.google.ads.util.z;
import java.lang.ref.WeakReference;

public class e extends WebView {
    protected final bt a;
    private WeakReference b = null;
    private g c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    public e(bt btVar, g gVar) {
        super((Context) btVar.f.a());
        this.a = btVar;
        this.c = gVar;
        setBackgroundColor(0);
        AdUtil.a((WebView) this);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        setDownloadListener(new f(this));
        if (AdUtil.a >= 17) {
            z.a(settings, btVar);
        } else if (AdUtil.a >= 11) {
            p.a(settings, btVar);
        }
        setScrollBarStyle(33554432);
        if (AdUtil.a >= 14) {
            setWebChromeClient(new d(btVar));
        } else if (AdUtil.a >= 11) {
            setWebChromeClient(new r(btVar));
        }
    }

    public void a(boolean z) {
        if (z) {
            setOnTouchListener(new g(this));
        } else {
            setOnTouchListener(null);
        }
    }

    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable th) {
            com.google.ads.util.g.d("An error occurred while destroying an AdWebView:", th);
        }
        try {
            setWebViewClient(new WebViewClient());
        } catch (Throwable th2) {
        }
    }

    public void f() {
        AdActivity i = i();
        if (i != null) {
            i.finish();
        }
    }

    public void g() {
        if (AdUtil.a >= 11) {
            p.a((View) this);
        }
        this.e = true;
    }

    public void h() {
        if (this.e && AdUtil.a >= 11) {
            p.b(this);
        }
        this.e = false;
    }

    public AdActivity i() {
        return this.b != null ? (AdActivity) this.b.get() : null;
    }

    public boolean j() {
        return this.f;
    }

    public boolean k() {
        return this.e;
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            com.google.ads.util.g.d("An error occurred while loading data in AdWebView:", th);
        }
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            com.google.ads.util.g.d("An error occurred while loading a URL in AdWebView:", th);
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void onMeasure(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        synchronized (this) {
            if (isInEditMode()) {
                super.onMeasure(i, i2);
            } else if (this.c == null || this.d) {
                super.onMeasure(i, i2);
            } else {
                int mode = MeasureSpec.getMode(i);
                int size = MeasureSpec.getSize(i);
                int mode2 = MeasureSpec.getMode(i2);
                int size2 = MeasureSpec.getSize(i2);
                float f = getContext().getResources().getDisplayMetrics().density;
                int a = (int) (((float) this.c.a()) * f);
                int b = (int) (((float) this.c.b()) * f);
                mode = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
                if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                    i3 = size2;
                }
                if (((float) a) - (f * 6.0f) > ((float) mode) || b > i3) {
                    com.google.ads.util.g.b("Not enough space to show ad! Wants: <" + a + ", " + b + ">, Has: <" + size + ", " + size2 + ">");
                    setVisibility(8);
                    setMeasuredDimension(size, size2);
                } else {
                    setMeasuredDimension(a, b);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ai aiVar = (ai) this.a.r.a();
        if (aiVar != null) {
            aiVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdActivity(AdActivity adActivity) {
        this.b = new WeakReference(adActivity);
    }

    public synchronized void setAdSize(g gVar) {
        this.c = gVar;
        requestLayout();
    }

    public void setCustomClose(boolean z) {
        this.f = z;
        if (this.b != null) {
            AdActivity adActivity = (AdActivity) this.b.get();
            if (adActivity != null) {
                adActivity.a(z);
            }
        }
    }

    public void setIsExpandedMraid(boolean z) {
        this.d = z;
    }

    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Throwable th) {
            com.google.ads.util.g.d("An error occurred while stopping loading in AdWebView:", th);
        }
    }
}
