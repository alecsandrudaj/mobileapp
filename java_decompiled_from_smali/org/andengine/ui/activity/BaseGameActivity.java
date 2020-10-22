package org.andengine.ui.activity;

import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.widget.FrameLayout.LayoutParams;
import org.andengine.a.c.c;
import org.andengine.b.c.b;
import org.andengine.b.c.e;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.opengl.view.h;
import org.andengine.ui.a;

public abstract class BaseGameActivity extends BaseActivity implements h, a {
    private static /* synthetic */ int[] f;
    private WakeLock a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    protected org.andengine.b.a k;
    protected RenderSurfaceView l;

    protected static LayoutParams B() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    static /* synthetic */ int[] C() {
        int[] iArr = f;
        if (iArr == null) {
            iArr = new int[e.values().length];
            try {
                iArr[e.LANDSCAPE_FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[e.LANDSCAPE_SENSOR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[e.PORTRAIT_FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[e.PORTRAIT_SENSOR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f = iArr;
        }
        return iArr;
    }

    private void a(org.andengine.b.c.h hVar) {
        if (hVar == org.andengine.b.c.h.SCREEN_ON) {
            org.andengine.d.a.b(this);
            return;
        }
        this.a = ((PowerManager) getSystemService("power")).newWakeLock(hVar.a() | 536870912, "AndEngine");
        try {
            this.a.acquire();
        } catch (SecurityException e) {
            org.andengine.d.e.a.b("You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !", e);
        }
    }

    private void c() {
        runOnUiThread(new d(this));
    }

    private void d() {
        a(this.k.d().m());
    }

    private void e() {
        if (this.a != null && this.a.isHeld()) {
            this.a.release();
        }
    }

    private void f() {
        b d = this.k.d();
        if (d.f()) {
            org.andengine.d.a.a(this);
        }
        if (d.d().c() || d.d().b()) {
            setVolumeControlStream(3);
        }
        switch (C()[d.g().ordinal()]) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                setRequestedOrientation(0);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                if (org.andengine.d.i.a.c) {
                    setRequestedOrientation(6);
                    return;
                }
                org.andengine.d.e.a.c(new StringBuilder(String.valueOf(e.class.getSimpleName())).append(".").append(e.LANDSCAPE_SENSOR).append(" is not supported on this device. Falling back to ").append(e.class.getSimpleName()).append(".").append(e.LANDSCAPE_FIXED).toString());
                setRequestedOrientation(0);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                setRequestedOrientation(1);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                if (org.andengine.d.i.a.c) {
                    setRequestedOrientation(7);
                    return;
                }
                org.andengine.d.e.a.c(new StringBuilder(String.valueOf(e.class.getSimpleName())).append(".").append(e.PORTRAIT_SENSOR).append(" is not supported on this device. Falling back to ").append(e.class.getSimpleName()).append(".").append(e.PORTRAIT_FIXED).toString());
                setRequestedOrientation(1);
                return;
            default:
                return;
        }
    }

    public org.andengine.a.b.b A() {
        return this.k.j();
    }

    public org.andengine.b.a a(b bVar) {
        return new org.andengine.b.a(bVar);
    }

    public synchronized void a(org.andengine.opengl.util.e eVar) {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onSurfaceCreated").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        if (this.c) {
            t();
            if (this.b && this.c) {
                s();
            }
        } else if (this.d) {
            this.e = true;
        } else {
            this.d = true;
            q();
        }
    }

    public synchronized void a(org.andengine.opengl.util.e eVar, int i, int i2) {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onSurfaceChanged(Width=").append(i).append(",  Height=").append(i2).append(")").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        this.l = new RenderSurfaceView(this);
        this.l.a(this.k, (h) this);
        setContentView(this.l, B());
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onCreate").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onCreate(bundle);
        this.b = true;
        this.k = a(a());
        this.k.a();
        f();
        b();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onDestroy").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onDestroy();
        this.k.k();
        try {
            v();
        } catch (Throwable th) {
            org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onDestroyResources failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
        w();
        this.k = null;
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onPause").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onPause();
        this.l.onPause();
        e();
        if (!this.b) {
            u();
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void onResume() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onResume").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onResume();
        d();
        this.l.onResume();
    }

    public synchronized void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.b && this.c) {
            s();
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void q() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onCreateGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        c cVar = new c(this, new b(this, new a(this)));
        try {
            org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onCreateResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            a((org.andengine.ui.b) cVar);
        } catch (Throwable th) {
            org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onCreateGame failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
        }
        return;
    }

    public synchronized void r() {
        this.c = true;
        if (this.e) {
            this.e = false;
            try {
                t();
            } catch (Throwable th) {
                org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onReloadResources failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), th);
            }
        }
        return;
    }

    public synchronized void s() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onResumeGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this.k.b();
        this.b = false;
    }

    public void t() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onReloadResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this.k.l();
    }

    public synchronized void u() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onPauseGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this.b = true;
        this.k.c();
    }

    public void v() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onDestroyResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        if (this.k.d().d().c()) {
            A().b();
        }
        if (this.k.d().d().b()) {
            z().b();
        }
    }

    public synchronized void w() {
        org.andengine.d.e.a.b(new StringBuilder(String.valueOf(getClass().getSimpleName())).append(".onGameDestroyed").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this.c = false;
    }

    public org.andengine.b.a x() {
        return this.k;
    }

    public org.andengine.opengl.c.e y() {
        return this.k.h();
    }

    public c z() {
        return this.k.i();
    }
}
