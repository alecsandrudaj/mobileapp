package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.dq;

public final class PlusOneButton extends FrameLayout {
    private View a;
    private int b;
    private int c;
    private String d;
    private int e = -1;
    private e f;

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = a(context, attributeSet);
        this.c = b(context, attributeSet);
        a(getContext());
        if (isInEditMode()) {
        }
    }

    protected static int a(Context context, AttributeSet attributeSet) {
        String a = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        return "SMALL".equalsIgnoreCase(a) ? 0 : "MEDIUM".equalsIgnoreCase(a) ? 1 : "TALL".equalsIgnoreCase(a) ? 2 : 3;
    }

    private void a(Context context) {
        if (this.a != null) {
            removeView(this.a);
        }
        this.a = be.a(context, this.b, this.c, this.d, this.e);
        setOnPlusOneClickListener(this.f);
        addView(this.a);
    }

    protected static int b(Context context, AttributeSet attributeSet) {
        String a = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        return "INLINE".equalsIgnoreCase(a) ? 2 : !"NONE".equalsIgnoreCase(a) ? 1 : 0;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, i3 - i, i4 - i2);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        View view = this.a;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.c = i;
        a(getContext());
    }

    public void setOnPlusOneClickListener(e eVar) {
        this.f = eVar;
        this.a.setOnClickListener(new d(this, eVar));
    }

    public void setSize(int i) {
        this.b = i;
        a(getContext());
    }
}
