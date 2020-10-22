package com.google.tagmanager.a;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class ax extends AbstractMap {
    private final int a;
    private List b;
    private Map c;
    private boolean d;
    private volatile be e;

    private ax(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
    }

    /* synthetic */ ax(int i, ay ayVar) {
        this(i);
    }

    private int a(Comparable comparable) {
        int compareTo;
        int i = 0;
        int size = this.b.size() - 1;
        if (size >= 0) {
            compareTo = comparable.compareTo(((bc) this.b.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            compareTo = comparable.compareTo(((bc) this.b.get(i2)).getKey());
            if (compareTo < 0) {
                compareTo = i2 - 1;
                size = i;
            } else if (compareTo <= 0) {
                return i2;
            } else {
                int i3 = size;
                size = i2 + 1;
                compareTo = i3;
            }
            i = size;
            size = compareTo;
        }
        return -(i + 1);
    }

    static ax a(int i) {
        return new ay(i);
    }

    private Object c(int i) {
        e();
        Object value = ((bc) this.b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.b.add(new bc(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private void e() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap f() {
        e();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    private void g() {
        e();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
    }

    /* renamed from: a */
    public Object put(Comparable comparable, Object obj) {
        e();
        int a = a(comparable);
        if (a >= 0) {
            return ((bc) this.b.get(a)).setValue(obj);
        }
        g();
        int i = -(a + 1);
        if (i >= this.a) {
            return f().put(comparable, obj);
        }
        if (this.b.size() == this.a) {
            bc bcVar = (bc) this.b.remove(this.a - 1);
            f().put(bcVar.getKey(), bcVar.getValue());
        }
        this.b.add(i, new bc(this, comparable, obj));
        return null;
    }

    public void a() {
        if (!this.d) {
            this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.d = true;
        }
    }

    public Entry b(int i) {
        return (Entry) this.b.get(i);
    }

    public boolean b() {
        return this.d;
    }

    public int c() {
        return this.b.size();
    }

    public void clear() {
        e();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public Iterable d() {
        return this.c.isEmpty() ? az.a() : this.c.entrySet();
    }

    public Set entrySet() {
        if (this.e == null) {
            this.e = new be(this, null);
        }
        return this.e;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((bc) this.b.get(a)).getValue() : this.c.get(comparable);
    }

    public Object remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? c(a) : this.c.isEmpty() ? null : this.c.remove(comparable);
    }

    public int size() {
        return this.b.size() + this.c.size();
    }
}
