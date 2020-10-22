package org.andengine.opengl.d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.andengine.opengl.b.g;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.BufferUtils;
import org.andengine.opengl.util.e;

public abstract class d implements c {
    protected final int c;
    protected final boolean d;
    protected final int e;
    protected final ByteBuffer f;
    protected int g = -1;
    protected boolean h = true;
    protected boolean i;
    protected final e j;
    protected final c k;

    public d(e eVar, int i, a aVar, boolean z, c cVar) {
        this.j = eVar;
        this.c = i;
        this.e = aVar.a();
        this.d = z;
        this.k = cVar;
        this.f = BufferUtils.a(i * 4);
        this.f.order(ByteOrder.nativeOrder());
    }

    private void c(e eVar) {
        this.g = eVar.h();
        this.h = true;
    }

    public abstract void a();

    public void a(int i, int i2) {
        GLES20.glDrawArrays(i, 0, i2);
    }

    public void a(e eVar) {
        eVar.b(this.g);
        this.g = -1;
    }

    public void a(e eVar, g gVar) {
        b(eVar);
        gVar.a(eVar, this.k);
    }

    public void b(e eVar) {
        if (this.g == -1) {
            c(eVar);
            if (this.j != null) {
                this.j.a((c) this);
            }
        }
        eVar.a(this.g);
        if (this.h) {
            a();
            this.h = false;
        }
    }

    public void b(e eVar, g gVar) {
        gVar.b(eVar);
    }

    public boolean b() {
        return this.d;
    }

    public boolean c() {
        return this.i;
    }

    public boolean d() {
        return this.g != -1;
    }

    public void e() {
        this.g = -1;
        this.h = true;
    }

    public void f() {
        this.h = true;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
        if (!this.i) {
            n();
        }
    }

    public void n() {
        if (this.i) {
            throw new org.andengine.d.c();
        }
        this.i = true;
        if (this.j != null) {
            this.j.b(this);
        }
        BufferUtils.a(this.f);
    }
}
