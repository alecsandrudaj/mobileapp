package com.flappy;

import android.util.Log;

public class j {
    public static float A;
    public static float B;
    public static float[] a;
    public static float[] b;
    public static float[] c;
    public static float[] d;
    public static float[] e;
    public static float[] f;
    public static float[] g;
    public static float[] h;
    public static float[] i;
    public static float[] j;
    public static float[] k;
    public static float[] l;
    public static float[] m;
    public static float[] n;
    public static float[] o;
    public static float[] p;
    public static float[] q;
    public static float[] r;
    public static float[] s;
    public static float[] t;
    public static float[] u;
    public static float[] v;
    public static float[] w;
    public static j x;
    public static int y;
    public static int z;

    j() {
        int i = 0;
        a = new float[360];
        b = new float[360];
        for (int i2 = 0; i2 < 360; i2++) {
            float f = (((float) i2) * 3.1415925f) / 180.0f;
            a[i2] = (float) Math.sin((double) f);
            b[i2] = (float) Math.cos((double) f);
        }
        c = new float[101];
        d = new float[101];
        e = new float[101];
        f = new float[101];
        g = new float[101];
        h = new float[101];
        i = new float[101];
        j = new float[101];
        k = new float[101];
        l = new float[101];
        m = new float[101];
        n = new float[101];
        o = new float[101];
        p = new float[101];
        q = new float[101];
        r = new float[101];
        s = new float[101];
        t = new float[101];
        u = new float[101];
        v = new float[101];
        w = new float[101];
        while (i <= 100) {
            double d = ((double) i) / 100.0d;
            c[i] = (float) a(d);
            d[i] = (float) b(d);
            e[i] = (float) c(d);
            f[i] = (float) d(d);
            g[i] = (float) e(d);
            h[i] = (float) f(d);
            i[i] = (float) g(d);
            j[i] = (float) h(d);
            k[i] = (float) i(d);
            l[i] = (float) j(d);
            m[i] = (float) k(d);
            n[i] = (float) l(d);
            o[i] = (float) m(d);
            p[i] = (float) n(d);
            q[i] = (float) o(d);
            r[i] = (float) p(d);
            s[i] = (float) q(d);
            t[i] = (float) r(d);
            u[i] = (float) s(d);
            v[i] = (float) t(d);
            w[i] = (float) u(d);
            i++;
        }
    }

    public static float a(float f) {
        float f2 = f;
        while (f2 > 360.0f) {
            f2 -= 360.0f;
        }
        while (f2 < 0.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    public static int a() {
        z = (36969 * (z & 65535)) + (z >> 16);
        y = ((y & 65535) * 18000) + (y >> 16);
        return Math.abs((z << 16) + y);
    }

    public static int a(int i, int i2) {
        return (a() % (i2 - i)) + i;
    }

    public static void a(float f, float f2, float f3, float f4, float f5) {
        float f6 = f - f3;
        float f7 = f2 - f4;
        float a = a(f5);
        A = ((c(a) * f6) - (b(a) * f7)) + f3;
        B = ((f6 * b(a)) + (f7 * c(a))) + f4;
    }

    public static void a(int i) {
        Log.i("FlappyBird", "Engine: Randomize " + i);
        y = i % 32000;
        z = i % 65535;
    }

    public static float b(float f) {
        return a[(int) f];
    }

    public static float b(int i) {
        return i[i];
    }

    static double c(double d) {
        return d < 0.5d ? (2.0d * d) * d : (((-2.0d * d) * d) + (4.0d * d)) - 1.0d;
    }

    public static float c(float f) {
        return b[(int) f];
    }

    public static float c(int i) {
        return d[i];
    }

    static double d(double d) {
        return (d * d) * d;
    }

    public static float d(int i) {
        return e[i];
    }

    static double e(double d) {
        double d2 = d - 1.0d;
        return (d2 * (d2 * d2)) + 1.0d;
    }

    public static float e(int i) {
        return f[i];
    }

    static double f(double d) {
        if (d < 0.5d) {
            return ((4.0d * d) * d) * d;
        }
        double d2 = (2.0d * d) - 2.0d;
        return (d2 * ((0.5d * d2) * d2)) + 1.0d;
    }

    public static float f(int i) {
        return g[i];
    }

    static double g(double d) {
        return ((d * d) * d) * d;
    }

    public static float g(int i) {
        return h[i];
    }

    static double h(double d) {
        double d2 = d - 1.0d;
        return ((d2 * (d2 * d2)) * (1.0d - d)) + 1.0d;
    }

    public static float h(int i) {
        return i[i];
    }

    static double i(double d) {
        if (d < 0.5d) {
            return (((8.0d * d) * d) * d) * d;
        }
        double d2 = d - 1.0d;
        return (d2 * (((-8.0d * d2) * d2) * d2)) + 1.0d;
    }

    public static float i(int i) {
        return j[i];
    }

    static double j(double d) {
        return (((d * d) * d) * d) * d;
    }

    public static float j(int i) {
        return k[i];
    }

    static double k(double d) {
        double d2 = d - 1.0d;
        return (d2 * (((d2 * d2) * d2) * d2)) + 1.0d;
    }

    public static float k(int i) {
        return l[i];
    }

    static double l(double d) {
        if (d < 0.5d) {
            return ((((16.0d * d) * d) * d) * d) * d;
        }
        double d2 = (2.0d * d) - 2.0d;
        return (d2 * ((((0.5d * d2) * d2) * d2) * d2)) + 1.0d;
    }

    public static float l(int i) {
        return m[i];
    }

    public static float m(int i) {
        return n[i];
    }

    public static float n(int i) {
        return o[i];
    }

    public static float o(int i) {
        return p[i];
    }

    public static float p(int i) {
        return q[i];
    }

    public static float q(int i) {
        return o[i];
    }

    public static float r(int i) {
        return p[i];
    }

    public static float s(int i) {
        return q[i];
    }

    public static float t(int i) {
        return u[i];
    }

    public static float u(int i) {
        return v[i];
    }

    public static float v(int i) {
        return w[i];
    }

    /* Access modifiers changed, original: 0000 */
    public double a(double d) {
        return d * d;
    }

    /* Access modifiers changed, original: 0000 */
    public double b(double d) {
        return -((d - 2.0d) * d);
    }

    /* Access modifiers changed, original: 0000 */
    public double m(double d) {
        return Math.sin(20.420352248333657d * d) * Math.pow(2.0d, 10.0d * (d - 1.0d));
    }

    /* Access modifiers changed, original: 0000 */
    public double n(double d) {
        return (Math.sin(-20.420352248333657d * (d + 1.0d)) * Math.pow(2.0d, -10.0d * d)) + 1.0d;
    }

    /* Access modifiers changed, original: 0000 */
    public double o(double d) {
        return d < 0.5d ? (Math.sin(20.420352248333657d * (2.0d * d)) * 0.5d) * Math.pow(2.0d, 10.0d * ((2.0d * d) - 1.0d)) : ((Math.sin(-20.420352248333657d * (((2.0d * d) - 1.0d) + 1.0d)) * Math.pow(2.0d, -10.0d * ((2.0d * d) - 1.0d))) + 2.0d) * 0.5d;
    }

    /* Access modifiers changed, original: 0000 */
    public double p(double d) {
        return ((d * d) * d) - (Math.sin(3.141592653589793d * d) * d);
    }

    /* Access modifiers changed, original: 0000 */
    public double q(double d) {
        double d2 = 1.0d - d;
        return 1.0d - (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2)));
    }

    /* Access modifiers changed, original: 0000 */
    public double r(double d) {
        double d2;
        if (d < 0.5d) {
            d2 = 2.0d * d;
            return (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2))) * 0.5d;
        }
        d2 = 1.0d - ((2.0d * d) - 1.0d);
        return ((1.0d - (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2)))) * 0.5d) + 0.5d;
    }

    /* Access modifiers changed, original: 0000 */
    public double s(double d) {
        return 1.0d - t(1.0d - d);
    }

    /* Access modifiers changed, original: 0000 */
    public double t(double d) {
        return d < 0.36363636363636365d ? ((121.0d * d) * d) / 16.0d : d < 0.7272727272727273d ? (((9.075d * d) * d) - (9.9d * d)) + 3.4d : d < 0.9d ? (((12.066481994459833d * d) * d) - (19.63545706371191d * d)) + 8.898060941828255d : (((10.8d * d) * d) - (20.52d * d)) + 10.72d;
    }

    /* Access modifiers changed, original: 0000 */
    public double u(double d) {
        return d < 0.5d ? s(d * 2.0d) * 0.5d : (t((d * 2.0d) - 1.0d) * 0.5d) + 0.5d;
    }
}
