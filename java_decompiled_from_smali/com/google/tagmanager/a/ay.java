package com.google.tagmanager.a;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class ay extends ax {
    ay(int i) {
        super(i, null);
    }

    public void a() {
        if (!b()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= c()) {
                    break;
                }
                Entry b = b(i2);
                if (((s) b.getKey()).c()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
                i = i2 + 1;
            }
            for (Entry entry : d()) {
                if (((s) entry.getKey()).c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((s) obj, obj2);
    }
}
