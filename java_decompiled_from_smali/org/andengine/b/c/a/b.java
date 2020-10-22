package org.andengine.b.c.a;

import android.view.View.MeasureSpec;
import org.andengine.opengl.view.RenderSurfaceView;

public class b extends a {
    private final float a;
    private final float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;

    public b(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public void a(RenderSurfaceView renderSurfaceView, int i, int i2) {
        float f;
        float f2;
        a.a(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        float f3 = this.a / this.b;
        if (((float) size) / ((float) size2) < f3) {
            f = ((float) size2) * f3;
            f3 = (float) size2;
            f2 = this.b / f3;
        } else {
            f3 = ((float) size) / f3;
            f = (float) size;
            f2 = this.a / f;
        }
        this.c = ((float) size) * f2;
        this.d = f2 * ((float) size2);
        this.e = (this.a - this.c) / 2.0f;
        this.f = this.c + this.e;
        this.h = (this.b - this.d) / 2.0f;
        this.g = this.d + this.h;
        renderSurfaceView.a((int) f, (int) f3);
    }
}
