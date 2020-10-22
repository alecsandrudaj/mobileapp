package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.at;
import android.support.v4.view.bo;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.gms.e;

public class DrawerLayout extends ViewGroup {
    private static final int[] a = new int[]{16842931};
    private int b;
    private int c;
    private float d;
    private Paint e;
    private final ac f;
    private final ac g;
    private final f h;
    private final f i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private d q;
    private float r;
    private float s;
    private Drawable t;
    private Drawable u;

    public class LayoutParams extends MarginLayoutParams {
        public int a = 0;
        float b;
        boolean c;
        boolean d;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.a);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.a = layoutParams.a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new e();
        int a = 0;
        int b = 0;
        int c = 0;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1728053248;
        this.e = new Paint();
        this.l = true;
        float f = getResources().getDisplayMetrics().density;
        this.b = (int) ((64.0f * f) + 0.5f);
        f *= 400.0f;
        this.h = new f(this, 3);
        this.i = new f(this, 5);
        this.f = ac.a((ViewGroup) this, 1.0f, this.h);
        this.f.a(1);
        this.f.a(f);
        this.h.a(this.f);
        this.g = ac.a((ViewGroup) this, 1.0f, this.i);
        this.g.a(2);
        this.g.a(f);
        this.i.a(this.g);
        setFocusableInTouchMode(true);
        at.a((View) this, new c(this));
        bo.a(this, false);
    }

    static String b(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        return g() != null;
    }

    private View g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt) && j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    private static boolean k(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public int a(View view) {
        int e = e(view);
        return e == 3 ? this.m : e == 5 ? this.n : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((LayoutParams) childAt.getLayoutParams()).d) {
                return childAt;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public View a(int i) {
        int a = n.a(i, at.e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public void a(int i, int i2) {
        int a = n.a(i2, at.e(this));
        if (a == 3) {
            this.m = i;
        } else if (a == 5) {
            this.n = i;
        }
        if (i != 0) {
            (a == 3 ? this.f : this.g).e();
        }
        View a2;
        switch (i) {
            case e.MapAttrs_cameraBearing /*1*/:
                a2 = a(a);
                if (a2 != null) {
                    i(a2);
                    return;
                }
                return;
            case e.MapAttrs_cameraTargetLat /*2*/:
                a2 = a(a);
                if (a2 != null) {
                    h(a2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, int i2, View view) {
        int i3 = 1;
        int a = this.f.a();
        int a2 = this.g.a();
        if (!(a == 1 || a2 == 1)) {
            i3 = (a == 2 || a2 == 2) ? 2 : 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.b == 0.0f) {
                b(view);
            } else if (layoutParams.b == 1.0f) {
                c(view);
            }
        }
        if (i3 != this.j) {
            this.j = i3;
            if (this.q != null) {
                this.q.a(i3);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(View view, float f) {
        if (this.q != null) {
            this.q.a(view, f);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (g(childAt) && (!z || layoutParams.c)) {
                i = a(childAt, 3) ? i | this.f.a(childAt, -childAt.getWidth(), childAt.getTop()) : i | this.g.a(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        this.h.a();
        this.i.a();
        if (i != 0) {
            invalidate();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(View view, int i) {
        return (e(view) & i) == i;
    }

    public void b() {
        a(false);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.d) {
            layoutParams.d = false;
            if (this.q != null) {
                this.q.b(view);
            }
            sendAccessibilityEvent(32);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.b) {
            layoutParams.b = f;
            a(view, f);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c() {
        int i = 0;
        if (!this.p) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).dispatchTouchEvent(obtain);
                i++;
            }
            obtain.recycle();
            this.p = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.d) {
            layoutParams.d = true;
            if (this.q != null) {
                this.q.a(view);
            }
            view.sendAccessibilityEvent(32);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.d = f;
        if ((this.f.a(true) | this.g.a(true)) != 0) {
            at.b(this);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public float d(View view) {
        return ((LayoutParams) view.getLayoutParams()).b;
    }

    /* Access modifiers changed, original: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean f = f(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && k(childAt) && g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i = width;
                    } else if (a(childAt, 3)) {
                        i = childAt.getRight();
                        if (i <= i2) {
                            i = i2;
                        }
                        i2 = i;
                        i = width;
                    } else {
                        i = childAt.getLeft();
                        if (i < width) {
                        }
                    }
                    i3++;
                    width = i;
                }
                i = width;
                i3++;
                width = i;
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        i = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float max;
        if (this.d > 0.0f && f) {
            this.e.setColor((((int) (((float) ((this.c & -16777216) >>> 24)) * this.d)) << 24) | (this.c & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.e);
        } else if (this.t != null && a(view, 3)) {
            i = this.t.getIntrinsicWidth();
            i2 = view.getRight();
            max = Math.max(0.0f, Math.min(((float) i2) / ((float) this.f.b()), 1.0f));
            this.t.setBounds(i2, view.getTop(), i + i2, view.getBottom());
            this.t.setAlpha((int) (255.0f * max));
            this.t.draw(canvas);
        } else if (this.u != null && a(view, 5)) {
            i = this.u.getIntrinsicWidth();
            i2 = view.getLeft();
            max = Math.max(0.0f, Math.min(((float) (getWidth() - i2)) / ((float) this.g.b()), 1.0f));
            this.u.setBounds(i2 - i, view.getTop(), i2, view.getBottom());
            this.u.setAlpha((int) (255.0f * max));
            this.u.draw(canvas);
        }
        return drawChild;
    }

    /* Access modifiers changed, original: 0000 */
    public int e(View view) {
        return n.a(((LayoutParams) view.getLayoutParams()).a, at.e(this));
    }

    /* Access modifiers changed, original: 0000 */
    public boolean f(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean g(View view) {
        return (n.a(((LayoutParams) view.getLayoutParams()).a, at.e(view)) & 7) != 0;
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void h(View view) {
        if (g(view)) {
            if (this.l) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.b = 1.0f;
                layoutParams.d = true;
            } else if (a(view, 3)) {
                this.f.a(view, 0, view.getTop());
            } else {
                this.g.a(view, getWidth() - view.getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void i(View view) {
        if (g(view)) {
            if (this.l) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.b = 0.0f;
                layoutParams.d = false;
            } else if (a(view, 3)) {
                this.f.a(view, -view.getWidth(), view.getTop());
            } else {
                this.g.a(view, getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public boolean j(View view) {
        if (g(view)) {
            return ((LayoutParams) view.getLayoutParams()).b > 0.0f;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l = true;
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = android.support.v4.view.z.a(r8);
        r3 = r7.f;
        r3 = r3.a(r8);
        r4 = r7.g;
        r4 = r4.a(r8);
        r3 = r3 | r4;
        switch(r0) {
            case 0: goto L_0x0027;
            case 1: goto L_0x0063;
            case 2: goto L_0x004e;
            case 3: goto L_0x0063;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r3 != 0) goto L_0x0025;
    L_0x0019:
        if (r0 != 0) goto L_0x0025;
    L_0x001b:
        r0 = r7.e();
        if (r0 != 0) goto L_0x0025;
    L_0x0021:
        r0 = r7.p;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        r2 = r1;
    L_0x0026:
        return r2;
    L_0x0027:
        r0 = r8.getX();
        r4 = r8.getY();
        r7.r = r0;
        r7.s = r4;
        r5 = r7.d;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x006b;
    L_0x003a:
        r5 = r7.f;
        r0 = (int) r0;
        r4 = (int) r4;
        r0 = r5.d(r0, r4);
        r0 = r7.f(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x0048:
        r0 = r1;
    L_0x0049:
        r7.o = r2;
        r7.p = r2;
        goto L_0x0017;
    L_0x004e:
        r0 = r7.f;
        r4 = 3;
        r0 = r0.d(r4);
        if (r0 == 0) goto L_0x0016;
    L_0x0057:
        r0 = r7.h;
        r0.a();
        r0 = r7.i;
        r0.a();
        r0 = r2;
        goto L_0x0017;
    L_0x0063:
        r7.a(r1);
        r7.o = r2;
        r7.p = r2;
        goto L_0x0016;
    L_0x006b:
        r0 = r2;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !f()) {
            return super.onKeyDown(i, keyEvent);
        }
        s.b(keyEvent);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View g = g();
        if (g != null && a(g) == 0) {
            b();
        }
        return g != null;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.k = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        i7 = ((int) (((float) measuredWidth) * layoutParams.b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i7)) / ((float) measuredWidth);
                    } else {
                        i7 = i5 - ((int) (((float) measuredWidth) * layoutParams.b));
                        f = ((float) (i5 - i7)) / ((float) measuredWidth);
                    }
                    Object obj = f != layoutParams.b ? 1 : null;
                    int i8;
                    switch (layoutParams.a & 112) {
                        case 16:
                            int i9 = i4 - i2;
                            i8 = (i9 - measuredHeight) / 2;
                            if (i8 < layoutParams.topMargin) {
                                i8 = layoutParams.topMargin;
                            } else if (i8 + measuredHeight > i9 - layoutParams.bottomMargin) {
                                i8 = (i9 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
                            break;
                        case 80:
                            i8 = i4 - i2;
                            childAt.layout(i7, (i8 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i8 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, layoutParams.topMargin, measuredWidth + i7, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (obj != null) {
                        b(childAt, f);
                    }
                    int i10 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i10) {
                        childAt.setVisibility(i10);
                    }
                }
            }
        }
        this.k = false;
        this.l = false;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Missing block: B:15:0x0044, code skipped:
            if (r5 != 0) goto L_0x0046;
     */
    public void onMeasure(int r12, int r13) {
        /*
        r11 = this;
        r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r4 = 0;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.getMode(r12);
        r5 = android.view.View.MeasureSpec.getMode(r13);
        r2 = android.view.View.MeasureSpec.getSize(r12);
        r0 = android.view.View.MeasureSpec.getSize(r13);
        if (r3 != r10) goto L_0x001b;
    L_0x0019:
        if (r5 == r10) goto L_0x0046;
    L_0x001b:
        r6 = r11.isInEditMode();
        if (r6 == 0) goto L_0x0048;
    L_0x0021:
        if (r3 != r7) goto L_0x0040;
    L_0x0023:
        if (r5 != r7) goto L_0x0044;
    L_0x0025:
        r1 = r0;
    L_0x0026:
        r11.setMeasuredDimension(r2, r1);
        r5 = r11.getChildCount();
        r3 = r4;
    L_0x002e:
        if (r3 >= r5) goto L_0x0109;
    L_0x0030:
        r6 = r11.getChildAt(r3);
        r0 = r6.getVisibility();
        r7 = 8;
        if (r0 != r7) goto L_0x0050;
    L_0x003c:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x002e;
    L_0x0040:
        if (r3 != 0) goto L_0x0023;
    L_0x0042:
        r2 = r1;
        goto L_0x0023;
    L_0x0044:
        if (r5 == 0) goto L_0x0026;
    L_0x0046:
        r1 = r0;
        goto L_0x0026;
    L_0x0048:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "DrawerLayout must be measured with MeasureSpec.EXACTLY.";
        r0.<init>(r1);
        throw r0;
    L_0x0050:
        r0 = r6.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r7 = r11.f(r6);
        if (r7 == 0) goto L_0x0077;
    L_0x005c:
        r7 = r0.leftMargin;
        r7 = r2 - r7;
        r8 = r0.rightMargin;
        r7 = r7 - r8;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10);
        r8 = r0.topMargin;
        r8 = r1 - r8;
        r0 = r0.bottomMargin;
        r0 = r8 - r0;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10);
        r6.measure(r7, r0);
        goto L_0x003c;
    L_0x0077:
        r7 = r11.g(r6);
        if (r7 == 0) goto L_0x00da;
    L_0x007d:
        r7 = r11.e(r6);
        r7 = r7 & 7;
        r8 = r4 & r7;
        if (r8 == 0) goto L_0x00bc;
    L_0x0087:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Child drawer has absolute gravity ";
        r1 = r1.append(r2);
        r2 = b(r7);
        r1 = r1.append(r2);
        r2 = " but this ";
        r1 = r1.append(r2);
        r2 = "DrawerLayout";
        r1 = r1.append(r2);
        r2 = " already has a ";
        r1 = r1.append(r2);
        r2 = "drawer view along that edge";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00bc:
        r7 = r11.b;
        r8 = r0.leftMargin;
        r7 = r7 + r8;
        r8 = r0.rightMargin;
        r7 = r7 + r8;
        r8 = r0.width;
        r7 = getChildMeasureSpec(r12, r7, r8);
        r8 = r0.topMargin;
        r9 = r0.bottomMargin;
        r8 = r8 + r9;
        r0 = r0.height;
        r0 = getChildMeasureSpec(r13, r8, r0);
        r6.measure(r7, r0);
        goto L_0x003c;
    L_0x00da:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Child ";
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r2 = " at index ";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, ";
        r1 = r1.append(r2);
        r2 = "Gravity.RIGHT or Gravity.NO_GRAVITY";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0109:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a != 0) {
            View a = a(savedState.a);
            if (a != null) {
                h(a);
            }
        }
        a(savedState.b, 3);
        a(savedState.c, 5);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.d) {
                    savedState.a = layoutParams.a;
                    break;
                }
            }
        }
        savedState.b = this.m;
        savedState.c = this.n;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f.b(motionEvent);
        this.g.b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case e.MapAttrs_mapType /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.r = x;
                this.s = y;
                this.o = false;
                this.p = false;
                break;
            case e.MapAttrs_cameraBearing /*1*/:
                boolean z;
                x = motionEvent.getX();
                y = motionEvent.getY();
                View d = this.f.d((int) x, (int) y);
                if (d != null && f(d)) {
                    x -= this.r;
                    y -= this.s;
                    int d2 = this.f.d();
                    if ((x * x) + (y * y) < ((float) (d2 * d2))) {
                        View a = a();
                        if (a != null) {
                            z = a(a) == 2;
                            a(z);
                            this.o = false;
                            break;
                        }
                    }
                }
                z = true;
                a(z);
                this.o = false;
            case e.MapAttrs_cameraTargetLng /*3*/:
                a(true);
                this.o = false;
                this.p = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.o = z;
        if (z) {
            a(true);
        }
    }

    public void requestLayout() {
        if (!this.k) {
            super.requestLayout();
        }
    }

    public void setDrawerListener(d dVar) {
        this.q = dVar;
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void setScrimColor(int i) {
        this.c = i;
        invalidate();
    }
}
