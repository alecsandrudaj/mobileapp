package com.google.tagmanager.a;

import java.io.OutputStream;
import java.util.ArrayList;

class ar extends h {
    private static final int[] c;
    private final int d;
    private final h e;
    private final h f;
    private final int g;
    private final int h;
    private int i;

    static {
        int i = 1;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        c = new int[arrayList.size()];
        i = 0;
        while (true) {
            i2 = i;
            if (i2 < c.length) {
                c[i2] = ((Integer) arrayList.get(i2)).intValue();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    private ar(h hVar, h hVar2) {
        this.i = 0;
        this.e = hVar;
        this.f = hVar2;
        this.g = hVar.a();
        this.d = this.g + hVar2.a();
        this.h = Math.max(hVar.j(), hVar2.j()) + 1;
    }

    static h a(h hVar, h hVar2) {
        ar arVar = hVar instanceof ar ? (ar) hVar : null;
        if (hVar2.a() == 0) {
            return hVar;
        }
        if (hVar.a() == 0) {
            return hVar2;
        }
        int a = hVar.a() + hVar2.a();
        if (a < 128) {
            return b(hVar, hVar2);
        }
        if (arVar != null && arVar.f.a() + hVar2.a() < 128) {
            return new ar(arVar.e, b(arVar.f, hVar2));
        } else if (arVar == null || arVar.e.j() <= arVar.f.j() || arVar.j() <= hVar2.j()) {
            return a >= c[Math.max(hVar.j(), hVar2.j()) + 1] ? new ar(hVar, hVar2) : new at().a(hVar, hVar2);
        } else {
            return new ar(arVar.e, new ar(arVar.f, hVar2));
        }
    }

    private static aj b(h hVar, h hVar2) {
        int a = hVar.a();
        int a2 = hVar2.a();
        byte[] bArr = new byte[(a + a2)];
        hVar.b(bArr, 0, 0, a);
        hVar2.b(bArr, 0, a, a2);
        return new aj(bArr);
    }

    private boolean b(h hVar) {
        au auVar = new au(this);
        aj ajVar = (aj) auVar.next();
        au auVar2 = new au(hVar);
        aj ajVar2 = (aj) auVar2.next();
        int i = 0;
        aj ajVar3 = ajVar;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int a = ajVar3.a() - i2;
            int a2 = ajVar2.a() - i;
            int min = Math.min(a, a2);
            if (!(i2 == 0 ? ajVar3.a(ajVar2, i, min) : ajVar2.a(ajVar3, i2, min))) {
                return false;
            }
            int i4 = i3 + min;
            if (i4 < this.d) {
                boolean z;
                if (min == a) {
                    ajVar3 = (aj) auVar.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == a2) {
                    ajVar = (aj) auVar2.next();
                    z = false;
                } else {
                    aj ajVar4 = ajVar2;
                    z = i + min;
                    ajVar = ajVar4;
                }
                boolean i5 = z;
                ajVar2 = ajVar;
                i3 = i4;
            } else if (i4 == this.d) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int a() {
        return this.d;
    }

    /* Access modifiers changed, original: protected */
    public int a(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.e.a(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.f.a(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.f.a(this.e.a(i, i2, i4), 0, i3 - i4);
    }

    public String a(String str) {
        return new String(e(), str);
    }

    /* Access modifiers changed, original: protected */
    public void a(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.g) {
            this.e.a(bArr, i, i2, i3);
        } else if (i >= this.g) {
            this.f.a(bArr, i - this.g, i2, i3);
        } else {
            int i4 = this.g - i;
            this.e.a(bArr, i, i2, i4);
            this.f.a(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    /* Access modifiers changed, original: protected */
    public int b(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.e.b(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.f.b(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.f.b(this.e.b(i, i2, i4), 0, i3 - i4);
    }

    /* Access modifiers changed, original: 0000 */
    public void b(OutputStream outputStream, int i, int i2) {
        if (i + i2 <= this.g) {
            this.e.b(outputStream, i, i2);
        } else if (i >= this.g) {
            this.f.b(outputStream, i - this.g, i2);
        } else {
            int i3 = this.g - i;
            this.e.b(outputStream, i, i3);
            this.f.b(outputStream, 0, i2 - i3);
        }
    }

    /* renamed from: c */
    public i iterator() {
        return new av(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.d != hVar.a()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        if (this.i != 0) {
            int l = hVar.l();
            if (!(l == 0 || this.i == l)) {
                return false;
            }
        }
        return b(hVar);
    }

    public boolean g() {
        return this.f.a(this.e.a(0, 0, this.g), 0, this.f.a()) == 0;
    }

    public k h() {
        return k.a(new aw(this));
    }

    public int hashCode() {
        int i = this.i;
        if (i == 0) {
            i = b(this.d, 0, this.d);
            if (i == 0) {
                i = 1;
            }
            this.i = i;
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public int j() {
        return this.h;
    }

    /* Access modifiers changed, original: protected */
    public boolean k() {
        return this.d >= c[this.h];
    }

    /* Access modifiers changed, original: protected */
    public int l() {
        return this.i;
    }
}
