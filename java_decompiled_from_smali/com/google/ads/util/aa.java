package com.google.ads.util;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class aa {
    private static final Object a = new Object();
    private static int b = 0;
    private static HashMap c = new HashMap();
    private final ArrayList d = new ArrayList();
    public final int u;

    public aa() {
        synchronized (a) {
            int i = b;
            b = i + 1;
            this.u = i;
            Integer num = (Integer) c.get(getClass());
            if (num == null) {
                c.put(getClass(), Integer.valueOf(1));
            } else {
                c.put(getClass(), Integer.valueOf(num.intValue() + 1));
            }
        }
        g.d("State created: " + toString());
    }

    private void a(ac acVar) {
        this.d.add(acVar);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        synchronized (a) {
            c.put(getClass(), Integer.valueOf(((Integer) c.get(getClass())).intValue() - 1));
        }
        super.finalize();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.u + "]";
    }
}
