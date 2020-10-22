package com.google.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ads.AdView;
import com.google.ads.g;
import com.google.ads.h;

public class DfpAdView extends AdView {
    public DfpAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DfpAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAppEventListener(h hVar) {
        super.setAppEventListener(hVar);
    }

    public void setSupportedAdSizes(g... gVarArr) {
        super.setSupportedAdSizes(gVarArr);
    }
}
