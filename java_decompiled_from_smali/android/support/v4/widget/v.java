package android.support.v4.widget;

import android.support.v4.widget.SlidingPaneLayout.LayoutParams;
import android.view.View;

class v extends af {
    final /* synthetic */ SlidingPaneLayout a;

    private v(SlidingPaneLayout slidingPaneLayout) {
        this.a = slidingPaneLayout;
    }

    public int a(View view) {
        return this.a.j;
    }

    public int a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.a.g.getLayoutParams();
        int paddingLeft = layoutParams.leftMargin + this.a.getPaddingLeft();
        return Math.min(Math.max(i, paddingLeft), this.a.j + paddingLeft);
    }

    public void a(int i) {
        if (this.a.p.a() != 0) {
            return;
        }
        if (this.a.h == 0.0f) {
            this.a.d(this.a.g);
            this.a.c(this.a.g);
            this.a.q = false;
            return;
        }
        this.a.b(this.a.g);
        this.a.q = true;
    }

    public void a(View view, float f, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int paddingLeft = layoutParams.leftMargin + this.a.getPaddingLeft();
        if (f > 0.0f || (f == 0.0f && this.a.h > 0.5f)) {
            paddingLeft += this.a.j;
        }
        this.a.p.a(paddingLeft, view.getTop());
        this.a.invalidate();
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        this.a.a(i);
        this.a.invalidate();
    }

    public boolean a(View view, int i) {
        return this.a.k ? false : ((LayoutParams) view.getLayoutParams()).b;
    }

    public void b(int i, int i2) {
        this.a.p.a(this.a.g, i2);
    }

    public void b(View view, int i) {
        this.a.a();
    }
}
