package com.google.ads.util;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.google.ads.AdSize;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.AdWebView;
import com.google.ads.n;

@TargetApi(14)
public class IcsUtil {

    public static class a extends com.google.ads.util.g.a {
        public a(n nVar) {
            super(nVar);
        }

        public void onShowCustomView(View view, int requestedOrientation, CustomViewCallback callback) {
            callback.onCustomViewHidden();
        }
    }

    public static class IcsAdWebView extends AdWebView {
        public IcsAdWebView(n slotState, AdSize adSize) {
            super(slotState, adSize);
        }

        public boolean canScrollHorizontally(int direction) {
            if (this.a.e.a() != null) {
                return !((ActivationOverlay) this.a.e.a()).b();
            } else {
                return super.canScrollHorizontally(direction);
            }
        }

        public boolean canScrollVertically(int direction) {
            if (this.a.e.a() != null) {
                return !((ActivationOverlay) this.a.e.a()).b();
            } else {
                return super.canScrollVertically(direction);
            }
        }
    }
}
