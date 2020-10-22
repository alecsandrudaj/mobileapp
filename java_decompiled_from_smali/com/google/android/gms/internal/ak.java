package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.ae.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ak extends ae implements SafeParcelable {
    public static final i CREATOR = new i();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final ah d;
    private final String e;
    private int f;
    private int g;

    ak(int i, Parcel parcel, ah ahVar) {
        this.a = i;
        this.b = (Parcel) do.a((Object) parcel);
        this.d = ahVar;
        if (this.d == null) {
            this.e = null;
        } else {
            this.e = this.d.d();
        }
        this.f = 2;
    }

    public static HashMap a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Entry entry : hashMap.entrySet()) {
            hashMap2.put(Integer.valueOf(((a) entry.getValue()).g()), entry);
        }
        return hashMap2;
    }

    private void a(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case e.MapAttrs_mapType /*0*/:
            case e.MapAttrs_cameraBearing /*1*/:
            case e.MapAttrs_cameraTargetLat /*2*/:
            case e.MapAttrs_cameraTargetLng /*3*/:
            case e.MapAttrs_cameraTilt /*4*/:
            case e.MapAttrs_cameraZoom /*5*/:
            case e.MapAttrs_uiCompass /*6*/:
                stringBuilder.append(obj);
                return;
            case e.MapAttrs_uiRotateGestures /*7*/:
                stringBuilder.append("\"").append(n.a(obj.toString())).append("\"");
                return;
            case e.MapAttrs_uiScrollGestures /*8*/:
                stringBuilder.append("\"").append(l.a((byte[]) obj)).append("\"");
                return;
            case e.MapAttrs_uiTiltGestures /*9*/:
                stringBuilder.append("\"").append(l.b((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case e.MapAttrs_uiZoomControls /*10*/:
                o.a(stringBuilder, (HashMap) obj);
                return;
            case e.MapAttrs_uiZoomGestures /*11*/:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void a(StringBuilder stringBuilder, a aVar, Parcel parcel, int i) {
        switch (aVar.d()) {
            case e.MapAttrs_mapType /*0*/:
                a(stringBuilder, aVar, a(aVar, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i))));
                return;
            case e.MapAttrs_cameraBearing /*1*/:
                a(stringBuilder, aVar, a(aVar, com.google.android.gms.common.internal.safeparcel.a.h(parcel, i)));
                return;
            case e.MapAttrs_cameraTargetLat /*2*/:
                a(stringBuilder, aVar, a(aVar, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i))));
                return;
            case e.MapAttrs_cameraTargetLng /*3*/:
                a(stringBuilder, aVar, a(aVar, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i))));
                return;
            case e.MapAttrs_cameraTilt /*4*/:
                a(stringBuilder, aVar, a(aVar, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i))));
                return;
            case e.MapAttrs_cameraZoom /*5*/:
                a(stringBuilder, aVar, a(aVar, com.google.android.gms.common.internal.safeparcel.a.k(parcel, i)));
                return;
            case e.MapAttrs_uiCompass /*6*/:
                a(stringBuilder, aVar, a(aVar, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i))));
                return;
            case e.MapAttrs_uiRotateGestures /*7*/:
                a(stringBuilder, aVar, a(aVar, com.google.android.gms.common.internal.safeparcel.a.l(parcel, i)));
                return;
            case e.MapAttrs_uiScrollGestures /*8*/:
            case e.MapAttrs_uiTiltGestures /*9*/:
                a(stringBuilder, aVar, a(aVar, com.google.android.gms.common.internal.safeparcel.a.o(parcel, i)));
                return;
            case e.MapAttrs_uiZoomControls /*10*/:
                a(stringBuilder, aVar, a(aVar, a(com.google.android.gms.common.internal.safeparcel.a.n(parcel, i))));
                return;
            case e.MapAttrs_uiZoomGestures /*11*/:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + aVar.d());
        }
    }

    private void a(StringBuilder stringBuilder, a aVar, Object obj) {
        if (aVar.c()) {
            a(stringBuilder, aVar, (ArrayList) obj);
        } else {
            a(stringBuilder, aVar.b(), obj);
        }
    }

    private void a(StringBuilder stringBuilder, a aVar, ArrayList arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            a(stringBuilder, aVar.b(), arrayList.get(i));
        }
        stringBuilder.append("]");
    }

    private void a(StringBuilder stringBuilder, String str, a aVar, Parcel parcel, int i) {
        stringBuilder.append("\"").append(str).append("\":");
        if (aVar.j()) {
            a(stringBuilder, aVar, parcel, i);
        } else {
            b(stringBuilder, aVar, parcel, i);
        }
    }

    private void a(StringBuilder stringBuilder, HashMap hashMap, Parcel parcel) {
        HashMap a = a(hashMap);
        stringBuilder.append('{');
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Object obj = null;
        while (parcel.dataPosition() < b) {
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            Entry entry = (Entry) a.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.a(a2)));
            if (entry != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                a(stringBuilder, (String) entry.getKey(), (a) entry.getValue(), parcel, a2);
                obj = 1;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        stringBuilder.append('}');
    }

    private void b(StringBuilder stringBuilder, a aVar, Parcel parcel, int i) {
        if (aVar.e()) {
            stringBuilder.append("[");
            switch (aVar.d()) {
                case e.MapAttrs_mapType /*0*/:
                    k.a(stringBuilder, com.google.android.gms.common.internal.safeparcel.a.q(parcel, i));
                    break;
                case e.MapAttrs_cameraBearing /*1*/:
                    k.a(stringBuilder, com.google.android.gms.common.internal.safeparcel.a.s(parcel, i));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    k.a(stringBuilder, com.google.android.gms.common.internal.safeparcel.a.r(parcel, i));
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    k.a(stringBuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, i));
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    k.a(stringBuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, i));
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    k.a(stringBuilder, com.google.android.gms.common.internal.safeparcel.a.v(parcel, i));
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    k.a(stringBuilder, com.google.android.gms.common.internal.safeparcel.a.p(parcel, i));
                    break;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    k.a(stringBuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, i));
                    break;
                case e.MapAttrs_uiScrollGestures /*8*/:
                case e.MapAttrs_uiTiltGestures /*9*/:
                case e.MapAttrs_uiZoomControls /*10*/:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case e.MapAttrs_uiZoomGestures /*11*/:
                    Parcel[] z = com.google.android.gms.common.internal.safeparcel.a.z(parcel, i);
                    int length = z.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            stringBuilder.append(",");
                        }
                        z[i2].setDataPosition(0);
                        a(stringBuilder, aVar.l(), z[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        switch (aVar.d()) {
            case e.MapAttrs_mapType /*0*/:
                stringBuilder.append(com.google.android.gms.common.internal.safeparcel.a.f(parcel, i));
                return;
            case e.MapAttrs_cameraBearing /*1*/:
                stringBuilder.append(com.google.android.gms.common.internal.safeparcel.a.h(parcel, i));
                return;
            case e.MapAttrs_cameraTargetLat /*2*/:
                stringBuilder.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, i));
                return;
            case e.MapAttrs_cameraTargetLng /*3*/:
                stringBuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, i));
                return;
            case e.MapAttrs_cameraTilt /*4*/:
                stringBuilder.append(com.google.android.gms.common.internal.safeparcel.a.j(parcel, i));
                return;
            case e.MapAttrs_cameraZoom /*5*/:
                stringBuilder.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, i));
                return;
            case e.MapAttrs_uiCompass /*6*/:
                stringBuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, i));
                return;
            case e.MapAttrs_uiRotateGestures /*7*/:
                stringBuilder.append("\"").append(n.a(com.google.android.gms.common.internal.safeparcel.a.l(parcel, i))).append("\"");
                return;
            case e.MapAttrs_uiScrollGestures /*8*/:
                stringBuilder.append("\"").append(l.a(com.google.android.gms.common.internal.safeparcel.a.o(parcel, i))).append("\"");
                return;
            case e.MapAttrs_uiTiltGestures /*9*/:
                stringBuilder.append("\"").append(l.b(com.google.android.gms.common.internal.safeparcel.a.o(parcel, i)));
                stringBuilder.append("\"");
                return;
            case e.MapAttrs_uiZoomControls /*10*/:
                Bundle n = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i);
                Set<String> keySet = n.keySet();
                keySet.size();
                stringBuilder.append("{");
                int i3 = 1;
                for (String str : keySet) {
                    if (i3 == 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"").append(str).append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"").append(n.a(n.getString(str))).append("\"");
                    i3 = 0;
                }
                stringBuilder.append("}");
                return;
            case e.MapAttrs_uiZoomGestures /*11*/:
                Parcel y = com.google.android.gms.common.internal.safeparcel.a.y(parcel, i);
                y.setDataPosition(0);
                a(stringBuilder, aVar.l(), y);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    public int a() {
        return this.a;
    }

    /* Access modifiers changed, original: protected */
    public Object a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public HashMap b() {
        return this.d == null ? null : this.d.a(this.e);
    }

    /* Access modifiers changed, original: protected */
    public boolean b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents() {
        i iVar = CREATOR;
        return 0;
    }

    public Parcel e() {
        switch (this.f) {
            case e.MapAttrs_mapType /*0*/:
                this.g = c.a(this.b);
                c.a(this.b, this.g);
                this.f = 2;
                break;
            case e.MapAttrs_cameraBearing /*1*/:
                c.a(this.b, this.g);
                this.f = 2;
                break;
        }
        return this.b;
    }

    /* Access modifiers changed, original: 0000 */
    public ah f() {
        switch (this.c) {
            case e.MapAttrs_mapType /*0*/:
                return null;
            case e.MapAttrs_cameraBearing /*1*/:
                return this.d;
            case e.MapAttrs_cameraTargetLat /*2*/:
                return this.d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.c);
        }
    }

    public String toString() {
        do.a(this.d, (Object) "Cannot convert to JSON on client side.");
        Parcel e = e();
        e.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        a(stringBuilder, this.d.a(this.e), e);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i iVar = CREATOR;
        i.a(this, parcel, i);
    }
}
