package android.support.v4.b;

import java.util.Iterator;
import java.util.Map.Entry;

final class j implements Iterator, Entry {
    int a;
    int b;
    boolean c = false;
    final /* synthetic */ f d;

    j(f fVar) {
        this.d = fVar;
        this.a = fVar.a() - 1;
        this.b = -1;
    }

    /* renamed from: a */
    public Entry next() {
        this.b++;
        this.c = true;
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            if (!(c.a(entry.getKey(), this.d.a(this.b, 0)) && c.a(entry.getValue(), this.d.a(this.b, 1)))) {
                z = false;
            }
            return z;
        }
    }

    public Object getKey() {
        if (this.c) {
            return this.d.a(this.b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public Object getValue() {
        if (this.c) {
            return this.d.a(this.b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return this.b < this.a;
    }

    public final int hashCode() {
        int i = 0;
        if (this.c) {
            Object a = this.d.a(this.b, 0);
            Object a2 = this.d.a(this.b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public void remove() {
        if (this.c) {
            this.b--;
            this.a--;
            this.c = false;
            this.d.a(this.b);
            return;
        }
        throw new IllegalStateException();
    }

    public Object setValue(Object obj) {
        if (this.c) {
            return this.d.a(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
