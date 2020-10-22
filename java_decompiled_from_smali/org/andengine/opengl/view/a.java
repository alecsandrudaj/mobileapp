package org.andengine.opengl.view;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public class a implements EGLConfigChooser {
    private static final int[] a = new int[1];
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;
    private final boolean e;
    private boolean f;
    private boolean g;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;

    static {
        r0 = new int[19];
        b = r0;
        r0 = new int[19];
        c = r0;
        r0 = new int[15];
        r0[0] = 12324;
        r0[1] = 5;
        r0[2] = 12323;
        r0[3] = 6;
        r0[4] = 12322;
        r0[5] = 5;
        r0[6] = 12321;
        r0[8] = 12325;
        r0[10] = 12326;
        r0[12] = 12352;
        r0[13] = 4;
        r0[14] = 12344;
        d = r0;
    }

    public a(boolean z) {
        this.e = z;
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, a) ? a[0] : i2;
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, a)) {
            return a[0];
        }
        throw new IllegalArgumentException("EGLCONFIG_FALLBACK failed!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, b bVar) {
        int a;
        a[0] = 0;
        if (this.e) {
            a = a(egl10, eGLDisplay, b);
            if (a > 0) {
                this.f = true;
                return a(egl10, eGLDisplay, b, a, bVar);
            }
            a = a(egl10, eGLDisplay, c);
            if (a > 0) {
                this.g = true;
                return a(egl10, eGLDisplay, c, a, bVar);
            }
        }
        a = a(egl10, eGLDisplay, d);
        if (a > 0) {
            return a(egl10, eGLDisplay, d, a, bVar);
        }
        throw new IllegalArgumentException("No " + EGLConfig.class.getSimpleName() + " found!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int i, b bVar) {
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, a)) {
            return a(egl10, eGLDisplay, eGLConfigArr, bVar);
        }
        throw new IllegalArgumentException("findEGLConfig failed!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, b bVar) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            if (eGLConfig != null) {
                int a = a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int a2 = a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int a3 = a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int a4 = a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                int a5 = a(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int a6 = a(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (bVar.a(a, a2, a3, a4, a5, a6)) {
                    this.h = a;
                    this.i = a2;
                    this.j = a3;
                    this.k = a4;
                    this.l = a5;
                    this.m = a6;
                    return eGLConfig;
                }
            }
        }
        throw new IllegalArgumentException("No EGLConfig found!");
    }

    public boolean a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        try {
            return a(egl10, eGLDisplay, b.STRICT);
        } catch (IllegalArgumentException e) {
            try {
                return a(egl10, eGLDisplay, b.LOOSE_STENCIL);
            } catch (IllegalArgumentException e2) {
                try {
                    return a(egl10, eGLDisplay, b.LOOSE_DEPTH_AND_STENCIL);
                } catch (IllegalArgumentException e3) {
                    return a(egl10, eGLDisplay, b.ANY);
                }
            }
        }
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.l;
    }

    public int g() {
        return this.m;
    }
}
