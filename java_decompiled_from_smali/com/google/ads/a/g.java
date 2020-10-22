package com.google.ads.a;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class g implements OnTouchListener {
    final /* synthetic */ e a;

    g(e eVar) {
        this.a = eVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() == 2;
    }
}
