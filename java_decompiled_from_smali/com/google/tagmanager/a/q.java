package com.google.tagmanager.a;

import com.google.android.gms.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class q {
    private static final q d = new q(true);
    private final ax a = ax.a(16);
    private boolean b;
    private boolean c = false;

    private q() {
    }

    private q(boolean z) {
        c();
    }

    static int a(bm bmVar, boolean z) {
        return z ? 2 : bmVar.b();
    }

    public static q a() {
        return new q();
    }

    public static Object a(k kVar, bm bmVar, boolean z) {
        switch (r.b[bmVar.ordinal()]) {
            case e.MapAttrs_cameraBearing /*1*/:
                return Double.valueOf(kVar.b());
            case e.MapAttrs_cameraTargetLat /*2*/:
                return Float.valueOf(kVar.c());
            case e.MapAttrs_cameraTargetLng /*3*/:
                return Long.valueOf(kVar.e());
            case e.MapAttrs_cameraTilt /*4*/:
                return Long.valueOf(kVar.d());
            case e.MapAttrs_cameraZoom /*5*/:
                return Integer.valueOf(kVar.f());
            case e.MapAttrs_uiCompass /*6*/:
                return Long.valueOf(kVar.g());
            case e.MapAttrs_uiRotateGestures /*7*/:
                return Integer.valueOf(kVar.h());
            case e.MapAttrs_uiScrollGestures /*8*/:
                return Boolean.valueOf(kVar.i());
            case e.MapAttrs_uiTiltGestures /*9*/:
                return z ? kVar.k() : kVar.j();
            case e.MapAttrs_uiZoomControls /*10*/:
                return kVar.l();
            case e.MapAttrs_uiZoomGestures /*11*/:
                return Integer.valueOf(kVar.m());
            case e.MapAttrs_useViewLifecycle /*12*/:
                return Integer.valueOf(kVar.o());
            case e.MapAttrs_zOrderOnTop /*13*/:
                return Long.valueOf(kVar.p());
            case 14:
                return Integer.valueOf(kVar.q());
            case 15:
                return Long.valueOf(kVar.r());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void a(bm bmVar, Object obj) {
        boolean z = false;
        if (obj == null) {
            throw new NullPointerException();
        }
        switch (r.a[bmVar.a().ordinal()]) {
            case e.MapAttrs_cameraBearing /*1*/:
                z = obj instanceof Integer;
                break;
            case e.MapAttrs_cameraTargetLat /*2*/:
                z = obj instanceof Long;
                break;
            case e.MapAttrs_cameraTargetLng /*3*/:
                z = obj instanceof Float;
                break;
            case e.MapAttrs_cameraTilt /*4*/:
                z = obj instanceof Double;
                break;
            case e.MapAttrs_cameraZoom /*5*/:
                z = obj instanceof Boolean;
                break;
            case e.MapAttrs_uiCompass /*6*/:
                z = obj instanceof String;
                break;
            case e.MapAttrs_uiRotateGestures /*7*/:
                if ((obj instanceof h) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case e.MapAttrs_uiScrollGestures /*8*/:
                if ((obj instanceof Integer) || (obj instanceof ad)) {
                    z = true;
                    break;
                }
            case e.MapAttrs_uiTiltGestures /*9*/:
                if ((obj instanceof am) || (obj instanceof ag)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private boolean a(Entry entry) {
        s sVar = (s) entry.getKey();
        if (sVar.b() == br.MESSAGE) {
            if (sVar.c()) {
                for (am j : (List) entry.getValue()) {
                    if (!j.j()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof am) {
                if (!((am) value).j()) {
                    return false;
                }
            } else if (value instanceof ag) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public static q b() {
        return d;
    }

    private void b(Entry entry) {
        Comparable comparable = (s) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ag) {
            value = ((ag) value).a();
        }
        Object a;
        if (comparable.c()) {
            a = a((s) comparable);
            if (a == null) {
                this.a.put(comparable, new ArrayList((List) value));
            } else {
                ((List) a).addAll((List) value);
            }
        } else if (comparable.b() == br.MESSAGE) {
            a = a((s) comparable);
            if (a == null) {
                this.a.put(comparable, value);
            } else {
                this.a.put(comparable, a instanceof ap ? comparable.a((ap) a, (ap) value) : comparable.a(((am) a).n(), (am) value).h());
            }
        } else {
            this.a.put(comparable, value);
        }
    }

    public Object a(s sVar) {
        Object obj = this.a.get(sVar);
        return obj instanceof ag ? ((ag) obj).a() : obj;
    }

    public void a(q qVar) {
        for (int i = 0; i < qVar.a.c(); i++) {
            b(qVar.a.b(i));
        }
        for (Entry b : qVar.a.d()) {
            b(b);
        }
    }

    public void a(s sVar, Object obj) {
        if (!sVar.c()) {
            a(sVar.a(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object a : arrayList) {
                a(sVar.a(), a);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof ag) {
            this.c = true;
        }
        this.a.put((Comparable) sVar, obj);
    }

    public void b(s sVar, Object obj) {
        if (sVar.c()) {
            List arrayList;
            a(sVar.a(), obj);
            Object a = a(sVar);
            if (a == null) {
                arrayList = new ArrayList();
                this.a.put((Comparable) sVar, (Object) arrayList);
            } else {
                arrayList = (List) a;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public void c() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    /* renamed from: d */
    public q clone() {
        q a = a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.c()) {
                break;
            }
            Entry b = this.a.b(i2);
            a.a((s) b.getKey(), b.getValue());
            i = i2 + 1;
        }
        for (Entry entry : this.a.d()) {
            a.a((s) entry.getKey(), entry.getValue());
        }
        a.c = this.c;
        return a;
    }

    public boolean e() {
        for (int i = 0; i < this.a.c(); i++) {
            if (!a(this.a.b(i))) {
                return false;
            }
        }
        for (Entry a : this.a.d()) {
            if (!a(a)) {
                return false;
            }
        }
        return true;
    }
}
