package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class ae {

    public class a implements SafeParcelable {
        public static final e CREATOR = new e();
        protected final int a;
        protected final boolean b;
        protected final int c;
        protected final boolean d;
        protected final String e;
        protected final int f;
        protected final Class g;
        protected final String h;
        private final int i;
        private ah j;
        private d k;

        a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, z zVar) {
            this.i = i;
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.d = z2;
            this.e = str;
            this.f = i4;
            if (str2 == null) {
                this.g = null;
                this.h = null;
            } else {
                this.g = ak.class;
                this.h = str2;
            }
            if (zVar == null) {
                this.k = null;
            } else {
                this.k = zVar.c();
            }
        }

        protected a(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, d dVar) {
            this.i = 1;
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = z2;
            this.e = str;
            this.f = i3;
            this.g = cls;
            if (cls == null) {
                this.h = null;
            } else {
                this.h = cls.getCanonicalName();
            }
            this.k = dVar;
        }

        public static a a(String str, int i) {
            return new a(0, false, 0, false, str, i, null, null);
        }

        public static a a(String str, int i, d dVar, boolean z) {
            return new a(dVar.c(), z, dVar.d(), false, str, i, null, dVar);
        }

        public static a a(String str, int i, Class cls) {
            return new a(11, false, 11, false, str, i, cls, null);
        }

        public static a b(String str, int i) {
            return new a(4, false, 4, false, str, i, null, null);
        }

        public static a b(String str, int i, Class cls) {
            return new a(11, true, 11, true, str, i, cls, null);
        }

        public static a c(String str, int i) {
            return new a(6, false, 6, false, str, i, null, null);
        }

        public static a d(String str, int i) {
            return new a(7, false, 7, false, str, i, null, null);
        }

        public static a e(String str, int i) {
            return new a(7, true, 7, true, str, i, null, null);
        }

        public int a() {
            return this.i;
        }

        public Object a(Object obj) {
            return this.k.a(obj);
        }

        public void a(ah ahVar) {
            this.j = ahVar;
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        public int describeContents() {
            e eVar = CREATOR;
            return 0;
        }

        public boolean e() {
            return this.d;
        }

        public String f() {
            return this.e;
        }

        public int g() {
            return this.f;
        }

        public Class h() {
            return this.g;
        }

        /* Access modifiers changed, original: 0000 */
        public String i() {
            return this.h == null ? null : this.h;
        }

        public boolean j() {
            return this.k != null;
        }

        /* Access modifiers changed, original: 0000 */
        public z k() {
            return this.k == null ? null : z.a(this.k);
        }

        public HashMap l() {
            do.a(this.h);
            do.a(this.j);
            return this.j.a(this.h);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field\n");
            stringBuilder.append("            versionCode=").append(this.i).append(10);
            stringBuilder.append("                 typeIn=").append(this.a).append(10);
            stringBuilder.append("            typeInArray=").append(this.b).append(10);
            stringBuilder.append("                typeOut=").append(this.c).append(10);
            stringBuilder.append("           typeOutArray=").append(this.d).append(10);
            stringBuilder.append("        outputFieldName=").append(this.e).append(10);
            stringBuilder.append("      safeParcelFieldId=").append(this.f).append(10);
            stringBuilder.append("       concreteTypeName=").append(i()).append(10);
            if (h() != null) {
                stringBuilder.append("     concreteType.class=").append(h().getCanonicalName()).append(10);
            }
            stringBuilder.append("          converterName=").append(this.k == null ? "null" : this.k.getClass().getCanonicalName()).append(10);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            e eVar = CREATOR;
            e.a(this, parcel, i);
        }
    }

    private void a(StringBuilder stringBuilder, a aVar, Object obj) {
        if (aVar.b() == 11) {
            stringBuilder.append(((ae) aVar.h().cast(obj)).toString());
        } else if (aVar.b() == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(n.a((String) obj));
            stringBuilder.append("\"");
        } else {
            stringBuilder.append(obj);
        }
    }

    private void a(StringBuilder stringBuilder, a aVar, ArrayList arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                a(stringBuilder, aVar, obj);
            }
        }
        stringBuilder.append("]");
    }

    /* Access modifiers changed, original: protected */
    public Object a(a aVar, Object obj) {
        return aVar.k != null ? aVar.a(obj) : obj;
    }

    public abstract Object a(String str);

    /* Access modifiers changed, original: protected */
    public boolean a(a aVar) {
        return aVar.d() == 11 ? aVar.e() ? d(aVar.f()) : c(aVar.f()) : b(aVar.f());
    }

    /* Access modifiers changed, original: protected */
    public Object b(a aVar) {
        boolean z = true;
        String f = aVar.f();
        if (aVar.h() == null) {
            return a(aVar.f());
        }
        if (a(aVar.f()) != null) {
            z = false;
        }
        do.a(z, "Concrete field shouldn't be value object: " + aVar.f());
        Map d = aVar.e() ? d() : c();
        if (d != null) {
            return d.get(f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(f.charAt(0)) + f.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract HashMap b();

    public abstract boolean b(String str);

    public HashMap c() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public boolean c(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public HashMap d() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public boolean d(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public String toString() {
        HashMap b = b();
        StringBuilder stringBuilder = new StringBuilder(100);
        for (String str : b.keySet()) {
            a aVar = (a) b.get(str);
            if (a(aVar)) {
                Object a = a(aVar, b(aVar));
                if (stringBuilder.length() == 0) {
                    stringBuilder.append("{");
                } else {
                    stringBuilder.append(",");
                }
                stringBuilder.append("\"").append(str).append("\":");
                if (a != null) {
                    switch (aVar.d()) {
                        case e.MapAttrs_uiScrollGestures /*8*/:
                            stringBuilder.append("\"").append(l.a((byte[]) a)).append("\"");
                            break;
                        case e.MapAttrs_uiTiltGestures /*9*/:
                            stringBuilder.append("\"").append(l.b((byte[]) a)).append("\"");
                            break;
                        case e.MapAttrs_uiZoomControls /*10*/:
                            o.a(stringBuilder, (HashMap) a);
                            break;
                        default:
                            if (!aVar.c()) {
                                a(stringBuilder, aVar, a);
                                break;
                            }
                            a(stringBuilder, aVar, (ArrayList) a);
                            break;
                    }
                }
                stringBuilder.append("null");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
        } else {
            stringBuilder.append("{}");
        }
        return stringBuilder.toString();
    }
}
