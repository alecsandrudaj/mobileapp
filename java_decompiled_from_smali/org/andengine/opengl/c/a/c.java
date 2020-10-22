package org.andengine.opengl.c.a;

import java.util.ArrayList;
import org.andengine.opengl.c.a.b.b;
import org.andengine.opengl.c.d;
import org.andengine.opengl.c.e;
import org.andengine.opengl.c.f;

public abstract class c extends d implements a {
    protected final int g;
    protected final int h;
    protected final ArrayList i = new ArrayList();

    public c(e eVar, int i, int i2, org.andengine.opengl.c.c cVar, f fVar, b bVar) {
        super(eVar, cVar, fVar, bVar);
        this.g = i;
        this.h = i2;
    }

    private void b(b bVar, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal negative pTextureX supplied: '" + i + "'");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Illegal negative pTextureY supplied: '" + i2 + "'");
        } else if (bVar.c() + i > a() || bVar.d() + i2 > b()) {
            throw new IllegalArgumentException("Supplied pTextureAtlasSource must not exceed bounds of Texture.");
        }
    }

    public int a() {
        return this.g;
    }

    public void a(b bVar, int i, int i2) {
        b(bVar, i, i2);
        bVar.a(i);
        bVar.b(i2);
        this.i.add(bVar);
        this.e = true;
    }

    public int b() {
        return this.h;
    }

    @Deprecated
    /* renamed from: j */
    public b h() {
        return k();
    }

    public b k() {
        return (b) super.h();
    }
}
