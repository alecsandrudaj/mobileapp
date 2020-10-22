package com.google.tagmanager.a;

import com.google.android.gms.e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class k {
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private l n;

    private k(aj ajVar) {
        this.h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = ajVar.c;
        this.e = ajVar.b();
        this.c = ajVar.b() + ajVar.a();
        this.i = -this.e;
        this.f = null;
        this.b = true;
    }

    private k(InputStream inputStream) {
        this.h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = new byte[4096];
        this.c = 0;
        this.e = 0;
        this.i = 0;
        this.f = inputStream;
        this.b = false;
    }

    public static long a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    static k a(aj ajVar) {
        k kVar = new k(ajVar);
        try {
            kVar.c(ajVar.a());
            return kVar;
        } catch (af e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static k a(InputStream inputStream) {
        return new k(inputStream);
    }

    private boolean a(boolean z) {
        if (this.e < this.c) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        } else if (this.i + this.c != this.j) {
            if (this.n != null) {
                this.n.a();
            }
            this.i += this.c;
            this.e = 0;
            this.c = this.f == null ? -1 : this.f.read(this.a);
            if (this.c == 0 || this.c < -1) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.c + "\nThe InputStream implementation is buggy.");
            } else if (this.c == -1) {
                this.c = 0;
                if (!z) {
                    return false;
                }
                throw af.b();
            } else {
                z();
                int i = (this.i + this.c) + this.d;
                if (i <= this.m && i >= 0) {
                    return true;
                }
                throw af.i();
            }
        } else if (!z) {
            return false;
        } else {
            throw af.b();
        }
    }

    public static int b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    private void z() {
        this.c += this.d;
        int i = this.i + this.c;
        if (i > this.j) {
            this.d = i - this.j;
            this.c -= this.d;
            return;
        }
        this.d = 0;
    }

    public int a() {
        if (x()) {
            this.g = 0;
            return 0;
        }
        this.g = s();
        if (bk.b(this.g) != 0) {
            return this.g;
        }
        throw af.e();
    }

    public am a(aq aqVar, o oVar) {
        int s = s();
        if (this.k >= this.l) {
            throw af.h();
        }
        int c = c(s);
        this.k++;
        am amVar = (am) aqVar.b(this, oVar);
        a(0);
        this.k--;
        d(c);
        return amVar;
    }

    public void a(int i) {
        if (this.g != i) {
            throw af.f();
        }
    }

    public void a(int i, an anVar, o oVar) {
        if (this.k >= this.l) {
            throw af.h();
        }
        this.k++;
        anVar.c(this, oVar);
        a(bk.a(i, 4));
        this.k--;
    }

    public void a(an anVar, o oVar) {
        int s = s();
        if (this.k >= this.l) {
            throw af.h();
        }
        s = c(s);
        this.k++;
        anVar.c(this, oVar);
        a(0);
        this.k--;
        d(s);
    }

    public void a(m mVar) {
        int a;
        do {
            a = a();
            if (a == 0) {
                return;
            }
        } while (a(a, mVar));
    }

    public boolean a(int i, m mVar) {
        long e;
        int a;
        switch (bk.a(i)) {
            case e.MapAttrs_mapType /*0*/:
                e = e();
                mVar.d(i);
                mVar.a(e);
                return true;
            case e.MapAttrs_cameraBearing /*1*/:
                e = v();
                mVar.d(i);
                mVar.b(e);
                return true;
            case e.MapAttrs_cameraTargetLat /*2*/:
                h l = l();
                mVar.d(i);
                mVar.a(l);
                return true;
            case e.MapAttrs_cameraTargetLng /*3*/:
                mVar.d(i);
                a(mVar);
                a = bk.a(bk.b(i), 4);
                a(a);
                mVar.d(a);
                return true;
            case e.MapAttrs_cameraTilt /*4*/:
                return false;
            case e.MapAttrs_cameraZoom /*5*/:
                a = u();
                mVar.d(i);
                mVar.a(a);
                return true;
            default:
                throw af.g();
        }
    }

    public double b() {
        return Double.longBitsToDouble(v());
    }

    public float c() {
        return Float.intBitsToFloat(u());
    }

    public int c(int i) {
        if (i < 0) {
            throw af.c();
        }
        int i2 = (this.i + this.e) + i;
        int i3 = this.j;
        if (i2 > i3) {
            throw af.b();
        }
        this.j = i2;
        z();
        return i3;
    }

    public long d() {
        return t();
    }

    public void d(int i) {
        this.j = i;
        z();
    }

    public long e() {
        return t();
    }

    public byte[] e(int i) {
        byte[] bArr;
        int i2;
        if (i < 0) {
            throw af.c();
        } else if ((this.i + this.e) + i > this.j) {
            f((this.j - this.i) - this.e);
            throw af.b();
        } else if (i <= this.c - this.e) {
            bArr = new byte[i];
            System.arraycopy(this.a, this.e, bArr, 0, i);
            this.e += i;
            return bArr;
        } else if (i < 4096) {
            byte[] bArr2 = new byte[i];
            i2 = this.c - this.e;
            System.arraycopy(this.a, this.e, bArr2, 0, i2);
            this.e = this.c;
            a(true);
            while (i - i2 > this.c) {
                System.arraycopy(this.a, 0, bArr2, i2, this.c);
                i2 += this.c;
                this.e = this.c;
                a(true);
            }
            System.arraycopy(this.a, 0, bArr2, i2, i - i2);
            this.e = i - i2;
            return bArr2;
        } else {
            int read;
            int i3 = this.e;
            int i4 = this.c;
            this.i += this.c;
            this.e = 0;
            this.c = 0;
            i2 = i - (i4 - i3);
            ArrayList arrayList = new ArrayList();
            int i5 = i2;
            while (i5 > 0) {
                byte[] bArr3 = new byte[Math.min(i5, 4096)];
                i2 = 0;
                while (i2 < bArr3.length) {
                    read = this.f == null ? -1 : this.f.read(bArr3, i2, bArr3.length - i2);
                    if (read == -1) {
                        throw af.b();
                    }
                    this.i += read;
                    i2 += read;
                }
                i2 = i5 - bArr3.length;
                arrayList.add(bArr3);
                i5 = i2;
            }
            byte[] bArr4 = new byte[i];
            i2 = i4 - i3;
            System.arraycopy(this.a, i3, bArr4, 0, i2);
            Iterator it = arrayList.iterator();
            while (true) {
                read = i2;
                if (!it.hasNext()) {
                    return bArr4;
                }
                bArr = (byte[]) it.next();
                System.arraycopy(bArr, 0, bArr4, read, bArr.length);
                i2 = bArr.length + read;
            }
        }
    }

    public int f() {
        return s();
    }

    public void f(int i) {
        if (i < 0) {
            throw af.c();
        } else if ((this.i + this.e) + i > this.j) {
            f((this.j - this.i) - this.e);
            throw af.b();
        } else if (i <= this.c - this.e) {
            this.e += i;
        } else {
            int i2 = this.c - this.e;
            this.e = this.c;
            a(true);
            while (i - i2 > this.c) {
                i2 += this.c;
                this.e = this.c;
                a(true);
            }
            this.e = i - i2;
        }
    }

    public long g() {
        return v();
    }

    public int h() {
        return u();
    }

    public boolean i() {
        return s() != 0;
    }

    public String j() {
        int s = s();
        if (s > this.c - this.e || s <= 0) {
            return new String(e(s), "UTF-8");
        }
        String str = new String(this.a, this.e, s, "UTF-8");
        this.e = s + this.e;
        return str;
    }

    public String k() {
        h ajVar;
        int s = s();
        if (s > this.c - this.e || s <= 0) {
            ajVar = new aj(e(s));
        } else {
            ajVar = h.a(this.a, this.e, s);
            this.e = s + this.e;
        }
        if (ajVar.g()) {
            return ajVar.f();
        }
        throw af.j();
    }

    public h l() {
        int s = s();
        if (s == 0) {
            return h.a;
        }
        if (s > this.c - this.e || s <= 0) {
            return new aj(e(s));
        }
        h eVar = (this.b && this.h) ? new e(this.a, this.e, s) : h.a(this.a, this.e, s);
        this.e = s + this.e;
        return eVar;
    }

    public int m() {
        return s();
    }

    public int n() {
        return s();
    }

    public int o() {
        return u();
    }

    public long p() {
        return v();
    }

    public int q() {
        return b(s());
    }

    public long r() {
        return a(t());
    }

    public int s() {
        byte y = y();
        if (y >= (byte) 0) {
            return y;
        }
        int i = y & 127;
        byte y2 = y();
        if (y2 >= (byte) 0) {
            return i | (y2 << 7);
        }
        i |= (y2 & 127) << 7;
        y2 = y();
        if (y2 >= (byte) 0) {
            return i | (y2 << 14);
        }
        i |= (y2 & 127) << 14;
        y2 = y();
        if (y2 >= (byte) 0) {
            return i | (y2 << 21);
        }
        i |= (y2 & 127) << 21;
        y2 = y();
        i |= y2 << 28;
        if (y2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (y() >= (byte) 0) {
                return i;
            }
        }
        throw af.d();
    }

    public long t() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte y = y();
            j |= ((long) (y & 127)) << i;
            if ((y & 128) == 0) {
                return j;
            }
        }
        throw af.d();
    }

    public int u() {
        return (((y() & 255) | ((y() & 255) << 8)) | ((y() & 255) << 16)) | ((y() & 255) << 24);
    }

    public long v() {
        byte y = y();
        byte y2 = y();
        return ((((((((((long) y2) & 255) << 8) | (((long) y) & 255)) | ((((long) y()) & 255) << 16)) | ((((long) y()) & 255) << 24)) | ((((long) y()) & 255) << 32)) | ((((long) y()) & 255) << 40)) | ((((long) y()) & 255) << 48)) | ((((long) y()) & 255) << 56);
    }

    public int w() {
        if (this.j == Integer.MAX_VALUE) {
            return -1;
        }
        return this.j - (this.i + this.e);
    }

    public boolean x() {
        return this.e == this.c && !a(false);
    }

    public byte y() {
        if (this.e == this.c) {
            a(true);
        }
        byte[] bArr = this.a;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }
}
