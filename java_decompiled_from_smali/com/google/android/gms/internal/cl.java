package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cl extends ConstantState {
    int a;
    int b;

    cl(cl clVar) {
        if (clVar != null) {
            this.a = clVar.a;
            this.b = clVar.b;
        }
    }

    public int getChangingConfigurations() {
        return this.a;
    }

    public Drawable newDrawable() {
        return new ch(this);
    }
}
