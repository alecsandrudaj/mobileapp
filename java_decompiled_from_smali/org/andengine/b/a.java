package org.andengine.b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import org.andengine.b.b.d;
import org.andengine.input.a.a.e;
import org.andengine.input.a.a.f;
import org.andengine.input.sensor.a.g;
import org.andengine.input.sensor.b;
import org.andengine.opengl.a.c;
import org.andengine.opengl.b.h;

public class a implements SensorEventListener, LocationListener, OnTouchListener, e {
    private static final b e = b.GAME;
    private final d A = new d(8);
    private final org.andengine.b.b.a B = new org.andengine.b.b.a(4);
    protected final org.andengine.b.a.a a;
    protected org.andengine.c.b.e b;
    protected int c = 1;
    protected int d = 1;
    private boolean f;
    private boolean g;
    private long h;
    private float i;
    private final c j;
    private final d k;
    private final org.andengine.b.b.a.a l = new org.andengine.b.b.a.a();
    private final org.andengine.b.c.b m;
    private org.andengine.input.a.a.d n;
    private final org.andengine.opengl.d.e o = new org.andengine.opengl.d.e();
    private final org.andengine.opengl.c.e p = new org.andengine.opengl.c.e();
    private final c q = new c();
    private final h r = new h();
    private final org.andengine.a.c.c s;
    private final org.andengine.a.b.b t;
    private org.andengine.input.sensor.location.a u;
    private Location v;
    private g w;
    private org.andengine.input.sensor.a.a x;
    private org.andengine.input.sensor.b.a y;
    private org.andengine.input.sensor.b.b z;

    public a(org.andengine.b.c.b bVar) {
        org.andengine.opengl.c.a.a.b.a();
        org.andengine.a.c.b.a();
        org.andengine.a.b.a.a();
        org.andengine.opengl.a.b.a();
        this.o.a();
        this.p.a();
        this.q.a();
        this.r.a();
        this.m = bVar;
        if (this.m.a()) {
            this.j = bVar.b();
        } else {
            this.j = new c(false);
        }
        this.a = bVar.i();
        if (this.m.c().a()) {
            a(new f());
        } else {
            a(new org.andengine.input.a.a.g());
        }
        if (this.m.d().b()) {
            this.s = new org.andengine.a.c.c(this.m.d().a().b());
        } else {
            this.s = null;
        }
        if (this.m.d().c()) {
            this.t = new org.andengine.a.b.b();
        } else {
            this.t = null;
        }
        if (this.m.j()) {
            this.k = this.m.k();
        } else {
            this.k = new d();
        }
        this.k.a(this);
    }

    private void n() {
        if (this.g) {
            throw new b(this);
        }
    }

    private long o() {
        return System.nanoTime() - this.h;
    }

    public void a() {
        this.k.start();
    }

    /* Access modifiers changed, original: protected */
    public void a(float f) {
        if (this.b != null) {
            this.b.a_(f);
        }
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        f();
    }

    public void a(long j) {
        float f = ((float) j) * 1.0E-9f;
        this.i += f;
        this.h += j;
        this.n.a_(f);
        b(f);
        a(f);
    }

    public void a(org.andengine.c.b.e eVar) {
        this.b = eVar;
    }

    public void a(org.andengine.input.a.a.d dVar) {
        this.n = dVar;
        this.n.a((e) this);
    }

    public void a(org.andengine.opengl.util.e eVar) {
        c cVar = this.j;
        cVar.lock();
        try {
            cVar.c();
            this.o.a(eVar);
            this.p.a(eVar);
            this.q.a(eVar);
            a(eVar, this.a);
            b(eVar, this.a);
            cVar.b();
        } finally {
            cVar.unlock();
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        this.B.a(eVar, aVar);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(org.andengine.b.a.a aVar, org.andengine.input.a.a aVar2) {
        return aVar.j() ? aVar.i().a(aVar2) : false;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(org.andengine.c.b.e eVar, org.andengine.input.a.a aVar) {
        return eVar != null ? eVar.a(aVar) : false;
    }

    public boolean a(org.andengine.input.a.a aVar) {
        org.andengine.c.b.e c = c(aVar);
        org.andengine.b.a.a b = b(aVar);
        b(b, aVar);
        return a(b, aVar) ? true : a(c, aVar);
    }

    /* Access modifiers changed, original: protected */
    public org.andengine.b.a.a b(org.andengine.input.a.a aVar) {
        return e();
    }

    public synchronized void b() {
        if (!this.f) {
            this.h = System.nanoTime();
            this.f = true;
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(float f) {
        this.l.a_(f);
        this.A.a_(f);
        e().a_(f);
    }

    /* Access modifiers changed, original: protected */
    public void b(org.andengine.b.a.a aVar, org.andengine.input.a.a aVar2) {
        aVar.a(aVar2, this.c, this.d);
    }

    /* Access modifiers changed, original: protected */
    public void b(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        if (this.b != null) {
            this.b.a(eVar, aVar);
        }
        aVar.a(eVar);
    }

    /* Access modifiers changed, original: protected */
    public org.andengine.c.b.e c(org.andengine.input.a.a aVar) {
        return this.b;
    }

    public synchronized void c() {
        if (this.f) {
            this.f = false;
        }
    }

    public org.andengine.b.c.b d() {
        return this.m;
    }

    public org.andengine.b.a.a e() {
        return this.a;
    }

    /* Access modifiers changed, original: protected */
    public void f() {
        this.a.a(0, 0, this.c, this.d);
    }

    public org.andengine.opengl.d.e g() {
        return this.o;
    }

    public org.andengine.opengl.c.e h() {
        return this.p;
    }

    public org.andengine.a.c.c i() {
        if (this.s != null) {
            return this.s;
        }
        throw new IllegalStateException("To enable the SoundManager, check the EngineOptions!");
    }

    public org.andengine.a.b.b j() {
        if (this.t != null) {
            return this.t;
        }
        throw new IllegalStateException("To enable the MusicManager, check the EngineOptions!");
    }

    public void k() {
        this.j.lock();
        try {
            this.g = true;
            this.j.b();
            try {
                this.k.join();
            } catch (InterruptedException e) {
                org.andengine.d.e.a.b("Could not join UpdateThread.", e);
                org.andengine.d.e.a.c("Trying to manually interrupt UpdateThread.");
                this.k.interrupt();
            }
            this.o.b();
            this.p.c();
            this.q.b();
            this.r.b();
        } finally {
            this.j.unlock();
        }
    }

    public void l() {
        this.o.c();
        this.p.b();
        this.q.c();
        this.r.c();
    }

    /* Access modifiers changed, original: 0000 */
    public void m() {
        if (this.f) {
            long o = o();
            this.j.lock();
            try {
                n();
                a(o);
                n();
                this.j.a();
                this.j.d();
            } finally {
                this.j.unlock();
            }
        } else {
            this.j.lock();
            try {
                n();
                this.j.a();
                this.j.d();
                Thread.sleep(16);
            } finally {
                this.j.unlock();
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        if (this.f) {
            switch (sensor.getType()) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                    if (this.x != null) {
                        this.x.a(i);
                        this.w.a(this.x);
                        return;
                    } else if (this.z != null) {
                        this.z.b(i);
                        this.y.a(this.z);
                        return;
                    } else {
                        return;
                    }
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                    this.z.c(i);
                    this.y.a(this.z);
                    return;
                default:
                    return;
            }
        }
    }

    public void onLocationChanged(Location location) {
        if (this.v == null) {
            this.v = location;
        } else if (location == null) {
            this.u.b();
        } else {
            this.v = location;
            this.u.a(location);
        }
    }

    public void onProviderDisabled(String str) {
        this.u.c();
    }

    public void onProviderEnabled(String str) {
        this.u.a();
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f) {
            switch (sensorEvent.sensor.getType()) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                    if (this.x != null) {
                        this.x.a(sensorEvent.values);
                        this.w.b(this.x);
                        return;
                    } else if (this.z != null) {
                        this.z.b(sensorEvent.values);
                        this.y.b(this.z);
                        return;
                    } else {
                        return;
                    }
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                    this.z.c(sensorEvent.values);
                    this.y.b(this.z);
                    return;
                default:
                    return;
            }
        }
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        switch (i) {
            case com.google.android.gms.e.MapAttrs_mapType /*0*/:
                this.u.a(org.andengine.input.sensor.location.b.OUT_OF_SERVICE, bundle);
                return;
            case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                this.u.a(org.andengine.input.sensor.location.b.TEMPORARILY_UNAVAILABLE, bundle);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                this.u.a(org.andengine.input.sensor.location.b.AVAILABLE, bundle);
                return;
            default:
                return;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f) {
            return false;
        }
        this.n.a(motionEvent);
        try {
            Thread.sleep(this.m.c().b());
        } catch (InterruptedException e) {
            org.andengine.d.e.a.a(e);
        }
        return true;
    }
}
