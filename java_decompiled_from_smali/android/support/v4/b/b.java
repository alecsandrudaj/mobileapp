package android.support.v4.b;

import java.util.Map;

class b extends f {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    /* Access modifiers changed, original: protected */
    public int a() {
        return this.a.h;
    }

    /* Access modifiers changed, original: protected */
    public int a(Object obj) {
        return obj == null ? this.a.a() : this.a.a(obj, obj.hashCode());
    }

    /* Access modifiers changed, original: protected */
    public Object a(int i, int i2) {
        return this.a.g[(i << 1) + i2];
    }

    /* Access modifiers changed, original: protected */
    public Object a(int i, Object obj) {
        return this.a.a(i, obj);
    }

    /* Access modifiers changed, original: protected */
    public void a(int i) {
        this.a.d(i);
    }

    /* Access modifiers changed, original: protected */
    public void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    /* Access modifiers changed, original: protected */
    public int b(Object obj) {
        return this.a.a(obj);
    }

    /* Access modifiers changed, original: protected */
    public Map b() {
        return this.a;
    }

    /* Access modifiers changed, original: protected */
    public void c() {
        this.a.clear();
    }
}
