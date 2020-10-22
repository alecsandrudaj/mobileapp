package com.google.ads.util;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ads.AdActivity;
import com.google.ads.a.e;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;

public class r extends WebChromeClient {
    private final bt a;

    public r(bt btVar) {
        this.a = btVar;
    }

    private static void a(Builder builder, Context context, String str, String str2, JsPromptResult jsPromptResult) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str);
        EditText editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(17039370, new x(jsPromptResult, editText)).setNegativeButton(17039360, new w(jsPromptResult)).setOnCancelListener(new v(jsPromptResult)).create().show();
    }

    private static void a(Builder builder, String str, JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(17039370, new u(jsResult)).setNegativeButton(17039360, new t(jsResult)).setOnCancelListener(new s(jsResult)).create().show();
    }

    private static boolean a(WebView webView, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        if (webView instanceof e) {
            AdActivity i = ((e) webView).i();
            if (i != null) {
                Builder builder = new Builder(i);
                builder.setTitle(str);
                if (z) {
                    a(builder, i, str2, str3, jsPromptResult);
                } else {
                    a(builder, str2, jsResult);
                }
                return true;
            }
        }
        return false;
    }

    public void onCloseWindow(WebView webView) {
        if (webView instanceof e) {
            ((e) webView).f();
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        switch (q.a[consoleMessage.messageLevel().ordinal()]) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                g.b(str);
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                g.e(str);
                break;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
            case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                g.c(str);
                break;
            case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                g.a(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        bs bsVar = (bs) ((br) this.a.d.a()).b.a();
        long longValue = ((Long) bsVar.l.a()).longValue() - j3;
        if (longValue <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > longValue || j2 > ((Long) bsVar.m.a()).longValue()) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(((Long) bsVar.n.a()).longValue(), longValue) + j, ((Long) bsVar.m.a()).longValue());
        } else {
            if (j2 <= Math.min(((Long) bsVar.m.a()).longValue() - j, longValue)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(webView, str, str2, null, jsResult, null, false);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(webView, str, str2, null, jsResult, null, false);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(webView, str, str2, null, jsResult, null, false);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(webView, str, str2, str3, null, jsPromptResult, true);
    }

    public void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        bs bsVar = (bs) ((br) this.a.d.a()).b.a();
        long longValue = ((Long) bsVar.j.a()).longValue() + j;
        if (((Long) bsVar.k.a()).longValue() - j2 < longValue) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(longValue);
        }
    }

    public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
