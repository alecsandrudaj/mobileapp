package org.andengine.d.b.b;

import java.util.Comparator;
import java.util.List;

public class a extends b {
    public void a(List list, int i, int i2, Comparator comparator) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            Object obj = list.get(i3);
            Object obj2 = list.get(i3 - 1);
            if (comparator.compare(obj, obj2) < 0) {
                int i4;
                Object obj3 = obj2;
                int i5 = i3;
                while (true) {
                    i4 = i5 - 1;
                    list.set(i5, obj3);
                    if (i4 <= i) {
                        break;
                    }
                    obj2 = list.get(i4 - 1);
                    if (comparator.compare(obj, obj2) >= 0) {
                        break;
                    }
                    obj3 = obj2;
                    i5 = i4;
                }
                list.set(i4, obj);
            }
        }
    }
}
