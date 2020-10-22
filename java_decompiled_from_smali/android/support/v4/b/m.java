package android.support.v4.b;

public class m implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;

    public m() {
        this(10);
    }

    public m(int i) {
        this.b = false;
        if (i == 0) {
            this.c = c.a;
            this.d = c.c;
        } else {
            int a = c.a(i);
            this.c = new int[a];
            this.d = new Object[a];
        }
        this.e = 0;
    }

    private void d() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public int a(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    /* renamed from: a */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            try {
                mVar.c = (int[]) this.c.clone();
                mVar.d = (Object[]) this.d.clone();
                return mVar;
            } catch (CloneNotSupportedException e) {
                return mVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public int b() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public Object b(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
    }

    public void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(a(i));
            stringBuilder.append('=');
            m b = b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
