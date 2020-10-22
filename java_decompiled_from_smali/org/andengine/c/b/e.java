package org.andengine.c.b;

import android.util.SparseArray;
import org.andengine.c.a;
import org.andengine.c.c;
import org.andengine.d.a.a.b;

public class e extends a {
    protected e I;
    protected b J = new b(4);
    private boolean K = false;
    private boolean L = false;
    private final SparseArray M = new SparseArray();
    private boolean N = false;
    private final SparseArray O = new SparseArray();
    private float a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final org.andengine.b.b.a.a e = new org.andengine.b.b.a.a();
    private c f;
    private b g;
    private org.andengine.c.b.a.b h = new org.andengine.c.b.a.a(org.andengine.d.d.a.b);
    private boolean i = true;
    private boolean j = true;

    private Boolean a(org.andengine.input.a.a aVar, float f, float f2, d dVar) {
        float[] b = dVar.b(f, f2);
        float f3 = b[0];
        float f4 = b[1];
        return dVar.a(aVar, f3, f4) ? Boolean.TRUE : this.g != null ? Boolean.valueOf(this.g.a(aVar, dVar, f3, f4)) : null;
    }

    /* Access modifiers changed, original: protected */
    public void a(float f) {
        this.a += f;
        this.e.a_(f);
        e eVar = this.I;
        if (eVar == null || !this.c) {
            this.h.a_(f);
            super.a(f);
        }
        if (eVar != null) {
            eVar.a_(f);
        }
    }

    public void a(c cVar) {
        this.f = cVar;
    }

    public void a(c cVar) {
    }

    public boolean a(org.andengine.input.a.a aVar) {
        Boolean valueOf;
        d dVar;
        float b;
        int e = aVar.e();
        boolean f = aVar.f();
        boolean h = aVar.h();
        if (!f) {
            if (this.N && ((c) this.O.get(aVar.d())) != null) {
                switch (e) {
                    case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                    case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                        this.O.remove(aVar.d());
                        break;
                }
                valueOf = Boolean.valueOf(this.f.a(this, aVar));
                if (valueOf != null && valueOf.booleanValue()) {
                    return true;
                }
            }
            if (this.K) {
                SparseArray sparseArray = this.M;
                dVar = (d) sparseArray.get(aVar.d());
                if (dVar != null) {
                    b = aVar.b();
                    float c = aVar.c();
                    switch (e) {
                        case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                        case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                            sparseArray.remove(aVar.d());
                            break;
                    }
                    valueOf = a(aVar, b, c, dVar);
                    if (valueOf != null && valueOf.booleanValue()) {
                        return true;
                    }
                }
            }
        }
        if (this.I != null) {
            if (b(aVar)) {
                return true;
            }
            if (this.d) {
                return false;
            }
        }
        float b2 = aVar.b();
        b = aVar.c();
        b bVar = this.J;
        if (bVar != null) {
            int size = bVar.size();
            if (size > 0) {
                if (this.j) {
                    for (e = 0; e < size; e++) {
                        dVar = (d) bVar.get(e);
                        if (dVar.a(b2, b)) {
                            Boolean a = a(aVar, b2, b, dVar);
                            if (a != null && a.booleanValue()) {
                                if ((this.K && f) || (this.L && h)) {
                                    this.M.put(aVar.d(), dVar);
                                }
                                return true;
                            }
                        }
                    }
                } else {
                    for (e = size - 1; e >= 0; e--) {
                        dVar = (d) bVar.get(e);
                        if (dVar.a(b2, b)) {
                            Boolean a2 = a(aVar, b2, b, dVar);
                            if (a2 != null && a2.booleanValue()) {
                                if ((this.K && f) || (this.L && h)) {
                                    this.M.put(aVar.d(), dVar);
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        if (this.f == null) {
            return false;
        }
        valueOf = Boolean.valueOf(this.f.a(this, aVar));
        if (valueOf == null || !valueOf.booleanValue()) {
            return false;
        }
        if (this.N && f) {
            this.O.put(aVar.d(), this.f);
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean b(org.andengine.input.a.a aVar) {
        return this.I.a(aVar);
    }

    /* Access modifiers changed, original: protected */
    public void e(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        e eVar2 = this.I;
        if (eVar2 == null || !this.b) {
            if (this.i) {
                eVar.m();
                aVar.c(eVar);
                eVar.l();
                this.h.a(eVar, aVar);
                eVar.n();
            }
            eVar.m();
            f(eVar, aVar);
            eVar.l();
            super.e(eVar, aVar);
            eVar.n();
        }
        if (eVar2 != null) {
            eVar2.a(eVar, aVar);
        }
    }

    /* Access modifiers changed, original: protected */
    public void f(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        aVar.b(eVar);
    }
}
