package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.ao;
import android.support.v4.view.z;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.gms.e;
import java.util.Arrays;

public class ac {
    private static final Interpolator v = new ad();
    private int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private m q;
    private final af r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable w = new ae(this);

    private ac(Context context, ViewGroup viewGroup, af afVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (afVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.u = viewGroup;
            this.r = afVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = m.a(context, v);
        }
    }

    private float a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        return abs < f2 ? 0.0f : abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    private int a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        int i4 = width / 2;
        float b = (b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        return Math.min(i4 > 0 ? Math.round(Math.abs(b / ((float) i4)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    private int a(View view, int i, int i2, int i3, int i4) {
        int b = b(i3, (int) this.n, (int) this.m);
        int b2 = b(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        return (int) (((b2 != 0 ? ((float) abs4) / ((float) i5) : ((float) abs2) / ((float) i6)) * ((float) a(i2, b2, this.r.b(view)))) + ((b != 0 ? ((float) abs3) / ((float) i5) : ((float) abs) / ((float) i6)) * ((float) a(i, b, this.r.a(view)))));
    }

    public static ac a(ViewGroup viewGroup, float f, af afVar) {
        ac a = a(viewGroup, afVar);
        a.b = (int) (((float) a.b) * (1.0f / f));
        return a;
    }

    public static ac a(ViewGroup viewGroup, af afVar) {
        return new ac(viewGroup.getContext(), viewGroup, afVar);
    }

    private void a(float f, float f2) {
        this.t = true;
        this.r.a(this.s, f, f2);
        this.t = false;
        if (this.a == 1) {
            c(0);
        }
    }

    private void a(float f, float f2, int i) {
        f(i);
        float[] fArr = this.d;
        this.f[i] = f;
        fArr[i] = f;
        fArr = this.e;
        this.g[i] = f2;
        fArr[i] = f2;
        this.h[i] = e((int) f, (int) f2);
        this.k |= 1 << i;
    }

    private boolean a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.p & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.b) && abs2 <= ((float) this.b)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.r.b(i2)) {
            return (this.i[i] & i2) == 0 && abs > ((float) this.b);
        } else {
            int[] iArr = this.j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
    }

    private boolean a(int i, int i2, int i3, int i4) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.q.g();
            c(0);
            return false;
        }
        this.q.a(left, top, i5, i6, a(this.s, i5, i6, i3, i4));
        c(2);
        return true;
    }

    private boolean a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.r.a(view) > 0;
        boolean z2 = this.r.b(view) > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.b * this.b)) : z ? Math.abs(f) > ((float) this.b) : z2 ? Math.abs(f2) > ((float) this.b) : false;
    }

    private float b(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    private int b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        return abs < i2 ? 0 : abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    private void b(float f, float f2, int i) {
        int i2 = 1;
        if (!a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | i2;
            this.r.b(i2, i);
        }
    }

    private void b(int i, int i2, int i3, int i4) {
        int a;
        int b;
        int left = this.s.getLeft();
        int top = this.s.getTop();
        if (i3 != 0) {
            a = this.r.a(this.s, i, i3);
            this.s.offsetLeftAndRight(a - left);
        } else {
            a = i;
        }
        if (i4 != 0) {
            b = this.r.b(this.s, i2, i4);
            this.s.offsetTopAndBottom(b - top);
        } else {
            b = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.r.a(this.s, a, b, a - left, b - top);
        }
    }

    private void c(MotionEvent motionEvent) {
        int c = z.c(motionEvent);
        for (int i = 0; i < c; i++) {
            int b = z.b(motionEvent, i);
            float c2 = z.c(motionEvent, i);
            float d = z.d(motionEvent, i);
            this.f[b] = c2;
            this.g[b] = d;
        }
    }

    private int e(int i, int i2) {
        int i3 = 0;
        if (i < this.u.getLeft() + this.o) {
            i3 = 1;
        }
        if (i2 < this.u.getTop() + this.o) {
            i3 |= 4;
        }
        if (i > this.u.getRight() - this.o) {
            i3 |= 2;
        }
        return i2 > this.u.getBottom() - this.o ? i3 | 8 : i3;
    }

    private void e(int i) {
        if (this.d != null) {
            this.d[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k &= (1 << i) ^ -1;
        }
    }

    private void f(int i) {
        if (this.d == null || this.d.length <= i) {
            float[] fArr = new float[(i + 1)];
            float[] fArr2 = new float[(i + 1)];
            float[] fArr3 = new float[(i + 1)];
            float[] fArr4 = new float[(i + 1)];
            int[] iArr = new int[(i + 1)];
            int[] iArr2 = new int[(i + 1)];
            int[] iArr3 = new int[(i + 1)];
            if (this.d != null) {
                System.arraycopy(this.d, 0, fArr, 0, this.d.length);
                System.arraycopy(this.e, 0, fArr2, 0, this.e.length);
                System.arraycopy(this.f, 0, fArr3, 0, this.f.length);
                System.arraycopy(this.g, 0, fArr4, 0, this.g.length);
                System.arraycopy(this.h, 0, iArr, 0, this.h.length);
                System.arraycopy(this.i, 0, iArr2, 0, this.i.length);
                System.arraycopy(this.j, 0, iArr3, 0, this.j.length);
            }
            this.d = fArr;
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    private void g() {
        if (this.d != null) {
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    private void h() {
        this.l.computeCurrentVelocity(1000, this.m);
        a(a(ao.a(this.l, this.c), this.n, this.m), a(ao.b(this.l, this.c), this.n, this.m));
    }

    public int a() {
        return this.a;
    }

    public void a(float f) {
        this.n = f;
    }

    public void a(int i) {
        this.p = i;
    }

    public void a(View view, int i) {
        if (view.getParent() != this.u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
        }
        this.s = view;
        this.c = i;
        this.r.b(view, i);
        c(1);
    }

    public boolean a(int i, int i2) {
        if (this.t) {
            return a(i, i2, (int) ao.a(this.l, this.c), (int) ao.b(this.l, this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean a(MotionEvent motionEvent) {
        int a = z.a(motionEvent);
        int b = z.b(motionEvent);
        if (a == 0) {
            e();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        float y;
        int b2;
        switch (a) {
            case e.MapAttrs_mapType /*0*/:
                float x = motionEvent.getX();
                y = motionEvent.getY();
                b2 = z.b(motionEvent, 0);
                a(x, y, b2);
                View d = d((int) x, (int) y);
                if (d == this.s && this.a == 2) {
                    b(d, b2);
                }
                a = this.h[b2];
                if ((this.p & a) != 0) {
                    this.r.a(a & this.p, b2);
                    break;
                }
                break;
            case e.MapAttrs_cameraBearing /*1*/:
            case e.MapAttrs_cameraTargetLng /*3*/:
                e();
                break;
            case e.MapAttrs_cameraTargetLat /*2*/:
                b = z.c(motionEvent);
                a = 0;
                while (a < b) {
                    b2 = z.b(motionEvent, a);
                    float c = z.c(motionEvent, a);
                    float d2 = z.d(motionEvent, a);
                    float f = c - this.d[b2];
                    float f2 = d2 - this.e[b2];
                    b(f, f2, b2);
                    if (this.a != 1) {
                        View d3 = d((int) c, (int) d2);
                        if (d3 == null || !a(d3, f, f2) || !b(d3, b2)) {
                            a++;
                        }
                    }
                    c(motionEvent);
                    break;
                }
                c(motionEvent);
                break;
            case e.MapAttrs_cameraZoom /*5*/:
                a = z.b(motionEvent, b);
                float c2 = z.c(motionEvent, b);
                y = z.d(motionEvent, b);
                a(c2, y, a);
                if (this.a != 0) {
                    if (this.a == 2) {
                        View d4 = d((int) c2, (int) y);
                        if (d4 == this.s) {
                            b(d4, a);
                            break;
                        }
                    }
                }
                b = this.h[a];
                if ((this.p & b) != 0) {
                    this.r.a(b & this.p, a);
                    break;
                }
                break;
            case e.MapAttrs_uiCompass /*6*/:
                e(z.b(motionEvent, b));
                break;
        }
        return this.a == 1;
    }

    public boolean a(View view, int i, int i2) {
        this.s = view;
        this.c = -1;
        return a(i, i2, 0, 0);
    }

    public boolean a(boolean z) {
        if (this.a == 2) {
            boolean a;
            boolean f = this.q.f();
            int b = this.q.b();
            int c = this.q.c();
            int left = b - this.s.getLeft();
            int top = c - this.s.getTop();
            if (left != 0) {
                this.s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.s.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.r.a(this.s, b, c, left, top);
            }
            if (f && b == this.q.d() && c == this.q.e()) {
                this.q.g();
                a = this.q.a();
            } else {
                a = f;
            }
            if (!a) {
                if (z) {
                    this.u.post(this.w);
                } else {
                    c(0);
                }
            }
        }
        return this.a == 2;
    }

    public int b() {
        return this.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x013c  */
    public void b(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r1 = -1;
        r5 = 0;
        r0 = 0;
        r8 = 1;
        r2 = android.support.v4.view.z.a(r10);
        r3 = android.support.v4.view.z.b(r10);
        if (r2 != 0) goto L_0x0011;
    L_0x000e:
        r9.e();
    L_0x0011:
        r4 = r9.l;
        if (r4 != 0) goto L_0x001b;
    L_0x0015:
        r4 = android.view.VelocityTracker.obtain();
        r9.l = r4;
    L_0x001b:
        r4 = r9.l;
        r4.addMovement(r10);
        switch(r2) {
            case 0: goto L_0x0024;
            case 1: goto L_0x0144;
            case 2: goto L_0x008a;
            case 3: goto L_0x0150;
            case 4: goto L_0x0023;
            case 5: goto L_0x004e;
            case 6: goto L_0x0101;
            default: goto L_0x0023;
        };
    L_0x0023:
        return;
    L_0x0024:
        r1 = r10.getX();
        r2 = r10.getY();
        r0 = android.support.v4.view.z.b(r10, r0);
        r3 = (int) r1;
        r4 = (int) r2;
        r3 = r9.d(r3, r4);
        r9.a(r1, r2, r0);
        r9.b(r3, r0);
        r1 = r9.h;
        r1 = r1[r0];
        r2 = r9.p;
        r2 = r2 & r1;
        if (r2 == 0) goto L_0x0023;
    L_0x0045:
        r2 = r9.r;
        r3 = r9.p;
        r1 = r1 & r3;
        r2.a(r1, r0);
        goto L_0x0023;
    L_0x004e:
        r0 = android.support.v4.view.z.b(r10, r3);
        r1 = android.support.v4.view.z.c(r10, r3);
        r2 = android.support.v4.view.z.d(r10, r3);
        r9.a(r1, r2, r0);
        r3 = r9.a;
        if (r3 != 0) goto L_0x007c;
    L_0x0061:
        r1 = (int) r1;
        r2 = (int) r2;
        r1 = r9.d(r1, r2);
        r9.b(r1, r0);
        r1 = r9.h;
        r1 = r1[r0];
        r2 = r9.p;
        r2 = r2 & r1;
        if (r2 == 0) goto L_0x0023;
    L_0x0073:
        r2 = r9.r;
        r3 = r9.p;
        r1 = r1 & r3;
        r2.a(r1, r0);
        goto L_0x0023;
    L_0x007c:
        r1 = (int) r1;
        r2 = (int) r2;
        r1 = r9.c(r1, r2);
        if (r1 == 0) goto L_0x0023;
    L_0x0084:
        r1 = r9.s;
        r9.b(r1, r0);
        goto L_0x0023;
    L_0x008a:
        r1 = r9.a;
        if (r1 != r8) goto L_0x00c2;
    L_0x008e:
        r0 = r9.c;
        r0 = android.support.v4.view.z.a(r10, r0);
        r1 = android.support.v4.view.z.c(r10, r0);
        r0 = android.support.v4.view.z.d(r10, r0);
        r2 = r9.f;
        r3 = r9.c;
        r2 = r2[r3];
        r1 = r1 - r2;
        r1 = (int) r1;
        r2 = r9.g;
        r3 = r9.c;
        r2 = r2[r3];
        r0 = r0 - r2;
        r0 = (int) r0;
        r2 = r9.s;
        r2 = r2.getLeft();
        r2 = r2 + r1;
        r3 = r9.s;
        r3 = r3.getTop();
        r3 = r3 + r0;
        r9.b(r2, r3, r1, r0);
        r9.c(r10);
        goto L_0x0023;
    L_0x00c2:
        r1 = android.support.v4.view.z.c(r10);
    L_0x00c6:
        if (r0 >= r1) goto L_0x00e7;
    L_0x00c8:
        r2 = android.support.v4.view.z.b(r10, r0);
        r3 = android.support.v4.view.z.c(r10, r0);
        r4 = android.support.v4.view.z.d(r10, r0);
        r5 = r9.d;
        r5 = r5[r2];
        r5 = r3 - r5;
        r6 = r9.e;
        r6 = r6[r2];
        r6 = r4 - r6;
        r9.b(r5, r6, r2);
        r7 = r9.a;
        if (r7 != r8) goto L_0x00ec;
    L_0x00e7:
        r9.c(r10);
        goto L_0x0023;
    L_0x00ec:
        r3 = (int) r3;
        r4 = (int) r4;
        r3 = r9.d(r3, r4);
        r4 = r9.a(r3, r5, r6);
        if (r4 == 0) goto L_0x00fe;
    L_0x00f8:
        r2 = r9.b(r3, r2);
        if (r2 != 0) goto L_0x00e7;
    L_0x00fe:
        r0 = r0 + 1;
        goto L_0x00c6;
    L_0x0101:
        r2 = android.support.v4.view.z.b(r10, r3);
        r3 = r9.a;
        if (r3 != r8) goto L_0x013f;
    L_0x0109:
        r3 = r9.c;
        if (r2 != r3) goto L_0x013f;
    L_0x010d:
        r3 = android.support.v4.view.z.c(r10);
    L_0x0111:
        if (r0 >= r3) goto L_0x015c;
    L_0x0113:
        r4 = android.support.v4.view.z.b(r10, r0);
        r5 = r9.c;
        if (r4 != r5) goto L_0x011e;
    L_0x011b:
        r0 = r0 + 1;
        goto L_0x0111;
    L_0x011e:
        r5 = android.support.v4.view.z.c(r10, r0);
        r6 = android.support.v4.view.z.d(r10, r0);
        r5 = (int) r5;
        r6 = (int) r6;
        r5 = r9.d(r5, r6);
        r6 = r9.s;
        if (r5 != r6) goto L_0x011b;
    L_0x0130:
        r5 = r9.s;
        r4 = r9.b(r5, r4);
        if (r4 == 0) goto L_0x011b;
    L_0x0138:
        r0 = r9.c;
    L_0x013a:
        if (r0 != r1) goto L_0x013f;
    L_0x013c:
        r9.h();
    L_0x013f:
        r9.e(r2);
        goto L_0x0023;
    L_0x0144:
        r0 = r9.a;
        if (r0 != r8) goto L_0x014b;
    L_0x0148:
        r9.h();
    L_0x014b:
        r9.e();
        goto L_0x0023;
    L_0x0150:
        r0 = r9.a;
        if (r0 != r8) goto L_0x0157;
    L_0x0154:
        r9.a(r5, r5);
    L_0x0157:
        r9.e();
        goto L_0x0023;
    L_0x015c:
        r0 = r1;
        goto L_0x013a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ac.b(android.view.MotionEvent):void");
    }

    public boolean b(int i) {
        return (this.k & (1 << i)) != 0;
    }

    public boolean b(int i, int i2) {
        if (!b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f[i2] - this.d[i2];
        float f2 = this.g[i2] - this.e[i2];
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.b * this.b)) : z ? Math.abs(f) > ((float) this.b) : z2 ? Math.abs(f2) > ((float) this.b) : false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean b(View view, int i) {
        if (view == this.s && this.c == i) {
            return true;
        }
        if (view == null || !this.r.a(view, i)) {
            return false;
        }
        this.c = i;
        a(view, i);
        return true;
    }

    public boolean b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public View c() {
        return this.s;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(int i) {
        if (this.a != i) {
            this.a = i;
            this.r.a(i);
            if (i == 0) {
                this.s = null;
            }
        }
    }

    public boolean c(int i, int i2) {
        return b(this.s, i, i2);
    }

    public int d() {
        return this.b;
    }

    public View d(int i, int i2) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(this.r.c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean d(int i) {
        int length = this.d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        this.c = -1;
        g();
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    public void f() {
        e();
        if (this.a == 2) {
            int b = this.q.b();
            int c = this.q.c();
            this.q.g();
            int b2 = this.q.b();
            int c2 = this.q.c();
            this.r.a(this.s, b2, c2, b2 - b, c2 - c);
        }
        c(0);
    }
}
