package org.andengine.opengl.a;

import android.util.SparseIntArray;

public class d {
    public final char a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    private final boolean m;
    private SparseIntArray n;

    public boolean a() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return this.a == ((d) obj).a;
    }

    public int hashCode() {
        return this.a + 31;
    }

    public String toString() {
        return new StringBuilder(String.valueOf(getClass().getSimpleName())).append("[Character=").append(this.a).append(", Whitespace=").append(this.m).append(", TextureX=").append(this.b).append(", TextureY=").append(this.c).append(", Width=").append(this.d).append(", Height=").append(this.e).append(", OffsetX=").append(this.f).append(", OffsetY=").append(this.g).append(", Advance=").append(this.h).append(", U=").append(this.i).append(", V=").append(this.j).append(", U2=").append(this.k).append(", V2=").append(this.l).append(", Kernings=").append(this.n).append("]").toString();
    }
}
