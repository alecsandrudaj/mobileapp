package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.e;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    static final y a;
    private int b;
    private int c;
    private Drawable d;
    private final int e;
    private boolean f;
    private View g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private int l;
    private float m;
    private float n;
    private w o;
    private final ac p;
    private boolean q;
    private boolean r;
    private final Rect s;
    private final ArrayList t;

    public class LayoutParams extends MarginLayoutParams {
        private static final int[] e = new int[]{16843137};
        public float a = 0.0f;
        boolean b;
        boolean c;
        Paint d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new x();
        boolean a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 0;
        }

        /* synthetic */ SavedState(Parcel parcel, s sVar) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            a = new ab();
        } else if (i >= 16) {
            a = new aa();
        } else {
            a = new z();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -858993460;
        this.r = true;
        this.s = new Rect();
        this.t = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.e = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        at.a((View) this, new t(this));
        at.b(this, 1);
        this.p = ac.a((ViewGroup) this, 0.5f, new v(this, null));
        this.p.a(1);
        this.p.a(f * 400.0f);
    }

    private void a(float f) {
        int i = 0;
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        int i2 = (!layoutParams.c || layoutParams.leftMargin > 0) ? 0 : 1;
        int childCount = getChildCount();
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt != this.g) {
                int i3 = (int) ((1.0f - this.i) * ((float) this.l));
                this.i = f;
                childAt.offsetLeftAndRight(i3 - ((int) ((1.0f - f) * ((float) this.l))));
                if (i2 != 0) {
                    a(childAt, 1.0f - this.i, this.c);
                }
            }
            i++;
        }
    }

    private void a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        this.h = ((float) (i - (getPaddingLeft() + layoutParams.leftMargin))) / ((float) this.j);
        if (this.l != 0) {
            a(this.h);
        }
        if (layoutParams.c) {
            a(this.g, this.h, this.b);
        }
        a(this.g);
    }

    private void a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (16777215 & i);
            if (layoutParams.d == null) {
                layoutParams.d = new Paint();
            }
            layoutParams.d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
            if (at.d(view) != 2) {
                at.a(view, 2, layoutParams.d);
            }
            g(view);
        } else if (at.d(view) != 0) {
            if (layoutParams.d != null) {
                layoutParams.d.setColorFilter(null);
            }
            Runnable uVar = new u(this, view);
            this.t.add(uVar);
            at.a((View) this, uVar);
        }
    }

    private boolean a(View view, int i) {
        if (!this.r && !a(0.0f, i)) {
            return false;
        }
        this.q = false;
        return true;
    }

    private boolean b(View view, int i) {
        if (!this.r && !a(1.0f, i)) {
            return false;
        }
        this.q = true;
        return true;
    }

    private static boolean f(View view) {
        if (at.g(view)) {
            return true;
        }
        if (VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        return background != null ? background.getOpacity() == -1 : false;
    }

    private void g(View view) {
        a.a(this, view);
    }

    /* Access modifiers changed, original: 0000 */
    public void a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(View view) {
        if (this.o != null) {
            this.o.a(view, this.h);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(float f, int i) {
        if (!this.f) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.g.getLayoutParams();
        if (!this.p.a(this.g, (int) (((float) (layoutParams.leftMargin + getPaddingLeft())) + (((float) this.j) * f)), this.g.getTop())) {
            return false;
        }
        a();
        at.b(this);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(View view) {
        if (this.o != null) {
            this.o.a(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean b() {
        return b(this.g, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public void c(View view) {
        if (this.o != null) {
            this.o.b(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean c() {
        return a(this.g, 0);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.p.a(true)) {
            return;
        }
        if (this.f) {
            at.b(this);
        } else {
            this.p.f();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view == null || !f(view)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                int i6 = (Math.max(paddingLeft, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(width, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4;
                childAt.setVisibility(i6);
                i5++;
            } else {
                return;
            }
        }
    }

    public boolean d() {
        return !this.f || this.h == 1.0f;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && this.d != null) {
            int intrinsicWidth = this.d.getIntrinsicWidth();
            int left = childAt.getLeft();
            this.d.setBounds(left - intrinsicWidth, childAt.getTop(), left, childAt.getBottom());
            this.d.draw(canvas);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (!(!this.f || layoutParams.b || this.g == null)) {
            canvas.getClipBounds(this.s);
            this.s.right = Math.min(this.s.right, this.g.getLeft());
            canvas.clipRect(this.s);
        }
        if (VERSION.SDK_INT >= 11) {
            drawChild = super.drawChild(canvas, view, j);
        } else if (!layoutParams.c || this.h <= 0.0f) {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            drawChild = super.drawChild(canvas, view, j);
        } else {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, (float) view.getLeft(), (float) view.getTop(), layoutParams.d);
                drawChild = false;
            } else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                drawChild = super.drawChild(canvas, view, j);
            }
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public boolean e() {
        return this.f;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean e(View view) {
        if (view == null) {
            return false;
        }
        boolean z = this.f && ((LayoutParams) view.getLayoutParams()).c && this.h > 0.0f;
        return z;
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.c;
    }

    public int getParallaxDistance() {
        return this.l;
    }

    public int getSliderFadeColor() {
        return this.b;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            ((u) this.t.get(i)).run();
        }
        this.t.clear();
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r2 = 0;
        r1 = 1;
        r3 = android.support.v4.view.z.a(r8);
        r0 = r7.f;
        if (r0 != 0) goto L_0x002d;
    L_0x000a:
        if (r3 != 0) goto L_0x002d;
    L_0x000c:
        r0 = r7.getChildCount();
        if (r0 <= r1) goto L_0x002d;
    L_0x0012:
        r0 = r7.getChildAt(r1);
        if (r0 == 0) goto L_0x002d;
    L_0x0018:
        r4 = r7.p;
        r5 = r8.getX();
        r5 = (int) r5;
        r6 = r8.getY();
        r6 = (int) r6;
        r0 = r4.b(r0, r5, r6);
        if (r0 != 0) goto L_0x0041;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r7.q = r0;
    L_0x002d:
        r0 = r7.f;
        if (r0 == 0) goto L_0x0037;
    L_0x0031:
        r0 = r7.k;
        if (r0 == 0) goto L_0x0043;
    L_0x0035:
        if (r3 == 0) goto L_0x0043;
    L_0x0037:
        r0 = r7.p;
        r0.e();
        r2 = super.onInterceptTouchEvent(r8);
    L_0x0040:
        return r2;
    L_0x0041:
        r0 = r2;
        goto L_0x002b;
    L_0x0043:
        r0 = 3;
        if (r3 == r0) goto L_0x0048;
    L_0x0046:
        if (r3 != r1) goto L_0x004e;
    L_0x0048:
        r0 = r7.p;
        r0.e();
        goto L_0x0040;
    L_0x004e:
        switch(r3) {
            case 0: goto L_0x005e;
            case 1: goto L_0x0051;
            case 2: goto L_0x0082;
            default: goto L_0x0051;
        };
    L_0x0051:
        r0 = r2;
    L_0x0052:
        r3 = r7.p;
        r3 = r3.a(r8);
        if (r3 != 0) goto L_0x005c;
    L_0x005a:
        if (r0 == 0) goto L_0x0040;
    L_0x005c:
        r2 = r1;
        goto L_0x0040;
    L_0x005e:
        r7.k = r2;
        r0 = r8.getX();
        r3 = r8.getY();
        r7.m = r0;
        r7.n = r3;
        r4 = r7.p;
        r5 = r7.g;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = r4.b(r5, r0, r3);
        if (r0 == 0) goto L_0x0051;
    L_0x0078:
        r0 = r7.g;
        r0 = r7.e(r0);
        if (r0 == 0) goto L_0x0051;
    L_0x0080:
        r0 = r1;
        goto L_0x0052;
    L_0x0082:
        r0 = r8.getX();
        r3 = r8.getY();
        r4 = r7.m;
        r0 = r0 - r4;
        r0 = java.lang.Math.abs(r0);
        r4 = r7.n;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r7.p;
        r4 = r4.d();
        r4 = (float) r4;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0051;
    L_0x00a3:
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0051;
    L_0x00a7:
        r0 = r7.p;
        r0.e();
        r7.k = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.r) {
            float f = (this.f && this.q) ? 1.0f : 0.0f;
            this.h = f;
        }
        int i7 = 0;
        int i8 = paddingLeft;
        while (i7 < childCount) {
            int i9;
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                i9 = i8;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.b) {
                    int min = (Math.min(paddingLeft, (i6 - paddingRight) - this.e) - i8) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.j = min;
                    layoutParams.c = ((layoutParams.leftMargin + i8) + min) + (measuredWidth / 2) > i6 - paddingRight;
                    i9 = (layoutParams.leftMargin + ((int) (((float) min) * this.h))) + i8;
                    i5 = 0;
                } else if (!this.f || this.l == 0) {
                    i5 = 0;
                    i9 = paddingLeft;
                } else {
                    i5 = (int) ((1.0f - this.h) * ((float) this.l));
                    i9 = paddingLeft;
                }
                i5 = i9 - i5;
                childAt.layout(i5, paddingTop, i5 + measuredWidth, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
            i7++;
            i8 = i9;
        }
        if (this.r) {
            if (this.f) {
                if (this.l != 0) {
                    a(this.h);
                }
                if (((LayoutParams) this.g.getLayoutParams()).c) {
                    a(this.g, this.h, this.b);
                }
            } else {
                for (i5 = 0; i5 < childCount; i5++) {
                    a(getChildAt(i5), 0.0f, this.b);
                }
            }
            d(this.g);
        }
        this.r = false;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        LayoutParams layoutParams;
        int i5;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 == 0) {
                if (!isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                } else if (mode2 == 0) {
                    i3 = Integer.MIN_VALUE;
                    i4 = size;
                    size = 300;
                }
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        } else if (!isInEditMode()) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode == Integer.MIN_VALUE) {
            i3 = mode2;
            i4 = size;
            size = size2;
        } else {
            if (mode == 0) {
                i3 = mode2;
                i4 = 300;
                size = size2;
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                size2 = 0;
                mode2 = (size - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                size2 = (size - getPaddingTop()) - getPaddingBottom();
                mode2 = size2;
                break;
            default:
                size2 = 0;
                mode2 = -1;
                break;
        }
        int i6 = 0;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.g = null;
        int i7 = 0;
        int i8 = size2;
        float f = 0.0f;
        while (i7 < childCount) {
            float f2;
            View childAt = getChildAt(i7);
            layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.c = false;
                size2 = paddingLeft;
                f2 = f;
                i5 = i8;
                size = i6;
            } else {
                if (layoutParams.a > 0.0f) {
                    f += layoutParams.a;
                    if (layoutParams.width == 0) {
                        size2 = paddingLeft;
                        f2 = f;
                        i5 = i8;
                        size = i6;
                    }
                }
                mode = layoutParams.leftMargin + layoutParams.rightMargin;
                mode = layoutParams.width == -2 ? MeasureSpec.makeMeasureSpec(i4 - mode, Integer.MIN_VALUE) : layoutParams.width == -1 ? MeasureSpec.makeMeasureSpec(i4 - mode, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                i5 = layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                childAt.measure(mode, i5);
                mode = childAt.getMeasuredWidth();
                i5 = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE && i5 > i8) {
                    i8 = Math.min(i5, mode2);
                }
                i5 = paddingLeft - mode;
                boolean z = i5 < 0;
                layoutParams.b = z;
                mode = z | i6;
                if (layoutParams.b) {
                    this.g = childAt;
                }
                size2 = i5;
                i5 = i8;
                float f3 = f;
                size = mode;
                f2 = f3;
            }
            i7++;
            i6 = size;
            i8 = i5;
            f = f2;
            paddingLeft = size2;
        }
        if (i6 != 0 || f > 0.0f) {
            int i9 = i4 - this.e;
            for (i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getVisibility() != 8) {
                    layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        Object obj = (layoutParams.width != 0 || layoutParams.a <= 0.0f) ? null : 1;
                        i5 = obj != null ? 0 : childAt2.getMeasuredWidth();
                        if (i6 == 0 || childAt2 == this.g) {
                            if (layoutParams.a > 0.0f) {
                                mode = layoutParams.width == 0 ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                if (i6 != 0) {
                                    size2 = i4 - (layoutParams.rightMargin + layoutParams.leftMargin);
                                    i7 = MeasureSpec.makeMeasureSpec(size2, 1073741824);
                                    if (i5 != size2) {
                                        childAt2.measure(i7, mode);
                                    }
                                } else {
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(((int) ((layoutParams.a * ((float) Math.max(0, paddingLeft))) / f)) + i5, 1073741824), mode);
                                }
                            }
                        } else if (layoutParams.width < 0 && (i5 > i9 || layoutParams.a > 0.0f)) {
                            size2 = obj != null ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(mode2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(mode2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            childAt2.measure(MeasureSpec.makeMeasureSpec(i9, 1073741824), size2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, i8);
        this.f = i6;
        if (this.p.a() != 0 && i6 == 0) {
            this.p.f();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a) {
            b();
        } else {
            c();
        }
        this.q = savedState.a;
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = e() ? d() : this.q;
        return savedState;
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.r = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        this.p.b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case e.MapAttrs_mapType /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.m = x;
                this.n = y;
                return true;
            case e.MapAttrs_cameraBearing /*1*/:
                if (!e(this.g)) {
                    return true;
                }
                x = motionEvent.getX();
                y = motionEvent.getY();
                float f = x - this.m;
                float f2 = y - this.n;
                int d = this.p.d();
                if ((f * f) + (f2 * f2) >= ((float) (d * d)) || !this.p.b(this.g, (int) x, (int) y)) {
                    return true;
                }
                a(this.g, 0);
                return true;
            default:
                return true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f) {
            this.q = view == this.g;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.c = i;
    }

    public void setPanelSlideListener(w wVar) {
        this.o = wVar;
    }

    public void setParallaxDistance(int i) {
        this.l = i;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable) {
        this.d = drawable;
    }

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i) {
        this.b = i;
    }
}
