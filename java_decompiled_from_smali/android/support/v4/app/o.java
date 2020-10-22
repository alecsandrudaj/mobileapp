package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.b.d;
import android.support.v4.b.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

final class o extends m {
    static final Interpolator A = new DecelerateInterpolator(1.5f);
    static final Interpolator B = new AccelerateInterpolator(2.5f);
    static final Interpolator C = new AccelerateInterpolator(1.5f);
    static boolean a = false;
    static final boolean b;
    static final Interpolator z = new DecelerateInterpolator(2.5f);
    ArrayList c;
    Runnable[] d;
    boolean e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    ArrayList m;
    int n = 0;
    FragmentActivity o;
    l p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w = null;
    SparseArray x = null;
    Runnable y = new p(this);

    static {
        boolean z = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        b = z;
    }

    o() {
    }

    static Animation a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    static Animation a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(z);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new e("FragmentManager"));
        if (this.o != null) {
            try {
                this.o.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                a("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public static int b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    public static int c(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    private void t() {
        if (this.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.u);
        }
    }

    public int a(b bVar) {
        int size;
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                size = this.k.size();
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + bVar);
                }
                this.k.add(bVar);
            } else {
                size = ((Integer) this.l.remove(this.l.size() - 1)).intValue();
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + bVar);
                }
                this.k.set(size, bVar);
            }
        }
        return size;
    }

    public Fragment a(int i) {
        int size;
        Fragment fragment;
        if (this.g != null) {
            for (size = this.g.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.g.get(size);
                if (fragment != null && fragment.w == i) {
                    return fragment;
                }
            }
        }
        if (this.f != null) {
            for (size = this.f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f.get(size);
                if (fragment != null && fragment.w == i) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public Fragment a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f.size()) {
            a(new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = (Fragment) this.f.get(i);
        if (fragment != null) {
            return fragment;
        }
        a(new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i));
        return fragment;
    }

    public Fragment a(String str) {
        int size;
        Fragment fragment;
        if (!(this.g == null || str == null)) {
            for (size = this.g.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.g.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (!(this.f == null || str == null)) {
            for (size = this.f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public w a() {
        return new b(this);
    }

    /* Access modifiers changed, original: 0000 */
    public Animation a(Fragment fragment, int i, boolean z, int i2) {
        Animation a = fragment.a(i, z, fragment.G);
        if (a != null) {
            return a;
        }
        if (fragment.G != 0) {
            a = AnimationUtils.loadAnimation(this.o, fragment.G);
            if (a != null) {
                return a;
            }
        }
        if (i == 0) {
            return null;
        }
        int b = b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                return a(this.o, 1.125f, 1.0f, 0.0f, 1.0f);
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                return a(this.o, 1.0f, 0.975f, 1.0f, 0.0f);
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                return a(this.o, 0.975f, 1.0f, 0.0f, 1.0f);
            case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                return a(this.o, 1.0f, 1.075f, 1.0f, 0.0f);
            case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                return a(this.o, 0.0f, 1.0f);
            case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                return a(this.o, 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.o.getWindow() != null) {
                    i2 = this.o.getWindow().getAttributes().windowAnimations;
                }
                return i2 == 0 ? null : null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, int i2, int i3, boolean z) {
        if (this.o == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || this.n != i) {
            this.n = i;
            if (this.f != null) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.f.size()) {
                    Fragment fragment = (Fragment) this.f.get(i4);
                    if (fragment != null) {
                        a(fragment, i, i2, i3, false);
                        if (fragment.M != null) {
                            i5 |= fragment.M.a();
                        }
                    }
                    i4++;
                    i5 = i5;
                }
                if (i5 == 0) {
                    d();
                }
                if (this.r && this.o != null && this.n == 5) {
                    this.o.c();
                    this.r = false;
                }
            }
        }
    }

    public void a(int i, b bVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            int size = this.k.size();
            if (i < size) {
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + bVar);
                }
                this.k.set(i, bVar);
            } else {
                while (size < i) {
                    this.k.add(null);
                    if (this.l == null) {
                        this.l = new ArrayList();
                    }
                    if (a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.l.add(Integer.valueOf(size));
                    size++;
                }
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + bVar);
                }
                this.k.add(bVar);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, boolean z) {
        a(i, 0, 0, z);
    }

    public void a(Configuration configuration) {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i2);
                    if (fragment != null) {
                        fragment.a(configuration);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.f);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Parcelable parcelable, ArrayList arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.a != null) {
                int i;
                Fragment fragment;
                int i2;
                if (arrayList != null) {
                    for (i = 0; i < arrayList.size(); i++) {
                        fragment = (Fragment) arrayList.get(i);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.a[fragment.f];
                        fragmentState.k = fragment;
                        fragment.e = null;
                        fragment.r = 0;
                        fragment.p = false;
                        fragment.l = false;
                        fragment.i = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.getClassLoader());
                            fragment.e = fragmentState.j.getSparseParcelableArray("android:view_state");
                        }
                    }
                }
                this.f = new ArrayList(fragmentManagerState.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (i2 = 0; i2 < fragmentManagerState.a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.a[i2];
                    if (fragmentState2 != null) {
                        Fragment a = fragmentState2.a(this.o, this.q);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + a);
                        }
                        this.f.add(a);
                        fragmentState2.k = null;
                    } else {
                        this.f.add(null);
                        if (this.h == null) {
                            this.h = new ArrayList();
                        }
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.h.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        fragment = (Fragment) arrayList.get(i3);
                        if (fragment.j >= 0) {
                            if (fragment.j < this.f.size()) {
                                fragment.i = (Fragment) this.f.get(fragment.j);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment + " target no longer exists: " + fragment.j);
                                fragment.i = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.b != null) {
                    this.g = new ArrayList(fragmentManagerState.b.length);
                    for (i = 0; i < fragmentManagerState.b.length; i++) {
                        fragment = (Fragment) this.f.get(fragmentManagerState.b[i]);
                        if (fragment == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.b[i]));
                        }
                        fragment.l = true;
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i + ": " + fragment);
                        }
                        if (this.g.contains(fragment)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.g.add(fragment);
                    }
                } else {
                    this.g = null;
                }
                if (fragmentManagerState.c != null) {
                    this.i = new ArrayList(fragmentManagerState.c.length);
                    for (i2 = 0; i2 < fragmentManagerState.c.length; i2++) {
                        b a2 = fragmentManagerState.c[i2].a(this);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a2.o + "): " + a2);
                            a2.a("  ", new PrintWriter(new e("FragmentManager")), false);
                        }
                        this.i.add(a2);
                        if (a2.o >= 0) {
                            a(a2.o, a2);
                        }
                    }
                    return;
                }
                this.i = null;
            }
        }
    }

    public void a(Fragment fragment) {
        if (!fragment.K) {
            return;
        }
        if (this.e) {
            this.v = true;
            return;
        }
        fragment.K = false;
        a(fragment, this.n, 0, 0, false);
    }

    public void a(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z = !fragment.a();
        if (!fragment.A || z) {
            if (this.g != null) {
                this.g.remove(fragment);
            }
            if (fragment.D && fragment.E) {
                this.r = true;
            }
            fragment.l = false;
            fragment.m = true;
            a(fragment, z ? 0 : 1, i, i2, false);
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:64:0x0126, code skipped:
            if (r11 <= 1) goto L_0x01ef;
     */
    /* JADX WARNING: Missing block: B:66:0x012a, code skipped:
            if (a == false) goto L_0x0144;
     */
    /* JADX WARNING: Missing block: B:67:0x012c, code skipped:
            android.util.Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + r10);
     */
    /* JADX WARNING: Missing block: B:69:0x0146, code skipped:
            if (r10.o != false) goto L_0x01df;
     */
    /* JADX WARNING: Missing block: B:71:0x014a, code skipped:
            if (r10.x == 0) goto L_0x0397;
     */
    /* JADX WARNING: Missing block: B:72:0x014c, code skipped:
            r0 = (android.view.ViewGroup) r9.p.a(r10.x);
     */
    /* JADX WARNING: Missing block: B:73:0x0156, code skipped:
            if (r0 != null) goto L_0x019b;
     */
    /* JADX WARNING: Missing block: B:75:0x015a, code skipped:
            if (r10.q != false) goto L_0x019b;
     */
    /* JADX WARNING: Missing block: B:76:0x015c, code skipped:
            a(new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(r10.x) + " (" + r10.c().getResourceName(r10.x) + ") for fragment " + r10));
     */
    /* JADX WARNING: Missing block: B:77:0x019b, code skipped:
            r10.H = r0;
            r10.I = r10.b(r10.b(r10.d), r0, r10.d);
     */
    /* JADX WARNING: Missing block: B:78:0x01ad, code skipped:
            if (r10.I == null) goto L_0x023d;
     */
    /* JADX WARNING: Missing block: B:79:0x01af, code skipped:
            r10.J = r10.I;
            r10.I = android.support.v4.app.ab.a(r10.I);
     */
    /* JADX WARNING: Missing block: B:80:0x01bb, code skipped:
            if (r0 == null) goto L_0x01cd;
     */
    /* JADX WARNING: Missing block: B:81:0x01bd, code skipped:
            r1 = a(r10, r12, true, r13);
     */
    /* JADX WARNING: Missing block: B:82:0x01c1, code skipped:
            if (r1 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Missing block: B:83:0x01c3, code skipped:
            r10.I.startAnimation(r1);
     */
    /* JADX WARNING: Missing block: B:84:0x01c8, code skipped:
            r0.addView(r10.I);
     */
    /* JADX WARNING: Missing block: B:86:0x01cf, code skipped:
            if (r10.z == false) goto L_0x01d8;
     */
    /* JADX WARNING: Missing block: B:87:0x01d1, code skipped:
            r10.I.setVisibility(8);
     */
    /* JADX WARNING: Missing block: B:88:0x01d8, code skipped:
            r10.a(r10.I, r10.d);
     */
    /* JADX WARNING: Missing block: B:89:0x01df, code skipped:
            r10.h(r10.d);
     */
    /* JADX WARNING: Missing block: B:90:0x01e6, code skipped:
            if (r10.I == null) goto L_0x01ed;
     */
    /* JADX WARNING: Missing block: B:91:0x01e8, code skipped:
            r10.a(r10.d);
     */
    /* JADX WARNING: Missing block: B:92:0x01ed, code skipped:
            r10.d = null;
     */
    /* JADX WARNING: Missing block: B:93:0x01ef, code skipped:
            if (r11 <= 3) goto L_0x0210;
     */
    /* JADX WARNING: Missing block: B:95:0x01f3, code skipped:
            if (a == false) goto L_0x020d;
     */
    /* JADX WARNING: Missing block: B:96:0x01f5, code skipped:
            android.util.Log.v("FragmentManager", "moveto STARTED: " + r10);
     */
    /* JADX WARNING: Missing block: B:97:0x020d, code skipped:
            r10.o();
     */
    /* JADX WARNING: Missing block: B:98:0x0210, code skipped:
            if (r11 <= 4) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:100:0x0214, code skipped:
            if (a == false) goto L_0x022e;
     */
    /* JADX WARNING: Missing block: B:101:0x0216, code skipped:
            android.util.Log.v("FragmentManager", "moveto RESUMED: " + r10);
     */
    /* JADX WARNING: Missing block: B:102:0x022e, code skipped:
            r10.n = true;
            r10.p();
            r10.d = null;
            r10.e = null;
     */
    /* JADX WARNING: Missing block: B:104:0x023d, code skipped:
            r10.J = null;
     */
    /* JADX WARNING: Missing block: B:109:0x024b, code skipped:
            if (r11 >= 1) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:111:0x024f, code skipped:
            if (r9.t == false) goto L_0x025c;
     */
    /* JADX WARNING: Missing block: B:113:0x0253, code skipped:
            if (r10.b == null) goto L_0x025c;
     */
    /* JADX WARNING: Missing block: B:114:0x0255, code skipped:
            r0 = r10.b;
            r10.b = null;
            r0.clearAnimation();
     */
    /* JADX WARNING: Missing block: B:116:0x025e, code skipped:
            if (r10.b == null) goto L_0x0338;
     */
    /* JADX WARNING: Missing block: B:117:0x0260, code skipped:
            r10.c = r11;
            r11 = 1;
     */
    /* JADX WARNING: Missing block: B:124:0x0289, code skipped:
            if (r11 >= 4) goto L_0x02aa;
     */
    /* JADX WARNING: Missing block: B:126:0x028d, code skipped:
            if (a == false) goto L_0x02a7;
     */
    /* JADX WARNING: Missing block: B:127:0x028f, code skipped:
            android.util.Log.v("FragmentManager", "movefrom STARTED: " + r10);
     */
    /* JADX WARNING: Missing block: B:128:0x02a7, code skipped:
            r10.s();
     */
    /* JADX WARNING: Missing block: B:129:0x02aa, code skipped:
            if (r11 >= 3) goto L_0x02cb;
     */
    /* JADX WARNING: Missing block: B:131:0x02ae, code skipped:
            if (a == false) goto L_0x02c8;
     */
    /* JADX WARNING: Missing block: B:132:0x02b0, code skipped:
            android.util.Log.v("FragmentManager", "movefrom STOPPED: " + r10);
     */
    /* JADX WARNING: Missing block: B:133:0x02c8, code skipped:
            r10.t();
     */
    /* JADX WARNING: Missing block: B:135:0x02cc, code skipped:
            if (r11 >= 2) goto L_0x024b;
     */
    /* JADX WARNING: Missing block: B:137:0x02d0, code skipped:
            if (a == false) goto L_0x02ea;
     */
    /* JADX WARNING: Missing block: B:138:0x02d2, code skipped:
            android.util.Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + r10);
     */
    /* JADX WARNING: Missing block: B:140:0x02ec, code skipped:
            if (r10.I == null) goto L_0x02fd;
     */
    /* JADX WARNING: Missing block: B:142:0x02f4, code skipped:
            if (r9.o.isFinishing() != false) goto L_0x02fd;
     */
    /* JADX WARNING: Missing block: B:144:0x02f8, code skipped:
            if (r10.e != null) goto L_0x02fd;
     */
    /* JADX WARNING: Missing block: B:145:0x02fa, code skipped:
            e(r10);
     */
    /* JADX WARNING: Missing block: B:146:0x02fd, code skipped:
            r10.u();
     */
    /* JADX WARNING: Missing block: B:147:0x0302, code skipped:
            if (r10.I == null) goto L_0x0330;
     */
    /* JADX WARNING: Missing block: B:149:0x0306, code skipped:
            if (r10.H == null) goto L_0x0330;
     */
    /* JADX WARNING: Missing block: B:151:0x030a, code skipped:
            if (r9.n <= 0) goto L_0x0394;
     */
    /* JADX WARNING: Missing block: B:153:0x030e, code skipped:
            if (r9.t != false) goto L_0x0394;
     */
    /* JADX WARNING: Missing block: B:154:0x0310, code skipped:
            r0 = a(r10, r12, false, r13);
     */
    /* JADX WARNING: Missing block: B:155:0x0314, code skipped:
            if (r0 == null) goto L_0x0329;
     */
    /* JADX WARNING: Missing block: B:156:0x0316, code skipped:
            r10.b = r10.I;
            r10.c = r11;
            r0.setAnimationListener(new android.support.v4.app.q(r9, r10));
            r10.I.startAnimation(r0);
     */
    /* JADX WARNING: Missing block: B:157:0x0329, code skipped:
            r10.H.removeView(r10.I);
     */
    /* JADX WARNING: Missing block: B:158:0x0330, code skipped:
            r10.H = null;
            r10.I = null;
            r10.J = null;
     */
    /* JADX WARNING: Missing block: B:160:0x033a, code skipped:
            if (a == false) goto L_0x0354;
     */
    /* JADX WARNING: Missing block: B:161:0x033c, code skipped:
            android.util.Log.v("FragmentManager", "movefrom CREATED: " + r10);
     */
    /* JADX WARNING: Missing block: B:163:0x0356, code skipped:
            if (r10.C != false) goto L_0x035b;
     */
    /* JADX WARNING: Missing block: B:164:0x0358, code skipped:
            r10.v();
     */
    /* JADX WARNING: Missing block: B:165:0x035b, code skipped:
            r10.F = false;
            r10.l();
     */
    /* JADX WARNING: Missing block: B:166:0x0362, code skipped:
            if (r10.F != false) goto L_0x0383;
     */
    /* JADX WARNING: Missing block: B:168:0x0382, code skipped:
            throw new android.support.v4.app.ac("Fragment " + r10 + " did not call through to super.onDetach()");
     */
    /* JADX WARNING: Missing block: B:169:0x0383, code skipped:
            if (r14 != false) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:171:0x0387, code skipped:
            if (r10.C != false) goto L_0x038e;
     */
    /* JADX WARNING: Missing block: B:172:0x0389, code skipped:
            d(r10);
     */
    /* JADX WARNING: Missing block: B:173:0x038e, code skipped:
            r10.t = null;
            r10.s = null;
     */
    /* JADX WARNING: Missing block: B:174:0x0394, code skipped:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:175:0x0397, code skipped:
            r0 = null;
     */
    public void a(android.support.v4.app.Fragment r10, int r11, int r12, int r13, boolean r14) {
        /*
        r9 = this;
        r8 = 4;
        r6 = 3;
        r3 = 0;
        r5 = 1;
        r7 = 0;
        r0 = r10.l;
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = r10.A;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        if (r11 <= r5) goto L_0x0010;
    L_0x000f:
        r11 = r5;
    L_0x0010:
        r0 = r10.m;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r10.a;
        if (r11 <= r0) goto L_0x001a;
    L_0x0018:
        r11 = r10.a;
    L_0x001a:
        r0 = r10.K;
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r10.a;
        if (r0 >= r8) goto L_0x0025;
    L_0x0022:
        if (r11 <= r6) goto L_0x0025;
    L_0x0024:
        r11 = r6;
    L_0x0025:
        r0 = r10.a;
        if (r0 >= r11) goto L_0x0240;
    L_0x0029:
        r0 = r10.o;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r10.p;
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r0 = r10.b;
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r10.b = r7;
        r2 = r10.c;
        r0 = r9;
        r1 = r10;
        r4 = r3;
        r0.a(r1, r2, r3, r4, r5);
    L_0x0040:
        r0 = r10.a;
        switch(r0) {
            case 0: goto L_0x0048;
            case 1: goto L_0x0126;
            case 2: goto L_0x01ef;
            case 3: goto L_0x01ef;
            case 4: goto L_0x0210;
            default: goto L_0x0045;
        };
    L_0x0045:
        r10.a = r11;
        goto L_0x0031;
    L_0x0048:
        r0 = a;
        if (r0 == 0) goto L_0x0064;
    L_0x004c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0064:
        r0 = r10.d;
        if (r0 == 0) goto L_0x009d;
    L_0x0068:
        r0 = r10.d;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r10.e = r0;
        r0 = r10.d;
        r1 = "android:target_state";
        r0 = r9.a(r0, r1);
        r10.i = r0;
        r0 = r10.i;
        if (r0 == 0) goto L_0x008a;
    L_0x0080:
        r0 = r10.d;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r3);
        r10.k = r0;
    L_0x008a:
        r0 = r10.d;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r5);
        r10.L = r0;
        r0 = r10.L;
        if (r0 != 0) goto L_0x009d;
    L_0x0098:
        r10.K = r5;
        if (r11 <= r6) goto L_0x009d;
    L_0x009c:
        r11 = r6;
    L_0x009d:
        r0 = r9.o;
        r10.t = r0;
        r0 = r9.q;
        r10.v = r0;
        r0 = r9.q;
        if (r0 == 0) goto L_0x00d9;
    L_0x00a9:
        r0 = r9.q;
        r0 = r0.u;
    L_0x00ad:
        r10.s = r0;
        r10.F = r3;
        r0 = r9.o;
        r10.a(r0);
        r0 = r10.F;
        if (r0 != 0) goto L_0x00de;
    L_0x00ba:
        r0 = new android.support.v4.app.ac;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00d9:
        r0 = r9.o;
        r0 = r0.b;
        goto L_0x00ad;
    L_0x00de:
        r0 = r10.v;
        if (r0 != 0) goto L_0x00e7;
    L_0x00e2:
        r0 = r9.o;
        r0.a(r10);
    L_0x00e7:
        r0 = r10.C;
        if (r0 != 0) goto L_0x00f0;
    L_0x00eb:
        r0 = r10.d;
        r10.g(r0);
    L_0x00f0:
        r10.C = r3;
        r0 = r10.o;
        if (r0 == 0) goto L_0x0126;
    L_0x00f6:
        r0 = r10.d;
        r0 = r10.b(r0);
        r1 = r10.d;
        r0 = r10.b(r0, r7, r1);
        r10.I = r0;
        r0 = r10.I;
        if (r0 == 0) goto L_0x0239;
    L_0x0108:
        r0 = r10.I;
        r10.J = r0;
        r0 = r10.I;
        r0 = android.support.v4.app.ab.a(r0);
        r10.I = r0;
        r0 = r10.z;
        if (r0 == 0) goto L_0x011f;
    L_0x0118:
        r0 = r10.I;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x011f:
        r0 = r10.I;
        r1 = r10.d;
        r10.a(r0, r1);
    L_0x0126:
        if (r11 <= r5) goto L_0x01ef;
    L_0x0128:
        r0 = a;
        if (r0 == 0) goto L_0x0144;
    L_0x012c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0144:
        r0 = r10.o;
        if (r0 != 0) goto L_0x01df;
    L_0x0148:
        r0 = r10.x;
        if (r0 == 0) goto L_0x0397;
    L_0x014c:
        r0 = r9.p;
        r1 = r10.x;
        r0 = r0.a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x019b;
    L_0x0158:
        r1 = r10.q;
        if (r1 != 0) goto L_0x019b;
    L_0x015c:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "No view found for id 0x";
        r2 = r2.append(r3);
        r3 = r10.x;
        r3 = java.lang.Integer.toHexString(r3);
        r2 = r2.append(r3);
        r3 = " (";
        r2 = r2.append(r3);
        r3 = r10.c();
        r4 = r10.x;
        r3 = r3.getResourceName(r4);
        r2 = r2.append(r3);
        r3 = ") for fragment ";
        r2 = r2.append(r3);
        r2 = r2.append(r10);
        r2 = r2.toString();
        r1.<init>(r2);
        r9.a(r1);
    L_0x019b:
        r10.H = r0;
        r1 = r10.d;
        r1 = r10.b(r1);
        r2 = r10.d;
        r1 = r10.b(r1, r0, r2);
        r10.I = r1;
        r1 = r10.I;
        if (r1 == 0) goto L_0x023d;
    L_0x01af:
        r1 = r10.I;
        r10.J = r1;
        r1 = r10.I;
        r1 = android.support.v4.app.ab.a(r1);
        r10.I = r1;
        if (r0 == 0) goto L_0x01cd;
    L_0x01bd:
        r1 = r9.a(r10, r12, r5, r13);
        if (r1 == 0) goto L_0x01c8;
    L_0x01c3:
        r2 = r10.I;
        r2.startAnimation(r1);
    L_0x01c8:
        r1 = r10.I;
        r0.addView(r1);
    L_0x01cd:
        r0 = r10.z;
        if (r0 == 0) goto L_0x01d8;
    L_0x01d1:
        r0 = r10.I;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x01d8:
        r0 = r10.I;
        r1 = r10.d;
        r10.a(r0, r1);
    L_0x01df:
        r0 = r10.d;
        r10.h(r0);
        r0 = r10.I;
        if (r0 == 0) goto L_0x01ed;
    L_0x01e8:
        r0 = r10.d;
        r10.a(r0);
    L_0x01ed:
        r10.d = r7;
    L_0x01ef:
        if (r11 <= r6) goto L_0x0210;
    L_0x01f1:
        r0 = a;
        if (r0 == 0) goto L_0x020d;
    L_0x01f5:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x020d:
        r10.o();
    L_0x0210:
        if (r11 <= r8) goto L_0x0045;
    L_0x0212:
        r0 = a;
        if (r0 == 0) goto L_0x022e;
    L_0x0216:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x022e:
        r10.n = r5;
        r10.p();
        r10.d = r7;
        r10.e = r7;
        goto L_0x0045;
    L_0x0239:
        r10.J = r7;
        goto L_0x0126;
    L_0x023d:
        r10.J = r7;
        goto L_0x01df;
    L_0x0240:
        r0 = r10.a;
        if (r0 <= r11) goto L_0x0045;
    L_0x0244:
        r0 = r10.a;
        switch(r0) {
            case 1: goto L_0x024b;
            case 2: goto L_0x02cb;
            case 3: goto L_0x02aa;
            case 4: goto L_0x0289;
            case 5: goto L_0x0265;
            default: goto L_0x0249;
        };
    L_0x0249:
        goto L_0x0045;
    L_0x024b:
        if (r11 >= r5) goto L_0x0045;
    L_0x024d:
        r0 = r9.t;
        if (r0 == 0) goto L_0x025c;
    L_0x0251:
        r0 = r10.b;
        if (r0 == 0) goto L_0x025c;
    L_0x0255:
        r0 = r10.b;
        r10.b = r7;
        r0.clearAnimation();
    L_0x025c:
        r0 = r10.b;
        if (r0 == 0) goto L_0x0338;
    L_0x0260:
        r10.c = r11;
        r11 = r5;
        goto L_0x0045;
    L_0x0265:
        r0 = 5;
        if (r11 >= r0) goto L_0x0289;
    L_0x0268:
        r0 = a;
        if (r0 == 0) goto L_0x0284;
    L_0x026c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0284:
        r10.r();
        r10.n = r3;
    L_0x0289:
        if (r11 >= r8) goto L_0x02aa;
    L_0x028b:
        r0 = a;
        if (r0 == 0) goto L_0x02a7;
    L_0x028f:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02a7:
        r10.s();
    L_0x02aa:
        if (r11 >= r6) goto L_0x02cb;
    L_0x02ac:
        r0 = a;
        if (r0 == 0) goto L_0x02c8;
    L_0x02b0:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02c8:
        r10.t();
    L_0x02cb:
        r0 = 2;
        if (r11 >= r0) goto L_0x024b;
    L_0x02ce:
        r0 = a;
        if (r0 == 0) goto L_0x02ea;
    L_0x02d2:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02ea:
        r0 = r10.I;
        if (r0 == 0) goto L_0x02fd;
    L_0x02ee:
        r0 = r9.o;
        r0 = r0.isFinishing();
        if (r0 != 0) goto L_0x02fd;
    L_0x02f6:
        r0 = r10.e;
        if (r0 != 0) goto L_0x02fd;
    L_0x02fa:
        r9.e(r10);
    L_0x02fd:
        r10.u();
        r0 = r10.I;
        if (r0 == 0) goto L_0x0330;
    L_0x0304:
        r0 = r10.H;
        if (r0 == 0) goto L_0x0330;
    L_0x0308:
        r0 = r9.n;
        if (r0 <= 0) goto L_0x0394;
    L_0x030c:
        r0 = r9.t;
        if (r0 != 0) goto L_0x0394;
    L_0x0310:
        r0 = r9.a(r10, r12, r3, r13);
    L_0x0314:
        if (r0 == 0) goto L_0x0329;
    L_0x0316:
        r1 = r10.I;
        r10.b = r1;
        r10.c = r11;
        r1 = new android.support.v4.app.q;
        r1.<init>(r9, r10);
        r0.setAnimationListener(r1);
        r1 = r10.I;
        r1.startAnimation(r0);
    L_0x0329:
        r0 = r10.H;
        r1 = r10.I;
        r0.removeView(r1);
    L_0x0330:
        r10.H = r7;
        r10.I = r7;
        r10.J = r7;
        goto L_0x024b;
    L_0x0338:
        r0 = a;
        if (r0 == 0) goto L_0x0354;
    L_0x033c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0354:
        r0 = r10.C;
        if (r0 != 0) goto L_0x035b;
    L_0x0358:
        r10.v();
    L_0x035b:
        r10.F = r3;
        r10.l();
        r0 = r10.F;
        if (r0 != 0) goto L_0x0383;
    L_0x0364:
        r0 = new android.support.v4.app.ac;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r10);
        r2 = " did not call through to super.onDetach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0383:
        if (r14 != 0) goto L_0x0045;
    L_0x0385:
        r0 = r10.C;
        if (r0 != 0) goto L_0x038e;
    L_0x0389:
        r9.d(r10);
        goto L_0x0045;
    L_0x038e:
        r10.t = r7;
        r10.s = r7;
        goto L_0x0045;
    L_0x0394:
        r0 = r7;
        goto L_0x0314;
    L_0x0397:
        r0 = r7;
        goto L_0x019b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    public void a(Fragment fragment, boolean z) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        c(fragment);
        if (!fragment.A) {
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            this.g.add(fragment);
            fragment.l = true;
            fragment.m = false;
            if (fragment.D && fragment.E) {
                this.r = true;
            }
            if (z) {
                b(fragment);
            }
        }
    }

    public void a(FragmentActivity fragmentActivity, l lVar, Fragment fragment) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = fragmentActivity;
        this.p = lVar;
        this.q = fragment;
    }

    public void a(Runnable runnable, boolean z) {
        if (!z) {
            t();
        }
        synchronized (this) {
            if (this.t || this.o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(runnable);
            if (this.c.size() == 1) {
                this.o.a.removeCallbacks(this.y);
                this.o.a.post(this.y);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        Fragment fragment;
        b bVar;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.f != null) {
            size = this.f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.a(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.g != null) {
            size = this.g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        if (this.j != null) {
            size = this.j.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.j.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        if (this.i != null) {
            size = this.i.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    bVar = (b) this.i.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(bVar.toString());
                    bVar.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.k != null) {
                int size2 = this.k.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        bVar = (b) this.k.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(bVar);
                    }
                }
            }
            if (this.l != null && this.l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.l.toArray()));
            }
        }
        if (this.c != null) {
            i = this.c.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    Runnable runnable = (Runnable) this.c.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(runnable);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
        if (this.h != null && this.h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.h.toArray()));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(Handler handler, String str, int i, int i2) {
        if (this.i == null) {
            return false;
        }
        int size;
        if (str == null && i < 0 && (i2 & 1) == 0) {
            size = this.i.size() - 1;
            if (size < 0) {
                return false;
            }
            ((b) this.i.remove(size)).b(true);
            f();
        } else {
            int size2;
            size = -1;
            if (str != null || i >= 0) {
                b bVar;
                size2 = this.i.size() - 1;
                while (size2 >= 0) {
                    bVar = (b) this.i.get(size2);
                    if ((str != null && str.equals(bVar.b())) || (i >= 0 && i == bVar.o)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        bVar = (b) this.i.get(size2);
                        if ((str == null || !str.equals(bVar.b())) && (i < 0 || i != bVar.o)) {
                            break;
                        }
                        size2--;
                    }
                }
                size = size2;
            }
            if (size == this.i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (size2 = this.i.size() - 1; size2 > size; size2--) {
                arrayList.add(this.i.remove(size2));
            }
            int size3 = arrayList.size() - 1;
            int i3 = 0;
            while (i3 <= size3) {
                if (a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i3));
                }
                ((b) arrayList.get(i3)).b(i3 == size3);
                i3++;
            }
            f();
        }
        return true;
    }

    public boolean a(Menu menu) {
        if (this.g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.c(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        Fragment fragment;
        int i = 0;
        ArrayList arrayList = null;
        if (this.g != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.g.size()) {
                fragment = (Fragment) this.g.get(i2);
                if (fragment != null && fragment.b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                }
                i2++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.j != null) {
            while (i < this.j.size()) {
                fragment = (Fragment) this.j.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.m();
                }
                i++;
            }
        }
        this.j = arrayList;
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void b(int i) {
        synchronized (this) {
            this.k.set(i, null);
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.l.add(Integer.valueOf(i));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(Fragment fragment) {
        a(fragment, this.n, 0, 0, false);
    }

    public void b(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.z) {
            fragment.z = true;
            if (fragment.I != null) {
                Animation a = a(fragment, i, false, i2);
                if (a != null) {
                    fragment.I.startAnimation(a);
                }
                fragment.I.setVisibility(8);
            }
            if (fragment.l && fragment.D && fragment.E) {
                this.r = true;
            }
            fragment.a(true);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void b(b bVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(bVar);
        f();
    }

    public void b(Menu menu) {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i2);
                    if (fragment != null) {
                        fragment.d(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public boolean b() {
        return e();
    }

    public boolean b(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = (Fragment) this.g.get(i);
            if (fragment != null && fragment.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(Fragment fragment) {
        if (fragment.f < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                fragment.a(this.f.size(), this.q);
                this.f.add(fragment);
            } else {
                fragment.a(((Integer) this.h.remove(this.h.size() - 1)).intValue(), this.q);
                this.f.set(fragment.f, fragment);
            }
            if (a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
    }

    public void c(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            if (fragment.I != null) {
                Animation a = a(fragment, i, true, i2);
                if (a != null) {
                    fragment.I.startAnimation(a);
                }
                fragment.I.setVisibility(0);
            }
            if (fragment.l && fragment.D && fragment.E) {
                this.r = true;
            }
            fragment.a(false);
        }
    }

    public boolean c() {
        t();
        b();
        return a(this.o.a, null, -1, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public void d() {
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f.size()) {
                    Fragment fragment = (Fragment) this.f.get(i2);
                    if (fragment != null) {
                        a(fragment);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void d(Fragment fragment) {
        if (fragment.f >= 0) {
            if (a) {
                Log.v("FragmentManager", "Freeing fragment index " + fragment);
            }
            this.f.set(fragment.f, null);
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(Integer.valueOf(fragment.f));
            this.o.a(fragment.g);
            fragment.k();
        }
    }

    public void d(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (fragment.l) {
                if (this.g != null) {
                    if (a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.g.remove(fragment);
                }
                if (fragment.D && fragment.E) {
                    this.r = true;
                }
                fragment.l = false;
                a(fragment, 1, i, i2, false);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void e(Fragment fragment) {
        if (fragment.J != null) {
            if (this.x == null) {
                this.x = new SparseArray();
            } else {
                this.x.clear();
            }
            fragment.J.saveHierarchyState(this.x);
            if (this.x.size() > 0) {
                fragment.e = this.x;
                this.x = null;
            }
        }
    }

    public void e(Fragment fragment, int i, int i2) {
        if (a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (!fragment.l) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                if (this.g.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                this.g.add(fragment);
                fragment.l = true;
                if (fragment.D && fragment.E) {
                    this.r = true;
                }
                a(fragment, this.n, i, i2, false);
            }
        }
    }

    /* JADX WARNING: Missing block: B:17:0x0035, code skipped:
            if (r6.v == false) goto L_0x00a5;
     */
    /* JADX WARNING: Missing block: B:18:0x0037, code skipped:
            r3 = 0;
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:20:0x003f, code skipped:
            if (r3 >= r6.f.size()) goto L_0x009e;
     */
    /* JADX WARNING: Missing block: B:21:0x0041, code skipped:
            r0 = (android.support.v4.app.Fragment) r6.f.get(r3);
     */
    /* JADX WARNING: Missing block: B:22:0x0049, code skipped:
            if (r0 == null) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:24:0x004d, code skipped:
            if (r0.M == null) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:25:0x004f, code skipped:
            r4 = r4 | r0.M.a();
     */
    /* JADX WARNING: Missing block: B:26:0x0056, code skipped:
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:35:0x0083, code skipped:
            r6.e = true;
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:36:0x0086, code skipped:
            if (r1 >= r3) goto L_0x009a;
     */
    /* JADX WARNING: Missing block: B:37:0x0088, code skipped:
            r6.d[r1].run();
            r6.d[r1] = null;
            r1 = r1 + 1;
     */
    /* JADX WARNING: Missing block: B:43:0x009e, code skipped:
            if (r4 != 0) goto L_0x00a5;
     */
    /* JADX WARNING: Missing block: B:44:0x00a0, code skipped:
            r6.v = false;
            d();
     */
    /* JADX WARNING: Missing block: B:45:0x00a5, code skipped:
            return r1;
     */
    public boolean e() {
        /*
        r6 = this;
        r0 = 1;
        r2 = 0;
        r1 = r6.e;
        if (r1 == 0) goto L_0x000e;
    L_0x0006:
        r0 = new java.lang.IllegalStateException;
        r1 = "Recursive entry to executePendingTransactions";
        r0.<init>(r1);
        throw r0;
    L_0x000e:
        r1 = android.os.Looper.myLooper();
        r3 = r6.o;
        r3 = r3.a;
        r3 = r3.getLooper();
        if (r1 == r3) goto L_0x0024;
    L_0x001c:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must be called from main thread of process";
        r0.<init>(r1);
        throw r0;
    L_0x0024:
        r1 = r2;
    L_0x0025:
        monitor-enter(r6);
        r3 = r6.c;	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x0032;
    L_0x002a:
        r3 = r6.c;	 Catch:{ all -> 0x0097 }
        r3 = r3.size();	 Catch:{ all -> 0x0097 }
        if (r3 != 0) goto L_0x005a;
    L_0x0032:
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        r0 = r6.v;
        if (r0 == 0) goto L_0x00a5;
    L_0x0037:
        r3 = r2;
        r4 = r2;
    L_0x0039:
        r0 = r6.f;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x009e;
    L_0x0041:
        r0 = r6.f;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 == 0) goto L_0x0056;
    L_0x004b:
        r5 = r0.M;
        if (r5 == 0) goto L_0x0056;
    L_0x004f:
        r0 = r0.M;
        r0 = r0.a();
        r4 = r4 | r0;
    L_0x0056:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0039;
    L_0x005a:
        r1 = r6.c;	 Catch:{ all -> 0x0097 }
        r3 = r1.size();	 Catch:{ all -> 0x0097 }
        r1 = r6.d;	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x0069;
    L_0x0064:
        r1 = r6.d;	 Catch:{ all -> 0x0097 }
        r1 = r1.length;	 Catch:{ all -> 0x0097 }
        if (r1 >= r3) goto L_0x006d;
    L_0x0069:
        r1 = new java.lang.Runnable[r3];	 Catch:{ all -> 0x0097 }
        r6.d = r1;	 Catch:{ all -> 0x0097 }
    L_0x006d:
        r1 = r6.c;	 Catch:{ all -> 0x0097 }
        r4 = r6.d;	 Catch:{ all -> 0x0097 }
        r1.toArray(r4);	 Catch:{ all -> 0x0097 }
        r1 = r6.c;	 Catch:{ all -> 0x0097 }
        r1.clear();	 Catch:{ all -> 0x0097 }
        r1 = r6.o;	 Catch:{ all -> 0x0097 }
        r1 = r1.a;	 Catch:{ all -> 0x0097 }
        r4 = r6.y;	 Catch:{ all -> 0x0097 }
        r1.removeCallbacks(r4);	 Catch:{ all -> 0x0097 }
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        r6.e = r0;
        r1 = r2;
    L_0x0086:
        if (r1 >= r3) goto L_0x009a;
    L_0x0088:
        r4 = r6.d;
        r4 = r4[r1];
        r4.run();
        r4 = r6.d;
        r5 = 0;
        r4[r1] = r5;
        r1 = r1 + 1;
        goto L_0x0086;
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        throw r0;
    L_0x009a:
        r6.e = r2;
        r1 = r0;
        goto L_0x0025;
    L_0x009e:
        if (r4 != 0) goto L_0x00a5;
    L_0x00a0:
        r6.v = r2;
        r6.d();
    L_0x00a5:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.e():boolean");
    }

    /* Access modifiers changed, original: 0000 */
    public Bundle f(Fragment fragment) {
        Bundle bundle;
        if (this.w == null) {
            this.w = new Bundle();
        }
        fragment.i(this.w);
        if (this.w.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.w;
            this.w = null;
        }
        if (fragment.I != null) {
            e(fragment);
        }
        if (fragment.e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.e);
        }
        if (!fragment.L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.L);
        }
        return bundle;
    }

    /* Access modifiers changed, original: 0000 */
    public void f() {
        if (this.m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.m.size()) {
                    ((n) this.m.get(i2)).a();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ArrayList g() {
        ArrayList arrayList = null;
        if (this.f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f.size()) {
                    break;
                }
                Fragment fragment = (Fragment) this.f.get(i2);
                if (fragment != null && fragment.B) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    fragment.C = true;
                    fragment.j = fragment.i != null ? fragment.i.f : -1;
                    if (a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0187  */
    public android.os.Parcelable h() {
        /*
        r11 = this;
        r1 = 1;
        r3 = 0;
        r4 = 0;
        r11.e();
        r0 = b;
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        r11.s = r1;
    L_0x000c:
        r0 = r11.f;
        if (r0 == 0) goto L_0x0018;
    L_0x0010:
        r0 = r11.f;
        r0 = r0.size();
        if (r0 > 0) goto L_0x0019;
    L_0x0018:
        return r3;
    L_0x0019:
        r0 = r11.f;
        r6 = r0.size();
        r7 = new android.support.v4.app.FragmentState[r6];
        r5 = r4;
        r2 = r4;
    L_0x0023:
        if (r5 >= r6) goto L_0x00f5;
    L_0x0025:
        r0 = r11.f;
        r0 = r0.get(r5);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 == 0) goto L_0x01e1;
    L_0x002f:
        r2 = r0.f;
        if (r2 >= 0) goto L_0x005a;
    L_0x0033:
        r2 = new java.lang.IllegalStateException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "Failure saving state: active ";
        r8 = r8.append(r9);
        r8 = r8.append(r0);
        r9 = " has cleared index: ";
        r8 = r8.append(r9);
        r9 = r0.f;
        r8 = r8.append(r9);
        r8 = r8.toString();
        r2.<init>(r8);
        r11.a(r2);
    L_0x005a:
        r2 = new android.support.v4.app.FragmentState;
        r2.<init>(r0);
        r7[r5] = r2;
        r8 = r0.a;
        if (r8 <= 0) goto L_0x00f0;
    L_0x0065:
        r8 = r2.j;
        if (r8 != 0) goto L_0x00f0;
    L_0x0069:
        r8 = r11.f(r0);
        r2.j = r8;
        r8 = r0.i;
        if (r8 == 0) goto L_0x00c1;
    L_0x0073:
        r8 = r0.i;
        r8 = r8.f;
        if (r8 >= 0) goto L_0x00a0;
    L_0x0079:
        r8 = new java.lang.IllegalStateException;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = "Failure saving state: ";
        r9 = r9.append(r10);
        r9 = r9.append(r0);
        r10 = " has target not in fragment manager: ";
        r9 = r9.append(r10);
        r10 = r0.i;
        r9 = r9.append(r10);
        r9 = r9.toString();
        r8.<init>(r9);
        r11.a(r8);
    L_0x00a0:
        r8 = r2.j;
        if (r8 != 0) goto L_0x00ab;
    L_0x00a4:
        r8 = new android.os.Bundle;
        r8.<init>();
        r2.j = r8;
    L_0x00ab:
        r8 = r2.j;
        r9 = "android:target_state";
        r10 = r0.i;
        r11.a(r8, r9, r10);
        r8 = r0.k;
        if (r8 == 0) goto L_0x00c1;
    L_0x00b8:
        r8 = r2.j;
        r9 = "android:target_req_state";
        r10 = r0.k;
        r8.putInt(r9, r10);
    L_0x00c1:
        r8 = a;
        if (r8 == 0) goto L_0x00e9;
    L_0x00c5:
        r8 = "FragmentManager";
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = "Saved state of ";
        r9 = r9.append(r10);
        r0 = r9.append(r0);
        r9 = ": ";
        r0 = r0.append(r9);
        r2 = r2.j;
        r0 = r0.append(r2);
        r0 = r0.toString();
        android.util.Log.v(r8, r0);
    L_0x00e9:
        r0 = r1;
    L_0x00ea:
        r2 = r5 + 1;
        r5 = r2;
        r2 = r0;
        goto L_0x0023;
    L_0x00f0:
        r8 = r0.d;
        r2.j = r8;
        goto L_0x00c1;
    L_0x00f5:
        if (r2 != 0) goto L_0x0104;
    L_0x00f7:
        r0 = a;
        if (r0 == 0) goto L_0x0018;
    L_0x00fb:
        r0 = "FragmentManager";
        r1 = "saveAllState: no fragments!";
        android.util.Log.v(r0, r1);
        goto L_0x0018;
    L_0x0104:
        r0 = r11.g;
        if (r0 == 0) goto L_0x0182;
    L_0x0108:
        r0 = r11.g;
        r5 = r0.size();
        if (r5 <= 0) goto L_0x0182;
    L_0x0110:
        r1 = new int[r5];
        r2 = r4;
    L_0x0113:
        if (r2 >= r5) goto L_0x0183;
    L_0x0115:
        r0 = r11.g;
        r0 = r0.get(r2);
        r0 = (android.support.v4.app.Fragment) r0;
        r0 = r0.f;
        r1[r2] = r0;
        r0 = r1[r2];
        if (r0 >= 0) goto L_0x0152;
    L_0x0125:
        r0 = new java.lang.IllegalStateException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r8 = "Failure saving state: active ";
        r6 = r6.append(r8);
        r8 = r11.g;
        r8 = r8.get(r2);
        r6 = r6.append(r8);
        r8 = " has cleared index: ";
        r6 = r6.append(r8);
        r8 = r1[r2];
        r6 = r6.append(r8);
        r6 = r6.toString();
        r0.<init>(r6);
        r11.a(r0);
    L_0x0152:
        r0 = a;
        if (r0 == 0) goto L_0x017e;
    L_0x0156:
        r0 = "FragmentManager";
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r8 = "saveAllState: adding fragment #";
        r6 = r6.append(r8);
        r6 = r6.append(r2);
        r8 = ": ";
        r6 = r6.append(r8);
        r8 = r11.g;
        r8 = r8.get(r2);
        r6 = r6.append(r8);
        r6 = r6.toString();
        android.util.Log.v(r0, r6);
    L_0x017e:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0113;
    L_0x0182:
        r1 = r3;
    L_0x0183:
        r0 = r11.i;
        if (r0 == 0) goto L_0x01d3;
    L_0x0187:
        r0 = r11.i;
        r5 = r0.size();
        if (r5 <= 0) goto L_0x01d3;
    L_0x018f:
        r3 = new android.support.v4.app.BackStackState[r5];
        r2 = r4;
    L_0x0192:
        if (r2 >= r5) goto L_0x01d3;
    L_0x0194:
        r4 = new android.support.v4.app.BackStackState;
        r0 = r11.i;
        r0 = r0.get(r2);
        r0 = (android.support.v4.app.b) r0;
        r4.<init>(r11, r0);
        r3[r2] = r4;
        r0 = a;
        if (r0 == 0) goto L_0x01cf;
    L_0x01a7:
        r0 = "FragmentManager";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r6 = "saveAllState: adding back stack #";
        r4 = r4.append(r6);
        r4 = r4.append(r2);
        r6 = ": ";
        r4 = r4.append(r6);
        r6 = r11.i;
        r6 = r6.get(r2);
        r4 = r4.append(r6);
        r4 = r4.toString();
        android.util.Log.v(r0, r4);
    L_0x01cf:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0192;
    L_0x01d3:
        r0 = new android.support.v4.app.FragmentManagerState;
        r0.<init>();
        r0.a = r7;
        r0.b = r1;
        r0.c = r3;
        r3 = r0;
        goto L_0x0018;
    L_0x01e1:
        r0 = r2;
        goto L_0x00ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.h():android.os.Parcelable");
    }

    public void i() {
        this.s = false;
    }

    public void j() {
        this.s = false;
        a(1, false);
    }

    public void k() {
        this.s = false;
        a(2, false);
    }

    public void l() {
        this.s = false;
        a(4, false);
    }

    public void m() {
        this.s = false;
        a(5, false);
    }

    public void n() {
        a(4, false);
    }

    public void o() {
        this.s = true;
        a(3, false);
    }

    public void p() {
        a(2, false);
    }

    public void q() {
        a(1, false);
    }

    public void r() {
        this.t = true;
        e();
        a(0, false);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public void s() {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i2);
                    if (fragment != null) {
                        fragment.q();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.q != null) {
            d.a(this.q, stringBuilder);
        } else {
            d.a(this.o, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
