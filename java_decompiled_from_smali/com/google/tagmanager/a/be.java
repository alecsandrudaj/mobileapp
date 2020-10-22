package com.google.tagmanager.a;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class be extends AbstractSet {
    final /* synthetic */ ax a;

    private be(ax axVar) {
        this.a = axVar;
    }

    /* synthetic */ be(ax axVar, ay ayVar) {
        this(axVar);
    }

    /* renamed from: a */
    public boolean add(Entry entry) {
        if (contains(entry)) {
            return false;
        }
        this.a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator iterator() {
        return new bd(this.a, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.a.size();
    }
}
