package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import com.google.android.gms.e;

public final class ch extends Drawable implements Callback {
    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private cl j;
    private Drawable k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;

    public ch(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = cj.a;
        }
        this.k = drawable;
        drawable.setCallback(this);
        cl clVar = this.j;
        clVar.b |= drawable.getChangingConfigurations();
        if (drawable2 == null) {
            drawable2 = cj.a;
        }
        this.l = drawable2;
        drawable2.setCallback(this);
        clVar = this.j;
        clVar.b |= drawable2.getChangingConfigurations();
    }

    ch(cl clVar) {
        this.a = 0;
        this.e = 255;
        this.g = 0;
        this.h = true;
        this.j = new cl(clVar);
    }

    public void a(int i) {
        this.c = 0;
        this.d = this.e;
        this.g = 0;
        this.f = i;
        this.a = 1;
        invalidateSelf();
    }

    public boolean a() {
        if (!this.m) {
            boolean z = (this.k.getConstantState() == null || this.l.getConstantState() == null) ? false : true;
            this.n = z;
            this.m = true;
        }
        return this.n;
    }

    public Drawable b() {
        return this.l;
    }

    public void draw(Canvas canvas) {
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case e.MapAttrs_cameraBearing /*1*/:
                this.b = SystemClock.uptimeMillis();
                this.a = 2;
                break;
            case e.MapAttrs_cameraTargetLat /*2*/:
                if (this.b >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.b)) / ((float) this.f);
                    if (uptimeMillis < 1.0f) {
                        i = 0;
                    }
                    if (i != 0) {
                        this.a = 0;
                    }
                    float min = Math.min(uptimeMillis, 1.0f);
                    this.g = (int) ((min * ((float) (this.d - this.c))) + ((float) this.c));
                    break;
                }
                break;
        }
        i2 = i;
        i = this.g;
        boolean z = this.h;
        Drawable drawable = this.k;
        Drawable drawable2 = this.l;
        if (i2 != 0) {
            if (!z || i == 0) {
                drawable.draw(canvas);
            }
            if (i == this.e) {
                drawable2.setAlpha(this.e);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z) {
            drawable.setAlpha(this.e - i);
        }
        drawable.draw(canvas);
        if (z) {
            drawable.setAlpha(this.e);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.e);
        }
        invalidateSelf();
    }

    public int getChangingConfigurations() {
        return (super.getChangingConfigurations() | this.j.a) | this.j.b;
    }

    public ConstantState getConstantState() {
        if (!a()) {
            return null;
        }
        this.j.a = getChangingConfigurations();
        return this.j;
    }

    public int getIntrinsicHeight() {
        return Math.max(this.k.getIntrinsicHeight(), this.l.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.k.getIntrinsicWidth(), this.l.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.o) {
            this.p = Drawable.resolveOpacity(this.k.getOpacity(), this.l.getOpacity());
            this.o = true;
        }
        return this.p;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (p.a()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            if (a()) {
                this.k.mutate();
                this.l.mutate();
                this.i = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        this.k.setBounds(rect);
        this.l.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (p.a()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.scheduleDrawable(this, runnable, j);
            }
        }
    }

    public void setAlpha(int i) {
        if (this.g == this.e) {
            this.g = i;
        }
        this.e = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        this.l.setColorFilter(colorFilter);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (p.a()) {
            Callback callback = getCallback();
            if (callback != null) {
                callback.unscheduleDrawable(this, runnable);
            }
        }
    }
}
