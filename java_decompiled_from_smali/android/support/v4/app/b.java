package android.support.v4.app;

import android.support.v4.b.e;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class b extends w implements Runnable {
    final o a;
    c b;
    c c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l = true;
    String m;
    boolean n;
    int o = -1;
    int p;
    CharSequence q;
    int r;
    CharSequence s;

    public b(o oVar) {
        this.a = oVar;
    }

    private void a(int i, Fragment fragment, String str, int i2) {
        fragment.s = this.a;
        if (str != null) {
            if (fragment.y == null || str.equals(fragment.y)) {
                fragment.y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.y + " now " + str);
            }
        }
        if (i != 0) {
            if (fragment.w == 0 || fragment.w == i) {
                fragment.w = i;
                fragment.x = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.w + " now " + i);
            }
        }
        c cVar = new c();
        cVar.c = i2;
        cVar.d = fragment;
        a(cVar);
    }

    public int a() {
        return a(false);
    }

    /* Access modifiers changed, original: 0000 */
    public int a(boolean z) {
        if (this.n) {
            throw new IllegalStateException("commit already called");
        }
        if (o.a) {
            Log.v("FragmentManager", "Commit: " + this);
            a("  ", null, new PrintWriter(new e("FragmentManager")), null);
        }
        this.n = true;
        if (this.k) {
            this.o = this.a.a(this);
        } else {
            this.o = -1;
        }
        this.a.a((Runnable) this, z);
        return this.o;
    }

    public w a(int i, Fragment fragment, String str) {
        a(i, fragment, str, 1);
        return this;
    }

    public w a(Fragment fragment) {
        c cVar = new c();
        cVar.c = 6;
        cVar.d = fragment;
        a(cVar);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i) {
        if (this.k) {
            if (o.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (c cVar = this.b; cVar != null; cVar = cVar.a) {
                Fragment fragment;
                if (cVar.d != null) {
                    fragment = cVar.d;
                    fragment.r += i;
                    if (o.a) {
                        Log.v("FragmentManager", "Bump nesting of " + cVar.d + " to " + cVar.d.r);
                    }
                }
                if (cVar.i != null) {
                    for (int size = cVar.i.size() - 1; size >= 0; size--) {
                        fragment = (Fragment) cVar.i.get(size);
                        fragment.r += i;
                        if (o.a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.r);
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(c cVar) {
        if (this.b == null) {
            this.c = cVar;
            this.b = cVar;
        } else {
            cVar.b = this.c;
            this.c.a = cVar;
            this.c = cVar;
        }
        cVar.e = this.e;
        cVar.f = this.f;
        cVar.g = this.g;
        cVar.h = this.h;
        this.d++;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.n);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.j));
            }
            if (!(this.e == 0 && this.f == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (!(this.g == 0 && this.h == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (!(this.p == 0 && this.q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.q);
            }
            if (!(this.r == 0 && this.s == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.s);
            }
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str2 = str + "    ";
            int i = 0;
            c cVar = this.b;
            while (cVar != null) {
                String str3;
                switch (cVar.c) {
                    case com.google.android.gms.e.MapAttrs_mapType /*0*/:
                        str3 = "NULL";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                        str3 = "ADD";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                        str3 = "REPLACE";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                        str3 = "REMOVE";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                        str3 = "HIDE";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                        str3 = "SHOW";
                        break;
                    case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                        str3 = "DETACH";
                        break;
                    case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                        str3 = "ATTACH";
                        break;
                    default:
                        str3 = "cmd=" + cVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str3);
                printWriter.print(" ");
                printWriter.println(cVar.d);
                if (z) {
                    if (!(cVar.e == 0 && cVar.f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(cVar.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(cVar.f));
                    }
                    if (!(cVar.g == 0 && cVar.h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(cVar.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(cVar.h));
                    }
                }
                if (cVar.i != null && cVar.i.size() > 0) {
                    for (int i2 = 0; i2 < cVar.i.size(); i2++) {
                        printWriter.print(str2);
                        if (cVar.i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str2);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(cVar.i.get(i2));
                    }
                }
                cVar = cVar.a;
                i++;
            }
        }
    }

    public w b(Fragment fragment) {
        c cVar = new c();
        cVar.c = 7;
        cVar.d = fragment;
        a(cVar);
        return this;
    }

    public String b() {
        return this.m;
    }

    public void b(boolean z) {
        if (o.a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            a("  ", null, new PrintWriter(new e("FragmentManager")), null);
        }
        a(-1);
        for (c cVar = this.c; cVar != null; cVar = cVar.b) {
            Fragment fragment;
            switch (cVar.c) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                    fragment = cVar.d;
                    fragment.G = cVar.h;
                    this.a.a(fragment, o.c(this.i), this.j);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                    fragment = cVar.d;
                    if (fragment != null) {
                        fragment.G = cVar.h;
                        this.a.a(fragment, o.c(this.i), this.j);
                    }
                    if (cVar.i == null) {
                        break;
                    }
                    for (int i = 0; i < cVar.i.size(); i++) {
                        fragment = (Fragment) cVar.i.get(i);
                        fragment.G = cVar.g;
                        this.a.a(fragment, false);
                    }
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                    fragment = cVar.d;
                    fragment.G = cVar.g;
                    this.a.a(fragment, false);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                    fragment = cVar.d;
                    fragment.G = cVar.g;
                    this.a.c(fragment, o.c(this.i), this.j);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                    fragment = cVar.d;
                    fragment.G = cVar.h;
                    this.a.b(fragment, o.c(this.i), this.j);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                    fragment = cVar.d;
                    fragment.G = cVar.g;
                    this.a.e(fragment, o.c(this.i), this.j);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                    fragment = cVar.d;
                    fragment.G = cVar.g;
                    this.a.d(fragment, o.c(this.i), this.j);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + cVar.c);
            }
        }
        if (z) {
            this.a.a(this.a.n, o.c(this.i), this.j, true);
        }
        if (this.o >= 0) {
            this.a.b(this.o);
            this.o = -1;
        }
    }

    public void run() {
        if (o.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (!this.k || this.o >= 0) {
            a(1);
            for (c cVar = this.b; cVar != null; cVar = cVar.a) {
                Fragment fragment;
                switch (cVar.c) {
                    case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                        fragment = cVar.d;
                        fragment.G = cVar.e;
                        this.a.a(fragment, false);
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                        Fragment fragment2;
                        fragment = cVar.d;
                        if (this.a.g != null) {
                            fragment2 = fragment;
                            for (int i = 0; i < this.a.g.size(); i++) {
                                fragment = (Fragment) this.a.g.get(i);
                                if (o.a) {
                                    Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment2 + " old=" + fragment);
                                }
                                if (fragment2 == null || fragment.x == fragment2.x) {
                                    if (fragment == fragment2) {
                                        fragment2 = null;
                                        cVar.d = null;
                                    } else {
                                        if (cVar.i == null) {
                                            cVar.i = new ArrayList();
                                        }
                                        cVar.i.add(fragment);
                                        fragment.G = cVar.f;
                                        if (this.k) {
                                            fragment.r++;
                                            if (o.a) {
                                                Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.r);
                                            }
                                        }
                                        this.a.a(fragment, this.i, this.j);
                                    }
                                }
                            }
                        } else {
                            fragment2 = fragment;
                        }
                        if (fragment2 == null) {
                            break;
                        }
                        fragment2.G = cVar.e;
                        this.a.a(fragment2, false);
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                        fragment = cVar.d;
                        fragment.G = cVar.f;
                        this.a.a(fragment, this.i, this.j);
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                        fragment = cVar.d;
                        fragment.G = cVar.f;
                        this.a.b(fragment, this.i, this.j);
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                        fragment = cVar.d;
                        fragment.G = cVar.e;
                        this.a.c(fragment, this.i, this.j);
                        break;
                    case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                        fragment = cVar.d;
                        fragment.G = cVar.f;
                        this.a.d(fragment, this.i, this.j);
                        break;
                    case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                        fragment = cVar.d;
                        fragment.G = cVar.e;
                        this.a.e(fragment, this.i, this.j);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + cVar.c);
                }
            }
            this.a.a(this.a.n, this.i, this.j, true);
            if (this.k) {
                this.a.b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.o >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.o);
        }
        if (this.m != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.m);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
